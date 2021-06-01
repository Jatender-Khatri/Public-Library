package com.dao;

import java.util.List;

import com.model.CategoryEntity;

public interface CategoryEntityDao {
	public Integer addCategory(CategoryEntity c);

	public Integer deleteCategory(CategoryEntity c);

	public Integer updateCategorry(CategoryEntity c);

	public List<CategoryEntity> getCategory();

	public CategoryEntity getCategoryById(Integer id);

	public Integer getIdByCategory(String name);
}
