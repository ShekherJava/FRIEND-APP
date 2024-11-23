package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FriendEntity;
import com.example.demo.repository.FriendRepository;

@Service
public class FriendService {
	
	@Autowired
	FriendRepository  repository;
	

	public FriendEntity addFriendService(FriendEntity friend) {
		
		Integer  count=repository.checkFriendContact(friend.getPhoneNumber(), friend.getFriendNumber());
		if(count==0) {
			FriendEntity newFriend = repository.saveAndFlush(friend);
			return  newFriend;
		}
		else {
			return null;
		}
	}

	public List<Long> readFriendsContacts(Long phoneNumber) {
		
		return  repository.findFriendsContactNumbers(phoneNumber);
	}

}
