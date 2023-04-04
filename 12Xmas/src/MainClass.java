import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Poem p = new Poem();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite broj stihova:");
		String userString = scanner.next();
		
		System.out.println(p.poem(Integer.valueOf(userString)));
	}

}
