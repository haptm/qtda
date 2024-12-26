package com.example.chatapp.service;

import com.example.chatapp.dto.request.UpdateUserRequestDTO;
import com.example.chatapp.exception.UserException;
import com.example.chatapp.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    User findUserById(UUID id) throws UserException;

    User findUserByProfile(String jwt) throws UserException;

    User updateUser(UUID id, UpdateUserRequestDTO request) throws UserException;

    List<User> searchUser(String query);

    List<User> searchUserByName(String name);

}
