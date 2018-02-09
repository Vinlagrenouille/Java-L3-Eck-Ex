import java.util.Scanner;

public class Ex34 {

	public static void discard(String stc) {
		char prev = '.';
		char ances = '.';
		for (char c : stc.toCharArray()) {
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
				System.out.print(c);
			}
			else {
				System.out.println("");
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stc = sc.nextLine();
		
		discard(stc);
	}

}
