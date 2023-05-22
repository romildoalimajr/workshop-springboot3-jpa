package net.kalangos.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String passwword;
	
	public User() {
		
	}

	public User(Long id, String name, String email, String phone, String passwword) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.passwword = passwword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPasswword() {
		return passwword;
	}

	public void setPasswword(String passwword) {
		this.passwword = passwword;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
