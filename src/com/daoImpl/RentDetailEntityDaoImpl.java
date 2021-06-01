package com.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.DBManager.DBConnection;
import com.dao.RentDetailEntityDao;
import com.model.RentDetailEntity;
import com.model.RentEntity;

public class RentDetailEntityDaoImpl implements RentDetailEntityDao{

	@Override
	public Integer addRentDetail(RentDetailEntity r) {
		Integer roll = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			session.save(r);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	@Override
	public Integer deleteRentDetail(RentDetailEntity r) {
		Integer roll = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			session.remove(r);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	@Override
	public Integer updateRentDetail(RentDetailEntity r) {
		Integer roll = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			session.update(r);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	@Override
	public List<RentDetailEntity> getRentDetail() {
		List<RentDetailEntity> list = new ArrayList<>();
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			list = session.createQuery("From RentDetailEntity").list();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public RentDetailEntity getRenDetailtById(Integer id) {
		RentDetailEntity r = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			r = session.get(RentDetailEntity.class, id);

			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public Integer getIdByRentDetail(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
