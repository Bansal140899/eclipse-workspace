package com.ajay.entity;

import javax.persistence.*;

@Entity
@Table
public class Registration {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int  cid;
	@Column
	private String cname;
	@Column
	private String address;
	@Column
	private int number;
	public Registration() {
		
	}
	public Registration(int cid, String cname, String address, int number) {
		
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Registration [cid=" + cid + ", cname=" + cname + ", address=" + address + ", number=" + number + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	

}
