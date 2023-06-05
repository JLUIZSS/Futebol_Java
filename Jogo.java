package src;

import java.util.Scanner;

public class Jogo {

	private int id;
	private String data;
	private String hora;
	private String local;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public String getHora() {
		return hora;
	}



	public void setHora(String hora) {
		this.hora = hora;
	}



	public String getLocal() {
		return local;
	}



	public void setLocal(String local) {
		this.local = local;
	}



	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Jogo mn = new Jogo ();
		 
System.out.println("Digite a id do Jogo");
mn.setId(sc.nextInt());

System.out.println("Digite a Data do Jogo");
mn.setData(sc.next());

System.out.println("Digite a Hora do jogo");
mn.setHora(sc.next());

System.out.println("Digite o Local do Jogo");
mn.setLocal(sc.next());



sc.close();
	}
}