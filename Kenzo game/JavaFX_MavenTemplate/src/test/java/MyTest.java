import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

class MyTest {

	// test when 1 spot and 0 match
	@Test
	void get_T_1() {
		int num = JavaFXTemplate.get_T(1,0);

        assertEquals(0,num,"get_T failed");

	}

	// test when 1 spot and 1 match
	@Test
	void get_T_2() {
		int num = JavaFXTemplate.get_T(1,1);

		assertEquals(2,num,"get_T failed");

	}

	// test when 4 spot and 1 match
	@Test
	void get_T_3() {
		int num = JavaFXTemplate.get_T(4,1);

		assertEquals(0,num,"get_T failed");

	}


	// test when 4 spot and 2 match
	@Test
	void get_T_4() {
		int num = JavaFXTemplate.get_T(4,2);

		assertEquals(1,num,"get_T failed");

	}

	// test when 4 spot and 3 match
	@Test
	void get_T_5() {
		int num = JavaFXTemplate.get_T(4,3);

		assertEquals(5,num,"get_T failed");

	}

	// test when 4 spot and 4 match
	@Test
	void get_T_6() {
		int num = JavaFXTemplate.get_T(4,4);

		assertEquals(75,num,"get_T failed");

	}

	// test when 8 spot and 0 match
	@Test
	void get_T_7() {
		int num = JavaFXTemplate.get_T(8,0);

		assertEquals(0,num,"get_T failed");

	}

	// test when 8 spot and 4 match
	@Test
	void get_T_8() {
		int num = JavaFXTemplate.get_T(8,4);

		assertEquals(2,num,"get_T failed");

	}

	// test when 8 spot and 5 match
	@Test
	void get_T_9() {
		int num = JavaFXTemplate.get_T(8,5);

		assertEquals(12,num,"get_T failed");

	}

	// test when 8 spot and 6 match
	@Test
	void get_T_10() {
		int num = JavaFXTemplate.get_T(8,6);

		assertEquals(50,num,"get_T failed");

	}

	// test when 8 spot and 7 match
	@Test
	void get_T_11() {
		int num = JavaFXTemplate.get_T(8,7);

		assertEquals(750,num,"get_T failed");

	}

	// test when 8 spot and 8 match
	@Test
	void get_T_12() {
		int num = JavaFXTemplate.get_T(8,8);

		assertEquals(10000,num,"get_T failed");

	}

	// test when 10 spot and 0 match
	@Test
	void get_T_13() {
		int num = JavaFXTemplate.get_T(10,0);

		assertEquals(5,num,"get_T failed");

	}

	// test when 10 spot and 1 match
	@Test
	void get_T_14() {
		int num = JavaFXTemplate.get_T(10,1);

		assertEquals(0,num,"get_T failed");

	}

	// test when 10 spot and 5 match
	@Test
	void get_T_15() {
		int num = JavaFXTemplate.get_T(10,5);

		assertEquals(2,num,"get_T failed");

	}

	// test when 10 spot and 6 match
	@Test
	void get_T_16() {
		int num = JavaFXTemplate.get_T(10,6);

		assertEquals(15,num,"get_T failed");

	}

	// test when 10 spot and 7 match
	@Test
	void get_T_17() {
		int num = JavaFXTemplate.get_T(10,7);

		assertEquals(40,num,"get_T failed");

	}

	// test when 10 spot and 8 match
	@Test
	void get_T_18() {
		int num = JavaFXTemplate.get_T(10,8);

		assertEquals(450,num,"get_T failed");

	}

	// test when 10 spot and 9 match
	@Test
	void get_T_19() {
		int num = JavaFXTemplate.get_T(10,9);

		assertEquals(4250,num,"get_T failed");

	}

	// test when 10 spot and 10 match
	@Test
	void get_T_20() {
		int num = JavaFXTemplate.get_T(10,10);

		assertEquals(100000,num,"get_T failed");

	}

	@Test
	void getrandom_1(){
		ArrayList<Integer> a = JavaFXTemplate.getrandom(1);
		assertEquals(1,a.size(),"get_T failed");
	}

	@Test
	void getrandom_2(){
		ArrayList<Integer> a = JavaFXTemplate.getrandom(2);
		assertEquals(2,a.size(),"get_T failed");
	}

	@Test
	void getrandom_3(){
		ArrayList<Integer> a = JavaFXTemplate.getrandom(4);
		assertEquals(4,a.size(),"get_T failed");
	}

	@Test
	void getrandom_4(){
		ArrayList<Integer> a = JavaFXTemplate.getrandom(8);
		assertEquals(8,a.size(),"get_T failed");
	}

	@Test
	void getrandom_5(){
		ArrayList<Integer> a = JavaFXTemplate.getrandom(10);
		assertEquals(10,a.size(),"get_T failed");
	}

	@Test
	void getrandom_6(){
		ArrayList<Integer> a = JavaFXTemplate.getrandom(20);
		assertEquals(20,a.size(),"get_T failed");

	}



}
