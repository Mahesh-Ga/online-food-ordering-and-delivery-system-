package com.onlinefood.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "restaurant") 
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class Restaurant extends BaseEntity {
	
	@Column(name = "restaurant_name", length = 100)
	private String restaurantName;
	
	@Column(length = 50)
	private CuisineType cuisine;
	

	@Column(length = 50, unique = true, nullable = false) 
	private String email;
	
	@Column(length = 20, nullable = false) 
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	@Column(name="mobile_no", length=50)
	private String mobileNumber;

	@Column(name="fssai", length=100)
	private String fssai;
	
	@Column(name="approved")
	private boolean approved;

	@Column(name="deleted")
	private boolean deleted;
	
}
