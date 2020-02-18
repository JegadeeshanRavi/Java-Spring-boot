package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class UserEntity
{

	@Id
	private int userId;
	@Column
	private String userName;
	@Column
	private String userAddress;
	@Column
	private String userMobile;
	
	@Override
	public String toString ()
	{
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userMobile=" + userMobile + "]";
	}
	public int getUserId ()
	{
		return userId;
	}
	public void setUserId ( int userId )
	{
		this.userId = userId;
	}
	public String getUserName ()
	{
		return userName;
	}
	public void setUserName ( String userName )
	{
		this.userName = userName;
	}
	public String getUserAddress ()
	{
		return userAddress;
	}
	public void setUserAddress ( String userAddress )
	{
		this.userAddress = userAddress;
	}
	public String getUserMobile ()
	{
		return userMobile;
	}
	public void setUserMobile ( String userMobile )
	{
		this.userMobile = userMobile;
	}
	
	
	
}
