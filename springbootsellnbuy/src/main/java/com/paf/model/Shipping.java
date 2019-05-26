package com.paf.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;	
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Shipping")
@EntityListeners(AuditingEntityListener.class)
public class Shipping implements Serializable{
	
	private static final long serialVersionUID = 1143993377101043360L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int mid;
	private String address;
	private float cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
