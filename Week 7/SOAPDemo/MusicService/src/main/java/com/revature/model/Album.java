package com.revature.model;

public class Album {

	private String title;
	private String artist;
	private double price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Album(String title, String artist, double price) {
		super();
		this.title = title;
		this.artist = artist;
		this.price = price;
	}

	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Album [title=" + title + ", artist=" + artist + ", price=" + price + "]";
	}

}
