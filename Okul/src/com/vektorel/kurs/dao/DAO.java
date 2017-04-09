package com.vektorel.kurs.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vektorel.kurs.entity.Adres;
import com.vektorel.kurs.entity.Hizmetli;
import com.vektorel.kurs.entity.Ogrenci;

public class DAO {
	
	SessionFactory sessionFactory;

	public DAO() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	
	public void addStudent(Ogrenci ogrenci){
		Session session = sessionFactory.openSession();
		Transaction tx =null;
		try{
		tx = session.beginTransaction();
		session.save(ogrenci);
		tx.commit();
		}catch (Exception e) {
			if(tx != null)
				tx.rollback();
		}finally {
			session.close();
		}
	}
	
	
	public void updateStudent(Ogrenci ogrenci){
		Session session = sessionFactory.openSession();
		Transaction tx =null;
		try{
		tx = session.beginTransaction();
		session.merge(ogrenci);
		tx.commit();
		}catch (Exception e) {
			if(tx != null)
				tx.rollback();
		}finally {
			session.close();
		}
	}


	public void addAdres(Adres adres) {
		Session session = sessionFactory.openSession();
		Transaction tx =null;
		try{
		tx = session.beginTransaction();
		session.save(adres);
		tx.commit();
		}catch (Exception e) {
			if(tx != null)
				tx.rollback();
		}finally {
			session.close();
		}		
	}


	public Ogrenci getStudent(int id) {
		Session session = sessionFactory.openSession();
		Ogrenci ogrenci  =null;
		try{
			session.beginTransaction();
			ogrenci = session.get(Ogrenci.class, id);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return ogrenci;
	}


	public List<Adres> getAdresList() {
		Session session = sessionFactory.openSession();
		List<Adres> list = null;
		try{
			
	        Criteria criteria = session.createCriteria(Adres.class);
	        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
	        list= (List<Adres>) criteria.list();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}


	public void deleteStudent(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx =null;
		try{
		tx = session.beginTransaction();
		Ogrenci ogrenci = session.get(Ogrenci.class, id);
		session.delete(ogrenci);
		tx.commit();
		}catch (Exception e) {
			if(tx != null)
				tx.rollback();
		}finally {
			session.close();
		}	
		
	}


	public void addValue(Object obj) {
		Session session = sessionFactory.openSession();
		Transaction tx =null;
		try{
		tx = session.beginTransaction();
		session.save(obj);
		tx.commit();
		}catch (Exception e) {
			if(tx != null)
				tx.rollback();
		}finally {
			session.close();
		}			
	}


	public List<Hizmetli> getHizmetliList() {
		Session session = sessionFactory.openSession();
		Transaction tx =null;
		List<Hizmetli> list = null;
		try{
		session.beginTransaction();
		list = session.createCriteria(Hizmetli.class).list();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}


	public Adres getAdres(int id) {
		Session session = sessionFactory.openSession();
		Adres adres  =null;
		try{
			session.beginTransaction();
			adres = session.get(Adres.class, id);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return adres;
	}
	
	

}
