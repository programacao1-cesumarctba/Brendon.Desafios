package src.desafios;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Desafio3.desafio3();
	}
	public static void desafio3(){
		
		int num;
		int fat = 1;
		System.out.println("Digite um numero: ");
		Scanner scannum = new Scanner(System.in);
		num = scannum.nextInt();
		
		for( int i = 2; i <= num; i++ )
		{
		fat *= i;
		}	
		System.out.println( "O Fatorial de: "+ num +" é igual a: "+ fat);
	}
}
	


