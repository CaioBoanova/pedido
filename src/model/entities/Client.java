package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	private String email;
	private String address;
	private Integer number;
	private Integer code;
	private Integer phone;
	private Date birthDate;
	
	public Client(String name, String email, Date birthDate, String address, Integer number, Integer code, Integer phone) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.number = number;
		this.code = code;
		this.phone = phone;
		this.birthDate = birthDate;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	

	@Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + "\n" + address + " - " + number + "\n" + code + "\n" + phone + "\n" +  email;
	}


	
}
