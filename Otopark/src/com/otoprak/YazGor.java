package com.otoprak;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class YazGor implements Serializable{
	String veri;
	
	public void setVeri(String veri) {
		this.veri = veri;
	}
	public String getVeri() {
		return veri;
	}

}
