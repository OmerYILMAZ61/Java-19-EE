package com.vektorel.kurs.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "manager")
public class Mudur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(name ="isim")
	String name;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name="mudur_ognreci",joinColumns = @JoinColumn(name = "mudur_id"),
						inverseJoinColumns = @JoinColumn(name = "ogrenci_id"))
	List<Ogrenci> ogrenci = new ArrayList<>();
	
	
	public Mudur() {
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setOgrenci(List<Ogrenci> ogrenci) {
		this.ogrenci = ogrenci;
	}
	
	public List<Ogrenci> getOgrenci() {
		return ogrenci;
	}

}
