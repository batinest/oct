package com.nestle.hana.jpa.oct.dao;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import com.nestle.hana.jpa.oct.model.SaptrxEhExpev;

public interface ISaptrxEhExpevDao {

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
			String userDefInd);

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
			String userDefInd);

	public SaptrxEhExpev add(SaptrxEhExpev exPev);

	public SaptrxEhExpev update(SaptrxEhExpev exPev);

	public SaptrxEhExpev remove(String ehGuid);

	public SaptrxEhExpev get(String ehGuid);

	public List<SaptrxEhExpev> retriveAll();

	// public List<SaptrxEhExpev> getAllWithStatus(String status);

}
