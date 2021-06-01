package com.dao;

import java.util.List;

import com.model.RentDetailEntity;


public interface RentDetailEntityDao {
	public Integer addRentDetail(RentDetailEntity r);

	public Integer deleteRentDetail(RentDetailEntity r);

	public Integer updateRentDetail(RentDetailEntity r);

	public List<RentDetailEntity> getRentDetail();

	public RentDetailEntity getRenDetailtById(Integer id);

	public Integer getIdByRentDetail(String name);
}
