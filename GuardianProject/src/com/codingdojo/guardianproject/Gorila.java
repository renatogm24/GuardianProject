package com.codingdojo.guardianproject;

public class Gorila extends Mamifero {
	public void lanzarAlgo() {
		System.out.println("El gorila lanzo un objeto");
		this.setNivelDeEnergia(getNivelDeEnergia()-3);
	}
	
	public void comerBananas() {
		System.out.println("El gorila esta contento");
		this.setNivelDeEnergia(getNivelDeEnergia()+10);
	}
	
	public void escalar() {
		System.out.println("El gorila ha trepado el arbol");
		this.setNivelDeEnergia(getNivelDeEnergia()-10);
	}
}
