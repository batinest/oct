package com.nestle.hana.jpa.oct.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SAPTRX_EH_INFO database table.
 * 
 */
@Entity
@Table(name="Z_SAPTRX_EH_INFO")
@NamedQuery(name="SaptrxEhInfo.findAll", query="SELECT s FROM SaptrxEhInfo s")
public class SaptrxEhInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EH_GUID")
	private String ehGuid;
	
	@Column(name="LANGUAGE")
	private String language;

	@Column(name="PARAM_INDEX")
	private int paramIndex;

	@Column(name="PARAM_LENGTH")
	private int paramLength;

	@Column(name="PARAM_NAME")
	private String paramName;

	@Column(name="PARAM_TYPE")
	private String paramType;

	@Column(name="PARAM_VALUE")
	private String paramValue;

	@Column(name="SEQ_NBR")
	private int seqNbr;
	
	private String addUpdateFlag;

	public SaptrxEhInfo() {
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

	public String getAddUpdateFlag() {
		return addUpdateFlag;
	}

	public void setAddUpdateFlag(String addUpdateFlag) {
		this.addUpdateFlag = addUpdateFlag;
	}

}