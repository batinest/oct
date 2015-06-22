package com.nestle.hana.jpa.oct.dao.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.nestle.hana.jpa.oct.dao.ISaptrxEhExpevDao;
import com.nestle.hana.jpa.oct.model.SaptrxEhExpev;

public class SaptrxEhExpevJPADao extends BaseJPADao implements ISaptrxEhExpevDao{


	public SaptrxEhExpevJPADao() {

	}

	@Override
	public SaptrxEhExpev add(SaptrxEhExpev saptrxEhExpev) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(saptrxEhExpev);
		em.getTransaction().commit();
		System.out.println("Committed");
		em.close();
		// releaseEntityManager();
		return saptrxEhExpev;
	}

	@Override
	public SaptrxEhExpev update(SaptrxEhExpev contr) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		SaptrxEhExpev saptrxEhExpev = get(contr.getEhGuid());
		if (saptrxEhExpev != null) {
			em.getTransaction().begin();
			saptrxEhExpev.setAoEvExpDate(contr.getAoEvExpDate());
			saptrxEhExpev.setChkDataFunc(contr.getChkDataFunc());
			saptrxEhExpev.setChkLocFunc(contr.getChkLocFunc());
			saptrxEhExpev.setChkPartnerFunc(contr.getChkPartnerFunc());
			saptrxEhExpev.setCity(contr.getCity());
			saptrxEhExpev.setCountry(contr.getCountry());
			saptrxEhExpev.setDatacs(contr.getDatacs());
			saptrxEhExpev.setDataid(contr.getDataid());
			saptrxEhExpev.setDatetime1(contr.getDatetime1());
			saptrxEhExpev.setDatetime2(contr.getDatetime2());
			saptrxEhExpev.setDatetime3(contr.getDatetime3());
			saptrxEhExpev.setDatetime4(contr.getDatetime4());
			saptrxEhExpev.setDatetime5(contr.getDatetime5());
			saptrxEhExpev.setEventGroup(contr.getEventGroup());
			saptrxEhExpev.setEventExpIndex(contr.getEventExpIndex());
			saptrxEhExpev.setEventGroup(contr.getEventGroup());
			saptrxEhExpev.setEarliestEvDate(contr.getEarliestEvDate());
			saptrxEhExpev.setEarliestMsgDte(contr.getEarliestMsgDte());
			saptrxEhExpev.setEhGuid(contr.getEhGuid());
			saptrxEhExpev.setEventCode(contr.getEventCode());
			saptrxEhExpev.setEventDate(contr.getEventDate());
			saptrxEhExpev.setEventDateUtc(contr.getEventDateUtc());
			saptrxEhExpev.setEventExpTzone(contr.getEventExpTzone());
			saptrxEhExpev.setEventTzone(contr.getEventTzone());
			saptrxEhExpev.setEventStatus(contr.getEventStatus());
			saptrxEhExpev.setEvExpCalcRule(contr.getEvExpCalcRule());
			saptrxEhExpev.setEvExpDateSeq(contr.getEvExpDateSeq());
			saptrxEhExpev.setEvExpDur(contr.getEvExpDur());
			saptrxEhExpev.setEvExpDurSign(contr.getEvExpDurSign());
			saptrxEhExpev.setEvTolerance(contr.getEvTolerance());
			saptrxEhExpev.setEvTolRule(contr.getEvTolRule());
			saptrxEhExpev.setForecast(contr.getForecast());
			saptrxEhExpev.setGroupNbr(contr.getGroupNbr());
			saptrxEhExpev.setItemident(contr.getItemident());
			saptrxEhExpev.setItemNbr(contr.getItemNbr());
			saptrxEhExpev.setLanguage(contr.getLanguage());
			saptrxEhExpev.setLocatDesc(contr.getLocatDesc());
			saptrxEhExpev.setLocId1(contr.getLocId1());
			saptrxEhExpev.setLocId2(contr.getLocId2());
			saptrxEhExpev.setLocIdType(contr.getLocIdType());
			saptrxEhExpev.setLatestEvDate(contr.getLatestEvDate());
			saptrxEhExpev.setLatestMsgDate(contr.getLatestMsgDate());
			saptrxEhExpev.setMsgDateUtc(contr.getMsgDateUtc());
			saptrxEhExpev.setMsgExpTzone(contr.getMsgExpTzone());
			saptrxEhExpev.setMsgGuid(contr.getMsgGuid());
			saptrxEhExpev.setMsgRcvdDate(contr.getMsgRcvdDate());
			saptrxEhExpev.setMsgRcvdTzone(contr.getMsgRcvdTzone());
			saptrxEhExpev.setMsgExpCalcRul(contr.getMsgExpCalcRul());
			saptrxEhExpev.setMsgExpDate(contr.getMsgExpDate());
			saptrxEhExpev.setMsgExpDur(contr.getMsgExpDur());
			saptrxEhExpev.setMsgExpDurSign(contr.getMsgExpDurSign());
			saptrxEhExpev.setMsgExpIndex(contr.getMsgExpIndex());
			saptrxEhExpev.setMsgStatus(contr.getMsgStatus());
			saptrxEhExpev.setMsgTolerance(contr.getMsgTolerance());
			saptrxEhExpev.setMsgTolRule(contr.getMsgTolRule());
			saptrxEhExpev.setNoDataVal(contr.getNoDataVal());
			saptrxEhExpev.setNoLocVal(contr.getNoLocVal());
			saptrxEhExpev.setNoPartnerVal(contr.getNoPartnerVal());
			saptrxEhExpev.setOrigEvExpDate(contr.getOrigEvExpDate());
			saptrxEhExpev.setOrigMsgExpDte(contr.getOrigMsgExpDte());
			saptrxEhExpev.setPartnerId(contr.getPartnerId());
			saptrxEhExpev.setPartnerIdType(contr.getPartnerIdType());
			saptrxEhExpev.setPostalCd(contr.getPostalCd());
			saptrxEhExpev.setPredFlag(contr.getPredFlag());
			saptrxEhExpev.setPriority(contr.getPriority());
			saptrxEhExpev.setRefdistance(contr.getRefdistance());
			saptrxEhExpev.setRefdistunit(contr.getRefdistunit());
			saptrxEhExpev.setRefeffdurat(contr.getRefeffdurat());
			saptrxEhExpev.setRefmilestone(contr.getRefmilestone());
			saptrxEhExpev.setReftotdurat(contr.getReftotdurat());
			saptrxEhExpev.setRegion(contr.getRegion());
			saptrxEhExpev.setReprocessFlag(contr.getReprocessFlag());
			saptrxEhExpev.setReqSetNbr(contr.getReqSetNbr());
			saptrxEhExpev.setReqType(contr.getReqType());
			saptrxEhExpev.setSeqNbr(contr.getSeqNbr());
			saptrxEhExpev.setTzone1(contr.getTzone1());
			saptrxEhExpev.setTzone2(contr.getTzone2());
			saptrxEhExpev.setTzone3(contr.getTzone3());
			saptrxEhExpev.setTzone4(contr.getTzone4());
			saptrxEhExpev.setTzone5(contr.getTzone5());
			saptrxEhExpev.setUserDefInd(contr.getUserDefInd());
			
			System.out.println("update saptrxEhExpev");
			em.getTransaction().commit();
			em.close();
			System.out.println("update committed");

			// releaseEntityManager();
			return saptrxEhExpev;
			
		}
		else
			return null;
	}

	@Override
	public SaptrxEhExpev add(String ehGuid, Timestamp aoEvExpDate,
			String chkDataFunc, String chkLocFunc, String chkPartnerFunc,
			String city, String country, String datacs, String dataid,
			Timestamp datetime1, Timestamp datetime2, Timestamp datetime3,
			Timestamp datetime4, Timestamp datetime5, Timestamp earliestEvDate,
			Timestamp earliestMsgDte, String evExpCalcRule, int evExpDateSeq,
			BigDecimal evExpDur, String evExpDurSign, String evTolRule,
			BigDecimal evTolerance, String eventCode, Timestamp eventDate,
			Timestamp eventDateUtc, Timestamp eventExpDate,
			String eventExpIndex, String eventExpTzone, String eventGroup,
			String eventStatus, String eventTzone, String forecast,
			int groupNbr, int itemNbr, String itemident, String language,
			Timestamp latestEvDate, Timestamp latestMsgDate, String locId1,
			String locId2, String locIdType, String locatDesc,
			Timestamp msgDateUtc, String msgExpCalcRul, Timestamp msgExpDate,
			int msgExpDateSeq, BigDecimal msgExpDur, String msgExpDurSign,
			String msgExpIndex, String msgExpTzone, String msgGuid,
			Timestamp msgRcvdDate, String msgRcvdTzone, String msgStatus,
			String msgTolRule, BigDecimal msgTolerance, String noDataVal,
			String noLocVal, String noPartnerVal, Timestamp origEvExpDate,
			Timestamp origMsgExpDte, String partnerId, String partnerIdType,
			String postalCd, String predFlag, int priority, int refdistance,
			String refdistunit, BigDecimal refeffdurat, int refmilestone,
			BigDecimal reftotdurat, String region, String reprocessFlag,
			int reqSetNbr, String reqType, int seqNbr, String tzone1,
			String tzone2, String tzone3, String tzone4, String tzone5,
			String userDefInd) {

		EntityManager em = getEntityManagerFactory().createEntityManager();

		SaptrxEhExpev saptrxEhExpev = new SaptrxEhExpev();
		saptrxEhExpev.setAoEvExpDate(aoEvExpDate);
		saptrxEhExpev.setChkDataFunc(chkDataFunc);
		saptrxEhExpev.setChkLocFunc(chkLocFunc);
		saptrxEhExpev.setChkPartnerFunc(chkPartnerFunc);
		saptrxEhExpev.setCity(city);
		saptrxEhExpev.setCountry(country);
		saptrxEhExpev.setDatacs(datacs);
		saptrxEhExpev.setDataid(dataid);
		saptrxEhExpev.setDatetime1(datetime1);
		saptrxEhExpev.setDatetime2(datetime2);
		saptrxEhExpev.setDatetime3(datetime3);
		saptrxEhExpev.setDatetime4(datetime4);
		saptrxEhExpev.setDatetime5(datetime5);
		saptrxEhExpev.setEventGroup(eventGroup);
		saptrxEhExpev.setEventExpIndex(eventExpIndex);
		saptrxEhExpev.setEventGroup(eventGroup);
		saptrxEhExpev.setEarliestEvDate(earliestEvDate);
		saptrxEhExpev.setEarliestMsgDte(earliestMsgDte);
		saptrxEhExpev.setEhGuid(ehGuid);
		saptrxEhExpev.setEventCode(eventCode);
		saptrxEhExpev.setEventDate(eventDate);
		saptrxEhExpev.setEventDateUtc(eventDateUtc);
		saptrxEhExpev.setEventExpTzone(eventExpTzone);
		saptrxEhExpev.setEventTzone(eventTzone);
		saptrxEhExpev.setEventStatus(eventStatus);
		saptrxEhExpev.setEvExpCalcRule(evExpCalcRule);
		saptrxEhExpev.setEvExpDateSeq(evExpDateSeq);
		saptrxEhExpev.setEvExpDur(evExpDur);
		saptrxEhExpev.setEvExpDurSign(evExpDurSign);
		saptrxEhExpev.setEvTolerance(evTolerance);
		saptrxEhExpev.setEvTolRule(evTolRule);
		saptrxEhExpev.setForecast(forecast);
		saptrxEhExpev.setGroupNbr(groupNbr);
		saptrxEhExpev.setItemident(itemident);
		saptrxEhExpev.setItemNbr(itemNbr);
		saptrxEhExpev.setLanguage(language);
		saptrxEhExpev.setLocatDesc(locatDesc);
		saptrxEhExpev.setLocId1(locId1);
		saptrxEhExpev.setLocId2(locId2);
		saptrxEhExpev.setLocIdType(locIdType);
		saptrxEhExpev.setLatestEvDate(latestEvDate);
		saptrxEhExpev.setLatestMsgDate(latestMsgDate);
		saptrxEhExpev.setMsgDateUtc(msgDateUtc);
		saptrxEhExpev.setMsgExpTzone(msgExpTzone);
		saptrxEhExpev.setMsgGuid(msgGuid);
		saptrxEhExpev.setMsgRcvdDate(msgRcvdDate);
		saptrxEhExpev.setMsgRcvdTzone(msgRcvdTzone);
		saptrxEhExpev.setMsgExpCalcRul(msgExpCalcRul);
		saptrxEhExpev.setMsgExpDate(msgExpDate);
		saptrxEhExpev.setMsgExpDur(msgExpDur);
		saptrxEhExpev.setMsgExpDurSign(msgExpDurSign);
		saptrxEhExpev.setMsgExpIndex(msgExpIndex);
		saptrxEhExpev.setMsgStatus(msgStatus);
		saptrxEhExpev.setMsgTolerance(msgTolerance);
		saptrxEhExpev.setMsgTolRule(msgTolRule);
		saptrxEhExpev.setNoDataVal(noDataVal);
		saptrxEhExpev.setNoLocVal(noLocVal);
		saptrxEhExpev.setNoPartnerVal(noPartnerVal);
		saptrxEhExpev.setOrigEvExpDate(origEvExpDate);
		saptrxEhExpev.setOrigMsgExpDte(origMsgExpDte);
		saptrxEhExpev.setPartnerId(partnerId);
		saptrxEhExpev.setPartnerIdType(partnerIdType);
		saptrxEhExpev.setPostalCd(postalCd);
		saptrxEhExpev.setPredFlag(predFlag);
		saptrxEhExpev.setPriority(priority);
		saptrxEhExpev.setRefdistance(refdistance);
		saptrxEhExpev.setRefdistunit(refdistunit);
		saptrxEhExpev.setRefeffdurat(refeffdurat);
		saptrxEhExpev.setRefmilestone(refmilestone);
		saptrxEhExpev.setReftotdurat(reftotdurat);
		saptrxEhExpev.setRegion(region);
		saptrxEhExpev.setReprocessFlag(reprocessFlag);
		saptrxEhExpev.setReqSetNbr(reqSetNbr);
		saptrxEhExpev.setReqType(reqType);
		saptrxEhExpev.setSeqNbr(seqNbr);
		saptrxEhExpev.setTzone1(tzone1);
		saptrxEhExpev.setTzone2(tzone2);
		saptrxEhExpev.setTzone3(tzone3);
		saptrxEhExpev.setTzone4(tzone4);
		saptrxEhExpev.setTzone5(tzone5);
		saptrxEhExpev.setUserDefInd(userDefInd);
		
		System.out.println("Persist SaptrxEhExpev");
		em.getTransaction().begin();
		em.persist(saptrxEhExpev);
		em.getTransaction().commit();
		System.out.println("Commited");
		em.close();
		// releaseEntityManager();
		return saptrxEhExpev;

	}

	@Override
	public SaptrxEhExpev update(String ehGuid, Timestamp aoEvExpDate,
			String chkDataFunc, String chkLocFunc, String chkPartnerFunc,
			String city, String country, String datacs, String dataid,
			Timestamp datetime1, Timestamp datetime2, Timestamp datetime3,
			Timestamp datetime4, Timestamp datetime5, Timestamp earliestEvDate,
			Timestamp earliestMsgDte, String evExpCalcRule, int evExpDateSeq,
			BigDecimal evExpDur, String evExpDurSign, String evTolRule,
			BigDecimal evTolerance, String eventCode, Timestamp eventDate,
			Timestamp eventDateUtc, Timestamp eventExpDate,
			String eventExpIndex, String eventExpTzone, String eventGroup,
			String eventStatus, String eventTzone, String forecast,
			int groupNbr, int itemNbr, String itemident, String language,
			Timestamp latestEvDate, Timestamp latestMsgDate, String locId1,
			String locId2, String locIdType, String locatDesc,
			Timestamp msgDateUtc, String msgExpCalcRul, Timestamp msgExpDate,
			int msgExpDateSeq, BigDecimal msgExpDur, String msgExpDurSign,
			String msgExpIndex, String msgExpTzone, String msgGuid,
			Timestamp msgRcvdDate, String msgRcvdTzone, String msgStatus,
			String msgTolRule, BigDecimal msgTolerance, String noDataVal,
			String noLocVal, String noPartnerVal, Timestamp origEvExpDate,
			Timestamp origMsgExpDte, String partnerId, String partnerIdType,
			String postalCd, String predFlag, int priority, int refdistance,
			String refdistunit, BigDecimal refeffdurat, int refmilestone,
			BigDecimal reftotdurat, String region, String reprocessFlag,
			int reqSetNbr, String reqType, int seqNbr, String tzone1,
			String tzone2, String tzone3, String tzone4, String tzone5,
			String userDefInd) {

		EntityManager em = getEntityManagerFactory().createEntityManager();
		Date date = new java.util.Date();

		SaptrxEhExpev saptrxEhExpev = get(ehGuid);
		if (saptrxEhExpev == null) {
			return null;
		}
		saptrxEhExpev.setAoEvExpDate(new Timestamp(date.getTime()));
		saptrxEhExpev.setChkDataFunc("DONE");
		saptrxEhExpev.setChkLocFunc("TESTFUNC");
		saptrxEhExpev.setChkPartnerFunc("PARTFUNC");
		saptrxEhExpev.setCity("KOL");
		saptrxEhExpev.setCountry("INDIA");
		saptrxEhExpev.setDatacs("TESTDATA");
		saptrxEhExpev.setDataid("43264");
		saptrxEhExpev.setDatetime1(new Timestamp(date.getTime()));
		saptrxEhExpev.setDatetime2(new Timestamp(date.getTime()));
		saptrxEhExpev.setDatetime3(new Timestamp(date.getTime()));
		saptrxEhExpev.setDatetime4(new Timestamp(date.getTime()));
		saptrxEhExpev.setDatetime5(new Timestamp(date.getTime()));
		saptrxEhExpev.setEventGroup("TESTEVENT");
		saptrxEhExpev.setEventExpIndex("999");
		saptrxEhExpev.setEarliestEvDate(new Timestamp(date.getTime()));
		saptrxEhExpev.setEarliestMsgDte(new Timestamp(date.getTime()));
		saptrxEhExpev.setEhGuid("FGHF1235421");
		saptrxEhExpev.setEventCode("EVE1234");
		saptrxEhExpev.setEventDate(new Timestamp(date.getTime()));
		saptrxEhExpev.setEventDateUtc(new Timestamp(date.getTime()));
		saptrxEhExpev.setEventExpTzone("KOLKATA");
		saptrxEhExpev.setEventTzone("DELHI");
		saptrxEhExpev.setEventStatus("COMPLETED");
		saptrxEhExpev.setEvExpCalcRule("RULE123");
		saptrxEhExpev.setEvExpDateSeq(324);
		saptrxEhExpev.setEvExpDur(new BigDecimal(2.3));
		saptrxEhExpev.setEvExpDurSign("LONG");
		saptrxEhExpev.setEvTolerance(new BigDecimal(1.3));
		saptrxEhExpev.setEvTolRule("TOTALRULE");
		saptrxEhExpev.setForecast("FAIR");
		saptrxEhExpev.setGroupNbr(54);
		saptrxEhExpev.setItemident("TESTIND");
		saptrxEhExpev.setItemNbr(7897);
		saptrxEhExpev.setLanguage("ENGLISH");
		saptrxEhExpev.setLocatDesc("TEST LOCATION");
		saptrxEhExpev.setLocId1("KOL23");
		saptrxEhExpev.setLocId2("KOL236");
		saptrxEhExpev.setLocIdType("TEST");
		saptrxEhExpev.setLatestEvDate(new Timestamp(date.getTime()));
		saptrxEhExpev.setLatestMsgDate(new Timestamp(date.getTime()));
		saptrxEhExpev.setMsgDateUtc(new Timestamp(date.getTime()));
		saptrxEhExpev.setMsgExpTzone("TESTMSG");
		saptrxEhExpev.setMsgGuid("MSG324");
		saptrxEhExpev.setMsgRcvdDate(new Timestamp(date.getTime()));
		saptrxEhExpev.setMsgRcvdTzone("TEST RECV");
		saptrxEhExpev.setMsgExpCalcRul("TEST RULE");
		saptrxEhExpev.setMsgExpDate(new Timestamp(date.getTime()));
		saptrxEhExpev.setMsgExpDur(new BigDecimal(213.22));
		saptrxEhExpev.setMsgExpDurSign("TEST SIGN");
		saptrxEhExpev.setMsgExpIndex("MSG INDEX");
		saptrxEhExpev.setMsgStatus("DONE");
		saptrxEhExpev.setMsgTolerance(new BigDecimal(32.324));
		saptrxEhExpev.setMsgTolRule("MSG RULE");
		saptrxEhExpev.setNoDataVal("YES");
		saptrxEhExpev.setNoLocVal("NO");
		saptrxEhExpev.setNoPartnerVal("PART23");
		saptrxEhExpev.setOrigEvExpDate(new Timestamp(date.getTime()));
		saptrxEhExpev.setOrigMsgExpDte(new Timestamp(date.getTime()));
		saptrxEhExpev.setPartnerId("PART721379127");
		saptrxEhExpev.setPartnerIdType("TEST PARTNEr");
		saptrxEhExpev.setPostalCd("700056");
		saptrxEhExpev.setPredFlag("PREP");
		saptrxEhExpev.setPriority(5);
		saptrxEhExpev.setRefdistance(322);
		saptrxEhExpev.setRefdistunit("TEST UNIT");
		saptrxEhExpev.setRefeffdurat(new BigDecimal(21.34));
		saptrxEhExpev.setRefmilestone(68);
		saptrxEhExpev.setReftotdurat(new BigDecimal(432.87));
		saptrxEhExpev.setRegion("ASIA");
		saptrxEhExpev.setReprocessFlag("YES");
		saptrxEhExpev.setReqSetNbr(896);
		saptrxEhExpev.setReqType("TEST REQUEST");
		saptrxEhExpev.setSeqNbr(7);
		saptrxEhExpev.setTzone1("tzone1");
		saptrxEhExpev.setTzone2("tzone2");
		saptrxEhExpev.setTzone3("tzone3");
		saptrxEhExpev.setTzone4("tzone4");
		saptrxEhExpev.setTzone5("tzone5");
		saptrxEhExpev.setUserDefInd("TEST USER");
		System.out.println("update SaptrxEhExpev");
		em.getTransaction().begin();
		em.persist(saptrxEhExpev);
		em.getTransaction().commit();
		em.close();
		System.out.println("update committed");

		// releaseEntityManager();
		return saptrxEhExpev;
	}

	@Override
	public SaptrxEhExpev remove(String ehGuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SaptrxEhExpev get(String ehGuid) {
		SaptrxEhExpev saptrxEhExpev = getEntityManagerFactory()
				.createEntityManager().find(SaptrxEhExpev.class, ehGuid);
		// releaseEntityManager();
		return saptrxEhExpev;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SaptrxEhExpev> retriveAll() {
		Query query = getEntityManagerFactory().createEntityManager()
				.createQuery("SELECT s FROM SaptrxEhExpev s");
		List<SaptrxEhExpev> resList = query.getResultList();
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
