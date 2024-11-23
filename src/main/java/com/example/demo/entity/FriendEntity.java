package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name = "FRIEND")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FriendEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Integer  id;
	
	@Column(name="PHONE_NUMBER")
	private  Long  phoneNumber;
	
	@Column(name="FRIEND_NUMBER")
	private  Long  friendNumber;

}
