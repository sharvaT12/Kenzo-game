//
// CS 342 Project 2
//
// Sharva Thakur :- 654135206
// Russel Tjahjadi :- 676334415
//
// KENO:- Java Fx
//


import javafx.application.Application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.ArrayList;


public class JavaFXTemplate extends Application {

	//declaring the variables for later use
	private static int counter = 0;
	private static int total = 0;
	ArrayList<Integer> num_arr= new ArrayList<>(); //ArrayList for storing the user's numbers


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}


	//set_background_b to set the background for the border pane
	private void set_background_b(String url, BorderPane pane){

		//as we pass in the BorderPane parameter, we have to put in the parameters for the built in functions
		pane.setPrefSize(700,700); //size
		pane.setPadding(new Insets(0,10,0,0)); //padding

		//inserting the image for this
		Image background_image = new Image(url);

		//now we have the background size
		BackgroundSize backgroundSize = new BackgroundSize(700, 700, true, true, true, false); //the setting for background size
		BackgroundImage b = new BackgroundImage(background_image,BackgroundRepeat.REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,backgroundSize);
		Background temp = new Background(b);
		pane.setBackground(temp);

	}


	//set_background to set the background for the grid pane
	private void set_background(String url, GridPane pane){

		//setting up for the grid pane
		pane.setPrefSize(700,700); //preference size
		pane.setPadding(new Insets(0,10,0,0)); //set the padding

		//insert a new image for the background
		Image background_image = new Image(url);

		BackgroundSize backgroundSize = new BackgroundSize(700, 700, true, true, true, false);//setting for background size
		BackgroundImage b = new BackgroundImage(background_image,BackgroundRepeat.REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,backgroundSize);
		Background temp = new Background(b);
		pane.setBackground(temp);

	}

	//ODDS function which will show the odds to the user
	private void ODDS(Stage primaryStage, String picture){

		//using a grid pane because grid pane, you can divide the positions
		GridPane pane1 = new GridPane();

		//setting up the background
		set_background(picture,pane1);


		pane1.setMinSize(700,700);
		pane1.setMinSize(700,700);
		pane1.setHgap(5);
		pane1.setVgap(5);

		//new label for the new title
		Label w = new Label("Odds of winning");
		GridPane.setHalignment(w, HPos.CENTER);
		w.setFont(new Font("Arial",40));
		w.setTextFill(Color.web("#00008b")); //fill in the text by the colour of dark blue

		//make a new label to display the statistics of the number of players for the odds
		Label rule1 = new Label("No of players: Odds \n \n." +
				" 1: 1 in 4\n\n " +
				" 4: 1 in 16.63 \n\n" +
				" 8: 1 in 9.77 \n\n" +
				"10: 1 in 9.05" );


		rule1.setFont(new Font("Arial",35));
		rule1.setWrapText(true);

		//set both alignments to center of the frame
		GridPane.setHalignment(rule1, HPos.CENTER);
		GridPane.setHalignment(w, HPos.CENTER);

		//put in the back button
		Button back = new Button("back");

		EventHandler<ActionEvent> back_handler;
		back_handler = e->{
			MenuScreen(primaryStage,picture); //goes back to the menu screen
		};


		//put the back button in action
		back.setOnAction(back_handler);
		pane1.add(back,1,40);
		back.setStyle("-fx-font-size: 2em; -fx-border-width: 1px;");

		pane1.add(w,6,0);
		pane1.add(rule1,1,1);

		//have the scene to show it (the frame)
		Scene scene = new Scene(pane1,700,700);
		primaryStage.setScene(scene);
		primaryStage.show();


	}


	//Rules function to show the rules of the
	private void Rules(Stage primaryStage,String picture){

		//make the new grid pane for the Rules frame
		GridPane pane1 = new GridPane();

		//set background for the Rules function
		set_background(picture,pane1);
		pane1.setMinSize(700,700);
		pane1.setMinSize(700,700);


		pane1.setHgap(5); //set horizontal gap
		pane1.setVgap(5); //set vertical gap

		//new title: Rules in the frame
		Label w = new Label("Rules");
		GridPane.setHalignment(w, HPos.CENTER); //position it at the center
		w.setFont(new Font("Garfield",40)); //set the font for the "Rules" text to Arial
		w.setTextFill(Color.web("#00008b")); //set the colour

		//new label for the text of the rules
		Label rule1 = new Label("\n Wager by choosing a set amount of numbers( pick 2 numbers, pick 10 numbers,etc.) " +
				"ranging from 1 to 80\n \nAfter all players have made their wagers and picked their numbers, twenty numbers are drawn at random, between 1 and 80 with no duplicates.\n" +
				"\n The amount of numbers drawn and the amount of numbers matched that players are allowed to wager on will differ from casino to casino and state lottery to state lottery" +
				"\n \nPlayers win by matching a set amount of their numbers to the numbers that are randomly drawn.\n");
		rule1.setFont(new Font("Garfield",20));
		rule1.setWrapText(true);
		GridPane.setHalignment(rule1, HPos.CENTER); //remember to set the label for the center

		//putting the back button
		Button back = new Button("back");

		EventHandler<ActionEvent> back_handler;
		back_handler = e->{

			MenuScreen(primaryStage,picture); //this would go back to the menu screen again
		};

		//set the back button in action which will go back to the menu screen
		back.setOnAction(back_handler);
		pane1.add(back,1,40);
		back.setStyle("-fx-font-size: 2em; -fx-border-width: 1px;");

		//adds the text for the text and the rules description
		pane1.add(w,1,0);
		pane1.add(rule1,1,1);

		// now we show it
		Scene scene = new Scene(pane1,700,700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	//changecol function to change the collumns
	private void changecol(Stage primaryStage,String picture){

		//make a new border pane
		BorderPane pane1 = new BorderPane();
		set_background_b(picture,pane1); //using the function set_background_b for the border pane

		//make a new text to ask for the background color
		Label w = new Label("Choose the backgroud color");
		w.setFont(new Font("Arial",50));
		w.setTextFill(Color.web("#000000"));

		//blue button
		Button blue = new Button("Blue");

		EventHandler<ActionEvent> blue_handler;
		blue_handler = e->{
			changecol(primaryStage,"2.jpg"); //this will change the color of the background
		};
		blue.setOnAction(blue_handler); //now we set it on action

		//cyan button
		Button cyan = new Button("Cyan");
		EventHandler<ActionEvent> cyan_handler;
		cyan_handler = e->{
			changecol(primaryStage,"3.jpg");
		};
		cyan.setOnAction(cyan_handler);

		//green button
		Button green = new Button("Green");
		EventHandler<ActionEvent> green_handler;
		green_handler = e->{
			changecol(primaryStage,"1.jpg");
		};
		green.setOnAction(green_handler);

		//remember to put the back button
		Button back = new Button("Back");
		EventHandler<ActionEvent> back_handler;
		back_handler = e->{
			MenuScreen(primaryStage,picture);
		};
		back.setOnAction(back_handler);

		//styling for each of the color buttons
		blue.setStyle("-fx-background-color: #FF0000; -fx-font-size: 3em; -fx-border-color: #545454; -fx-border-width: 2px;");
		cyan.setStyle("-fx-background-color: #FF0000; -fx-font-size: 3em; -fx-border-color: #545454; -fx-border-width: 2px;");
		green.setStyle("-fx-background-color: #FF0000; -fx-font-size: 3em; -fx-border-color: #545454; -fx-border-width: 2px;");
		back.setStyle("-fx-background-color: #FFA500; -fx-font-size: 3em; -fx-border-color: #545454; -fx-border-width: 2px;");

		//new vertical box
		VBox s = new VBox();

		//add the buttons to the frame
		s.getChildren().add(blue);
		s.getChildren().add(cyan);
		s.getChildren().add(green);

		//set the spacing between the buttons
		s.setSpacing(100);

		//alignments for final positions
		s.setAlignment(Pos.CENTER);
		BorderPane.setAlignment(s,Pos.CENTER);
		pane1.setCenter(s);
		BorderPane.setAlignment(w,Pos.CENTER);
		pane1.setTop(w);
		back.setAlignment(Pos.BOTTOM_LEFT);
		pane1.setBottom(back);

		//show it to the frame
		Scene scene = new Scene(pane1,700,700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	//MenuScreen function to display the menu screen
	private void MenuScreen(Stage primaryStage,String picture){

		//make a new border pane and set up the background
		BorderPane pane1 = new BorderPane();
		set_background_b(picture,pane1);
		pane1.setMinWidth(700);
		pane1.setMaxWidth(700);

		//new text: "Menu", and set the fonts and the text fill
		Label w = new Label("Menu");
		w.setFont(new Font("Arial",50));
		w.setTextFill(Color.web("#00008b"));

		//rules button
		Button rules = new Button("Rules");
		EventHandler<ActionEvent> rules_handler;
		rules_handler = e->{
			Rules(primaryStage,picture); //handles the case when the rules button is pressed, it will show the picture
		};
		rules.setOnAction(rules_handler); //set it on action


		//odds button
		Button odds = new Button("Odds of winning");
		EventHandler<ActionEvent> odds_handler;
		odds_handler = e->{
			ODDS( primaryStage, picture);
		};
		odds.setOnAction(odds_handler);

		//change background button
		Button C = new Button("Change background");
		EventHandler<ActionEvent> C_handler;
		C_handler = e->{
			changecol( primaryStage, picture);
		};
		C.setOnAction(C_handler);


		//exit button
		Button exit = new Button("Exit");
		EventHandler<ActionEvent> exit_handler;
		exit_handler = e->{
			Platform.exit(); //this event will have the javafx application to terminate
		};
		exit.setOnAction(exit_handler); //set it to action

		//back button
		Button back = new Button("back");
		EventHandler<ActionEvent> back_handler;
		back_handler = e->{
			Welcomescreen(primaryStage,picture); //goes back to welcome screen again
		};
		back.setOnAction(back_handler);


		//styling for each of the frames
		odds.setStyle("-fx-background-color: #FFA500; -fx-font-size: 3em; -fx-border-color: #545454; -fx-border-width: 2px;");
		rules.setStyle("-fx-background-color: #FFA500; -fx-font-size: 3em; -fx-border-color: #545454; -fx-border-width: 2px;");
		exit.setStyle("-fx-background-color: #FFA500; -fx-font-size: 3em; -fx-border-color: #545454; -fx-border-width: 2px;");
		back.setStyle("-fx-background-color: #FFA500; -fx-font-size: 3em; -fx-border-color: #545454; -fx-border-width: 2px;");
		C.setStyle("-fx-background-color: #FFA500; -fx-font-size: 3em; -fx-border-color: #545454; -fx-border-width: 2px;");

		//new horizontal box, sets the spacing and adds the buttons to be there
		HBox s = new HBox();
		s.setSpacing(210);
		s.getChildren().add(rules);
		s.getChildren().add(C);

		//new horizontal box, sets the spacing and adds the buttons to be there
		HBox r = new HBox();
		r.setSpacing(500);
		r.getChildren().add(back);
		r.getChildren().add(exit);

		//alignment for the borderpane to be center
		BorderPane.setAlignment(w,Pos.CENTER);
		pane1.setTop(w);

		//new vertical box and sets the children and spacing
		VBox t = new VBox();
		t.setSpacing(200);
		t.getChildren().add(s);
		t.getChildren().add(odds);
		t.getChildren().add(r);

		//alignment for the center
		BorderPane.setAlignment(t,Pos.CENTER);
		pane1.setCenter(t);

		//show the new scene
		Scene scene = new Scene(pane1,700,700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static ArrayList<Integer> getrandom(int spots){

		//set up the variables minimum and max
		int min = 1;
		int max = 80;

		//have a new array to store the numbers
		ArrayList<Integer> temp = new ArrayList<>();


		int i = 0;
		while(i< spots){
			int r = (int)(Math.random()*max)+min; //randomize the number
			if(!temp.contains(r)){
				temp.add(r);
				i++;
			}
		}
		return temp;
	}


	//get_T
	public static int get_T(int no_spots, int c){

		//check the no_spots and do the according cases
		if(no_spots == 1){ // 1spot
			if(c == 1){
				total = total + 2;
				return 2;
			}
		}
		else if(no_spots == 4){ // 4 spots
			if(c == 2){
				total = total + 1;
				return 1;
			}
			else if(c == 3){
				total = total + 5;
				return 5;
			}
			else if(c == 4){
				total = total + 75;
				return 75;
			}
		}
		else if(no_spots == 8){ // 8 spot
			if(c == 4){
				total = total + 2;
				return 2;
			}
			else if(c == 5){
				total = total + 12;
				return 12;
			}
			else if(c == 6){
				total = total + 50;
				return 50;
			}
			else if(c == 7){
				total = total + 750;
				return 750;
			}
			else if(c == 8){
				total = total + 10000;
				return 10000;
			}
		}
		else if(no_spots == 10){ // 10 spot
			if(c == 0){
				total = total + 5;
				return 5;
			}
			else if(c == 5){
				total = total + 2;
				return 2;
			}
			else if(c == 6){
				total = total + 15;
				return 15;
			}
			else if(c == 7){
				total = total + 40;
				return 40;
			}
			else if(c == 8){
				total = total + 450;
				return 450;
			}
			else if(c == 9){
				total = total + 4250;
				return 4250;
			}
			else if(c == 10){
				total = total + 100000;
				return 100000;
			}
		}
		return 0;
	}

	//play_again function will have the play_again frame show up
	private void play_again(Stage primaryStage,String picture){

		//creating a new border pane for a new frame
		BorderPane pane = new BorderPane();

		//setting up the background
		set_background_b(picture, pane);

		//a new vbox for the buttons:play again and exit
		VBox vbox = new VBox();
		vbox.setSpacing(20); //spacing between the buttons

		//making the new buttons
		Button play_again = new Button("Play again");
		Button exit = new Button("Exit");


		Label T = new Label("Total score =");
		Label S = new Label(Integer.toString(total));
		T.setFont(new Font("Arial",60));
		T.setWrapText(true);
		T.setTextFill(Color.web("#000000"));
		S.setFont(new Font("Arial",60));
		S.setWrapText(true);
		S.setTextFill(Color.web("#000000"));


		HBox hbox = new HBox();
		hbox.getChildren().add(T);
		hbox.getChildren().add(S);
		hbox.setSpacing(20);

		//set the new buttons (play_again and exit) with the size and the text inside it
		play_again.setMinSize(200, 100);
		play_again.setStyle("-fx-font-size: 3em; -fx-border-width: 3px; -fx-background-color: #00FF00;");
		exit.setMinSize(200, 100);
		exit.setStyle("-fx-font-size: 3em; -fx-border-width: 3px; -fx-background-color: #FF0000;");

		//exit handler to handle what happens when exit button is pressed
		EventHandler<ActionEvent> exit_handler;
		exit_handler = e->{
			counter = 0;
			total = 0;
			num_arr.clear();
			Platform.exit();
		};
		exit.setOnAction(exit_handler);

		//play again handler when play_again is pressed
		EventHandler<ActionEvent> play_handler;
		play_handler = e->{
			counter = 0;
			total = 0;
			num_arr.clear();
			no_of_spots(primaryStage,picture);
		};
		play_again.setOnAction(play_handler);


		//now we want to get the buttons to be placed in the frame
		vbox.getChildren().add(play_again); //play_again button
		vbox.getChildren().add(exit); //exit button

		//alignments
		vbox.setAlignment(Pos.CENTER);
		BorderPane.setAlignment(vbox,Pos.CENTER);
		hbox.setAlignment(Pos.CENTER);
		BorderPane.setAlignment(hbox,Pos.CENTER);

		pane.setCenter(vbox);
		pane.setTop(hbox);

		//now we show the buttons from the frame
		Scene scene = new Scene(pane,700,700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	//continue_screen function will have the continue to the next drawing frame
	private void continue_screen(Stage primaryStage,String picture,int no_spots,int no_chances){


		//need a new border pane for a new frame
		BorderPane pane = new BorderPane();

		//set the background for the frame
		set_background_b(picture, pane);

		//the label would be the title/text to be displayed
		Label t = new Label("Do you wish to continue to the next drawing?");
		t.setFont(new Font("Arial",60));
		t.setWrapText(true);
		t.setTextFill(Color.web("#000000"));

		//new horizontal box for the frame (for the buttons)
		HBox hbox = new HBox();
		hbox.setSpacing(20);

		//make the yes and no buttons
		Button yes = new Button("Yes");
		Button no = new Button("No");

		//yes and no sizes
		yes.setMinSize(200, 100);
		yes.setStyle("-fx-font-size: 3em; -fx-border-width: 3px; -fx-background-color: #00FF00;");
		no.setMinSize(200, 100);
		no.setStyle("-fx-font-size: 3em; -fx-border-width: 3px; -fx-background-color: #FF0000;");

		//now put the buttons inside the horizontal box
		hbox.getChildren().add(yes);
		hbox.getChildren().add(no);

		//alignments
		t.setAlignment(Pos.CENTER);
		hbox.setAlignment(Pos.CENTER);

		pane.setTop(t);
		pane.setCenter(hbox);

		//check how many chances we have
		if(no_chances == 1){
			yes.setDisable(true);
		}

		//yes handler show what happens when the yes button is pressed
		EventHandler<ActionEvent> yes_handler;
		yes_handler = e->{
			rand_screen(primaryStage,picture,no_spots,no_chances-1);
		};
		yes.setOnAction(yes_handler);

		//no handler show what happens when the no button is pressed
		EventHandler<ActionEvent> no_handler;
		no_handler = e->{
			play_again(primaryStage, picture);
		};
		no.setOnAction(no_handler);

		//show the scene
		Scene scene = new Scene(pane,700,700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	//rand_screen function to show the randomly selected number screen
	private void rand_screen(Stage primaryStage,String picture,int no_spots,int no_chances){

		//make the new border pane and pass in the pane to the set_background pane function
		final int[] ctr = {0};
		BorderPane pane = new BorderPane();
		set_background_b(picture,pane);

		//create the new VBox and the new spacing
		VBox vbox = new VBox();
		vbox.setSpacing(27);

		//new text for the amount earned in the current round and set up the font colors
		Label A_E = new Label ("Amount earned this round");
		A_E.setFont(new Font("Arial",30));
		A_E.setWrapText(true);
		A_E.setTextFill(Color.web("#000000"));

		//total amount earned text and set the
		Label T_E = new Label ("Total amount earned");
		T_E.setFont(new Font("Arial",30));
		T_E.setWrapText(true);
		T_E.setTextFill(Color.web("#000000"));

		Label A_E_1 = new Label("0");
		A_E_1.setFont(new Font("Arial",40));
		A_E_1.setWrapText(true);
		A_E_1.setTextFill(Color.web("#000000"));


		Label T_E_1 = new Label(Integer.toString(total));
		T_E_1.setFont(new Font("Arial",40));
		T_E_1.setWrapText(true);
		T_E_1.setTextFill(Color.web("#000000"));

		//now add the buttons to the vbox for it to show up
		vbox.getChildren().add(A_E);
		vbox.getChildren().add(A_E_1);
		vbox.getChildren().add(T_E);
		vbox.getChildren().add(T_E_1);
		vbox.setAlignment(Pos.CENTER);


		ArrayList<Integer> A = getrandom(20); //get random integers


		//new vertical box
		VBox vbox1 = new VBox();

		//new label: "Randomly selected number" and set up the fonts
		Label R_N = new Label ("Randomly selected number");
		R_N.setFont(new Font("Arial",40));
		R_N.setWrapText(true);
		R_N.setTextFill(Color.web("#000000"));


		int a = A.get(ctr[0]);
		Label R_N_N = new Label(Integer.toString(a));
		R_N_N.setFont(new Font("Arial",50));
		R_N_N.setWrapText(true);
		R_N_N.setTextFill(Color.web("#000000"));

		//set up the spacing
		vbox1.setSpacing(25);

		//add the vbox
		vbox1.getChildren().add(R_N);
		vbox1.getChildren().add(R_N_N);
		vbox1.setAlignment(Pos.CENTER);

		//horizontal button for the next button
		HBox btn = new HBox();
		Button next = new Button("Next");
		next.setMinSize(70, 30);
		next.setStyle("-fx-font-size: 2em; -fx-border-width: 3px;");

		//next button handler
		EventHandler<ActionEvent> next_handler;
		next_handler = e->{
			continue_screen(primaryStage, picture, no_spots, no_chances); //continue screen
		};
		next.setOnAction(next_handler);

		//next number button
		Button next_num = new Button("Next number");
		next_num.setMinSize(70, 30);
		next_num.setStyle("-fx-font-size: 2em; -fx-border-width: 3px;");

		//alignments and adding in the button to the btn horizontal box
		btn.setAlignment(Pos.BOTTOM_CENTER);
		btn.getChildren().add(next_num);
		btn.getChildren().add(next);
		btn.setSpacing(400);

		//new grid pane
		GridPane g_1 = new GridPane();

		next.setDisable(true);

		//set the horizontal gaps and vertical gaps
		g_1.setHgap(10);
		g_1.setVgap(10);

		g_1.setAlignment(Pos.CENTER);

		//new text and set up the text
		Label Q = new Label(Integer.toString(a));
		Q.setFont(new Font("Arial",30));
		Q.setWrapText(true);
		Q.setTextFill(Color.web("#FFFFFF"));
		Q.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		Q.setPrefSize(50,20);


		g_1.add(Q,0,0);
		ctr[0]++;

		final int[] c = {0};
		final int[] r = {0};

		final int[] co = {0};

		//have the event handler
		EventHandler<ActionEvent> next_button_handler;
		next_button_handler = e->{
			if(ctr[0] < 20) {
				c[0]++;
				if (c[0] == 5) {
					c[0] = 0;
					r[0]++;
				}
				int z = A.get(ctr[0]);
				R_N_N.setText(Integer.toString(z));
				Label E = new Label(Integer.toString(z));
				E.setFont(new Font("Arial", 30));
				E.setWrapText(true);
				E.setTextFill(Color.web("#FFFFFF"));
				E.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
				E.setPrefSize(50, 20);

				if(num_arr.contains(z)){
					E.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
					co[0]++;
				}
				g_1.add(E, c[0], r[0]);
				ctr[0]++;

			}
			else if(ctr[0] == 20){
				next.setDisable(false);
				int F = get_T(no_spots,co[0]);
				T_E_1.setText(Integer.toString(total));
				A_E_1.setText(Integer.toString(F));
				ctr[0] ++;
			}

		};
		next_num.setOnAction(next_button_handler);

		//set the buttons positions
		pane.setBottom(btn);
		pane.setRight(vbox);
		pane.setTop(vbox1);
		pane.setLeft(g_1);


		//now show the final scene
		Scene scene = new Scene(pane,700,700);
		primaryStage.setScene(scene);
		primaryStage.show();


	}


	//bet_card function will show the bet card frame
	private void bet_card(Stage primaryStage,String picture,int no_spots,int no_chances){

		//make a new grid pane and set it all up
		GridPane pane1 = new GridPane();
		pane1.setPadding(new Insets(1)); //set the padding
		pane1.setHgap(5); //horizontal gap
		pane1.setVgap(5); //vertical gap

		//alignment to center
		pane1.setAlignment(Pos.CENTER);

		//next button and set the size of
		Button next = new Button("Next");
		next.setMinSize(70, 30);
		next.setStyle("-fx-font-size: 2em; -fx-border-width: 3px;");
		next.setDisable(true); //this will have the button to not be able to click once it is clicked

		// this makes an 80 button grid
		int number = 0;
		for (int r = 0; r < 8; r++) {
			for (int c = 0; c < 10; c++) {
				number++;
				Button button = new Button(String.valueOf(number));
				button.setMinSize(50,20);
				pane1.add(button, c, r); // adding each button
				EventHandler<ActionEvent> button_handler;
				int finalNumber = number;
				button_handler = e->{ // eventhandler for the button
					if(num_arr.size()!= no_spots) {
						button.setDisable(true);
						num_arr.add(finalNumber); //adding the option to button
						counter++;
						if (counter == no_spots) {
							for (Node n : pane1.getChildren()) {
								Button btn = (Button) n;
								btn.setDisable(true);

							}
							next.setDisable(false);
						}
					}
				};
				button.setOnAction(button_handler);



			}
		}

		//reset button and set up the size and style
		Button reset = new Button("Reset");
		reset.setMinSize(70, 30);
		reset.setStyle("-fx-font-size: 2em; -fx-border-width: 3px;");

		//randomize button and set up the size and style
		Button rand = new Button("Randomize");

		//making a new border pane and set the background for it
		BorderPane pane = new BorderPane();
		set_background_b(picture,pane);
		pane.setCenter(pane1);

		//new text: CHOOSE THE NUMBER OF SPOTS YOU WANT TO PLAY
		Label w = new Label("CHOOSE THE NUMBER OF SPOTS YOU WANT TO PLAY");
		w.setFont(new Font("Arial",60));
		w.setWrapText(true);
		w.setTextFill(Color.web("#000000"));

		//alignment to center
		w.setAlignment(Pos.CENTER);

		//event handler for the next button
		EventHandler<ActionEvent> next_handler;
		next_handler = e->{
			rand_screen(primaryStage,picture,no_spots,no_chances);
		};
		next.setOnAction(next_handler);

		//reset button handler
		EventHandler<ActionEvent> reset_handler;
		reset_handler = e->{
			for(Node n: pane1.getChildren()){
				Button btn = (Button)n;
				btn.setDisable(false);
				num_arr.clear();
				counter = 0;
			}
		};
		reset.setOnAction(reset_handler);


		// event handler for random
		EventHandler<ActionEvent> rand_1;
		rand_1 = e->{
			for(Node n: pane1.getChildren()){ // disabling all the buttons
				Button btn = (Button)n;
				btn.setDisable(true);
				num_arr.clear(); // clearing array
				counter = 0;
			}
			ArrayList<Integer> r_i = getrandom(no_spots);
			num_arr = r_i;
			for (Integer integer : r_i) { // turning random buttons on and adding them to array
				for (Node n : pane1.getChildren()) {
					Button btn = (Button) n;
					String a = btn.getText();
					int s = Integer.parseInt(a);
					if (s == integer) {
						btn.setDisable(false);
						break;
					}
				}
			}
			next.setDisable(false);
		};
		rand.setOnAction(rand_1);

		//making a new vbox and
		VBox A = new VBox();
		A.setSpacing(10);
		A.setAlignment(Pos.BOTTOM_LEFT);

		//adding the buttons to the vbox
		A.getChildren().add(rand);
		A.getChildren().add(reset);

		//setting up the alignments as well
		pane.setTop(w);
		BorderPane.setAlignment(next, Pos.BOTTOM_RIGHT);
		pane.setRight(next);

		//setting up the alignments
		BorderPane.setAlignment(A, Pos.BOTTOM_LEFT);
		pane.setLeft(A);


		//now you show the scene
		Scene scene = new Scene(pane,700,700);
		primaryStage.setScene(scene);
		primaryStage.show();


	}

	//no_of_chances function
	private void no_of_chances(Stage primaryStage,String picture,int no_spots){

		//new grid pane and setting up the horizontal and vertical gaps
		GridPane pane1 = new GridPane();
		pane1.setPadding(new Insets(1)); //padding set up
		pane1.setHgap(70);
		pane1.setVgap(20);

		//position it to the center
		pane1.setAlignment(Pos.CENTER);


		final int[] spots = {0};
		Button next = new Button("Next");
		next.setMinSize(70, 30);
		next.setStyle("-fx-font-size: 2em; -fx-border-width: 3px;");
		next.setDisable(true); //set it to true because we do not want to click the next button to true



		int number = 0;
		for (int r = 0; r < 2; r++) {
			for (int c = 0; c < 2; c++) {
				number++;
				int j = number;
				Button button = new Button(String.valueOf(number));
				button.setMinSize(200, 100);
				button.setStyle("-fx-font-size: 3em; -fx-border-width: 6px;");
				pane1.add(button, c, r);
				EventHandler<ActionEvent> button_handler;
				button_handler = e->{
					next.setDisable(false);
					spots[0] = j;
				};
				button.setOnAction(button_handler);

			}
		}

		//make a new border pane and set up the background and center
		BorderPane pane = new BorderPane();
		set_background_b(picture,pane);
		pane.setCenter(pane1);

		//new text for "CHOOSE THE NUMBER OF DRAWING"
		Label w = new Label("CHOOSE THE NUMBER OF DRAWING");
		w.setFont(new Font("Arial",60));
		w.setWrapText(true);
		w.setTextFill(Color.web("#000000"));
		w.setAlignment(Pos.CENTER);

		//next button handler
		EventHandler<ActionEvent> next_handler;
		next_handler = e->{
			bet_card( primaryStage, picture, no_spots, spots[0]);
		};
		next.setOnAction(next_handler);

		//alignments
		pane.setTop(w);
		BorderPane.setAlignment(next, Pos.BOTTOM_RIGHT);
		pane.setRight(next);

		//show up the new scene
		Scene scene = new Scene(pane,700,700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	//no_of_spots function where you show how many spots you have left
	private void no_of_spots(Stage primaryStage,String picture){

		//make a new grid pane and set up the padding, horizontal gap and vertical gap
		GridPane pane1 = new GridPane();
		pane1.setPadding(new Insets(1));
		pane1.setHgap(70);
		pane1.setVgap(20);

		//alignment from the frame
		pane1.setAlignment(Pos.CENTER);

		//new array num for the 1,4,8,10 spots that you have
		int[] num = {1,4,8,10};

		final int[] spots = {0};

		//next button and set up the style and disable it once we have clicked it
		Button next = new Button("Next");
		next.setMinSize(70, 30);
		next.setStyle("-fx-font-size: 2em; -fx-border-width: 3px;");
		next.setDisable(true);

		//back button
		Button back = new Button("Back");
		back.setMinSize(70, 30);
		back.setStyle("-fx-font-size: 2em; -fx-border-width: 3px;");

		//creating a loop for a 2 by 2 grid with 4 buttons
		for (int r = 0; r < 2; r++) {
			for (int c = 0; c < 2; c++) {
				int number = 2 * r + c;
				Button button = new Button(String.valueOf(num[number]));
				button.setMinSize(200, 100);
				button.setStyle("-fx-font-size: 3em; -fx-border-width: 6px;");
				pane1.add(button, c, r);
				EventHandler<ActionEvent> button_handler;
				button_handler = e->{
					next.setDisable(false);
					int i = num[number];
					spots[0] = i;
				};
				button.setOnAction(button_handler);

			}
		}

		//new border pane and set up
		BorderPane pane = new BorderPane();
		set_background_b(picture,pane);
		pane.setCenter(pane1);

		//new text for "CHOOSE THE NUMBER OF SPOTS YOU WANT TO PLAY" and set up the font and styling
		Label w = new Label("CHOOSE THE NUMBER OF SPOTS YOU WANT TO PLAY");
		w.setFont(new Font("Arial",60));
		w.setWrapText(true);
		w.setTextFill(Color.web("#000000"));

		//alignment
		w.setAlignment(Pos.CENTER);

		//next button event handler
		EventHandler<ActionEvent> next_handler;
		next_handler = e->{
			no_of_chances(primaryStage,picture,spots[0]);
		};
		next.setOnAction(next_handler);

		//back button event handler
		EventHandler<ActionEvent> back_handler;
		back_handler = e->{

			Welcomescreen(primaryStage,picture);
		};
		back.setOnAction(back_handler);


		//alignments
		pane.setTop(w);
		BorderPane.setAlignment(next, Pos.BOTTOM_RIGHT);
		BorderPane.setAlignment(back, Pos.BOTTOM_LEFT);
		pane.setRight(next);
		pane.setLeft(back);

		//now you make it show to the frame
		Scene scene = new Scene(pane,700,700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}


// welcome screen displays the welcome screen
	private void Welcomescreen(Stage primaryStage,String picture){

		//event handler for the menu 3
		EventHandler<ActionEvent> menu_handler;

		//new grid pane and set up
		GridPane pane1 = new GridPane();
		set_background(picture,pane1); // changing the background of the gridpane

		//start and menu button
		Button start = new Button("Start");
		Button menu = new Button("Menu");
		//new text for the welcoming to KENO and set up
		Label w = new Label("WELCOME TO KENO");
		w.setFont(new Font("Arial",50));
		w.setTextFill(Color.web("#FFD700"));

		//menu button handler
		menu_handler = e->{
			MenuScreen(primaryStage,picture);
		};
		menu.setOnAction(menu_handler);

		//start button handler
		EventHandler<ActionEvent> start_handler;
		start_handler = e->{
			no_of_spots(primaryStage,picture);
		};
		start.setOnAction(start_handler);


		start.setMaxSize(150,100);

		// changing button style
		start.setStyle("-fx-background-color: #FFFF00; -fx-font-size: 3em; -fx-border-color: #545454; -fx-border-width: 2px;");
		menu.setStyle("-fx-background-color: #FFFF00; -fx-font-size: 1em; -fx-border-color: #545454; -fx-border-width: 2px;");
		pane1.setHgap(100);
		pane1.setVgap(100);

		// adding buttons to the gridpane
		pane1.add(menu,5,0);
		pane1.add(start,3,4);
		pane1.add(w,1,0,5,5);

		// adding
		Scene scene = new Scene(pane1,700,700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Welcome to Keno");

		Welcomescreen(primaryStage,"2.jpg");

	}

}
