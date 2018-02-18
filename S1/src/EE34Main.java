import java.util.Scanner;

public class EE34Main {

	public static void discard(String stc) {
		char prev = '.';
		char ances = '.';
		for (char c : stc.toCharArray()) {
			if (prev == '\'' && 
					((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) && 
					((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))){
				System.out.print(prev);
			}
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
				System.out.print(c);
			}
			else if (c != '\''){				
				System.out.println("");
			}
			ances = prev;
			prev = c;			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stc = sc.nextLine();
		
		discard(stc);
	}

}
