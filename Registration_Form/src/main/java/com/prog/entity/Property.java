package com.prog.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Property implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

private int id;
	
	private String name;
	private String picture;
	private String location;
	private Long price;
	private String description;
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
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Property(int id, String name, String picture, String location, Long price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.picture = picture;
		this.location = location;
		this.price = price;
		this.description = description;
	}
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Property [id=" + id + ", name=" + name + ", picture=" + picture + ", location=" + location + ", price="
				+ price + ", description=" + description + "]";
	}
	
}
