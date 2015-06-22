package com.nestle.hana.jpa.oct.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType; 
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The persistent class for the SAPTRX_EH_EXPEV database table.
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="Z_SAPTRX_EH_EXPEV")
@NamedQuery(name="SaptrxEhExpev.findAll", query="SELECT s FROM SaptrxEhExpev s")
public class SaptrxEhExpev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EH_GUID")
	private String ehGuid;

	@Column(name="AO_EV_EXP_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp aoEvExpDate;

	@Column(name="CHK_DATA_FUNC")
	private String chkDataFunc;

	@Column(name="CHK_LOC_FUNC")
	private String chkLocFunc;

	@Column(name="CHK_PARTNER_FUNC")
	private String chkPartnerFunc;

	@Column(name="CITY")
	private String city;

	@Column(name="COUNTRY")
	private String country;

	@Column(name="DATACS")
	private String datacs;

	@Column(name="DATAID")
	private String dataid;
	
	@Column(name="DATETIME1")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp datetime1;

	@Column(name="DATETIME2")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp datetime2;

	@Column(name="DATETIME3")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp datetime3;

	@Column(name="DATETIME4")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp datetime4;

	@Column(name="DATETIME5")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp datetime5;

	@Column(name="EARLIEST_EV_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp earliestEvDate;

	@Column(name="EARLIEST_MSG_DTE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp earliestMsgDte;

	@Column(name="EV_EXP_CALC_RULE")
	private String evExpCalcRule;

	@Column(name="EV_EXP_DATE_SEQ")
	private int evExpDateSeq;

	@Column(name="EV_EXP_DUR")
	private BigDecimal evExpDur;

	@Column(name="EV_EXP_DUR_SIGN")
	private String evExpDurSign;

	@Column(name="EV_TOL_RULE")
	private String evTolRule;

	@Column(name="EV_TOLERANCE")
	private BigDecimal evTolerance;

	@Column(name="EVENT_CODE")
	private String eventCode;

	@Column(name="EVENT_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp eventDate;

	@Column(name="EVENT_DATE_UTC")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp eventDateUtc;

	@Column(name="EVENT_EXP_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp eventExpDate;

	@Column(name="EVENT_EXP_INDEX")
	private String eventExpIndex;

	@Column(name="EVENT_EXP_TZONE")
	private String eventExpTzone;

	@Column(name="EVENT_GROUP")
	private String eventGroup;

	@Column(name="EVENT_STATUS")
	private String eventStatus;

	@Column(name="EVENT_TZONE")
	private String eventTzone;

	@Column(name="FORECAST")
	private String forecast;

	@Column(name="GROUP_NBR")
	private int groupNbr;

	@Column(name="ITEM_NBR")
	private int itemNbr;

	@Column(name="ITEMIDENT")
	private String itemident;

	@Column(name="LANGUAGE")
	private String language;

	@Column(name="LATEST_EV_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp latestEvDate;

	@Column(name="LATEST_MSG_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp latestMsgDate;

	@Column(name="LOC_ID_1")
	private String locId1;

	@Column(name="LOC_ID_2")
	private String locId2;

	@Column(name="LOC_ID_TYPE")
	private String locIdType;

	@Column(name="LOCAT_DESC")
	private String locatDesc;

	@Column(name="MSG_DATE_UTC")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp msgDateUtc;

	@Column(name="MSG_EXP_CALC_RUL")
	private String msgExpCalcRul;

	@Column(name="MSG_EXP_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp msgExpDate;

	@Column(name="MSG_EXP_DATE_SEQ")
	private int msgExpDateSeq;

	@Column(name="MSG_EXP_DUR")
	private BigDecimal msgExpDur;

	@Column(name="MSG_EXP_DUR_SIGN")
	private String msgExpDurSign;

	@Column(name="MSG_EXP_INDEX")
	private String msgExpIndex;

	@Column(name="MSG_EXP_TZONE")
	private String msgExpTzone;

	@Column(name="MSG_GUID")
	private String msgGuid;

	@Column(name="MSG_RCVD_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp msgRcvdDate;

	@Column(name="MSG_RCVD_TZONE")
	private String msgRcvdTzone;

	@Column(name="MSG_STATUS")
	private String msgStatus;

	@Column(name="MSG_TOL_RULE")
	private String msgTolRule;

	@Column(name="MSG_TOLERANCE")
	private BigDecimal msgTolerance;

	@Column(name="NO_DATA_VAL")
	private String noDataVal;

	@Column(name="NO_LOC_VAL")
	private String noLocVal;

	@Column(name="NO_PARTNER_VAL")
	private String noPartnerVal;

	@Column(name="ORIG_EV_EXP_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp origEvExpDate;

	@Column(name="ORIG_MSG_EXP_DTE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp origMsgExpDte;

	@Column(name="PARTNER_ID")
	private String partnerId;

	@Column(name="PARTNER_ID_TYPE")
	private String partnerIdType;

	@Column(name="POSTAL_CD")
	private String postalCd;

	@Column(name="PRED_FLAG")
	private String predFlag;
	
	@Column(name="PRIORITY")
	private int priority;

	@Column(name="REFDISTANCE")
	private int refdistance;

	@Column(name="REFDISTUNIT")
	private String refdistunit;

	@Column(name="REFEFFDURAT")
	private BigDecimal refeffdurat;

	@Column(name="REFMILESTONE")
	private int refmilestone;

	@Column(name="REFTOTDURAT")
	private BigDecimal reftotdurat;

	@Column(name="REGION")
	private String region;

	@Column(name="REPROCESS_FLAG")
	private String reprocessFlag;

	@Column(name="REQ_SET_NBR")
	private int reqSetNbr;

	@Column(name="REQ_TYPE")
	private String reqType;

	@Column(name="SEQ_NBR")
	private int seqNbr;

	@Column(name="TZONE1")
	private String tzone1;

	@Column(name="TZONE2")
	private String tzone2;

	@Column(name="TZONE3")
	private String tzone3;

	@Column(name="TZONE4")
	private String tzone4;

	@Column(name="TZONE5")
	private String tzone5;
	
	private String addUpdateFlag;

	@Column(name="USER_DEF_IND")
	private String userDefInd;

	public SaptrxEhExpev() {
	}

	public String getEhGuid() {
		return this.ehGuid;
	}

	public void setEhGuid(String ehGuid) {
		this.ehGuid = ehGuid;
	}

	public Timestamp getAoEvExpDate() {
		return this.aoEvExpDate;
	}

	public void setAoEvExpDate(Timestamp aoEvExpDate) {
		this.aoEvExpDate = aoEvExpDate;
	}

	public String getChkDataFunc() {
		return this.chkDataFunc;
	}

	public void setChkDataFunc(String chkDataFunc) {
		this.chkDataFunc = chkDataFunc;
	}

	public String getChkLocFunc() {
		return this.chkLocFunc;
	}

	public void setChkLocFunc(String chkLocFunc) {
		this.chkLocFunc = chkLocFunc;
	}

	public String getChkPartnerFunc() {
		return this.chkPartnerFunc;
	}

	public void setChkPartnerFunc(String chkPartnerFunc) {
		this.chkPartnerFunc = chkPartnerFunc;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDatacs() {
		return this.datacs;
	}

	public void setDatacs(String datacs) {
		this.datacs = datacs;
	}

	public String getDataid() {
		return this.dataid;
	}

	public void setDataid(String dataid) {
		this.dataid = dataid;
	}

	public Timestamp getDatetime1() {
		return this.datetime1;
	}

	public void setDatetime1(Timestamp datetime1) {
		this.datetime1 = datetime1;
	}

	public Timestamp getDatetime2() {
		return this.datetime2;
	}

	public void setDatetime2(Timestamp datetime2) {
		this.datetime2 = datetime2;
	}

	public Timestamp getDatetime3() {
		return this.datetime3;
	}

	public void setDatetime3(Timestamp datetime3) {
		this.datetime3 = datetime3;
	}

	public Timestamp getDatetime4() {
		return this.datetime4;
	}

	public void setDatetime4(Timestamp datetime4) {
		this.datetime4 = datetime4;
	}

	public Timestamp getDatetime5() {
		return this.datetime5;
	}

	public void setDatetime5(Timestamp datetime5) {
		this.datetime5 = datetime5;
	}

	public Timestamp getEarliestEvDate() {
		return this.earliestEvDate;
	}

	public void setEarliestEvDate(Timestamp earliestEvDate) {
		this.earliestEvDate = earliestEvDate;
	}

	public Timestamp getEarliestMsgDte() {
		return this.earliestMsgDte;
	}

	public void setEarliestMsgDte(Timestamp earliestMsgDte) {
		this.earliestMsgDte = earliestMsgDte;
	}

	public String getEvExpCalcRule() {
		return this.evExpCalcRule;
	}

	public void setEvExpCalcRule(String evExpCalcRule) {
		this.evExpCalcRule = evExpCalcRule;
	}

	public int getEvExpDateSeq() {
		return this.evExpDateSeq;
	}

	public void setEvExpDateSeq(int evExpDateSeq) {
		this.evExpDateSeq = evExpDateSeq;
	}

	public BigDecimal getEvExpDur() {
		return this.evExpDur;
	}

	public void setEvExpDur(BigDecimal evExpDur) {
		this.evExpDur = evExpDur;
	}

	public String getEvExpDurSign() {
		return this.evExpDurSign;
	}

	public void setEvExpDurSign(String evExpDurSign) {
		this.evExpDurSign = evExpDurSign;
	}

	public String getEvTolRule() {
		return this.evTolRule;
	}

	public void setEvTolRule(String evTolRule) {
		this.evTolRule = evTolRule;
	}

	public BigDecimal getEvTolerance() {
		return this.evTolerance;
	}

	public void setEvTolerance(BigDecimal evTolerance) {
		this.evTolerance = evTolerance;
	}

	public String getEventCode() {
		return this.eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public Timestamp getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(Timestamp eventDate) {
		this.eventDate = eventDate;
	}

	public Timestamp getEventDateUtc() {
		return this.eventDateUtc;
	}

	public void setEventDateUtc(Timestamp eventDateUtc) {
		this.eventDateUtc = eventDateUtc;
	}

	public Timestamp getEventExpDate() {
		return this.eventExpDate;
	}

	public void setEventExpDate(Timestamp eventExpDate) {
		this.eventExpDate = eventExpDate;
	}

	public String getEventExpIndex() {
		return this.eventExpIndex;
	}

	public void setEventExpIndex(String eventExpIndex) {
		this.eventExpIndex = eventExpIndex;
	}

	public String getEventExpTzone() {
		return this.eventExpTzone;
	}

	public void setEventExpTzone(String eventExpTzone) {
		this.eventExpTzone = eventExpTzone;
	}

	public String getEventGroup() {
		return this.eventGroup;
	}

	public void setEventGroup(String eventGroup) {
		this.eventGroup = eventGroup;
	}

	public String getEventStatus() {
		return this.eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getEventTzone() {
		return this.eventTzone;
	}

	public void setEventTzone(String eventTzone) {
		this.eventTzone = eventTzone;
	}

	public String getForecast() {
		return this.forecast;
	}

	public void setForecast(String forecast) {
		this.forecast = forecast;
	}

	public int getGroupNbr() {
		return this.groupNbr;
	}

	public void setGroupNbr(int groupNbr) {
		this.groupNbr = groupNbr;
	}

	public int getItemNbr() {
		return this.itemNbr;
	}

	public void setItemNbr(int itemNbr) {
		this.itemNbr = itemNbr;
	}

	public String getItemident() {
		return this.itemident;
	}

	public void setItemident(String itemident) {
		this.itemident = itemident;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Timestamp getLatestEvDate() {
		return this.latestEvDate;
	}

	public void setLatestEvDate(Timestamp latestEvDate) {
		this.latestEvDate = latestEvDate;
	}

	public Timestamp getLatestMsgDate() {
		return this.latestMsgDate;
	}

	public void setLatestMsgDate(Timestamp latestMsgDate) {
		this.latestMsgDate = latestMsgDate;
	}

	public String getLocId1() {
		return this.locId1;
	}

	public void setLocId1(String locId1) {
		this.locId1 = locId1;
	}

	public String getLocId2() {
		return this.locId2;
	}

	public void setLocId2(String locId2) {
		this.locId2 = locId2;
	}

	public String getLocIdType() {
		return this.locIdType;
	}

	public void setLocIdType(String locIdType) {
		this.locIdType = locIdType;
	}

	public String getLocatDesc() {
		return this.locatDesc;
	}

	public void setLocatDesc(String locatDesc) {
		this.locatDesc = locatDesc;
	}

	public Timestamp getMsgDateUtc() {
		return this.msgDateUtc;
	}

	public void setMsgDateUtc(Timestamp msgDateUtc) {
		this.msgDateUtc = msgDateUtc;
	}

	public String getMsgExpCalcRul() {
		return this.msgExpCalcRul;
	}

	public void setMsgExpCalcRul(String msgExpCalcRul) {
		this.msgExpCalcRul = msgExpCalcRul;
	}

	public Timestamp getMsgExpDate() {
		return this.msgExpDate;
	}

	public void setMsgExpDate(Timestamp msgExpDate) {
		this.msgExpDate = msgExpDate;
	}

	public int getMsgExpDateSeq() {
		return this.msgExpDateSeq;
	}

	public void setMsgExpDateSeq(int msgExpDateSeq) {
		this.msgExpDateSeq = msgExpDateSeq;
	}

	public BigDecimal getMsgExpDur() {
		return this.msgExpDur;
	}

	public void setMsgExpDur(BigDecimal msgExpDur) {
		this.msgExpDur = msgExpDur;
	}

	public String getMsgExpDurSign() {
		return this.msgExpDurSign;
	}

	public void setMsgExpDurSign(String msgExpDurSign) {
		this.msgExpDurSign = msgExpDurSign;
	}

	public String getMsgExpIndex() {
		return this.msgExpIndex;
	}

	public void setMsgExpIndex(String msgExpIndex) {
		this.msgExpIndex = msgExpIndex;
	}

	public String getMsgExpTzone() {
		return this.msgExpTzone;
	}

	public void setMsgExpTzone(String msgExpTzone) {
		this.msgExpTzone = msgExpTzone;
	}

	public String getMsgGuid() {
		return this.msgGuid;
	}

	public void setMsgGuid(String msgGuid) {
		this.msgGuid = msgGuid;
	}

	public Timestamp getMsgRcvdDate() {
		return this.msgRcvdDate;
	}

	public void setMsgRcvdDate(Timestamp msgRcvdDate) {
		this.msgRcvdDate = msgRcvdDate;
	}

	public String getMsgRcvdTzone() {
		return this.msgRcvdTzone;
	}

	public void setMsgRcvdTzone(String msgRcvdTzone) {
		this.msgRcvdTzone = msgRcvdTzone;
	}

	public String getMsgStatus() {
		return this.msgStatus;
	}

	public void setMsgStatus(String msgStatus) {
		this.msgStatus = msgStatus;
	}

	public String getMsgTolRule() {
		return this.msgTolRule;
	}

	public void setMsgTolRule(String msgTolRule) {
		this.msgTolRule = msgTolRule;
	}

	public BigDecimal getMsgTolerance() {
		return this.msgTolerance;
	}

	public void setMsgTolerance(BigDecimal msgTolerance) {
		this.msgTolerance = msgTolerance;
	}

	public String getNoDataVal() {
		return this.noDataVal;
	}

	public void setNoDataVal(String noDataVal) {
		this.noDataVal = noDataVal;
	}

	public String getNoLocVal() {
		return this.noLocVal;
	}

	public void setNoLocVal(String noLocVal) {
		this.noLocVal = noLocVal;
	}

	public String getNoPartnerVal() {
		return this.noPartnerVal;
	}

	public void setNoPartnerVal(String noPartnerVal) {
		this.noPartnerVal = noPartnerVal;
	}

	public Timestamp getOrigEvExpDate() {
		return this.origEvExpDate;
	}

	public void setOrigEvExpDate(Timestamp origEvExpDate) {
		this.origEvExpDate = origEvExpDate;
	}

	public Timestamp getOrigMsgExpDte() {
		return this.origMsgExpDte;
	}

	public void setOrigMsgExpDte(Timestamp origMsgExpDte) {
		this.origMsgExpDte = origMsgExpDte;
	}

	public String getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerIdType() {
		return this.partnerIdType;
	}

	public void setPartnerIdType(String partnerIdType) {
		this.partnerIdType = partnerIdType;
	}

	public String getPostalCd() {
		return this.postalCd;
	}

	public void setPostalCd(String postalCd) {
		this.postalCd = postalCd;
	}

	public String getPredFlag() {
		return this.predFlag;
	}

	public void setPredFlag(String predFlag) {
		this.predFlag = predFlag;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getRefdistance() {
		return this.refdistance;
	}

	public void setRefdistance(int refdistance) {
		this.refdistance = refdistance;
	}

	public String getRefdistunit() {
		return this.refdistunit;
	}

	public void setRefdistunit(String refdistunit) {
		this.refdistunit = refdistunit;
	}

	public BigDecimal getRefeffdurat() {
		return this.refeffdurat;
	}

	public void setRefeffdurat(BigDecimal refeffdurat) {
		this.refeffdurat = refeffdurat;
	}

	public int getRefmilestone() {
		return this.refmilestone;
	}

	public void setRefmilestone(int refmilestone) {
		this.refmilestone = refmilestone;
	}

	public BigDecimal getReftotdurat() {
		return this.reftotdurat;
	}

	public void setReftotdurat(BigDecimal reftotdurat) {
		this.reftotdurat = reftotdurat;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getReprocessFlag() {
		return this.reprocessFlag;
	}

	public void setReprocessFlag(String reprocessFlag) {
		this.reprocessFlag = reprocessFlag;
	}

	public int getReqSetNbr() {
		return this.reqSetNbr;
	}

	public void setReqSetNbr(int reqSetNbr) {
		this.reqSetNbr = reqSetNbr;
	}

	public String getReqType() {
		return this.reqType;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	public int getSeqNbr() {
		return this.seqNbr;
	}

	public void setSeqNbr(int seqNbr) {
		this.seqNbr = seqNbr;
	}

	public String getTzone1() {
		return this.tzone1;
	}

	public void setTzone1(String tzone1) {
		this.tzone1 = tzone1;
	}

	public String getTzone2() {
		return this.tzone2;
	}

	public void setTzone2(String tzone2) {
		this.tzone2 = tzone2;
	}

	public String getTzone3() {
		return this.tzone3;
	}

	public void setTzone3(String tzone3) {
		this.tzone3 = tzone3;
	}

	public String getTzone4() {
		return this.tzone4;
	}

	public void setTzone4(String tzone4) {
		this.tzone4 = tzone4;
	}

	public String getTzone5() {
		return this.tzone5;
	}

	public void setTzone5(String tzone5) {
		this.tzone5 = tzone5;
	}

	public String getUserDefInd() {
		return this.userDefInd;
	}

	public void setUserDefInd(String userDefInd) {
		this.userDefInd = userDefInd;
	}

	public String getAddUpdateFlag() {
		return addUpdateFlag;
	}

	public void setAddUpdateFlag(String addUpdateFlag) {
		this.addUpdateFlag = addUpdateFlag;
	}

}