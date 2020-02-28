package src.desafios;

import java.util.Scanner;

public class Desafio1 {
	
	public static void main(String[] args) {
		Desafio1.desafio1();
		
	}

	public static void desafio1() {
		int Val;

		System.out.println("Digite um Numero: ");
		Scanner scanVal = new Scanner(System.in);
		Val = scanVal.nextInt();
			
		if (Val % 2 == 0){
			System.out.println("O Numero é par");
		} else {
			System.out.println("O Numero é impar");
		}
	}
}





