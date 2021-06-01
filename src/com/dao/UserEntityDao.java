package com.dao;

import java.util.List;

import com.model.UserEntity;

public interface UserEntityDao {
	public Integer addUser(UserEntity u);

	public Integer deleteUser(UserEntity u);

	public Integer updateUser(UserEntity u);

	public List<UserEntity> getUser();

	public UserEntity getUserById(Integer id);

	public Integer getIdByUser(String username);
}
