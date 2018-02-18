import java.util.Scanner;

public class EE27Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		int[] tab = new int[3];
		int total = 0;
		
		for(int i = 0; i < 3; i++) {
			tab[i] = sc.nextInt();
			total = total + tab[i];
		}
		System.out.println(name);
		System.out.println(total/3);
	}

}
