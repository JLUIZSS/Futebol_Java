package src;

import java.util.Scanner;

public class Jogo_Jogador {

private int id;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 Jogo_Jogador mn = new Jogo_Jogador();
	 
System.out.println("Digite a id do Jogo_Jogador");
mn.setId(sc.nextInt());
sc.close();
}
}