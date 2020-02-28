package src.desafios;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
	     Desafio2.desafio2();
	}
	public static void desafio2() {
		
		int Val;
		
		System.out.println("Digite um Numero: ");
		Scanner scanVal = new Scanner(System.in);
		Val = scanVal.nextInt();
		
		if(Val % 2 != 0){
			System.out.println("Estranho...");
		} else if((Val % 2 == 0)&&(Val < 10)) {
			
			System.out.println("Não é Estranho...");
			
		} else if((Val % 2 == 0)&&(Val >= 10)&&(Val <=20)){
			
			System.out.println("Estranho...");
			
		} else if((Val % 2 == 0)&&(Val > 20)){
			
			System.out.println("Não é Estranho...");	
		}	
	}		
}


