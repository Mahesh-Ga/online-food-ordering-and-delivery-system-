package com.onlinefood.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "customer") 
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class Customer extends BaseEntity {
	
	@Column(name = "first_name", length = 20)
	private String firstName;
	
	@Column(name = "last_name", length = 20)
	private String lastName;
	
	@Column(length = 50, unique = true, nullable = false) 
	private String email;
	
	@Column(length = 20, nullable = false) 
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
		
	@Column(length = 15, unique = true) 
	private String mobile_no;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_address",
				joinColumns = @JoinColumn(name ="customer_id"),
				inverseJoinColumns = @JoinColumn(name = "address_id")
				)
	private List<Address> addrList = new ArrayList<>();
	
	
	
//	 @Column(name="delivery_instructions", length = 20)
//   private String deliveryInstructions;
// 	 dilivery instructions required in order table not in customer	
	
	
	
}
