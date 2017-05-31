package com.cakes.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Chef {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String login;
	private String password;
	
	@OneToMany(mappedBy="chef")
	private List<Orders> orders;
	
	
	@OneToMany(mappedBy="chef")
	private List<Cakes> cakes;
	
	
	
	public Chef() {
		// TODO Автоматически созданная заглушка конструктора
	}

	public Chef(String name, String login, String password) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Chef [id=" + id + ", name=" + name + ", login=" + login + ", password=" + password + "]";
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public List<Cakes> getCakes() {
		return cakes;
	}

	public void setCakes(List<Cakes> cakes) {
		this.cakes = cakes;
	}
	
	
	
}
