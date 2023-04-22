package aula1;
import java.util.*;
public class Calculadora {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Soma = [1] "
				+ "Subtração = [2] "
				+ "Divisão = [3] "
				+ "multiplicação = [4] ");
		int op = sc.nextInt();
	
		System.out.println("Digite um valor:");
		int n1 = sc.nextInt();
		
		System.out.println("Digite outro valor:");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		int sub = n1 - n2;
		int mult = n1 * n2;
		int divi = n1 / n2;
		
		if(op == 1) {
			System.out.println("A soma de "+n1+ " e "+n2 + " é "+ soma);
		}else {
			if(op == 2) {
				System.out.println("A Subtração de "+n1+ " e "+ n2+ " é "+sub);
			}else
				if(op == 3) {
					System.out.println("A divisão de "+n1+ " e "+ n2+ " é "+divi);
				}else 
					if(op == 4){
						System.out.println("A multiplicação "+n1 +" e "+ n2+ " é "+ mult);
						
					}		
		}
		
		sc.close();
		
	}}