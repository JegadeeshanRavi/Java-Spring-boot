package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.UserEntity;
import com.example.service.UserService;

@RestController
public class MainController
{

	@Autowired
	private UserService userService;

	@RequestMapping ( value = "/user", method = RequestMethod.GET )
	public List <UserEntity> getAllUser ()
	{
		return userService.getAllUsers ();
	}

	@RequestMapping ( value = "/user/{id}", method = RequestMethod.GET )
	public UserEntity getUser ( @PathVariable Integer id )
	{
		return userService.getUser ( id );
	}

	@RequestMapping ( value = "/user", method = RequestMethod.POST )
	public String saveUser ( @RequestBody UserEntity userEntity )
	{
		return userService.saveUser ( userEntity );
	}

	@RequestMapping ( value = "/user", method = RequestMethod.PUT )
	public String updateUser ( @RequestBody UserEntity userEntity )
	{
		return userService.saveUser ( userEntity );
	}

	@RequestMapping ( value = "/user", method = RequestMethod.DELETE )
	public String deleteUSer ( @RequestBody UserEntity userEntity )
	{
		return userService.deleteUser ( userEntity );
	}

}
