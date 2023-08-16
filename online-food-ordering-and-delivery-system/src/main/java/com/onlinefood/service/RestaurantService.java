package com.onlinefood.service;

import java.util.List;

import com.onlinefood.dto.ApiResponse;
import com.onlinefood.dto.RestaurantDto;
import com.onlinefood.entities.Restaurant;

public interface RestaurantService {

	public ApiResponse addRestaurant(Restaurant res);

	public List<RestaurantDto> pendingRestaurantRequests();

	public ApiResponse approveRestaurant(Long id);

	public ApiResponse removeRestaurant(Long id);

	public ApiResponse rejectRestaurant(Long id);

	public List<RestaurantDto> getAllActiveRestaurants();
  
	// above api's belong to admin part add below for more do not modify above api's
	
	
}
