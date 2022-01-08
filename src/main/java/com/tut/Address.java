package com.tut;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;


@Entity
@Table(name = "student_address")
public class Address {
	
 @Id	
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 //@Column(name = "address_id")
  private int adresssId;
  private String street;
  private String city;
  private boolean isOpen;
  
  @Transient
  private double x;
  
  @Temporal(TemporalType.DATE)
  private Date addedDate;
  
  @Lob
  private byte[] image;
  
  public int getAdresssId() {
	return adresssId;
}
public void setAdresssId(int adresssId) {
	this.adresssId = adresssId;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public boolean isOpen() {
	return isOpen;
}
public void setOpen(boolean isOpen) {
	this.isOpen = isOpen;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public Date getAddedDate() {
	return addedDate;
}
public void setAddedDate(Date addedDate) {
	this.addedDate = addedDate;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int adresssId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
	super();
	this.adresssId = adresssId;
	this.street = street;
	this.city = city;
	this.isOpen = isOpen;
	this.x = x;
	this.addedDate = addedDate;
	this.image = image;
}

}
