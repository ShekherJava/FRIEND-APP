package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.FriendEntity;

public interface FriendRepository extends JpaRepository<FriendEntity, Integer> {
	@Query(value="SELECT COUNT(*) FROM FRIEND WHERE  PHONE_NUMBER=?  AND  FRIEND_NUMBER=?", nativeQuery=true)
	Integer  checkFriendContact(Long phoneNumber, Long friendNumber);
	
	@Query(value="SELECT  FRIEND_NUMBER  FROM  FRIEND  WHERE  PHONE_NUMBER=?", nativeQuery=true)
	List<Long>  findFriendsContactNumbers(Long phoneNumber);

}
