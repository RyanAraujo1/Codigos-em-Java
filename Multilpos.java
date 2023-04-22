package aula1;
import java.util.*;
public class Multilpos {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		System.out.println("Digite dois valores:");
	
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n2 % n1 == 0 || n1 % n2 == 0 ) {
			System.out.println("São multiplos!");
		}else {
			System.out.println("Não são multiplos!");
		}
	
		sc.close();
	}
}
