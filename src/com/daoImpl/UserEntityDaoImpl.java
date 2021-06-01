package com.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.DBManager.DBConnection;
import com.dao.UserEntityDao;
import com.model.UserEntity;

public class UserEntityDaoImpl implements UserEntityDao {

	@Override
	public Integer addUser(UserEntity u) {
		Integer roll = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			session.save(u);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	@Override
	public Integer deleteUser(UserEntity u) {
		Integer roll = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			session.remove(u);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	@Override
	public Integer updateUser(UserEntity u) {
		Integer roll = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			session.update(u);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	@Override
	public List<UserEntity> getUser() {
		List<UserEntity> list = new ArrayList<>();
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			list = session.createQuery("From Student").list();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public UserEntity getUserById(Integer id) {
		UserEntity u = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			u = session.get(UserEntity.class, id);

			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;

	}

	@Override
	public Integer getIdByUser(String username) {
		UserEntity userEntity = null;
		Integer roll = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();

			Query query = session.createQuery("from UserEntity t where t.username=:n");
			query.setParameter("n", username);

			List list = query.list();// will return the records from 5 to 10th number

			userEntity = (UserEntity) list.get(0);

			transaction.commit();
			// factory.close();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userEntity.getUserId();
	}

}
