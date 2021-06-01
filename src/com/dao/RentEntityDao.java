package com.dao;

import java.util.List;

import com.model.RentEntity;

public interface RentEntityDao {
	public Integer addRent(RentEntity r);

	public Integer deleteRent(RentEntity r);

	public Integer updateRent(RentEntity r);

	public List<RentEntity> getRent();

	public RentEntity getRentById(Integer id);

	public Integer getIdByRent(String name);
}
