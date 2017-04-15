package com.vektorel.kurs.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Hizmetli {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(length = 50)
	String name;
	
	@ManyToMany(mappedBy = "hizmetli")
	List<Ogrenci> ogrenci = new ArrayList<>();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	

}
