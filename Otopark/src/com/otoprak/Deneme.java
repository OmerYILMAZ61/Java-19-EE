package com.otoprak;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ApplicationScoped
public class Deneme implements Serializable{
	String veri;
	
	public void setVeri(String veri) {
		this.veri = veri;
	}
	
	public String getVeri() {
		return veri;
	}

}
