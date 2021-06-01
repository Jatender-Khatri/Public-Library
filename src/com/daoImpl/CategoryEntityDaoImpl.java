package com.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.DBManager.DBConnection;
import com.dao.CategoryEntityDao;
import com.model.CategoryEntity;

public class CategoryEntityDaoImpl implements CategoryEntityDao{

	@Override
	public Integer addCategory(CategoryEntity c) {
		Integer roll= null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.save(c);
			transaction.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	@Override
	public Integer deleteCategory(CategoryEntity c) {
		Integer roll= null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.remove(c);
			transaction.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	@Override
	public Integer updateCategorry(CategoryEntity c) {
		Integer roll= null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.update(c);
			transaction.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	@Override
	public List<CategoryEntity> getCategory() {
		List<CategoryEntity> list = new ArrayList<>();
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			list = session.createQuery("From CategoryEntity").list();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public CategoryEntity getCategoryById(Integer id) {
		CategoryEntity c = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			c = session.get(CategoryEntity.class, id);
			
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public Integer getIdByCategory(String name) {
		CategoryEntity categoryEntity = null;
		Integer roll = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			Query query = session.createQuery("from CategoryEntity t where t.categoryName=:n");
			query.setParameter("n", name);

			List list = query.list();// will return the records from 5 to 10th number

			categoryEntity = (CategoryEntity) list.get(0);

			transaction.commit();
			// factory.close();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return categoryEntity.getCategoryId();
	}
	
}