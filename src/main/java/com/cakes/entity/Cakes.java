package com.cakes.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Cakes {

	@Id
	@GeneratedValue
	private int id;
	
	private String CakeType;
	private String CakeName;
	private double weight;
	private int price;

	@ManyToMany
	@JoinTable(name="orders_cakes",
	joinColumns=@JoinColumn(name="cakes_id"),
	inverseJoinColumns=@JoinColumn(name="orders_id"))
	private List<Orders> orders = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name="ingredient_cakes",
	joinColumns = @JoinColumn(name="cakes_id"),
	inverseJoinColumns=@JoinColumn(name="ingredient_id"))
	private List<Ingredient> ingredient = new ArrayList<>();

	@ManyToOne
	private Chef chef;

	public Cakes() {
		// TODO Автоматически созданная заглушка конструктора
	}

	public Cakes(String cakeType, String cakeName, double weight) {
		super();
		CakeType = cakeType;
		CakeName = cakeName;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCakeType() {
		return CakeType;
	}

	public void setCakeType(String cakeType) {
		CakeType = cakeType;
	}

	public String getCakeName() {
		return CakeName;
	}

	public void setCakeName(String cakeName) {
		CakeName = cakeName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public List<Ingredient> getIngredient() {
		return ingredient;
	}

	public void setIngredient(List<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}


	@Override
	public String toString() {
		return "Cakes{" +
				"id=" + id +
				", CakeType='" + CakeType + '\'' +
				", CakeName='" + CakeName + '\'' +
				", weight=" + weight +
				", price=" + price +
				", ingredient=" + ingredient +
				'}';
	}
}
