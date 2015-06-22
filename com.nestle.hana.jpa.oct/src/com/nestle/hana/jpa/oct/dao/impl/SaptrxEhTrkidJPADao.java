package com.nestle.hana.jpa.oct.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.nestle.hana.jpa.oct.dao.ISaptrxEhTrkidDao;
import com.nestle.hana.jpa.oct.model.SaptrxEhTrkid;

public class SaptrxEhTrkidJPADao extends BaseJPADao implements ISaptrxEhTrkidDao{
	
	public SaptrxEhTrkidJPADao()
	{
		
	}
	

	@Override
	public SaptrxEhTrkid add(SaptrxEhTrkid saptrxEhTrkid) {
	  EntityManager em = getEntityManagerFactory().createEntityManager();
	  em.getTransaction().begin();
	  em.persist(saptrxEhTrkid);
	  em.getTransaction().commit();
	  System.out.println("Commited");
	  em.close();
	  //releaseEntityManager();
	  return saptrxEhTrkid;		}


	@Override
	public SaptrxEhTrkid update(SaptrxEhTrkid contr) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		SaptrxEhTrkid saptrxEhTrkid = get(contr.getEhGuid());
		if(saptrxEhTrkid != null) {
			em.getTransaction().begin();
			saptrxEhTrkid.setEhGuid(contr.getEhGuid());
			saptrxEhTrkid.setEndDate(contr.getEndDate());
			saptrxEhTrkid.setProviderId(contr.getProviderId());
			saptrxEhTrkid.setProviderType(contr.getProviderType());
			saptrxEhTrkid.setSeqNbr(contr.getSeqNbr());
			saptrxEhTrkid.setStartDate(contr.getStartDate());
			saptrxEhTrkid.setTrackingid(contr.getTrackingid());
			saptrxEhTrkid.setTrackingidtype(contr.getTrackingidtype());
			saptrxEhTrkid.setUrl(contr.getUrl());
			
			System.out.println("update SaptrxEhTrkid");
			em.getTransaction().commit();
			em.close();
			System.out.println("update comited");
			
			//releaseEntityManager();
			return saptrxEhTrkid;		
			
		}
		else
			return null;
		
	}


	@Override
	public SaptrxEhTrkid remove(String ehGuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SaptrxEhTrkid get(String ehGuid) {
		SaptrxEhTrkid saptrxEhTrkid = getEntityManagerFactory().createEntityManager().find(SaptrxEhTrkid.class, ehGuid);
    	 //releaseEntityManager();
    	 return saptrxEhTrkid;

		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SaptrxEhTrkid> retriveAll() {
		Query query = getEntityManagerFactory().createEntityManager().createQuery("SELECT s FROM SaptrxEhTrkid s");
		 List<SaptrxEhTrkid> resList = query.getResultList();
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
