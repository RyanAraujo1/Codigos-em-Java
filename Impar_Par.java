package aula1;
import java.util.*;
public class Impar_Par {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int num,resultado;
		
		System.out.println("Diigite um valor:");
		num = sc.nextInt();
		resultado = num % 2;
		
		if(resultado == 0) {
			System.out.println("Par");
		}else {
			System.out.println("impar");
		}
		
		sc.close();
	}

}
