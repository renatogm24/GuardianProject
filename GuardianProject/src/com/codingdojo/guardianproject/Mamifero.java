package com.codingdojo.guardianproject;

public class Mamifero {

	protected int nivelDeEnergia;
	protected String prueba = "";
	
	public String getPrueba() {
		return prueba;
	}

	
	public Mamifero(String prueba) {
		this.nivelDeEnergia = 100;
		this.prueba = prueba;
	}
	
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
