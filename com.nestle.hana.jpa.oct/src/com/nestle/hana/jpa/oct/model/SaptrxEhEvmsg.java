package com.nestle.hana.jpa.oct.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType; 
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.sql.Timestamp;

/**
 * The persistent class for the SAPTRX_EH_EVMSG database table.
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="nestle.dev.glb.sc.data.table::OCEANTRACKER.Saptrx_eh_evmsg")
@NamedQuery(name="SaptrxEhEvmsg.findAll", query="SELECT s FROM SaptrxEhEvmsg s")
public class SaptrxEhEvmsg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EH_GUID")
	private String ehGuid;

	@Column(name="ADD_DATA")
	private String addData;

	@Column(name="BUILT_EH_HIER")
	private String builtEhHier;

	@Column(name="EARLIEST_EV_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp earliestEvDate;

	@Column(name="EARLIEST_MSG_DTE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp earliestMsgDte;

	@Column(name="EVENT_CODE")
	private String eventCode;

	@Column(name="EVENT_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp eventDate;

	@Column(name="EVENT_DATE_UTC")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp eventDateUtc;

	@Column(name="EVENT_EXP_TZONE")
	private String eventExpTzone;

	@Column(name="EVENT_TZONE")
	private String eventTzone;

	@Column(name="LATEST_EV_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp latestEvDate;

	@Column(name="LATEST_MSG_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp latestMsgDate;

	@Column(name="MATCHED_EE")
	private String matchedEe;

	@Column(name="MSG_DATE_UTC")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp msgDateUtc;

	@Column(name="MSG_EXP_TZONE")
	private String msgExpTzone;

	@Column(name="MSG_GUID")
	private String msgGuid;

	@Column(name="MSG_RCVD_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp msgRcvdDate;

	@Column(name="MSG_RCVD_TZONE")
	private String msgRcvdTzone;

	@Column(name="NOT_RELEVANT")
	private String notRelevant;

	@Column(name="PROC_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp procDate;

	@Column(name="SEQ_NBR")
	private int seqNbr;

	@Transient
	private String addUpdateFlag;
	
	public SaptrxEhEvmsg() {
	}

	public String getEhGuid() {
		return this.ehGuid;
	}

	public void setEhGuid(String ehGuid) {
		this.ehGuid = ehGuid;
	}

	public String getAddData() {
		return this.addData;
	}

	public void setAddData(String addData) {
		this.addData = addData;
	}

	public String getBuiltEhHier() {
		return this.builtEhHier;
	}

	public void setBuiltEhHier(String builtEhHier) {
		this.builtEhHier = builtEhHier;
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

	public String getEventExpTzone() {
		return this.eventExpTzone;
	}

	public void setEventExpTzone(String eventExpTzone) {
		this.eventExpTzone = eventExpTzone;
	}

	public String getEventTzone() {
		return this.eventTzone;
	}

	public void setEventTzone(String eventTzone) {
		this.eventTzone = eventTzone;
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

	public String getMatchedEe() {
		return this.matchedEe;
	}

	public void setMatchedEe(String matchedEe) {
		this.matchedEe = matchedEe;
	}

	public Timestamp getMsgDateUtc() {
		return this.msgDateUtc;
	}

	public void setMsgDateUtc(Timestamp msgDateUtc) {
		this.msgDateUtc = msgDateUtc;
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

	public String getNotRelevant() {
		return this.notRelevant;
	}

	public void setNotRelevant(String notRelevant) {
		this.notRelevant = notRelevant;
	}

	public Timestamp getProcDate() {
		return this.procDate;
	}

	public void setProcDate(Timestamp procDate) {
		this.procDate = procDate;
	}

	public int getSeqNbr() {
		return this.seqNbr;
	}

	public void setSeqNbr(int seqNbr) {
		this.seqNbr = seqNbr;
	}

	public String getAddUpdateFlag() {
		return addUpdateFlag;
	}

	public void setAddUpdateFlag(String addUpdateFlag) {
		this.addUpdateFlag = addUpdateFlag;
	}

}