package aula1;
import java.util.*;
public class NumeroNegativo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int  numero;
		
		System.out.println("Digite um valor:");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO!");
		}else {
			System.out.println("NÃO NEGATIVO!");
		}
		
		sc.close();	
	}

}
