package com.cog.ingpoc.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cog.ingpoc.dao.UserDao;
import com.cog.ingpoc.data.User;


@Repository
public class UserDaoImpl implements UserDao {

	
	  private SessionFactory sessionFactory;
	  
	    @Autowired 
	    public UserDaoImpl(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }
	   

	@Override
	public User createUser(User user) {

		User savedUser = null;
		sessionFactory.getCurrentSession().save(user);
		return savedUser;
	}



}
