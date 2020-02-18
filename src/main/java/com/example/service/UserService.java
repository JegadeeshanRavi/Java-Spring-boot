package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.UserEntity;
import com.example.repository.UserRepository;

@Service
public class UserService
{

	@Autowired
	UserRepository userRepository;

	public List <UserEntity> getAllUsers ()
	{
		return (List <UserEntity>) userRepository.findAll ();
	}

	public UserEntity getUser ( Integer id )
	{
		UserEntity user = new UserEntity ();
		Optional <UserEntity> UserEntity = userRepository.findById ( id );
		if ( UserEntity.isPresent () )
		{
			user = UserEntity.get ();
		}
		else
		{
			user = null;
		}
		return user;
	}

	public String saveUser ( UserEntity userEntity )
	{
		userRepository.save ( userEntity );
		return "Successfully saved/updated";
	}

	public String deleteUser ( UserEntity userEntity )
	{
		userRepository.delete ( userEntity );
		return "Successfully deleted";
	}

}
