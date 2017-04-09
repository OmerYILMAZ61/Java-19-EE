package com.vektorel.kurs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adres {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String adres;
	
	public Adres(){
		
	}
	
	public Adres(String veri) {
		this.adres = veri;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public int getId() {
		return id;
	}

}
