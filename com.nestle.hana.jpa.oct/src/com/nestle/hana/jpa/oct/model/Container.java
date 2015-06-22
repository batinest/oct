package com.nestle.hana.jpa.oct.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the container database table.
 * 
 */
@Entity
@NamedQuery(name="Container.findAll", query="SELECT c FROM Container c")
@XmlRootElement

public class Container implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String oid;

	@Column(name="\"Destination\"")
	private String destination;

	@Column(name="\"Name\"")
	private String name;

	@Column(name="\"Source\"")
	private String source;

	@Column(name="\"Status\"")
	private String status;
	
	private String addUpdateFlag;

	public Container() {
	}

	public String getOid() {
		return this.oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAddUpdateFlag() {
		return addUpdateFlag;
	}

	public void setAddUpdateFlag(String addUpdateFlag) {
		this.addUpdateFlag = addUpdateFlag;
	}

}