package com.onlinefood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class RestaurantDto {

	private Long id;
	
	private String restaurantName;

	private String email;

	private String mobileNumber;

//	private String password;

//	private boolean active;

//	private boolean deleted;	

}
