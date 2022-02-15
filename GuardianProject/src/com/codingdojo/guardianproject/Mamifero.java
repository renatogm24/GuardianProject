package com.codingdojo.guardianproject;

public class Mamifero {

	private int nivelDeEnergia;
	
	public Mamifero() {
		this.nivelDeEnergia = 100;
	}
	
	public int mostrarEnergia() {
		System.out.println(this.nivelDeEnergia);
		return this.nivelDeEnergia;
	}

	public int getNivelDeEnergia() {
		return nivelDeEnergia;
	}

	public void setNivelDeEnergia(int nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}

}
