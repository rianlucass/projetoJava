package primeiroProg.JavaProg;

import JavaProg.classes.Conta;

public class JavaProg {
	public static void main(String[] args) {
		
		Conta conta1 =  new Conta("rian", 20);
		
		conta1.sacar(200);
		
		System.out.println(conta1.getSaldo());
		
		
	}
}
