package com.cakes.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String type;
	private String CakeName;
	private int number;
	private int price;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private LocalDate date;
		
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Chef chef;
	

	@ManyToMany
	@JoinTable(name="orders_cakes",
	joinColumns=@JoinColumn(name="orders_id"),
	inverseJoinColumns=@JoinColumn(name="cakes_id"))
	private List<Cakes> cakes;
	
	
	public Orders() {
		// TODO Автоматически созданная заглушка конструктора
	}

	public Orders(String cakeName, int number, LocalDate date) {
		super();
		CakeName = cakeName;
		this.number = number;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCakeName() {
		return CakeName;
	}

	public void setCakeName(String cakeName) {
		CakeName = cakeName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public List<Cakes> getCakes() {
		return cakes;
	}

	public void setCakes(List<Cakes> cakes) {
		this.cakes = cakes;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ",CakeName=" + CakeName + ", number=" + number + ", price="
				+ price + ", date=" + date + "]";
	}

	
	
	
}
