package com.nestle.hana.jpa.oct.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.XmlAccessType; 
import javax.xml.bind.annotation.XmlAccessorType;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the SAPTRX_EVM_HDR database table.
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="nestle.dev.glb.sc.data.table::OCEANTRACKER.Saptrx_evm_hdr")
@NamedQuery(name="SaptrxEvmHdr.findAll", query="SELECT s FROM SaptrxEvmHdr s")
public class SaptrxEvmHdr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EH_GUID")
	private String ehGuid;

	@Column(name="BATCH_GUID")
	private String batchGuid;

	@Column(name="CITY1")
	private String city1;

	@Column(name="COUNTRY1")
	private String country1;

	@Column(name="DATACS")
	private String datacs;

	@Column(name="DATAID")
	private String dataid;

	@Column(name="DCNFTP")
	private String dcnftp;

	@Column(name="ELCCOD")
	private String elccod;

	@Column(name="ELCID1")
	private String elcid1;

	@Column(name="ELCID2")
	private String elcid2;

	@Column(name="ESTQUL")
	private String estqul;

	@Column(name="ETXTST")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp etxtst;

	@Column(name="EVLTST")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp evltst;

	@Column(name="EVTCOD")
	private String evtcod;

	@Column(name="EVTDAT")
	@Temporal(TemporalType.DATE)
	private Date evtdat;

	@Column(name="EVTID")
	private String evtid;

	@Column(name="EVTTIM")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp evttim;

	@Column(name="EVTTST")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp evttst;

	@Column(name="EVTZON")
	private String evtzon;

	@Column(name="EXT_LOCCOD")
	private String extLoccod;

	@Column(name="EXT_LOCID1")
	private String extLocid1;

	@Column(name="EXT_LOCID2")
	private String extLocid2;

	@Column(name="EXT_REPCOD")
	private String extRepcod;

	@Column(name="EXT_REPID")
	private String extRepid;

	@Column(name="EXT_TABLE_ID")
	private String extTableId;

	@Column(name="EXT_TABLE_NAME")
	private String extTableName;

	@Column(name="IDOCID")
	private String idocid;

	@Column(name="INT_EV_COD")
	private String intEvCod;

	@Column(name="INT_SR_CODE")
	private String intSrCode;

	@Column(name="INVALID_DATA")
	private String invalidData;

	@Column(name="LOCCOD")
	private String loccod;

	@Column(name="LOCID1")
	private String locid1;

	@Column(name="LOCID2")
	private String locid2;

	@Column(name="LOCNAM")
	private String locnam;

	@Column(name="LOCZON")
	private String loczon;

	@Column(name="LODSTS")
	private String lodsts;

	@Column(name="MSG_DELETED")
	private String msgDeleted;

	@Column(name="MSG_NOT_SENT")
	private String msgNotSent;

	@Column(name="MSGMOD")
	private String msgmod;

	@Column(name="MSGNUM")
	private String msgnum;

	@Column(name="MSGSRCTYP")
	private String msgsrctyp;

	@Column(name="MULTIPLE_TRK_IDS")
	private String multipleTrkIds;

	@Column(name="PHYSND")
	private String physnd;

	@Column(name="PHYSTP")
	private String phystp;

	@Column(name="POSTL_COD1")
	private String postlCod1;

	@Column(name="PRCTST")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp prctst;

	@Column(name="PROCESS_INACTIVE")
	private String processInactive;

	@Column(name="PRODDS")
	private String prodds;

	@Column(name="PRODDT")
	private String proddt;

	@Column(name="RCVCOD")
	private String rcvcod;

	@Column(name="RCVID")
	private String rcvid;

	@Column(name="RCVNAM")
	private String rcvnam;

	@Column(name="REGION")
	private String region;

	@Column(name="RELTST")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp reltst;

	@Column(name="REPCOD")
	private String repcod;

	@Temporal(TemporalType.DATE)
	private Date repdat;

	@Column(name="REPID")
	private String repid;

	@Column(name="REPM")
	private String repm;

	@Column(name="REPTIM")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp reptim;

	@Column(name="REPTST")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp reptst;

	@Column(name="REPZON")
	private String repzon;

	@Column(name="SAVE_MODE")
	private String saveMode;

	@Column(name="SNDCOD")
	private String sndcod;

	@Column(name="SNDID")
	private String sndid;

	@Column(name="SNDNAM")
	private String sndnam;

	@Column(name="SRCCOD")
	private String srccod;

	@Column(name="SRCID")
	private String srcid;

	@Column(name="SRCTX")
	private String srctx;

	@Column(name="TIPCOD")
	private String tipcod;

	@Column(name="TIPID")
	private String tipid;

	@Column(name="TIPNAM")
	private String tipnam;

	@Column(name="TRXCOD")
	private String trxcod;

	@Column(name="TRXID")
	private String trxid;

	@Column(name="USERNAME")
	private String username;

	@Column(name="VERSION")
	private int version;
	
	@Transient
	private String addUpdateFlag;
	
	public SaptrxEvmHdr() {
	}

	public String getEhGuid() {
		return this.ehGuid;
	}

	public void setEhGuid(String ehGuid) {
		this.ehGuid = ehGuid;
	}

	public String getBatchGuid() {
		return this.batchGuid;
	}

	public void setBatchGuid(String batchGuid) {
		this.batchGuid = batchGuid;
	}

	public String getCity1() {
		return this.city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getCountry1() {
		return this.country1;
	}

	public void setCountry1(String country1) {
		this.country1 = country1;
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

	public String getDcnftp() {
		return this.dcnftp;
	}

	public void setDcnftp(String dcnftp) {
		this.dcnftp = dcnftp;
	}

	public String getElccod() {
		return this.elccod;
	}

	public void setElccod(String elccod) {
		this.elccod = elccod;
	}

	public String getElcid1() {
		return this.elcid1;
	}

	public void setElcid1(String elcid1) {
		this.elcid1 = elcid1;
	}

	public String getElcid2() {
		return this.elcid2;
	}

	public void setElcid2(String elcid2) {
		this.elcid2 = elcid2;
	}

	public String getEstqul() {
		return this.estqul;
	}

	public void setEstqul(String estqul) {
		this.estqul = estqul;
	}

	public Timestamp getEtxtst() {
		return this.etxtst;
	}

	public void setEtxtst(Timestamp etxtst) {
		this.etxtst = etxtst;
	}

	public Timestamp getEvltst() {
		return this.evltst;
	}

	public void setEvltst(Timestamp evltst) {
		this.evltst = evltst;
	}

	public String getEvtcod() {
		return this.evtcod;
	}

	public void setEvtcod(String evtcod) {
		this.evtcod = evtcod;
	}

	public Date getEvtdat() {
		return this.evtdat;
	}

	public void setEvtdat(Date evtdat) {
		this.evtdat = evtdat;
	}

	public String getEvtid() {
		return this.evtid;
	}

	public void setEvtid(String evtid) {
		this.evtid = evtid;
	}

	public Timestamp getEvttim() {
		return this.evttim;
	}

	public void setEvttim(Timestamp evttim) {
		this.evttim = evttim;
	}

	public Timestamp getEvttst() {
		return this.evttst;
	}

	public void setEvttst(Timestamp evttst) {
		this.evttst = evttst;
	}

	public String getEvtzon() {
		return this.evtzon;
	}

	public void setEvtzon(String evtzon) {
		this.evtzon = evtzon;
	}

	public String getExtLoccod() {
		return this.extLoccod;
	}

	public void setExtLoccod(String extLoccod) {
		this.extLoccod = extLoccod;
	}

	public String getExtLocid1() {
		return this.extLocid1;
	}

	public void setExtLocid1(String extLocid1) {
		this.extLocid1 = extLocid1;
	}

	public String getExtLocid2() {
		return this.extLocid2;
	}

	public void setExtLocid2(String extLocid2) {
		this.extLocid2 = extLocid2;
	}

	public String getExtRepcod() {
		return this.extRepcod;
	}

	public void setExtRepcod(String extRepcod) {
		this.extRepcod = extRepcod;
	}

	public String getExtRepid() {
		return this.extRepid;
	}

	public void setExtRepid(String extRepid) {
		this.extRepid = extRepid;
	}

	public String getExtTableId() {
		return this.extTableId;
	}

	public void setExtTableId(String extTableId) {
		this.extTableId = extTableId;
	}

	public String getExtTableName() {
		return this.extTableName;
	}

	public void setExtTableName(String extTableName) {
		this.extTableName = extTableName;
	}

	public String getIdocid() {
		return this.idocid;
	}

	public void setIdocid(String idocid) {
		this.idocid = idocid;
	}

	public String getIntEvCod() {
		return this.intEvCod;
	}

	public void setIntEvCod(String intEvCod) {
		this.intEvCod = intEvCod;
	}

	public String getIntSrCode() {
		return this.intSrCode;
	}

	public void setIntSrCode(String intSrCode) {
		this.intSrCode = intSrCode;
	}

	public String getInvalidData() {
		return this.invalidData;
	}

	public void setInvalidData(String invalidData) {
		this.invalidData = invalidData;
	}

	public String getLoccod() {
		return this.loccod;
	}

	public void setLoccod(String loccod) {
		this.loccod = loccod;
	}

	public String getLocid1() {
		return this.locid1;
	}

	public void setLocid1(String locid1) {
		this.locid1 = locid1;
	}

	public String getLocid2() {
		return this.locid2;
	}

	public void setLocid2(String locid2) {
		this.locid2 = locid2;
	}

	public String getLocnam() {
		return this.locnam;
	}

	public void setLocnam(String locnam) {
		this.locnam = locnam;
	}

	public String getLoczon() {
		return this.loczon;
	}

	public void setLoczon(String loczon) {
		this.loczon = loczon;
	}

	public String getLodsts() {
		return this.lodsts;
	}

	public void setLodsts(String lodsts) {
		this.lodsts = lodsts;
	}

	public String getMsgDeleted() {
		return this.msgDeleted;
	}

	public void setMsgDeleted(String msgDeleted) {
		this.msgDeleted = msgDeleted;
	}

	public String getMsgNotSent() {
		return this.msgNotSent;
	}

	public void setMsgNotSent(String msgNotSent) {
		this.msgNotSent = msgNotSent;
	}

	public String getMsgmod() {
		return this.msgmod;
	}

	public void setMsgmod(String msgmod) {
		this.msgmod = msgmod;
	}

	public String getMsgnum() {
		return this.msgnum;
	}

	public void setMsgnum(String msgnum) {
		this.msgnum = msgnum;
	}

	public String getMsgsrctyp() {
		return this.msgsrctyp;
	}

	public void setMsgsrctyp(String msgsrctyp) {
		this.msgsrctyp = msgsrctyp;
	}

	public String getMultipleTrkIds() {
		return this.multipleTrkIds;
	}

	public void setMultipleTrkIds(String multipleTrkIds) {
		this.multipleTrkIds = multipleTrkIds;
	}

	public String getPhysnd() {
		return this.physnd;
	}

	public void setPhysnd(String physnd) {
		this.physnd = physnd;
	}

	public String getPhystp() {
		return this.phystp;
	}

	public void setPhystp(String phystp) {
		this.phystp = phystp;
	}

	public String getPostlCod1() {
		return this.postlCod1;
	}

	public void setPostlCod1(String postlCod1) {
		this.postlCod1 = postlCod1;
	}

	public Timestamp getPrctst() {
		return this.prctst;
	}

	public void setPrctst(Timestamp prctst) {
		this.prctst = prctst;
	}

	public String getProcessInactive() {
		return this.processInactive;
	}

	public void setProcessInactive(String processInactive) {
		this.processInactive = processInactive;
	}

	public String getProdds() {
		return this.prodds;
	}

	public void setProdds(String prodds) {
		this.prodds = prodds;
	}

	public String getProddt() {
		return this.proddt;
	}

	public void setProddt(String proddt) {
		this.proddt = proddt;
	}

	public String getRcvcod() {
		return this.rcvcod;
	}

	public void setRcvcod(String rcvcod) {
		this.rcvcod = rcvcod;
	}

	public String getRcvid() {
		return this.rcvid;
	}

	public void setRcvid(String rcvid) {
		this.rcvid = rcvid;
	}

	public String getRcvnam() {
		return this.rcvnam;
	}

	public void setRcvnam(String rcvnam) {
		this.rcvnam = rcvnam;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Timestamp getReltst() {
		return this.reltst;
	}

	public void setReltst(Timestamp reltst) {
		this.reltst = reltst;
	}

	public String getRepcod() {
		return this.repcod;
	}

	public void setRepcod(String repcod) {
		this.repcod = repcod;
	}

	public Date getRepdat() {
		return this.repdat;
	}

	public void setRepdat(Date repdat) {
		this.repdat = repdat;
	}

	public String getRepid() {
		return this.repid;
	}

	public void setRepid(String repid) {
		this.repid = repid;
	}

	public String getRepm() {
		return this.repm;
	}

	public void setRepm(String repm) {
		this.repm = repm;
	}

	public Timestamp getReptim() {
		return this.reptim;
	}

	public void setReptim(Timestamp reptim) {
		this.reptim = reptim;
	}

	public Timestamp getReptst() {
		return this.reptst;
	}

	public void setReptst(Timestamp reptst) {
		this.reptst = reptst;
	}

	public String getRepzon() {
		return this.repzon;
	}

	public void setRepzon(String repzon) {
		this.repzon = repzon;
	}

	public String getSaveMode() {
		return this.saveMode;
	}

	public void setSaveMode(String saveMode) {
		this.saveMode = saveMode;
	}

	public String getSndcod() {
		return this.sndcod;
	}

	public void setSndcod(String sndcod) {
		this.sndcod = sndcod;
	}

	public String getSndid() {
		return this.sndid;
	}

	public void setSndid(String sndid) {
		this.sndid = sndid;
	}

	public String getSndnam() {
		return this.sndnam;
	}

	public void setSndnam(String sndnam) {
		this.sndnam = sndnam;
	}

	public String getSrccod() {
		return this.srccod;
	}

	public void setSrccod(String srccod) {
		this.srccod = srccod;
	}

	public String getSrcid() {
		return this.srcid;
	}

	public void setSrcid(String srcid) {
		this.srcid = srcid;
	}

	public String getSrctx() {
		return this.srctx;
	}

	public void setSrctx(String srctx) {
		this.srctx = srctx;
	}

	public String getTipcod() {
		return this.tipcod;
	}

	public void setTipcod(String tipcod) {
		this.tipcod = tipcod;
	}

	public String getTipid() {
		return this.tipid;
	}

	public void setTipid(String tipid) {
		this.tipid = tipid;
	}

	public String getTipnam() {
		return this.tipnam;
	}

	public void setTipnam(String tipnam) {
		this.tipnam = tipnam;
	}

	public String getTrxcod() {
		return this.trxcod;
	}

	public void setTrxcod(String trxcod) {
		this.trxcod = trxcod;
	}

	public String getTrxid() {
		return this.trxid;
	}

	public void setTrxid(String trxid) {
		this.trxid = trxid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getAddUpdateFlag() {
		return addUpdateFlag;
	}

	public void setAddUpdateFlag(String addUpdateFlag) {
		this.addUpdateFlag = addUpdateFlag;
	}

}