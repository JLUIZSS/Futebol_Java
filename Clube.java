package src;

import java.util.Scanner;

public class Clube {

private int id;
private String nome;

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
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 Clube mn = new Clube ();
	 
System.out.println("Digite a id do clube");
mn.setId(sc.nextInt());

System.out.println("Digite o nome do clube");
mn.setNome(sc.next());
sc.close();
}
}