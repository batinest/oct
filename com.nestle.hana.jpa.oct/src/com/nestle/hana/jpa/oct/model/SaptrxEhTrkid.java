package com.nestle.hana.jpa.oct.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * The persistent class for the SAPTRX_EH_TRKID database table.
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="Z_SAPTRX_EH_TRKID")
@NamedQuery(name="SaptrxEhTrkid.findAll", query="SELECT s FROM SaptrxEhTrkid s")
public class SaptrxEhTrkid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EH_GUID")
	private String ehGuid;

	@Column(name="END_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp endDate;

	@Column(name="PROVIDER_ID")
	private String providerId;

	@Column(name="PROVIDER_TYPE")
	private String providerType;

	@Column(name="SEQ_NBR")
	private int seqNbr;

	@Column(name="START_DATE")
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp startDate;
	
	@Column(name="TRACKINGID")
	private String trackingid;
	
	@Column(name="TRACKINGIDTYPE")
	private String trackingidtype;
	
	@Column(name="URL")
	private String url;
	
	private String addUpdateFlag;

	public SaptrxEhTrkid() {
	}

	public String getEhGuid() {
		return this.ehGuid;
	}

	public void setEhGuid(String ehGuid) {
		this.ehGuid = ehGuid;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public String getProviderId() {
		return this.providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getProviderType() {
		return this.providerType;
	}

	public void setProviderType(String providerType) {
		this.providerType = providerType;
	}

	public int getSeqNbr() {
		return this.seqNbr;
	}

	public void setSeqNbr(int seqNbr) {
		this.seqNbr = seqNbr;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAddUpdateFlag() {
		return addUpdateFlag;
	}

	public void setAddUpdateFlag(String addUpdateFlag) {
		this.addUpdateFlag = addUpdateFlag;
	}

}