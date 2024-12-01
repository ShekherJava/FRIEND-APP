package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FriendEntity;
import com.example.demo.service.FriendService;

@RestController
public class FriendController {
	@Autowired
	FriendService  service;
	
	@PostMapping(value = "/friend/save")
	public  ResponseEntity<FriendEntity> addFriend(@RequestBody FriendEntity  friend) {
		FriendEntity newEntity = service.addFriendService(friend);
		if ( newEntity != null )
			return  new ResponseEntity<>(newEntity, HttpStatus.OK);
		else
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping( value = "/friend/{phoneNumber}")
	public  List<Long>  getFriendsContacts(@PathVariable Long phoneNumber){
		return service.readFriendsContacts(phoneNumber);
	}

}
