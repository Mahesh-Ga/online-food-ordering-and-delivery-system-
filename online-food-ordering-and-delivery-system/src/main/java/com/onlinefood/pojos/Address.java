package com.onlinefood.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "owner")
public class Address extends BaseEntity{

	@Column(name="street_add_1", length = 50)
	private String streetAddressLine1;
	
	@Column(name="street_add_2", length = 50)
    private String streetAddressLine2;
	
	@Column(length = 100)
    private String city;
	
	@Column(length = 100)
    private String state;
	
	@Column(name="postal_code", length = 10)
    private String postalCode;
	
	@Column(length = 100)
    private String country;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")	
	private Customer selectedCust;
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "restaurant_id")
	private Restaurant selectedRestaurant;
}