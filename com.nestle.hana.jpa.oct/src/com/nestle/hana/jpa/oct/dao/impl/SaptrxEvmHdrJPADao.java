package com.nestle.hana.jpa.oct.dao.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.nestle.hana.jpa.oct.dao.ISaptrxEvmHdrDao;
import com.nestle.hana.jpa.oct.model.SaptrxEvmHdr;

public class SaptrxEvmHdrJPADao extends BaseJPADao implements ISaptrxEvmHdrDao {

	public SaptrxEvmHdrJPADao() {

	}

	@Override
	public SaptrxEvmHdr add(SaptrxEvmHdr saptrxEvmHdr) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(saptrxEvmHdr);
		em.getTransaction().commit();
		System.out.println("Commited");
		em.close();
		// releaseEntityManager();
		return saptrxEvmHdr;
	}

	@Override
	public SaptrxEvmHdr update(SaptrxEvmHdr contr) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		SaptrxEvmHdr saptrxEvmHdr = get(contr.getEhGuid());
		if (saptrxEvmHdr == null) {
			return null;
		}

		saptrxEvmHdr.setBatchGuid(contr.getBatchGuid());
		saptrxEvmHdr.setCity1(contr.getCity1());
		saptrxEvmHdr.setCountry1(contr.getCountry1());
		saptrxEvmHdr.setDatacs(contr.getDatacs());
		saptrxEvmHdr.setDataid(contr.getDataid());
		saptrxEvmHdr.setDcnftp(contr.getDcnftp());
		saptrxEvmHdr.setEhGuid(contr.getEhGuid());
		saptrxEvmHdr.setElccod(contr.getElccod());
		saptrxEvmHdr.setElcid1(contr.getElcid1());
		saptrxEvmHdr.setElcid2(contr.getElcid2());
		saptrxEvmHdr.setEstqul(contr.getEstqul());
		saptrxEvmHdr.setEtxtst(contr.getEtxtst());
		saptrxEvmHdr.setEvltst(contr.getEvltst());
		saptrxEvmHdr.setEvtcod(contr.getEvtcod());
		saptrxEvmHdr.setEvtdat(contr.getEvtdat());
		saptrxEvmHdr.setEvtid(contr.getEvtid());
		saptrxEvmHdr.setEvttim(contr.getEvttim());
		saptrxEvmHdr.setEvttst(contr.getEvttst());
		saptrxEvmHdr.setEvtzon(contr.getEvtzon());
		saptrxEvmHdr.setExtLoccod(contr.getExtLoccod());
		saptrxEvmHdr.setExtLocid1(contr.getExtLocid1());
		saptrxEvmHdr.setExtLocid2(contr.getExtLocid2());
		saptrxEvmHdr.setExtRepcod(contr.getExtRepcod());
		saptrxEvmHdr.setExtRepid(contr.getExtRepid());
		saptrxEvmHdr.setExtTableId(contr.getExtTableId());
		saptrxEvmHdr.setExtTableName(contr.getExtTableName());
		saptrxEvmHdr.setIdocid(contr.getIdocid());
		saptrxEvmHdr.setIntEvCod(contr.getIntEvCod());
		saptrxEvmHdr.setIntSrCode(contr.getIntSrCode());
		saptrxEvmHdr.setInvalidData(contr.getInvalidData());
		saptrxEvmHdr.setLoccod(contr.getLoccod());
		saptrxEvmHdr.setLocid1(contr.getLocid1());
		saptrxEvmHdr.setLocid2(contr.getLocid2());
		saptrxEvmHdr.setLocnam(contr.getLocnam());
		saptrxEvmHdr.setLoczon(contr.getLoczon());
		saptrxEvmHdr.setLodsts(contr.getLodsts());
		saptrxEvmHdr.setMsgDeleted(contr.getMsgDeleted());
		saptrxEvmHdr.setMsgmod(contr.getMsgmod());
		saptrxEvmHdr.setMsgNotSent(contr.getMsgNotSent());
		saptrxEvmHdr.setMsgnum(contr.getMsgnum());
		saptrxEvmHdr.setMsgsrctyp(contr.getMsgsrctyp());
		saptrxEvmHdr.setMultipleTrkIds(contr.getMultipleTrkIds());
		saptrxEvmHdr.setPhysnd(contr.getPhysnd());
		saptrxEvmHdr.setPhystp(contr.getPhystp());
		saptrxEvmHdr.setPostlCod1(contr.getPostlCod1());
		saptrxEvmHdr.setPrctst(contr.getPrctst());
		saptrxEvmHdr.setProcessInactive(contr.getProcessInactive());
		saptrxEvmHdr.setProdds(contr.getProdds());
		saptrxEvmHdr.setProddt(contr.getProddt());
		saptrxEvmHdr.setRcvcod(contr.getRcvcod());
		saptrxEvmHdr.setRcvid(contr.getRcvid());
		saptrxEvmHdr.setRcvnam(contr.getRcvnam());
		saptrxEvmHdr.setRegion(contr.getRegion());
		saptrxEvmHdr.setReltst(contr.getReltst());
		saptrxEvmHdr.setRepcod(contr.getRepcod());
		saptrxEvmHdr.setRepdat(contr.getRepdat());
		saptrxEvmHdr.setRepid(contr.getRepid());
		saptrxEvmHdr.setRepm(contr.getRepm());
		saptrxEvmHdr.setReptim(contr.getReptim());
		saptrxEvmHdr.setReptst(contr.getReptst());
		saptrxEvmHdr.setRepzon(contr.getRepzon());
		saptrxEvmHdr.setSaveMode(contr.getSaveMode());
		saptrxEvmHdr.setSndcod(contr.getSndcod());
		saptrxEvmHdr.setSndid(contr.getSndid());
		saptrxEvmHdr.setSndnam(contr.getSndnam());
		saptrxEvmHdr.setSrccod(contr.getSrccod());
		saptrxEvmHdr.setSrcid(contr.getSrcid());
		saptrxEvmHdr.setSrctx(contr.getSrctx());
		saptrxEvmHdr.setTipcod(contr.getTipcod());
		saptrxEvmHdr.setTipid(contr.getTipid());
		saptrxEvmHdr.setTipnam(contr.getTipnam());
		saptrxEvmHdr.setTrxcod(contr.getTrxcod());
		saptrxEvmHdr.setTrxid(contr.getTrxid());
		saptrxEvmHdr.setUsername(contr.getUsername());
		saptrxEvmHdr.setVersion(contr.getVersion());

		System.out.println("update SaptrxEvmHdr");
		em.getTransaction().begin();
		em.persist(saptrxEvmHdr);
		em.getTransaction().commit();
		em.close();
		System.out.println("update comited");

		// releaseEntityManager();
		return saptrxEvmHdr;
	}

	@Override
	public SaptrxEvmHdr add(String ehGuid, String batchGuid, String city1,
			String country1, String datacs, String dataid, String dcnftp,
			String elccod, String elcid1, String elcid2, String estqul,
			Timestamp etxtst, Timestamp evltst, String evtcod, Date evtdat,
			String evtid, Timestamp evttim, Timestamp evttst, String evtzon,
			String extLoccod, String extLocid1, String extLocid2,
			String extRepcod, String extRepid, String extTableId,
			String extTableName, String idocid, String intEvCod,
			String intSrCode, String invalidData, String loccod, String locid1,
			String locid2, String locnam, String loczon, String lodsts,
			String msgDeleted, String msgNotSent, String msgmod, String msgnum,
			String msgsrctyp, String multipleTrkIds, String physnd,
			String phystp, String postlCod1, Timestamp prctst,
			String processInactive, String prodds, String proddt,
			String rcvcod, String rcvid, String rcvnam, String region,
			Timestamp reltst, String repcod, Date repdat, String repid,
			String repm, Timestamp reptim, Timestamp reptst, String repzon,
			String saveMode, String sndcod, String sndid, String sndnam,
			String srccod, String srcid, String srctx, String tipcod,
			String tipid, String tipnam, String trxcod, String trxid,
			String username, int version) {

		EntityManager em = getEntityManagerFactory().createEntityManager();

		SaptrxEvmHdr saptrxEvmHdr = new SaptrxEvmHdr();
		saptrxEvmHdr.setBatchGuid(batchGuid);
		saptrxEvmHdr.setCity1(city1);
		saptrxEvmHdr.setCountry1(country1);
		saptrxEvmHdr.setDatacs(datacs);
		saptrxEvmHdr.setDataid(dataid);
		saptrxEvmHdr.setDcnftp(dcnftp);
		saptrxEvmHdr.setEhGuid(ehGuid);
		saptrxEvmHdr.setElccod(elccod);
		saptrxEvmHdr.setElcid1(elcid1);
		saptrxEvmHdr.setElcid2(elcid2);
		saptrxEvmHdr.setEstqul(estqul);
		saptrxEvmHdr.setEtxtst(etxtst);
		saptrxEvmHdr.setEvltst(evltst);
		saptrxEvmHdr.setEvtcod(evtcod);
		saptrxEvmHdr.setEvtdat(evtdat);
		saptrxEvmHdr.setEvtid(evtid);
		saptrxEvmHdr.setEvttim(evttim);
		saptrxEvmHdr.setEvttst(evttst);
		saptrxEvmHdr.setEvtzon(evtzon);
		saptrxEvmHdr.setExtLoccod(extLoccod);
		saptrxEvmHdr.setExtLocid1(extLocid1);
		saptrxEvmHdr.setExtLocid2(extLocid2);
		saptrxEvmHdr.setExtRepcod(extRepcod);
		saptrxEvmHdr.setExtRepid(extRepid);
		saptrxEvmHdr.setExtTableId(extTableId);
		saptrxEvmHdr.setExtTableName(extTableName);
		saptrxEvmHdr.setIdocid(idocid);
		saptrxEvmHdr.setIntEvCod(intEvCod);
		saptrxEvmHdr.setIntSrCode(intSrCode);
		saptrxEvmHdr.setInvalidData(invalidData);
		saptrxEvmHdr.setLoccod(loccod);
		saptrxEvmHdr.setLocid1(locid1);
		saptrxEvmHdr.setLocid2(locid2);
		saptrxEvmHdr.setLocnam(locnam);
		saptrxEvmHdr.setLoczon(loczon);
		saptrxEvmHdr.setLodsts(lodsts);
		saptrxEvmHdr.setMsgDeleted(msgDeleted);
		saptrxEvmHdr.setMsgmod(msgmod);
		saptrxEvmHdr.setMsgNotSent(msgNotSent);
		saptrxEvmHdr.setMsgnum(msgnum);
		saptrxEvmHdr.setMsgsrctyp(msgsrctyp);
		saptrxEvmHdr.setMultipleTrkIds(multipleTrkIds);
		saptrxEvmHdr.setPhysnd(physnd);
		saptrxEvmHdr.setPhystp(phystp);
		saptrxEvmHdr.setPostlCod1(postlCod1);
		saptrxEvmHdr.setPrctst(prctst);
		saptrxEvmHdr.setProcessInactive(processInactive);
		saptrxEvmHdr.setProdds(prodds);
		saptrxEvmHdr.setProddt(proddt);
		saptrxEvmHdr.setRcvcod(rcvcod);
		saptrxEvmHdr.setRcvid(rcvid);
		saptrxEvmHdr.setRcvnam(rcvnam);
		saptrxEvmHdr.setRegion(region);
		saptrxEvmHdr.setReltst(reltst);
		saptrxEvmHdr.setRepcod(repcod);
		saptrxEvmHdr.setRepdat(repdat);
		saptrxEvmHdr.setRepid(repid);
		saptrxEvmHdr.setRepm(repm);
		saptrxEvmHdr.setReptim(reptim);
		saptrxEvmHdr.setReptst(reptst);
		saptrxEvmHdr.setRepzon(repzon);
		saptrxEvmHdr.setSaveMode(saveMode);
		saptrxEvmHdr.setSndcod(sndcod);
		saptrxEvmHdr.setSndid(sndid);
		saptrxEvmHdr.setSndnam(sndnam);
		saptrxEvmHdr.setSrccod(srccod);
		saptrxEvmHdr.setSrcid(srcid);
		saptrxEvmHdr.setSrctx(srctx);
		saptrxEvmHdr.setTipcod(tipcod);
		saptrxEvmHdr.setTipid(tipid);
		saptrxEvmHdr.setTipnam(tipnam);
		saptrxEvmHdr.setTrxcod(trxcod);
		saptrxEvmHdr.setTrxid(trxid);
		saptrxEvmHdr.setUsername(username);
		saptrxEvmHdr.setVersion(version);

		System.out.println("Pesist SaptrxEvmHdr");
		em.getTransaction().begin();
		em.persist(saptrxEvmHdr);
		em.getTransaction().commit();
		System.out.println("Commited");
		em.close();
		// releaseEntityManager();
		return saptrxEvmHdr;

	}

	@Override
	public SaptrxEvmHdr update(String ehGuid, String batchGuid, String city1,
			String country1, String datacs, String dataid, String dcnftp,
			String elccod, String elcid1, String elcid2, String estqul,
			Timestamp etxtst, Timestamp evltst, String evtcod, Date evtdat,
			String evtid, Timestamp evttim, Timestamp evttst, String evtzon,
			String extLoccod, String extLocid1, String extLocid2,
			String extRepcod, String extRepid, String extTableId,
			String extTableName, String idocid, String intEvCod,
			String intSrCode, String invalidData, String loccod, String locid1,
			String locid2, String locnam, String loczon, String lodsts,
			String msgDeleted, String msgNotSent, String msgmod, String msgnum,
			String msgsrctyp, String multipleTrkIds, String physnd,
			String phystp, String postlCod1, Timestamp prctst,
			String processInactive, String prodds, String proddt,
			String rcvcod, String rcvid, String rcvnam, String region,
			Timestamp reltst, String repcod, Date repdat, String repid,
			String repm, Timestamp reptim, Timestamp reptst, String repzon,
			String saveMode, String sndcod, String sndid, String sndnam,
			String srccod, String srcid, String srctx, String tipcod,
			String tipid, String tipnam, String trxcod, String trxid,
			String username, int version) {

		EntityManager em = getEntityManagerFactory().createEntityManager();

		SaptrxEvmHdr saptrxEvmHdr = get(ehGuid);
		if (saptrxEvmHdr == null) {
			return null;
		}
		
		System.out.println("update SaptrxEvmHdr");
		em.getTransaction().begin();
		em.persist(saptrxEvmHdr);
		em.getTransaction().commit();
		em.close();
		System.out.println("update committed");

		// releaseEntityManager();
		return saptrxEvmHdr;
	}

	@Override
	public SaptrxEvmHdr remove(String ehGuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SaptrxEvmHdr get(String ehGuid) {
		SaptrxEvmHdr saptrxEvmHdr = getEntityManagerFactory()
				.createEntityManager().find(SaptrxEvmHdr.class, ehGuid);
		// releaseEntityManager();
		return saptrxEvmHdr;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SaptrxEvmHdr> retriveAll() {
		Query query = getEntityManagerFactory().createEntityManager()
				.createQuery("SELECT s FROM SaptrxEvmHdr s");
		List<SaptrxEvmHdr> resList = query.getResultList();
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
