package com.vektorel.projetakip.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.vektorel.projetakip.dao.DAO;
import com.vektorel.projetakip.entity.UserEntity;
import com.vektorel.projetakip.model.User;

@ManagedBean
@ViewScoped
public class LoginBean implements Serializable{

	private UserEntity userEntity;
//	
//	@PostConstruct
//	public void init(){
//		this.userEntity = new UserEntity();
//	}
//	
	
	public String login(){
		DAO dao = new DAO();
		User user = dao.checkUser(this.userEntity);
		if(user == null)
			return "fail.xhtml";
		else
			return "anasayfa.xhtml";
	}
	
	
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	public UserEntity getUserEntity() {
		return userEntity;
	}
	
	
}
