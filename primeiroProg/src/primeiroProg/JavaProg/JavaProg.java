package primeiroProg.JavaProg;

import java.util.Scanner;

public class JavaProg {
	public static void main(String[] args) {
		System.out.println("BEM-VINDO!!! primeiro programinha");
		
		Scanner input = new Scanner(System.in);
			String nome;
			
			double nota1, nota2;
			
			
			System.out.println("NOME DO ALUNO:");
			nome=input.next();
			
			System.out.println("primeira nota:");
			nota1=input.nextDouble();
			
			System.out.println("segunda nota:");
			nota2=input.nextDouble();
			
			
			double mediaFinal = (nota1 + nota2)/2;
			
			if (mediaFinal >= 7) {
				
				System.out.println("Aluno "+ nome +" aprovado com média " + mediaFinal);
				
			} else {
				System.out.println("Aluno "+ nome +" reprovado com média " + mediaFinal);
			}
			
			
		}

}
