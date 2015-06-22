package com.nestle.hana.jpa.oct.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.nestle.hana.jpa.oct.model.SaptrxEvmHdr;

public interface ISaptrxEvmHdrDao {

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
			String username, int version);

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
			String username, int version);

	public SaptrxEvmHdr add(SaptrxEvmHdr ehTrkId);

	public SaptrxEvmHdr update(SaptrxEvmHdr ehTrkId);

	public SaptrxEvmHdr remove(String ehTrkId);

	public SaptrxEvmHdr get(String ehTrkId);

	public List<SaptrxEvmHdr> retriveAll();

	// public List<SaptrxEvmHdr> getAllWithStatus(String status);

}
