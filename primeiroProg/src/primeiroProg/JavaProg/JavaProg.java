package primeiroProg.JavaProg;

import java.util.Scanner;

import javax.swing.JOptionPane;

import JavaProg.classes.Aluno;
 
public class JavaProg {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Nome do aluno:");
		String idade = JOptionPane.showInputDialog("Idade:");
		String cpf = JOptionPane.showInputDialog("digite seu cpf:");
		String nota1 = JOptionPane.showInputDialog("digite sua 1° nota:");
		String nota2 = JOptionPane.showInputDialog("digite sua 2° nota:");
		String nota3 = JOptionPane.showInputDialog("digite sua 3° nota:");
		String nota4 = JOptionPane.showInputDialog("digite sua 4° nota:");
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNumeroCpf(cpf);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		JOptionPane.showMessageDialog(null, "A media do aluno é "+ aluno1.getMedia());
		JOptionPane.showMessageDialog(null, aluno1.getResultado());
		
 }
}