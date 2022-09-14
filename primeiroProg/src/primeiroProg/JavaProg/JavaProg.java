package primeiroProg.JavaProg;

import java.util.Scanner;

public class JavaProg {
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		int num, impar = 0, par = 0;
		
		for( int numero = 1; numero <= 10; numero++ ) {
			
			
			System.out.println("digite o " +numero+"° numero:");
			num = scan.nextInt();
			
			if(num == 0) {
				System.out.println("zero nao é divisivel, digite novamente o "+numero+"°:");
				num = scan.nextInt();
				
			}
			
			if (num % 2 == 0){
				par++;
			}
			
			if (num % 2 == 1) {
				impar++;
			}
			
		}
		
		System.out.println("numeros pares:"+par);
		System.out.println("numeros impares:"+ impar);
		
		
 }
}
