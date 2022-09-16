package primeiroProg.JavaProg;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class JavaProg {
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		//tabuada
		int result = 0;
		
		String num1 = JOptionPane.showInputDialog(null, "Digite um numero para tabuada:");
		
		int num01 = Integer.parseInt(num1);
		
		String num = JOptionPane.showInputDialog(null, "Digite de onde iniciar:");
		
		int i = Integer.parseInt(num);
		
		String num3 = JOptionPane.showInputDialog(null, "Digite ate onde quer parar:");
		
		int num03 = Integer.parseInt(num3);
		
		for(;i<num03; i++) {
			result = num01 * i;
			
			JOptionPane.showMessageDialog(null, num01+ "x" +i+"="+result);
			
			if(result % 2 == 0) {
				JOptionPane.showMessageDialog(null, "Resultado com numero par");
			}else if(result % 2==1) {
				JOptionPane.showMessageDialog(null, "Resultado com numero impar");
			}
		}
			
 }
}
