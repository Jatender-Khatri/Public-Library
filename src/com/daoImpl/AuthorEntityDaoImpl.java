package com.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.DBManager.DBConnection;
import com.dao.AuthorEntityDao;
import com.model.AuthorEntity;

public class AuthorEntityDaoImpl implements AuthorEntityDao{

	@Override
	public Integer addAuthor(AuthorEntity author) {
		Integer roll = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			session.save(author);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	@Override
	public List<AuthorEntity> getAuthors() {
		List<AuthorEntity> list = new ArrayList<>();
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			list = session.createQuery("From AuthorEntity").list();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Integer deleteAuthor(AuthorEntity author) {
		Integer roll = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			session.remove(author);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	@Override
	public AuthorEntity getAuthorById(int id) {
		AuthorEntity a = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			a = session.get(AuthorEntity.class, id);

			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public Integer updateAuthor(AuthorEntity author) {
		Integer roll = null;
		try {
			SessionFactory factory = DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			session.update(author);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	@Override
	public Integer getIdByAuthor(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
