package com.nestle.hana.jpa.oct.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.nestle.hana.jpa.oct.dao.ISaptrxEhInfoDao;
import com.nestle.hana.jpa.oct.model.SaptrxEhInfo;

public class SaptrxEhInfoJPADao extends BaseJPADao implements ISaptrxEhInfoDao {

	public SaptrxEhInfoJPADao() {

	}

	@Override
	public SaptrxEhInfo add(SaptrxEhInfo saptrxEhInfo) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(saptrxEhInfo);
		em.getTransaction().commit();
		System.out.println("Commited");
		em.close();
		// releaseEntityManager();
		return saptrxEhInfo;
	}

	@Override
	public SaptrxEhInfo update(SaptrxEhInfo contr) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		SaptrxEhInfo saptrxEhInfo = get(contr.getEhGuid());
		if (saptrxEhInfo == null) {
			return null;
		}
		saptrxEhInfo.setEhGuid(contr.getEhGuid());
		saptrxEhInfo.setLanguage(contr.getLanguage());
		saptrxEhInfo.setParamIndex(contr.getParamIndex());
		saptrxEhInfo.setParamLength(contr.getParamLength());
		saptrxEhInfo.setParamName(contr.getParamName());
		saptrxEhInfo.setSeqNbr(contr.getSeqNbr());
		saptrxEhInfo.setParamValue(contr.getParamValue());
		
		System.out.println("update SaptrxEhInfo");
		em.getTransaction().begin();
		em.persist(saptrxEhInfo);
		em.getTransaction().commit();
		em.close();
		System.out.println("update comited");

		// releaseEntityManager();
		return saptrxEhInfo;
	}

	
	@Override
	public SaptrxEhInfo remove(String ehGuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SaptrxEhInfo get(String ehGuid) {
		SaptrxEhInfo saptrxEhTrkid = getEntityManagerFactory()
				.createEntityManager().find(SaptrxEhInfo.class, ehGuid);
		// releaseEntityManager();
		return saptrxEhTrkid;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SaptrxEhInfo> retriveAll() {
		Query query = getEntityManagerFactory().createEntityManager()
				.createQuery("SELECT s FROM SaptrxEhInfo s");
		List<SaptrxEhInfo> resList = query.getResultList();
		// releaseEntityManager();
		return resList;

	}

	/*
	 * @SuppressWarnings("unchecked")
	 * 
	 * @Override public List<SaptrxEhCntrl> getAllWithStatus(String status) {
	 * Query query =
	 * getEntityManagerFactory().createEntityManager().createQuery(
	 * "SELECT s from SaptrxEhCntrl s "+ "WHERE c.Status = :status");
	 * query.setParameter("status", status); List<SaptrxEhCntrl> resList =
	 * query.getResultList(); //releaseEntityManager(); return resList; }
	 */

}
