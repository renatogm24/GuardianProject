package com.codingdojo.guardianproject;

public class Murcielago extends Mamifero {
	public Murcielago() {
		this.nivelDeEnergia = 300;
	}
	
	public Murcielago(String prueba) {
		//this.prueba = prueba;
		super(prueba);
		this.nivelDeEnergia = 300;
	}
	
	public void volar() {
		System.out.println("Sonido murcielago");
		this.setNivelDeEnergia(getNivelDeEnergia()-50);
	}
	
	public void comerHumanos() {
		System.out.println("Sonido comiendo humano xD");
		this.setNivelDeEnergia(getNivelDeEnergia()+25);
	}
	
	public void atacarPueblo() {
		System.out.println("Sonido pueblo en llamas");
		this.setNivelDeEnergia(getNivelDeEnergia()-100);
	}
	
}
