package com.nestle.hana.jpa.oct.dao.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.nestle.hana.jpa.oct.dao.ISaptrxEhHdrDao;
import com.nestle.hana.jpa.oct.model.SaptrxEhHdr;

public class SaptrxEhHdrJPADao extends BaseJPADao implements
		ISaptrxEhHdrDao {

	public SaptrxEhHdrJPADao() {

	}

	@Override
	public SaptrxEhHdr add(SaptrxEhHdr saptrxEhHdr) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(saptrxEhHdr);
		em.getTransaction().commit();
		System.out.println("Committed");
		em.close();
		// releaseEntityManager();
		return saptrxEhHdr;
	}

	@Override
	public SaptrxEhHdr update(SaptrxEhHdr contr) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		SaptrxEhHdr saptrxEhHdr = get(contr.getEhGuid());
		if (saptrxEhHdr == null) {
			return null;
		}
		saptrxEhHdr.setEhGuid(contr.getEhGuid());
		saptrxEhHdr.setActiveDate(contr.getActiveDate());
		saptrxEhHdr.setAoClient(contr.getAoClient());
		saptrxEhHdr.setAoId(contr.getAoId());
		saptrxEhHdr.setAoSystem(contr.getAoSystem());
		saptrxEhHdr.setAoType(contr.getAoType());
		saptrxEhHdr.setAppLogFlag(contr.getAppLogFlag());
		saptrxEhHdr.setBusProcType(contr.getBusProcType());
		saptrxEhHdr.setBwPosted(contr.getBwPosted());
		saptrxEhHdr.setChkUnexpected(contr.getChkUnexpected());
		saptrxEhHdr.setCreatedBy(contr.getCreatedBy());
		saptrxEhHdr.setCreatedDate(contr.getCreatedDate());
		saptrxEhHdr.setDfExist(contr.getDfExist());
		saptrxEhHdr.setEeEvalProc(contr.getEeEvalProc());
		saptrxEhHdr.setEeMonitorProc(contr.getEeMonitorProc());
		saptrxEhHdr.setEeProfile(contr.getEeProfile());
		saptrxEhHdr.setEhActive(contr.getEhActive());
		saptrxEhHdr.setEhArchived(contr.getEhArchived());
		saptrxEhHdr.setEhChangeable(contr.getEhChangeable());
		saptrxEhHdr.setEhDeleted(contr.getEhDeleted());
		saptrxEhHdr.setEhType(contr.getEhType());
		saptrxEhHdr.setEmVersion(contr.getEmVersion());
		saptrxEhHdr.setEndDate(contr.getEndDate());
		saptrxEhHdr.setInactiveDate(contr.getInactiveDate());
		saptrxEhHdr.setLastCntrlNbr(contr.getLastCntrlNbr());
		saptrxEhHdr.setLastEehstNbr(contr.getLastEehstNbr());
		saptrxEhHdr.setLastErmsgNbr(contr.getLastErmsgNbr());
		saptrxEhHdr.setLastEvMsg(contr.getLastEvMsg());
		saptrxEhHdr.setLastEvmsgNbr(contr.getLastEvmsgNbr());
		saptrxEhHdr.setLastExpevNbr(contr.getLastExpevNbr());
		saptrxEhHdr.setLastHierNbr(contr.getLastHierNbr());
		saptrxEhHdr.setLastInfoNbr(contr.getLastInfoNbr());
		saptrxEhHdr.setLastMeasrNbr(contr.getLastMeasrNbr());
		saptrxEhHdr.setLastMehstNbr(contr.getLastMehstNbr());
		saptrxEhHdr.setLastQryidNbr(contr.getLastSthstNbr());
		saptrxEhHdr.setLastTaskNbr(contr.getLastTaskNbr());
		saptrxEhHdr.setLastTrkidNbr(contr.getLastTrkidNbr());
		saptrxEhHdr.setLoglvlEhpost(contr.getLoglvlEhpost());
		saptrxEhHdr.setLoglvlExtupd(contr.getLoglvlExtupd());
		saptrxEhHdr.setLoglvlMsgprc(contr.getLoglvlMsgprc());
		saptrxEhHdr.setMatchEeStored(contr.getMatchEeStored());
		saptrxEhHdr.setRulesetId(contr.getRulesetId());
		saptrxEhHdr.setStartDate(contr.getStartDate());
		saptrxEhHdr.setStatusProf(contr.getStatusProf());
		saptrxEhHdr.setTrackingid(contr.getTrackingid());
		saptrxEhHdr.setTrackingidtype(contr.getTrackingidtype());
		saptrxEhHdr.setUpdateProc1(contr.getUpdateProc1());
		saptrxEhHdr.setUpdateProc2(contr.getUpdateProc2());
		saptrxEhHdr.setUpdatedBy(contr.getUpdatedBy());
		saptrxEhHdr.setUpdatedDate(contr.getUpdatedDate());


		System.out.println("update saptrxEhHdr");
		em.getTransaction().begin();
		em.persist(saptrxEhHdr);
		em.getTransaction().commit();
		em.close();
		System.out.println("update committed");

		// releaseEntityManager();
		return saptrxEhHdr;
	}

	@Override
	public SaptrxEhHdr add(String ehGuid, Timestamp activeDate,
			String aoClient, String aoId, String aoSystem, String aoType,
			String appLogFlag, String busProcType, String bwPosted,
			String chkUnexpected, String createdBy, Timestamp createdDate,
			String dfExist, String eeEvalProc, String eeMonitorProc,
			String eeProfile, String ehActive, String ehArchived,
			String ehChangeable, String ehDeleted, String ehType,
			String emVersion, Timestamp endDate, Timestamp inactiveDate,
			int lastCntrlNbr, int lastEehstNbr, int lastErmsgNbr,
			String lastEvMsg, int lastEvmsgNbr, int lastExpevNbr,
			int lastHierNbr, int lastInfoNbr, int lastMeasrNbr,
			int lastMehstNbr, int lastQryidNbr, int lastSthstNbr,
			int lastTaskNbr, int lastTrkidNbr, String loglvlEhpost,
			String loglvlExtupd, String loglvlMsgprc, String matchEeStored,
			String rulesetId, Timestamp startDate, String statusProf,
			String trackingid, String trackingidtype, String updateProc1,
			String updateProc2, String updatedBy, Timestamp updatedDate) {

		EntityManager em = getEntityManagerFactory().createEntityManager();

		SaptrxEhHdr saptrxEhHdr = new SaptrxEhHdr();
		saptrxEhHdr.setEhGuid(ehGuid);
		saptrxEhHdr.setActiveDate(activeDate);
		saptrxEhHdr.setAoClient(aoClient);
		saptrxEhHdr.setAoId(aoId);
		saptrxEhHdr.setAoSystem(aoSystem);
		saptrxEhHdr.setAoType(aoType);
		saptrxEhHdr.setAppLogFlag(appLogFlag);
		saptrxEhHdr.setBusProcType(busProcType);
		saptrxEhHdr.setBwPosted(bwPosted);
		saptrxEhHdr.setChkUnexpected(chkUnexpected);
		saptrxEhHdr.setCreatedBy(createdBy);
		saptrxEhHdr.setCreatedDate(createdDate);
		saptrxEhHdr.setDfExist(dfExist);
		saptrxEhHdr.setEeEvalProc(eeEvalProc);
		saptrxEhHdr.setEeMonitorProc(eeMonitorProc);
		saptrxEhHdr.setEeProfile(eeProfile);
		saptrxEhHdr.setEhActive(ehActive);
		saptrxEhHdr.setEhArchived(ehArchived);
		saptrxEhHdr.setEhChangeable(ehChangeable);
		saptrxEhHdr.setEhDeleted(ehDeleted);
		saptrxEhHdr.setEhType(ehType);
		saptrxEhHdr.setEmVersion(emVersion);
		saptrxEhHdr.setEndDate(endDate);
		saptrxEhHdr.setInactiveDate(inactiveDate);
		saptrxEhHdr.setLastCntrlNbr(lastCntrlNbr);
		saptrxEhHdr.setLastEehstNbr(lastEehstNbr);
		saptrxEhHdr.setLastErmsgNbr(lastErmsgNbr);
		saptrxEhHdr.setLastEvMsg(lastEvMsg);
		saptrxEhHdr.setLastEvmsgNbr(lastEvmsgNbr);
		saptrxEhHdr.setLastExpevNbr(lastExpevNbr);
		saptrxEhHdr.setLastHierNbr(lastHierNbr);
		saptrxEhHdr.setLastInfoNbr(lastInfoNbr);
		saptrxEhHdr.setLastMeasrNbr(lastMeasrNbr);
		saptrxEhHdr.setLastMehstNbr(lastMehstNbr);
		saptrxEhHdr.setLastQryidNbr(lastSthstNbr);
		saptrxEhHdr.setLastTaskNbr(lastTaskNbr);
		saptrxEhHdr.setLastTrkidNbr(lastTrkidNbr);
		saptrxEhHdr.setLoglvlEhpost(loglvlEhpost);
		saptrxEhHdr.setLoglvlExtupd(loglvlExtupd);
		saptrxEhHdr.setLoglvlMsgprc(loglvlMsgprc);
		saptrxEhHdr.setMatchEeStored(matchEeStored);
		saptrxEhHdr.setRulesetId(rulesetId);
		saptrxEhHdr.setStartDate(startDate);
		saptrxEhHdr.setStatusProf(statusProf);
		saptrxEhHdr.setTrackingid(trackingid);
		saptrxEhHdr.setTrackingidtype(trackingidtype);
		saptrxEhHdr.setUpdateProc1(updateProc1);
		saptrxEhHdr.setUpdateProc2(updateProc2);
		saptrxEhHdr.setUpdatedBy(updatedBy);
		saptrxEhHdr.setUpdatedDate(updatedDate);

		System.out.println("Pesist SaptrxEhEvmsg");
		em.getTransaction().begin();
		em.persist(saptrxEhHdr);
		em.getTransaction().commit();
		System.out.println("Commited");
		em.close();
		// releaseEntityManager();
		return saptrxEhHdr;

	}

	@Override
	public SaptrxEhHdr update(String ehGuid, Timestamp activeDate,
			String aoClient, String aoId, String aoSystem, String aoType,
			String appLogFlag, String busProcType, String bwPosted,
			String chkUnexpected, String createdBy, Timestamp createdDate,
			String dfExist, String eeEvalProc, String eeMonitorProc,
			String eeProfile, String ehActive, String ehArchived,
			String ehChangeable, String ehDeleted, String ehType,
			String emVersion, Timestamp endDate, Timestamp inactiveDate,
			int lastCntrlNbr, int lastEehstNbr, int lastErmsgNbr,
			String lastEvMsg, int lastEvmsgNbr, int lastExpevNbr,
			int lastHierNbr, int lastInfoNbr, int lastMeasrNbr,
			int lastMehstNbr, int lastQryidNbr, int lastSthstNbr,
			int lastTaskNbr, int lastTrkidNbr, String loglvlEhpost,
			String loglvlExtupd, String loglvlMsgprc, String matchEeStored,
			String rulesetId, Timestamp startDate, String statusProf,
			String trackingid, String trackingidtype, String updateProc1,
			String updateProc2, String updatedBy, Timestamp updatedDate) {

		EntityManager em = getEntityManagerFactory().createEntityManager();
		Date date= new java.util.Date();

		SaptrxEhHdr saptrxEhHdr = get(ehGuid);
		if (saptrxEhHdr == null) {
			return null;
		}
		saptrxEhHdr.setEhGuid("BASC32483274");
		saptrxEhHdr.setActiveDate(new Timestamp(date.getTime()));
		saptrxEhHdr.setAoClient("TEST CLIENT");
		saptrxEhHdr.setAoId("AO342");
		saptrxEhHdr.setAoSystem("TEST AO");
		saptrxEhHdr.setAoType("TEST");
		saptrxEhHdr.setAppLogFlag("APP LOG");
		saptrxEhHdr.setBusProcType("TEST PROC");
		saptrxEhHdr.setBwPosted("TEST POST");
		saptrxEhHdr.setChkUnexpected("CHK UNEXPECT");
		saptrxEhHdr.setCreatedBy("TEST USER");
		saptrxEhHdr.setCreatedDate(new Timestamp(date.getTime()));
		saptrxEhHdr.setDfExist("DF EXIST");
		saptrxEhHdr.setEeEvalProc("EVAL_PROC");
		saptrxEhHdr.setEeMonitorProc("MONITOR_PROC");
		saptrxEhHdr.setEeProfile("TEST PROF");
		saptrxEhHdr.setEhActive("Y");
		saptrxEhHdr.setEhArchived("A");
		saptrxEhHdr.setEhChangeable("Y");
		saptrxEhHdr.setEhDeleted("D");
		saptrxEhHdr.setEhType("TEST");
		saptrxEhHdr.setEmVersion("2.0");
		saptrxEhHdr.setEndDate(new Timestamp(date.getTime()));
		saptrxEhHdr.setInactiveDate(new Timestamp(date.getTime()));
		saptrxEhHdr.setLastCntrlNbr(7642);
		saptrxEhHdr.setLastEehstNbr(34987);
		saptrxEhHdr.setLastErmsgNbr(998034354);
		saptrxEhHdr.setLastEvMsg("TEST MSG");
		saptrxEhHdr.setLastEvmsgNbr(5435);
		saptrxEhHdr.setLastExpevNbr(658732);
		saptrxEhHdr.setLastHierNbr(26585);
		saptrxEhHdr.setLastInfoNbr(7289472);
		saptrxEhHdr.setLastMeasrNbr(637458);
		saptrxEhHdr.setLastMehstNbr(7667657);
		saptrxEhHdr.setLastQryidNbr(9804328);
		saptrxEhHdr.setLastTaskNbr(7564358);
		saptrxEhHdr.setLastTrkidNbr(4566587);
		saptrxEhHdr.setLoglvlEhpost("LOG HOST");
		saptrxEhHdr.setLoglvlExtupd("LOG EXT");
		saptrxEhHdr.setLoglvlMsgprc("MSG PROC");
		saptrxEhHdr.setMatchEeStored("MATCHED STORE");
		saptrxEhHdr.setRulesetId("RULE432");
		saptrxEhHdr.setStartDate(new Timestamp(date.getTime()));
		saptrxEhHdr.setStatusProf("STATUS PROF");
		saptrxEhHdr.setTrackingid("T32432");
		saptrxEhHdr.setTrackingidtype("STR");
		saptrxEhHdr.setUpdateProc1("updateProc1");
		saptrxEhHdr.setUpdateProc2("updateProc2");
		saptrxEhHdr.setUpdatedBy("TEST USER");
		saptrxEhHdr.setUpdatedDate(new Timestamp(date.getTime()));
		System.out.println("update SaptrxEhHdr");
		em.getTransaction().begin();
		em.persist(saptrxEhHdr);
		em.getTransaction().commit();
		em.close();
		System.out.println("update committed");

		// releaseEntityManager();
		return saptrxEhHdr;
	}

	@Override
	public SaptrxEhHdr remove(String ehGuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SaptrxEhHdr get(String ehGuid) {
		SaptrxEhHdr saptrxEhHdr = getEntityManagerFactory()
				.createEntityManager().find(SaptrxEhHdr.class, ehGuid);
		// releaseEntityManager();
		return saptrxEhHdr;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SaptrxEhHdr> retriveAll() {
		Query query = getEntityManagerFactory().createEntityManager()
				.createQuery("SELECT s FROM SaptrxEhHdr s");
		List<SaptrxEhHdr> resList = query.getResultList();
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
