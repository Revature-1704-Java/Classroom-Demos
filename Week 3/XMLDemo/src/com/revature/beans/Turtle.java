package com.revature.beans;

import java.io.Serializable;

public class Turtle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String color;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Turtle(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}

	public Turtle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Turtle [id=" + id + ", name=" + name + ", color=" + color + "]";
	}

}
