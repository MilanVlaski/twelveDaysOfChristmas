import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.*;

class TestApp {

	String expected;
	Poem main;
	
	@Before
	void setup() {
		main = new Poem();
		expected = "on the first day of christmas\n"
				+ "my true love gave to me\n"
				+ "a partridge in a pear tree\n\n";
	}
	@Test
	void testFirst() {
		setup();
		assertEquals(expected, main.poem(1));
	}
	@Test
	void testFirstAndSecond() {
		setup();
		expected += "on the second day of christmas\n"
				+ "my true love gave to me\n"
				+ "two turtle doves and\n"
				+ "a partridge in a pear tree\n\n";
		assertEquals(expected, main.poem(2));
	}
	@Test 
	void andTest(){
		setup();
		assertEquals(" and\n", main.and(1));
	}
	@Test 
	void writeFirstGiftTest(){
		setup();
		assertEquals("a partridge in a pear tree\n", main.writeGifts(0));
	}
	@Test 
	void writeSecondGiftTest(){
		setup();
		assertEquals("two turtle doves and\na partridge in a pear tree\n", main.writeGifts(1));
	}
	@Test
	void testFinal() {
		setup();
		expected = "on the first day of christmas\n"
				+ "my true love gave to me\n"
				+ "a partridge in a pear tree\n"
				+ "\n"
				+ "on the second day of christmas\n"
				+ "my true love gave to me\n"
				+ "two turtle doves and\n"
				+ "a partridge in a pear tree\n"
				+ "\n"
				+ "on the third day of christmas\n"
				+ "my true love gave to me\n"
				+ "three french hens\n"
				+ "two turtle doves and\n"
				+ "a partridge in a pear tree\n"
				+ "\n"
				+ "on the fourth day of christmas\n"
				+ "my true love gave to me\n"
				+ "four calling birds\n"
				+ "three french hens\n"
				+ "two turtle doves and\n"
				+ "a partridge in a pear tree\n"
				+ "\n"
				+ "on the fifth day of christmas\n"
				+ "my true love gave to me\n"
				+ "five golden rings\n"
				+ "four calling birds\n"
				+ "three french hens\n"
				+ "two turtle doves and\n"
				+ "a partridge in a pear tree\n"
				+ "\n"
				+ "on the sixth day of christmas\n"
				+ "my true love gave to me\n"
				+ "six geese a-laying\n"
				+ "five golden rings\n"
				+ "four calling birds\n"
				+ "three french hens\n"
				+ "two turtle doves and\n"
				+ "a partridge in a pear tree\n"
				+ "\n"
				+ "on the seventh day of christmas\n"
				+ "my true love gave to me\n"
				+ "seven swans a-swimming\n"
				+ "six geese a-laying\n"
				+ "five golden rings\n"
				+ "four calling birds\n"
				+ "three french hens\n"
				+ "two turtle doves and\n"
				+ "a partridge in a pear tree\n"
				+ "\n"
				+ "on the eight day of christmas\n"
				+ "my true love gave to me\n"
				+ "eight maids a-milking\n"
				+ "seven swans a-swimming\n"
				+ "six geese a-laying\n"
				+ "five golden rings\n"
				+ "four calling birds\n"
				+ "three french hens\n"
				+ "two turtle doves and\n"
				+ "a partridge in a pear tree\n"
				+ "\n"
				+ "on the ninth day of christmas\n"
				+ "my true love gave to me\n"
				+ "nine ladies dancing\n"
				+ "eight maids a-milking\n"
				+ "seven swans a-swimming\n"
				+ "six geese a-laying\n"
				+ "five golden rings\n"
				+ "four calling birds\n"
				+ "three french hens\n"
				+ "two turtle doves and\n"
				+ "a partridge in a pear tree\n"
				+ "\n"
				+ "on the tenth day of christmas\n"
				+ "my true love gave to me\n"
				+ "ten lords a-leaping\n"
				+ "nine ladies dancing\n"
				+ "eight maids a-milking\n"
				+ "seven swans a-swimming\n"
				+ "six geese a-laying\n"
				+ "five golden rings\n"
				+ "four calling birds\n"
				+ "three french hens\n"
				+ "two turtle doves and\n"
				+ "a partridge in a pear tree\n"
				+ "\n"
				+ "on the eleventh day of christmas\n"
				+ "my true love gave to me\n"
				+ "eleven pipers piping\n"
				+ "ten lords a-leaping\n"
				+ "nine ladies dancing\n"
				+ "eight maids a-milking\n"
				+ "seven swans a-swimming\n"
				+ "six geese a-laying\n"
				+ "five golden rings\n"
				+ "four calling birds\n"
				+ "three french hens\n"
				+ "two turtle doves and\n"
				+ "a partridge in a pear tree\n"
				+ "\n"
				+ "on the twelfth day of christmas,\n"
				+ "my true love gave to me\n"
				+ "twelve drummers drumming\n"
				+ "eleven pipers piping\n"
				+ "ten lords a-leaping\n"
				+ "nine ladies dancing\n"
				+ "eight maids a-milking\n"
				+ "seven swans a-swimming\n"
				+ "six geese a-laying\n"
				+ "five golden rings\n"
				+ "four calling birds\n"
				+ "three french hens\n"
				+ "two turtle doves and\n"
				+ "a partridge in a pear tree\n";
		assertEquals(expected, main.poem(12));
	}
	
}
