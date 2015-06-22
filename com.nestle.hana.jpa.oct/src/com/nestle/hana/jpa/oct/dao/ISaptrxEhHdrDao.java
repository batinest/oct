package com.nestle.hana.jpa.oct.dao;

import java.sql.Timestamp;
import java.util.List;

import com.nestle.hana.jpa.oct.model.SaptrxEhHdr;

public interface ISaptrxEhHdrDao {

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
			String updateProc2, String updatedBy, Timestamp updatedDate);

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
			String updateProc2, String updatedBy, Timestamp updatedDate);

	public SaptrxEhHdr add(SaptrxEhHdr ehHdr);

	public SaptrxEhHdr update(SaptrxEhHdr ehHdr);

	public SaptrxEhHdr remove(String ehGuid);

	public SaptrxEhHdr get(String ehGuid);

	public List<SaptrxEhHdr> retriveAll();

	// public List<SaptrxEhExpev> getAllWithStatus(String status);

}
