package com.nestle.hana.jpa.oct.dao.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.nestle.hana.jpa.oct.dao.ISaptrxEhEvmsgDao;
import com.nestle.hana.jpa.oct.model.SaptrxEhEvmsg;

public class SaptrxEhEvmsgJPADao extends BaseJPADao implements
		ISaptrxEhEvmsgDao {

	public SaptrxEhEvmsgJPADao() {

	}

	@Override
	public SaptrxEhEvmsg add(SaptrxEhEvmsg saptrxEhEvmsg) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(saptrxEhEvmsg);
		em.getTransaction().commit();
		System.out.println("Committed");
		em.close();
		// releaseEntityManager();
		return saptrxEhEvmsg;
	}

	@Override
	public SaptrxEhEvmsg update(SaptrxEhEvmsg contr) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		SaptrxEhEvmsg saptrxEhEvmsg = get(contr.getEhGuid());
		if (saptrxEhEvmsg != null) {
			em.getTransaction().begin();
			saptrxEhEvmsg.setAddData(contr.getAddData());
			saptrxEhEvmsg.setBuiltEhHier(contr.getBuiltEhHier());
			saptrxEhEvmsg.setEarliestEvDate(contr.getEarliestEvDate());
			saptrxEhEvmsg.setEarliestMsgDte(contr.getEarliestMsgDte());
			saptrxEhEvmsg.setEventCode(contr.getEventCode());
			saptrxEhEvmsg.setEventDate(contr.getEventDate());
			saptrxEhEvmsg.setEventDateUtc(contr.getEventDateUtc());
			saptrxEhEvmsg.setEventExpTzone(contr.getEventExpTzone());
			saptrxEhEvmsg.setEventTzone(contr.getEventTzone());
			saptrxEhEvmsg.setLatestEvDate(contr.getLatestEvDate());
			saptrxEhEvmsg.setLatestMsgDate(contr.getLatestMsgDate());
			saptrxEhEvmsg.setMatchedEe(contr.getMatchedEe());
			saptrxEhEvmsg.setMsgDateUtc(contr.getMsgDateUtc());
			saptrxEhEvmsg.setMsgExpTzone(contr.getMsgExpTzone());
			saptrxEhEvmsg.setMsgGuid(contr.getMsgGuid());
			saptrxEhEvmsg.setMsgRcvdDate(contr.getMsgRcvdDate());
			saptrxEhEvmsg.setMsgRcvdTzone(contr.getMsgRcvdTzone());
			saptrxEhEvmsg.setNotRelevant(contr.getNotRelevant());
			saptrxEhEvmsg.setProcDate(contr.getProcDate());
			saptrxEhEvmsg.setSeqNbr(contr.getSeqNbr());

			System.out.println("update saptrxEhEvmsg");
			em.getTransaction().commit();
			em.close();
			System.out.println("update committed");

			// releaseEntityManager();
			return saptrxEhEvmsg;
			
		}
		else
			return null;
		
	}

	@Override
	public SaptrxEhEvmsg add(String ehGuid, String addData,
			String builtEhHier, Timestamp earliestEvDate,
			Timestamp earliestMsgDte, String eventCode, Timestamp eventDate,
			Timestamp eventDateUtc, String eventExpTzone, String eventTzone,
			Timestamp latestEvDate, Timestamp latestMsgDate, String matchedEe,
			Timestamp msgDateUtc, String msgExpTzone, String msgGuid,
			Timestamp msgRcvdDate, String msgRcvdTzone, String notRelevant,
			Timestamp procDate, int seqNbr) {

		EntityManager em = getEntityManagerFactory().createEntityManager();

		SaptrxEhEvmsg saptrxEhEvmsg = new SaptrxEhEvmsg();
		saptrxEhEvmsg.setAddData(addData);
		saptrxEhEvmsg.setBuiltEhHier(builtEhHier);
		saptrxEhEvmsg.setEarliestEvDate(earliestEvDate);
		saptrxEhEvmsg.setEarliestMsgDte(earliestMsgDte);
		saptrxEhEvmsg.setEhGuid(ehGuid);
		saptrxEhEvmsg.setEventCode(eventCode);
		saptrxEhEvmsg.setEventDate(eventDate);
		saptrxEhEvmsg.setEventDateUtc(eventDateUtc);
		saptrxEhEvmsg.setEventExpTzone(eventExpTzone);
		saptrxEhEvmsg.setEventTzone(eventTzone);
		saptrxEhEvmsg.setLatestEvDate(latestEvDate);
		saptrxEhEvmsg.setLatestMsgDate(latestMsgDate);
		saptrxEhEvmsg.setMatchedEe(matchedEe);
		saptrxEhEvmsg.setMsgDateUtc(msgDateUtc);
		saptrxEhEvmsg.setMsgExpTzone(msgExpTzone);
		saptrxEhEvmsg.setMsgGuid(msgGuid);
		saptrxEhEvmsg.setMsgRcvdDate(msgRcvdDate);
		saptrxEhEvmsg.setMsgRcvdTzone(msgRcvdTzone);
		saptrxEhEvmsg.setNotRelevant(notRelevant);
		saptrxEhEvmsg.setProcDate(procDate);
		saptrxEhEvmsg.setSeqNbr(seqNbr);

		System.out.println("Pesist SaptrxEhEvmsg");
		em.getTransaction().begin();
		em.persist(saptrxEhEvmsg);
		em.getTransaction().commit();
		System.out.println("Commited");
		em.close();
		// releaseEntityManager();
		return saptrxEhEvmsg;

	}

	@Override
	public SaptrxEhEvmsg update(String ehGuid, String addData,
			String builtEhHier, Timestamp earliestEvDate,
			Timestamp earliestMsgDte, String eventCode, Timestamp eventDate,
			Timestamp eventDateUtc, String eventExpTzone, String eventTzone,
			Timestamp latestEvDate, Timestamp latestMsgDate, String matchedEe,
			Timestamp msgDateUtc, String msgExpTzone, String msgGuid,
			Timestamp msgRcvdDate, String msgRcvdTzone, String notRelevant,
			Timestamp procDate, int seqNbr) {

		EntityManager em = getEntityManagerFactory().createEntityManager();
		Date date= new java.util.Date();

		SaptrxEhEvmsg saptrxEhEvmsg = get(ehGuid);
		if (saptrxEhEvmsg == null) {
			return null;
		}
		saptrxEhEvmsg.setAddData("TEST");
		saptrxEhEvmsg.setBuiltEhHier("TEST");
		saptrxEhEvmsg.setEarliestEvDate(new Timestamp(date.getTime()));
		saptrxEhEvmsg.setEarliestMsgDte(new Timestamp(date.getTime()));
		saptrxEhEvmsg.setEhGuid("ABCD98765");
		saptrxEhEvmsg.setEventCode("TESTING");
		saptrxEhEvmsg.setEventDate(new Timestamp(date.getTime()));
		saptrxEhEvmsg.setEventDateUtc(new Timestamp(date.getTime()));
		saptrxEhEvmsg.setEventExpTzone("DEV");
		saptrxEhEvmsg.setEventTzone("KOL");
		saptrxEhEvmsg.setLatestEvDate(new Timestamp(date.getTime()));
		saptrxEhEvmsg.setLatestMsgDate(new Timestamp(date.getTime()));
		saptrxEhEvmsg.setMatchedEe("UPDATE");
		saptrxEhEvmsg.setMsgDateUtc(new Timestamp(date.getTime()));
		saptrxEhEvmsg.setMsgExpTzone("DEV");
		saptrxEhEvmsg.setMsgGuid("XXX12345");
		saptrxEhEvmsg.setMsgRcvdDate(new Timestamp(date.getTime()));
		saptrxEhEvmsg.setMsgRcvdTzone("ETST");
		saptrxEhEvmsg.setNotRelevant("N");
		saptrxEhEvmsg.setProcDate(new Timestamp(date.getTime()));
		saptrxEhEvmsg.setSeqNbr(999);
		System.out.println("update SaptrxEhEvmsg");
		em.getTransaction().begin();
		em.persist(saptrxEhEvmsg);
		em.getTransaction().commit();
		em.close();
		System.out.println("update committed");

		// releaseEntityManager();
		return saptrxEhEvmsg;
	}

	@Override
	public SaptrxEhEvmsg remove(String ehGuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SaptrxEhEvmsg get(String ehGuid) {
		SaptrxEhEvmsg saptrxEhEvmsg = getEntityManagerFactory()
				.createEntityManager().find(SaptrxEhEvmsg.class, ehGuid);
		// releaseEntityManager();
		return saptrxEhEvmsg;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SaptrxEhEvmsg> retriveAll() {
		Query query = getEntityManagerFactory().createEntityManager()
				.createQuery("SELECT s FROM SaptrxEhEvmsg s");
		List<SaptrxEhEvmsg> resList = query.getResultList();
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
