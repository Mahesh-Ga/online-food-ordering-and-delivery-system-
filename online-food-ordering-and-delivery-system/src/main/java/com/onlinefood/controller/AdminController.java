package com.onlinefood.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlinefood.dao.RestaurantDao;
import com.onlinefood.dto.ApiResponse;
import com.onlinefood.dto.RestaurantDto;
import com.onlinefood.entities.Restaurant;
import com.onlinefood.service.RestaurantService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {

	@Autowired
	RestaurantService resservice;

	@PostMapping("/restaurant")
	public ApiResponse addRestaurant(@RequestBody Restaurant res) {
		return resservice.addRestaurant(res);
	}
// add restaurant for trial purpose it is going in restaurant controller 
	@GetMapping("/pending/restaurant")
	public List<RestaurantDto> getPendingRestaurants() {
		return resservice.pendingRestaurantRequests();
	}

	@GetMapping("/restaurant")
	public List<RestaurantDto> getAllRestaurants() {
		return resservice.getAllActiveRestaurants();
	}

	@PutMapping("/approve/restaurant/{id}")
	public ApiResponse approveRestaurant(@PathVariable Long id) {

		return resservice.approveRestaurant(id);
	}

	@PutMapping("/remove/restaurant/{id}")
	public ApiResponse removeRestaurant(@PathVariable Long id) {

		return resservice.removeRestaurant(id);
	}

	@DeleteMapping("/restaurant/{id}")
	public ApiResponse rejectRestaurant(@PathVariable Long id) {

		return resservice.rejectRestaurant(id);
	}

}
