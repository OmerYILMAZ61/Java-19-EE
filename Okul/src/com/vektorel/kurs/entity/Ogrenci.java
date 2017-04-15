package com.vektorel.kurs.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "ogrenci",schema ="okul")
public class Ogrenci {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(name = "name",nullable = true, length= 50)
	String name;
	
	@OneToOne
	@JoinColumn(name = "adres_id")
	Adres adres;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "ogrenci_hizmetli", 
	joinColumns = @JoinColumn(name = "ogrenci_id"),
	inverseJoinColumns = @JoinColumn(name = "hizmetli_id"))
	List<Hizmetli> hizmetli = new ArrayList<>();
	
	public Ogrenci() {
	}
	
	public Ogrenci(String veri) {
		this.name = veri;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	
	public Adres getAdres() {
		return adres;
	}

	
	public void setHizmetli(List<Hizmetli> hizmetli) {
		this.hizmetli = hizmetli;
	}
	
	public List<Hizmetli> getHizmetli() {
		return hizmetli;
	}
	
	

}
