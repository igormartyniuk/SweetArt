package com.cakes.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Ingredient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;
	private double weight;
	private double price;

	@ManyToMany
	@JoinTable(name="ingredient_cakes",
	joinColumns = @JoinColumn(name="ingredient_id"),
	inverseJoinColumns=@JoinColumn(name="cakes_id"))
	private List<Cakes> cakes = new ArrayList<>();
	
	
	
	public Ingredient() {
		// TODO Автоматически созданная заглушка конструктора
	}

	public Ingredient(String name) {
		super();
		this.name = name;
	}

	public Ingredient(String name, double price) {
		super();
		this.name = name;
		this.price = price;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Cakes> getCakes() {
		return cakes;
	}

	public void setCakes(List<Cakes> cakes) {
		this.cakes = cakes;
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
