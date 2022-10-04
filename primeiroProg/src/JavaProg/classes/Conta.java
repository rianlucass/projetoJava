package JavaProg.classes;

import java.util.Objects;

public class Conta {
	private String nome;
	private String email;
	private String cpf;
	private String rg;
	private int idade;
	private double saldo = 0;
	
	
	public double depositar(double deposito) {
		this.saldo =  deposito + saldo;
		return saldo;
	}
	
	public double sacar(double saque) {
		this.saldo = saldo - saque;
		
		return saldo;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", rg=" + rg + ", idade=" + idade + " saldo=" + saldo+"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	
	
	
	
}
