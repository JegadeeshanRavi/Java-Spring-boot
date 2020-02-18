package com.example.service;

import java.util.ArrayList;
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
    private UserRepository userRepository;

    public List <UserEntity> getAllUsers ( )
    {
        List <UserEntity> userList = new ArrayList <> ( );
        userRepository.findAll ( ).forEach ( userList::add );
        return userList;
    }

    public UserEntity getUser ( Integer id )
    {
        UserEntity user = userRepository.findById ( id ).isPresent ( ) ? userRepository.findById ( id ).get ( ) : null;
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
