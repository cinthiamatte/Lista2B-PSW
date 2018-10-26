package udc.edu.psw;

import java.util.Scanner;

public class Retangulo {
	private int comprimento = 1;
	private int largura = 1;
	private int per;
	public Scanner scan = new Scanner(System.in);
	
	public void entrada() {
		System.out.println("Comprimento do retangulo:");
		comprimento = scan.nextInt();
		System.out.println("Largura do retangulo:");
		largura = scan.nextInt();
	}
	
	public int CalculaPerimetro(){

		per = ((comprimento*comprimento)+(largura*largura));
		
		return per;
	}
	
	public String toString() {
		return String.format("Perimetro do Retangulo %d", per);
	}
	
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
}
