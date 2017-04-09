package com.vektorel.kurs.islem;

import java.util.List;
import java.util.Scanner;

import com.vektorel.kurs.dao.DAO;
import com.vektorel.kurs.entity.Adres;
import com.vektorel.kurs.entity.Ogrenci;

public class Islem2 {
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		Scanner scanner = new Scanner(System.in);

//		addOgrenci(dao,scanner);
//		addMudur(dao,scanner);
//		addAdres(dao,scanner);
//		getOgrenci(dao,scanner);
//		deleteOgrenci(dao,scanner);
		getAdresList(dao);
	}

	private static void deleteOgrenci(DAO dao,Scanner scanner) {
		System.out.println("Silinecek Ogrenci id");
		dao.deleteStudent(scanner.nextInt());
	}

	private static void getAdresList(DAO dao) {
		List<Adres> list = dao.getAdresList();
		for (Adres adres : list) {
			System.out.println(adres.getAdres());
		}
	}

	private static void getOgrenci(DAO dao,Scanner scanner) {
		System.out.println("Ogrenci ver id");
		dao.getStudent(Integer.parseInt(scanner.next()));
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
