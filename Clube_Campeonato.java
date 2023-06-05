package src;

import java.util.Scanner;

public class Clube_Campeonato {

private int id;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 Clube_Campeonato mn = new Clube_Campeonato ();
	 
System.out.println("Digite a id do Clube_Campeonato");
mn.setId(sc.nextInt());
sc.close();
}
}