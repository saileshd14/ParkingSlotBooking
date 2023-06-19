package com.example.demo.ParkingSlot;

import com.example.demo.User.User;
import com.example.demo.Worker.Worker;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ParkingSlot")
public class ParkingSlot {
	
	@Id
	@GeneratedValue 
	private int id;
	String parkingSlot;
	String location;
	float rating;
	public ParkingSlot()
	{
		
	}
	public ParkingSlot(int id, String parkingSlot, String location, float rating, User user) {
		super();
		this.id = id;
		this.parkingSlot = parkingSlot;
		this.location = location;
		this.rating = rating;

	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getParkingSlot() {
		return parkingSlot;
	}
	public void setParkingSlot(String parkingSlot) {
		this.parkingSlot = parkingSlot;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
}
