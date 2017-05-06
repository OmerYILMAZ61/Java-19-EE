package com.otoprak;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Toplama implements Serializable {
	
	int aVerisi;
	int bVerisi;
	int sonuc; 
	
	public void topla(){
		this.sonuc = aVerisi + bVerisi;
	}

	public int getaVerisi() {
		return aVerisi;
	}
	public void setaVerisi(int aVerisi) {
		this.aVerisi = aVerisi;
	}
	public int getbVerisi() {
		return bVerisi;
	}
	public void setbVerisi(int bVerisi) {
		this.bVerisi = bVerisi;
	}
	public int getSonuc() {
		return sonuc;
	}
	public void setSonuc(int sonuc) {
		this.sonuc = sonuc;
	}
	
	
	

}
