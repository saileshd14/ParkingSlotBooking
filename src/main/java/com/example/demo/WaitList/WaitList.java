
package com.example.demo.WaitList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WaitList")
public class WaitList {
 
	@Id
	@GeneratedValue
	private int sNo;
	private int iD;
	private String parkingSlot;
	private String location;
	
	public WaitList() {
	}

	public WaitList(int sNo, int iD, String parkingSlot, String location) {
		this.sNo = sNo;
		this.iD = iD;
		this.parkingSlot = parkingSlot;
		this.location = location;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
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
	
	
	
}
