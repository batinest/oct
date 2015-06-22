package com.nestle.hana.jpa.oct.dao.impl;

import javax.persistence.EntityManagerFactory;

import com.nestle.hana.jpa.oct.factory.LocalEntityManagerFactory;

public class BaseJPADao {
	
	public EntityManagerFactory getEntityManagerFactory() {
		  return LocalEntityManagerFactory.getEntityManagerFactory();
		  //return JPADaoFactory.createEntityManager();
	}
	
	public void releaseEntityManager() {
		  //LocalEntityManagerFactory.destroyContext();
		  //return JPADaoFactory.createEntityManager();
	} 


}
