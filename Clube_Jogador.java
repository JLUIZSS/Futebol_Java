package src;

import java.util.Scanner;

public class Clube_Jogador {

private int id;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 Clube_Jogador mn = new Clube_Jogador ();
	 
System.out.println("Digite a id do Clube_Jogador");
mn.setId(sc.nextInt());
sc.close();
}
}