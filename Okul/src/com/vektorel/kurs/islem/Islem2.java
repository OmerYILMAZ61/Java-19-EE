package com.vektorel.kurs.islem;

import java.util.List;
import java.util.Scanner;

import com.vektorel.kurs.dao.DAO;
import com.vektorel.kurs.entity.Adres;
import com.vektorel.kurs.entity.Hizmetli;
import com.vektorel.kurs.entity.Ogrenci;

public class Islem2 {
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		Scanner scanner = new Scanner(System.in);

//		addOgrenci(dao,scanner);
//		addMudur(dao,scanner);
//		addAdres(dao,scanner);
		getOgrenci(dao,scanner);
//		deleteOgrenci(dao,scanner);
//		getAdresList(dao);
		
//		addHizmetli(dao,scanner);
//		getHizmetliList(dao);
		
		Adres adres = getAdres(dao,scanner);
		addOgrenciAdres(dao,scanner,adres);

	}

	private static void addOgrenciAdres(DAO dao, Scanner scanner, Adres adres) {
		System.out.println("Ogrenci Gir");
		String veri = scanner.next();
		Ogrenci ogrenci =  new Ogrenci(veri);
		ogrenci.setAdres(adres);
		dao.addStudent(ogrenci);			
	}

	private static Adres getAdres(DAO dao, Scanner scanner) {
		Adres adres = dao.getAdres(Integer.parseInt(scanner.next()));
		return adres;
	}

	private static void addOgrenciAdres(DAO dao, Scanner scanner) {
		System.out.println("Ogrenci Gir");
		String veri = scanner.next();
		dao.addStudent(new Ogrenci(veri));		
	}

	private static void getHizmetliList(DAO dao) {
		List<Hizmetli> list = dao.getHizmetliList();
		
		for (Hizmetli hizmetli : list) {
			System.out.println(hizmetli.getName());
		}
		
	}

	private static void addHizmetli(DAO dao, Scanner scanner) {
		String veri =  scanner.next();
		Hizmetli hizmetli = new Hizmetli();
		hizmetli.setName(veri);
		dao.addValue(hizmetli);
	}

	private static void deleteOgrenci(DAO dao,Scanner scanner) {
		System.out.println("Silinecek Ogrenci id");
		dao.deleteStudent(scanner.nextInt());
	}

	private static void getAdresList(DAO dao) {
		List<Adres> list = dao.getAdresList();
		
//		for (int i = 0; i < list.size(); i++) {
//			Adres adres = list.get(i);
//		}
		
		for (Adres adres : list) {
			System.out.println(adres.getAdres());
		}
	}

	private static void getOgrenci(DAO dao,Scanner scanner) {
		System.out.println("Ogrenci ver id");
		Ogrenci ogrenci = dao.getStudent(Integer.parseInt(scanner.next()));
		System.out.println(ogrenci.getAdres().getAdres());
	}

	private static void addOgrenci(DAO dao,Scanner scanner) {
		System.out.println("Ogrenci Gir");
		String veri = scanner.next();
		dao.addStudent(new Ogrenci(veri));
	}

	private static void addAdres(DAO dao,Scanner scanner) {
		System.out.println("Adres Gir");
		String veri = scanner.next();
		dao.addAdres(new Adres(veri));	
	}
}
