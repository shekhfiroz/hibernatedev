package com.main.beans;
import java.io.Serializable;
import java.sql.Date;
/*reading db credentials from properties file*/
public class Society implements Serializable {
	protected int societyNo;
	protected String societyName;
	protected String registeredNm;
	protected Date societyRegisDate;
	protected String addressLine1;
	protected String addressLine2;
	protected String city;
	protected String state;
	protected int zip;
	protected String country;
	protected String mobileNo;
	protected String emailAddress;

	public int getSocietyNo() {
		return societyNo;
	}

	public void setSocietyNo(int societyNo) {
		this.societyNo = societyNo;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getRegisteredNm() {
		return registeredNm;
	}

	public void setRegisteredNm(String registeredNm) {
		this.registeredNm = registeredNm;
	}

	public Date getSocietyRegisDate() {
		return societyRegisDate;
	}

	public void setSocietyRegisDate(Date societyRegisDate) {
		this.societyRegisDate = societyRegisDate;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Society [societyNo=" + societyNo + ", societyName=" + societyName + ", registeredNm=" + registeredNm
				+ ", societyRegisDate=" + societyRegisDate + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + "]";
	}
}
