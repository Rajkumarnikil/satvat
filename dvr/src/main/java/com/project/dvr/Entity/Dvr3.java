package com.project.dvr.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="dvr3")
public class Dvr3 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dvr3_id")
	private long id;
	
	@Column(name="camera_Name")
	private String cameraName;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="Floor_name")
	private int floorNumber;
	
	
	
	
	
	public Dvr3() {
		
	}





	public Dvr3(long id, String cameraName, String location, int floorNumber) {
		super();
		this.id = id;
		this.cameraName = cameraName;
		this.location = location;
		this.floorNumber = floorNumber;
	}





	public long getId() {
		return id;
	}





	public void setId(long id) {
		this.id = id;
	}





	public String getCameraName() {
		return cameraName;
	}





	public void setCameraName(String cameraName) {
		this.cameraName = cameraName;
	}





	public String getLocation() {
		return location;
	}





	public void setLocation(String location) {
		this.location = location;
	}





	public int getFloorNumber() {
		return floorNumber;
	}





	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	

	
}
