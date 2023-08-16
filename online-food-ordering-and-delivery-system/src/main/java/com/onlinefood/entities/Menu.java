package com.onlinefood.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "menu") 
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Menu extends BaseEntity {
		
	@Column(name = "product_name", length = 100)
	private String name;
	
			
}
