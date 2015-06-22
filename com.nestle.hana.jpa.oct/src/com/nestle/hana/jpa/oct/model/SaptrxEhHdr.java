package com.nestle.hana.jpa.oct.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlAccessType; 
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The persistent class for the SAPTRX_EH_HDR database table.
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="Z_SAPTRX_EH_HDR")
@NamedQuery(name="SaptrxEhHdr.findAll", query="SELECT s FROM SaptrxEhHdr s")
public class SaptrxEhHdr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EH_GUID")
	private String ehGuid;

	@Column(name="ACTIVE_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp activeDate;

	@Column(name="AO_CLIENT")
	private String aoClient;

	@Column(name="AO_ID")
	private String aoId;

	@Column(name="AO_SYSTEM")
	private String aoSystem;

	@Column(name="AO_TYPE")
	private String aoType;

	@Column(name="APP_LOG_FLAG")
	private String appLogFlag;

	@Column(name="BUS_PROC_TYPE")
	private String busProcType;

	@Column(name="BW_POSTED")
	private String bwPosted;

	@Column(name="CHK_UNEXPECTED")
	private String chkUnexpected;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp createdDate;

	@Column(name="DF_EXIST")
	private String dfExist;

	@Column(name="EE_EVAL_PROC")
	private String eeEvalProc;

	@Column(name="EE_MONITOR_PROC")
	private String eeMonitorProc;

	@Column(name="EE_PROFILE")
	private String eeProfile;

	@Column(name="EH_ACTIVE")
	private String ehActive;

	@Column(name="EH_ARCHIVED")
	private String ehArchived;

	@Column(name="EH_CHANGEABLE")
	private String ehChangeable;

	@Column(name="EH_DELETED")
	private String ehDeleted;

	@Column(name="EH_TYPE")
	private String ehType;

	@Column(name="EM_VERSION")
	private String emVersion;

	@Column(name="END_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp endDate;

	@Column(name="INACTIVE_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp inactiveDate;

	@Column(name="LAST_CNTRL_NBR")
	private int lastCntrlNbr;

	@Column(name="LAST_EEHST_NBR")
	private int lastEehstNbr;

	@Column(name="LAST_ERMSG_NBR")
	private int lastErmsgNbr;

	@Column(name="LAST_EV_MSG")
	private String lastEvMsg;

	@Column(name="LAST_EVMSG_NBR")
	private int lastEvmsgNbr;

	@Column(name="LAST_EXPEV_NBR")
	private int lastExpevNbr;

	@Column(name="LAST_HIER_NBR")
	private int lastHierNbr;

	@Column(name="LAST_INFO_NBR")
	private int lastInfoNbr;

	@Column(name="LAST_MEASR_NBR")
	private int lastMeasrNbr;

	@Column(name="LAST_MEHST_NBR")
	private int lastMehstNbr;

	@Column(name="LAST_QRYID_NBR")
	private int lastQryidNbr;

	@Column(name="LAST_STHST_NBR")
	private int lastSthstNbr;

	@Column(name="LAST_TASK_NBR")
	private int lastTaskNbr;

	@Column(name="LAST_TRKID_NBR")
	private int lastTrkidNbr;

	@Column(name="LOGLVL_EHPOST")
	private String loglvlEhpost;

	@Column(name="LOGLVL_EXTUPD")
	private String loglvlExtupd;

	@Column(name="LOGLVL_MSGPRC")
	private String loglvlMsgprc;

	@Column(name="MATCH_EE_STORED")
	private String matchEeStored;

	@Column(name="RULESET_ID")
	private String rulesetId;

	@Column(name="START_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp startDate;

	@Column(name="STATUS_PROF")
	private String statusProf;
	
	@Column(name="TRACKINGID")
	private String trackingid;

	@Column(name="TRACKINGIDTYPE")
	private String trackingidtype;

	@Column(name="UPDATE_PROC_1")
	private String updateProc1;

	@Column(name="UPDATE_PROC_2")
	private String updateProc2;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp updatedDate;
	
	private String addUpdateFlag;

	public SaptrxEhHdr() {
	}

	public String getEhGuid() {
		return this.ehGuid;
	}

	public void setEhGuid(String ehGuid) {
		this.ehGuid = ehGuid;
	}

	public Timestamp getActiveDate() {
		return this.activeDate;
	}

	public void setActiveDate(Timestamp activeDate) {
		this.activeDate = activeDate;
	}

	public String getAoClient() {
		return this.aoClient;
	}

	public void setAoClient(String aoClient) {
		this.aoClient = aoClient;
	}

	public String getAoId() {
		return this.aoId;
	}

	public void setAoId(String aoId) {
		this.aoId = aoId;
	}

	public String getAoSystem() {
		return this.aoSystem;
	}

	public void setAoSystem(String aoSystem) {
		this.aoSystem = aoSystem;
	}

	public String getAoType() {
		return this.aoType;
	}

	public void setAoType(String aoType) {
		this.aoType = aoType;
	}

	public String getAppLogFlag() {
		return this.appLogFlag;
	}

	public void setAppLogFlag(String appLogFlag) {
		this.appLogFlag = appLogFlag;
	}

	public String getBusProcType() {
		return this.busProcType;
	}

	public void setBusProcType(String busProcType) {
		this.busProcType = busProcType;
	}

	public String getBwPosted() {
		return this.bwPosted;
	}

	public void setBwPosted(String bwPosted) {
		this.bwPosted = bwPosted;
	}

	public String getChkUnexpected() {
		return this.chkUnexpected;
	}

	public void setChkUnexpected(String chkUnexpected) {
		this.chkUnexpected = chkUnexpected;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDfExist() {
		return this.dfExist;
	}

	public void setDfExist(String dfExist) {
		this.dfExist = dfExist;
	}

	public String getEeEvalProc() {
		return this.eeEvalProc;
	}

	public void setEeEvalProc(String eeEvalProc) {
		this.eeEvalProc = eeEvalProc;
	}

	public String getEeMonitorProc() {
		return this.eeMonitorProc;
	}

	public void setEeMonitorProc(String eeMonitorProc) {
		this.eeMonitorProc = eeMonitorProc;
	}

	public String getEeProfile() {
		return this.eeProfile;
	}

	public void setEeProfile(String eeProfile) {
		this.eeProfile = eeProfile;
	}

	public String getEhActive() {
		return this.ehActive;
	}

	public void setEhActive(String ehActive) {
		this.ehActive = ehActive;
	}

	public String getEhArchived() {
		return this.ehArchived;
	}

	public void setEhArchived(String ehArchived) {
		this.ehArchived = ehArchived;
	}

	public String getEhChangeable() {
		return this.ehChangeable;
	}

	public void setEhChangeable(String ehChangeable) {
		this.ehChangeable = ehChangeable;
	}

	public String getEhDeleted() {
		return this.ehDeleted;
	}

	public void setEhDeleted(String ehDeleted) {
		this.ehDeleted = ehDeleted;
	}

	public String getEhType() {
		return this.ehType;
	}

	public void setEhType(String ehType) {
		this.ehType = ehType;
	}

	public String getEmVersion() {
		return this.emVersion;
	}

	public void setEmVersion(String emVersion) {
		this.emVersion = emVersion;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Timestamp getInactiveDate() {
		return this.inactiveDate;
	}

	public void setInactiveDate(Timestamp inactiveDate) {
		this.inactiveDate = inactiveDate;
	}

	public int getLastCntrlNbr() {
		return this.lastCntrlNbr;
	}

	public void setLastCntrlNbr(int lastCntrlNbr) {
		this.lastCntrlNbr = lastCntrlNbr;
	}

	public int getLastEehstNbr() {
		return this.lastEehstNbr;
	}

	public void setLastEehstNbr(int lastEehstNbr) {
		this.lastEehstNbr = lastEehstNbr;
	}

	public int getLastErmsgNbr() {
		return this.lastErmsgNbr;
	}

	public void setLastErmsgNbr(int lastErmsgNbr) {
		this.lastErmsgNbr = lastErmsgNbr;
	}

	public String getLastEvMsg() {
		return this.lastEvMsg;
	}

	public void setLastEvMsg(String lastEvMsg) {
		this.lastEvMsg = lastEvMsg;
	}

	public int getLastEvmsgNbr() {
		return this.lastEvmsgNbr;
	}

	public void setLastEvmsgNbr(int lastEvmsgNbr) {
		this.lastEvmsgNbr = lastEvmsgNbr;
	}

	public int getLastExpevNbr() {
		return this.lastExpevNbr;
	}

	public void setLastExpevNbr(int lastExpevNbr) {
		this.lastExpevNbr = lastExpevNbr;
	}

	public int getLastHierNbr() {
		return this.lastHierNbr;
	}

	public void setLastHierNbr(int lastHierNbr) {
		this.lastHierNbr = lastHierNbr;
	}

	public int getLastInfoNbr() {
		return this.lastInfoNbr;
	}

	public void setLastInfoNbr(int lastInfoNbr) {
		this.lastInfoNbr = lastInfoNbr;
	}

	public int getLastMeasrNbr() {
		return this.lastMeasrNbr;
	}

	public void setLastMeasrNbr(int lastMeasrNbr) {
		this.lastMeasrNbr = lastMeasrNbr;
	}

	public int getLastMehstNbr() {
		return this.lastMehstNbr;
	}

	public void setLastMehstNbr(int lastMehstNbr) {
		this.lastMehstNbr = lastMehstNbr;
	}

	public int getLastQryidNbr() {
		return this.lastQryidNbr;
	}

	public void setLastQryidNbr(int lastQryidNbr) {
		this.lastQryidNbr = lastQryidNbr;
	}

	public int getLastSthstNbr() {
		return this.lastSthstNbr;
	}

	public void setLastSthstNbr(int lastSthstNbr) {
		this.lastSthstNbr = lastSthstNbr;
	}

	public int getLastTaskNbr() {
		return this.lastTaskNbr;
	}

	public void setLastTaskNbr(int lastTaskNbr) {
		this.lastTaskNbr = lastTaskNbr;
	}

	public int getLastTrkidNbr() {
		return this.lastTrkidNbr;
	}

	public void setLastTrkidNbr(int lastTrkidNbr) {
		this.lastTrkidNbr = lastTrkidNbr;
	}

	public String getLoglvlEhpost() {
		return this.loglvlEhpost;
	}

	public void setLoglvlEhpost(String loglvlEhpost) {
		this.loglvlEhpost = loglvlEhpost;
	}

	public String getLoglvlExtupd() {
		return this.loglvlExtupd;
	}

	public void setLoglvlExtupd(String loglvlExtupd) {
		this.loglvlExtupd = loglvlExtupd;
	}

	public String getLoglvlMsgprc() {
		return this.loglvlMsgprc;
	}

	public void setLoglvlMsgprc(String loglvlMsgprc) {
		this.loglvlMsgprc = loglvlMsgprc;
	}

	public String getMatchEeStored() {
		return this.matchEeStored;
	}

	public void setMatchEeStored(String matchEeStored) {
		this.matchEeStored = matchEeStored;
	}

	public String getRulesetId() {
		return this.rulesetId;
	}

	public void setRulesetId(String rulesetId) {
		this.rulesetId = rulesetId;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public String getStatusProf() {
		return this.statusProf;
	}

	public void setStatusProf(String statusProf) {
		this.statusProf = statusProf;
	}

	public String getTrackingid() {
		return this.trackingid;
	}

	public void setTrackingid(String trackingid) {
		this.trackingid = trackingid;
	}

	public String getTrackingidtype() {
		return this.trackingidtype;
	}

	public void setTrackingidtype(String trackingidtype) {
		this.trackingidtype = trackingidtype;
	}

	public String getUpdateProc1() {
		return this.updateProc1;
	}

	public void setUpdateProc1(String updateProc1) {
		this.updateProc1 = updateProc1;
	}

	public String getUpdateProc2() {
		return this.updateProc2;
	}

	public void setUpdateProc2(String updateProc2) {
		this.updateProc2 = updateProc2;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getAddUpdateFlag() {
		return addUpdateFlag;
	}

	public void setAddUpdateFlag(String addUpdateFlag) {
		this.addUpdateFlag = addUpdateFlag;
	}

}