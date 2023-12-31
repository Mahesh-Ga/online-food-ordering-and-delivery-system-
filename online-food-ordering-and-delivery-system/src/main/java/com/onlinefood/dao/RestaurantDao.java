package com.onlinefood.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlinefood.entities.Restaurant;

public interface RestaurantDao  extends JpaRepository<Restaurant,Long>{

	@Query("select r from Restaurant r where r.approved = false")
	List<Restaurant> getPendingRestaurants();
	
	@Query("select r from Restaurant r where r.approved = true and r.deleted = false")
	List<Restaurant> getAllActiveRestauraants();
	
	

}
