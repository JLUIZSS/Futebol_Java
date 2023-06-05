package src;

import java.util.Scanner;

public class Jogador {

	private int id;
	private String nome;
	private String clube;
	private int numero;
	private String data_nascimento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClube() {
		return clube;
	}
	public void setClube(String clube) {
		this.clube = clube;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Jogador mn = new Jogador ();
		 
System.out.println("Digite a id do jogador");
mn.setId(sc.nextInt());

System.out.println("Digite o nome do jogador");
mn.setNome(sc.next());

System.out.println("Digite o clube do jogador");
mn.setClube(sc.next());

System.out.println("Digite o número do jogador");
mn.setNumero(sc.nextInt());

System.out.println("Digite a data de nascimento do jogador");
mn.setData_nascimento (sc.next());

sc.close();
	}
}