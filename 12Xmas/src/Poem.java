
public class Poem {

	String s = "";
	String[] days = {
	        "first", "second", "third", "fourth", "fifth", "sixth", "seventh",
	        "eighth", "ninth", "tenth", "eleventh", "twelfth"
	};
	String[] gifts = {
	        "a partridge in a pear tree", "two turtle doves",
	        "three french hens", "four calling birds",
	        "five golden rings", "six geese a-laying",
	        "seven swans a-swimming", "eight maids a-milking",
	        "nine ladies dancing", "ten lords a-leaping",
	        "eleven pipers piping", "twelve drummers drumming"
		};
	
	public String poem(int lines) {
		
		for(int i = 0; i < lines; i++) {
			s += "on the " + days[i] + " day of christmas\n"
					+ "my true love gave to me\n" 
					+ writeGifts(i) + "\n";		
		}
		
		return s;
	}
	public String and(int i) {
		if(i == 1)
			return " and\n";
		else return "\n";
	}
	
	public String writeGifts(int i) {
		String s = "";
		for(int j = i; j >= 0; j--) {
			s+= gifts[j] + and(j);
		}
		return s;

}
}
