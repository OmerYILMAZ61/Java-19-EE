package com.vektorel.kurs.islem2;

import java.util.ArrayList;
import java.util.List;

import com.vektorel.kurs.dao.DAO;
import com.vektorel.kurs.entity.Adres;
import com.vektorel.kurs.entity.Hizmetli;
import com.vektorel.kurs.entity.Mudur;
import com.vektorel.kurs.entity.Ogrenci;

public class Islem {
	
	public static void main(String[] args) {
		DAO dao = new DAO();
//		mudurEkle(dao);
//		Mudur mudur = dao.getMudur(16);
//		System.out.println(mudur.getOgrenci().get(0).getAdres().getAdres());
//		System.out.println(ogrenci);
		
//		ogrenciEkle(dao);
		
		Ogrenci ogrenci = dao.getStudent(24);
		
		System.out.println(ogrenci.getHizmetli().get(0).getName());
		
	}

	private static void ogrenciEkle(DAO dao) {
		
		Hizmetli hizmetli1 = new Hizmetli();
		
		hizmetli1.setName("fatma");
		
		Hizmetli hizmetli2 = new Hizmetli();
		
		hizmetli2.setName("ayse");
		
		dao.addValue(hizmetli1);
		dao.addValue(hizmetli2);

		
		List<Hizmetli> hizmetlis = new ArrayList<>();
		
		hizmetlis.add(hizmetli1);
		hizmetlis.add(hizmetli2);
		
		Adres adres = new Adres("asd/Ankara");
		dao.addAdres(adres);
		
		Ogrenci ogrenci = new Ogrenci("Ahmet");
		ogrenci.setAdres(adres);
		ogrenci.setHizmetli(hizmetlis);
		
		dao.addStudent(ogrenci);		
	}

	private static void mudurEkle(DAO dao) {
		Adres adres = new Adres("Çankaya/Ankara");
		dao.addAdres(adres);
		
		Ogrenci ogrenci = new Ogrenci("Onur");
		ogrenci.setAdres(adres);
		dao.addStudent(ogrenci);
		
		Adres adres2 = new Adres("Güvercinlik/Ankara");
		dao.addAdres(adres2);
		Ogrenci ogrenci2 = new Ogrenci("Recep");
		ogrenci2.setAdres(adres2);
		dao.addStudent(ogrenci2);
		Mudur mudur = new Mudur();
		
		mudur.setName("Þemo");
		
		List<Ogrenci> arrayOgrenci = new ArrayList<>();
		arrayOgrenci.add(ogrenci);
		arrayOgrenci.add(ogrenci2);
		
		mudur.setOgrenci(arrayOgrenci);
		dao.addValue(mudur);		
	}

}
