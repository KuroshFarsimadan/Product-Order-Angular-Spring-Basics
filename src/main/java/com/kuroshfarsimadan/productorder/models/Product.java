package com.kuroshfarsimadan.productorder.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Kurosh Farsi Madan
 *
 */
/* Plain Old Java Object (POJO) */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	private String email;
	private String phone;
	private String model;
	private String serialNumber;
	private double orderPrice;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date orderDate;
	private Boolean hasBeenContacted;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		// Note that we are not going to set ID on our side in post / creation. This is to let serialization occur
		// and that we can retrieve the ID from the database
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the orderPrice
	 */
	public double getOrderPrice() {
		return orderPrice;
	}
	/**
	 * @param orderPrice the orderPrice to set
	 */
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return the hasBeenContacted
	 */
	public Boolean getHasBeenContacted() {
		return hasBeenContacted;
	}
	/**
	 * @param hasBeenContacted the hasBeenContacted to set
	 */
	public void setHasBeenContacted(Boolean hasBeenContacted) {
		this.hasBeenContacted = hasBeenContacted;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
}
