package com.nestle.hana.jpa.oct.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the SAPTRX_EH_CNTRL database table.
 * 
 */
@Entity
@Table(name="nestle.dev.glb.sc.data.table::OCEANTRACKER.Saptrx_eh_cntrl")
@NamedQuery(name="SaptrxEhCntrl.findAll", query="SELECT s FROM SaptrxEhCntrl s")
public class SaptrxEhCntrl implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="\"eh_guid\"")
	private String ehGuid;

	@Column(name="\"language")
	private String language;

	@Column(name="\"param_index\"")
	private int paramIndex;

	@Column(name="\"param_length\"")
	private int paramLength;

	@Column(name="\"param_name\"")
	private String paramName;

	@Column(name="\"param_type\"")
	private String paramType;

	@Column(name="\"param_value\"")
	private String paramValue;

	@Column(name="\"seq_nbr\"")
	private int seqNbr;
	
	@Transient
	private String addupdateFlag;

	public SaptrxEhCntrl() {
	}

	public String getEhGuid() {
		return this.ehGuid;
	}

	public void setEhGuid(String ehGuid) {
		this.ehGuid = ehGuid;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getParamIndex() {
		return this.paramIndex;
	}

	public void setParamIndex(int paramIndex) {
		this.paramIndex = paramIndex;
	}

	public int getParamLength() {
		return this.paramLength;
	}

	public void setParamLength(int paramLength) {
		this.paramLength = paramLength;
	}

	public String getParamName() {
		return this.paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamType() {
		return this.paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public String getParamValue() {
		return this.paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public int getSeqNbr() {
		return this.seqNbr;
	}

	public void setSeqNbr(int seqNbr) {
		this.seqNbr = seqNbr;
	}

	public String getAddupdateFlag() {
		return addupdateFlag;
	}

	public void setAddupdateFlag(String addupdateFlag) {
		this.addupdateFlag = addupdateFlag;
	}

}