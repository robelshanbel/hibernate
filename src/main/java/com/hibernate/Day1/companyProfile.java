package com.hibernate.Day1;

import javax.persistence.Embeddable;

@Embeddable
public class companyProfile {

	private String comapanyname;
	private String address;
	private String contactNum;
	private String ceo;
	public String getComapanyname() {
		return comapanyname;
	}
	public void setComapanyname(String comapanyname) {
		this.comapanyname = comapanyname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	
	
}
