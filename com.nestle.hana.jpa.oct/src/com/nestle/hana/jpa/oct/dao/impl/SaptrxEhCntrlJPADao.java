package com.nestle.hana.jpa.oct.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nestle.hana.jpa.oct.dao.ISaptrxEhCntrlDao;
import com.nestle.hana.jpa.oct.model.SaptrxEhCntrl;

public class SaptrxEhCntrlJPADao extends BaseJPADao implements ISaptrxEhCntrlDao{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SaptrxEhCntrlJPADao.class);
	
	public SaptrxEhCntrlJPADao()
	{
		
	}
	

	@Override
	public SaptrxEhCntrl add(SaptrxEhCntrl saptrxEhCntrl) {
		System.out.println("Inside ADD method of JPA class \n");
		EntityManager em = getEntityManagerFactory().createEntityManager();
		  em.getTransaction().begin();
		  em.persist(saptrxEhCntrl);
		  em.getTransaction().commit();
		  LOGGER.info("Id for record commited in SaptrxEhCntrl::::: "+saptrxEhCntrl.getEhGuid());
		  em.close();
		  
	  //releaseEntityManager();
	  return saptrxEhCntrl;
	}


	@Override
	public SaptrxEhCntrl update(SaptrxEhCntrl contr) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
			SaptrxEhCntrl saptrxEhCntrl = get(contr.getEhGuid());
			if(saptrxEhCntrl != null) {
				em.getTransaction().begin();
				saptrxEhCntrl.setLanguage(contr.getLanguage());
				saptrxEhCntrl.setParamIndex(contr.getParamIndex());
				saptrxEhCntrl.setParamLength(contr.getParamLength());
				saptrxEhCntrl.setParamName(contr.getParamName());
				saptrxEhCntrl.setParamType(contr.getParamType());
				saptrxEhCntrl.setParamValue(contr.getParamValue());
				saptrxEhCntrl.setSeqNbr(contr.getSeqNbr());
				
				System.out.println("Updated record id in SaptrxEhCntrl ::::: "+saptrxEhCntrl.getEhGuid());
				em.getTransaction().commit();
				em.close();
				System.out.println("update committed");
				//releaseEntityManager();
				return saptrxEhCntrl;
			}
			else
				return null;
			
	}


	@Override
	public SaptrxEhCntrl remove(String ehGuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SaptrxEhCntrl get(String ehGuid) {
		SaptrxEhCntrl saptrxEhCntrl = getEntityManagerFactory().createEntityManager().find(SaptrxEhCntrl.class, ehGuid);
    	 //releaseEntityManager();
    	 return saptrxEhCntrl;

		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SaptrxEhCntrl> retriveAll() {
		Query query = getEntityManagerFactory().createEntityManager().createQuery("SELECT s FROM SaptrxEhCntrl s");
		 List<SaptrxEhCntrl> resList = query.getResultList();
		 //releaseEntityManager();
		 return resList;
		
	}


	/*@SuppressWarnings("unchecked")
	@Override
	public List<SaptrxEhCntrl> getAllWithStatus(String status) {
		Query query = getEntityManagerFactory().createEntityManager().createQuery("SELECT s from SaptrxEhCntrl s "+
                "WHERE c.Status = :status");
		query.setParameter("status", status);
		List<SaptrxEhCntrl> resList = query.getResultList();
		//releaseEntityManager();
		return resList;
	}
	*/

}
