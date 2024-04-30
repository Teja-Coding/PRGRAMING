package org.jsp.app;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_dtls database table.
 * 
 */
@Entity
@Table(name="user_dtls")
@NamedQuery(name="UserDtl.findAll", query="SELECT u FROM UserDtl u")
public class UserDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String email;

	@Column(name="full_name")
	private String fullName;

	private String password;

	public UserDtl() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}