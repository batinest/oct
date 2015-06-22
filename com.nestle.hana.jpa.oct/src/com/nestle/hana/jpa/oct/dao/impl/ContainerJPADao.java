package com.nestle.hana.jpa.oct.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.nestle.hana.jpa.oct.dao.IContainerDao;
import com.nestle.hana.jpa.oct.model.Container;

public class ContainerJPADao extends BaseJPADao implements IContainerDao{
	
	public ContainerJPADao()
	{
		
	}
	

	@Override
	public Container add(Container contr) {
	  EntityManager em = getEntityManagerFactory().createEntityManager();
	  em.getTransaction().begin();
	  em.persist(contr);
	  em.getTransaction().commit();
	  System.out.println("Id for record Commited in Container :::::"+contr.getOid());
	  em.close();
	  //releaseEntityManager();
	  return contr;		}


	@Override
	public Container update(Container contr) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		Container container = get(contr.getOid());
		if(container == null) {
			return null;
		}
		container.setName(contr.getName());
		container.setDestination(contr.getDestination());
		container.setSource(contr.getSource());
		container.setStatus(contr.getStatus());
		System.out.println("Updated record ID in Container :::::"+contr.getOid());
		em.getTransaction().begin();
		em.persist(container);
		em.getTransaction().commit();
		em.close();
		System.out.println("update committed");
		
		//releaseEntityManager();
		return container;		
	}


	@Override
	public Container remove(String oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Container get(String oid) {
		Container contr = getEntityManagerFactory().createEntityManager().find(Container.class, oid);
    	 //releaseEntityManager();
    	 return contr;

		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Container> retriveAll() {
		Query query = getEntityManagerFactory().createEntityManager().createQuery("SELECT c FROM Container c");
		 List<Container> resList = query.getResultList();
		 //releaseEntityManager();
		 return resList;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Container> getAllWithStatus(String status) {
		Query query = getEntityManagerFactory().createEntityManager().createQuery("SELECT c from Container c "+
                "WHERE c.Status = :status");
		query.setParameter("status", status);
		List<Container> resList = query.getResultList();
		//releaseEntityManager();
		return resList;
	}
	

}
