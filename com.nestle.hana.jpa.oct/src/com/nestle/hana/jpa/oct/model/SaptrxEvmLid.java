package com.nestle.hana.jpa.oct.model;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;


/**
 * The persistent class for the SAPTRX_EVM_LID database table.
 * 
 */
@Entity
@Table(name="Z_SAPTRX_EVM_LID")
@NamedQuery(name="SaptrxEvmLid.findAll", query="SELECT s FROM SaptrxEvmLid s")
public class SaptrxEvmLid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EH_GUID")
	private String ehGuid;

	@Column(name="ADDRESS_T")
	private String addressT;

	@Column(name="BUILDING")
	private String building;

	@Column(name="CITY1")
	private String city1;

	@Column(name="CITY2")
	private String city2;

	@Column(name="COUNTRY1")
	private String country1;

	@Column(name="COUNTRY2")
	private String country2;

	@Column(name="COUNTY_COD")
	private String countyCod;

	@Column(name="COUNTY_TXT")
	private String countyTxt;

	@Column(name="E_MAIL")
	private String eMail;

	@Column(name="EXT_LOCCOD")
	private String extLoccod;

	@Column(name="EXT_LOCID1")
	private String extLocid1;

	@Column(name="EXT_LOCID2")
	private String extLocid2;

	@Column(name="FLOOR")
	private String floor;

	@Column(name="FORMOFADDR")
	private String formofaddr;

	@Column(name="HOUSE_RANG")
	private String houseRang;

	@Column(name="HOUSE_SUPL")
	private String houseSupl;

	@Column(name="JURISDIC")
	private String jurisdic;

	@Column(name="LANGUAGE")
	private String language;

	@Column(name="LCDDIR")
	private String lcddir;

	@Column(name="LCDDST")
	private BigDecimal lcddst;

	@Column(name="LCDESC")
	private String lcdesc;

	@Column(name="LCDRFP")
	private String lcdrfp;

	@Column(name="LCDRFT")
	private String lcdrft;

	@Column(name="LCDUNT")
	private String lcdunt;

	@Column(name="LEADID")
	private String leadid;

	@Column(name="LOCATION")
	private String location;

	@Column(name="LOCCAT")
	private String loccat;

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

	@Column(name="NAME_CO")
	private String nameCo;

	@Column(name="NAME_TEXT")
	private String nameText;

	@Column(name="NAME1")
	private String name1;

	@Column(name="NAME2")
	private String name2;

	@Column(name="NAME3")
	private String name3;

	@Column(name="NAME4")
	private String name4;

	@Column(name="POSTL_AREA")
	private String postlArea;

	@Column(name="POSTL_CITY")
	private String postlCity;

	@Column(name="POSTL_COD1")
	private String postlCod1;

	@Column(name="POSTL_COD2")
	private String postlCod2;

	@Column(name="POSTL_COD3")
	private String postlCod3;

	@Column(name="POSTL_PBOX")
	private String postlPbox;

	@Column(name="REGION")
	private String region;

	@Column(name="ROOM")
	private String room;

	@Column(name="ROUTID")
	private String routid;

	@Column(name="ROUTYP")
	private String routyp;

	@Column(name="SEQ_NUM")
	private int seqNum;

	@Column(name="STREET1")
	private String street1;

	@Column(name="STREET2")
	private String street2;

	@Column(name="STREET3")
	private String street3;

	@Column(name="TELEFAX")
	private String telefax;

	@Column(name="TELEPHONE1")
	private String telephone1;

	@Column(name="TELEPHONE2")
	private String telephone2;

	@Column(name="TELEX")
	private String telex;

	@Column(name="TZCODE")
	private String tzcode;

	@Column(name="TZDESC")
	private String tzdesc;
	
	private String addUpdateFlag;

	public SaptrxEvmLid() {
	}

	public String getEhGuid() {
		return this.ehGuid;
	}

	public void setEhGuid(String ehGuid) {
		this.ehGuid = ehGuid;
	}

	public String getAddressT() {
		return this.addressT;
	}

	public void setAddressT(String addressT) {
		this.addressT = addressT;
	}

	public String getBuilding() {
		return this.building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getCity1() {
		return this.city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getCity2() {
		return this.city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	public String getCountry1() {
		return this.country1;
	}

	public void setCountry1(String country1) {
		this.country1 = country1;
	}

	public String getCountry2() {
		return this.country2;
	}

	public void setCountry2(String country2) {
		this.country2 = country2;
	}

	public String getCountyCod() {
		return this.countyCod;
	}

	public void setCountyCod(String countyCod) {
		this.countyCod = countyCod;
	}

	public String getCountyTxt() {
		return this.countyTxt;
	}

	public void setCountyTxt(String countyTxt) {
		this.countyTxt = countyTxt;
	}

	public String getEMail() {
		return this.eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
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

	public String getFloor() {
		return this.floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getFormofaddr() {
		return this.formofaddr;
	}

	public void setFormofaddr(String formofaddr) {
		this.formofaddr = formofaddr;
	}

	public String getHouseRang() {
		return this.houseRang;
	}

	public void setHouseRang(String houseRang) {
		this.houseRang = houseRang;
	}

	public String getHouseSupl() {
		return this.houseSupl;
	}

	public void setHouseSupl(String houseSupl) {
		this.houseSupl = houseSupl;
	}

	public String getJurisdic() {
		return this.jurisdic;
	}

	public void setJurisdic(String jurisdic) {
		this.jurisdic = jurisdic;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLcddir() {
		return this.lcddir;
	}

	public void setLcddir(String lcddir) {
		this.lcddir = lcddir;
	}

	public BigDecimal getLcddst() {
		return this.lcddst;
	}

	public void setLcddst(BigDecimal lcddst) {
		this.lcddst = lcddst;
	}

	public String getLcdesc() {
		return this.lcdesc;
	}

	public void setLcdesc(String lcdesc) {
		this.lcdesc = lcdesc;
	}

	public String getLcdrfp() {
		return this.lcdrfp;
	}

	public void setLcdrfp(String lcdrfp) {
		this.lcdrfp = lcdrfp;
	}

	public String getLcdrft() {
		return this.lcdrft;
	}

	public void setLcdrft(String lcdrft) {
		this.lcdrft = lcdrft;
	}

	public String getLcdunt() {
		return this.lcdunt;
	}

	public void setLcdunt(String lcdunt) {
		this.lcdunt = lcdunt;
	}

	public String getLeadid() {
		return this.leadid;
	}

	public void setLeadid(String leadid) {
		this.leadid = leadid;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLoccat() {
		return this.loccat;
	}

	public void setLoccat(String loccat) {
		this.loccat = loccat;
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

	public String getNameCo() {
		return this.nameCo;
	}

	public void setNameCo(String nameCo) {
		this.nameCo = nameCo;
	}

	public String getNameText() {
		return this.nameText;
	}

	public void setNameText(String nameText) {
		this.nameText = nameText;
	}

	public String getName1() {
		return this.name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return this.name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getName3() {
		return this.name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public String getName4() {
		return this.name4;
	}

	public void setName4(String name4) {
		this.name4 = name4;
	}

	public String getPostlArea() {
		return this.postlArea;
	}

	public void setPostlArea(String postlArea) {
		this.postlArea = postlArea;
	}

	public String getPostlCity() {
		return this.postlCity;
	}

	public void setPostlCity(String postlCity) {
		this.postlCity = postlCity;
	}

	public String getPostlCod1() {
		return this.postlCod1;
	}

	public void setPostlCod1(String postlCod1) {
		this.postlCod1 = postlCod1;
	}

	public String getPostlCod2() {
		return this.postlCod2;
	}

	public void setPostlCod2(String postlCod2) {
		this.postlCod2 = postlCod2;
	}

	public String getPostlCod3() {
		return this.postlCod3;
	}

	public void setPostlCod3(String postlCod3) {
		this.postlCod3 = postlCod3;
	}

	public String getPostlPbox() {
		return this.postlPbox;
	}

	public void setPostlPbox(String postlPbox) {
		this.postlPbox = postlPbox;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRoom() {
		return this.room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getRoutid() {
		return this.routid;
	}

	public void setRoutid(String routid) {
		this.routid = routid;
	}

	public String getRoutyp() {
		return this.routyp;
	}

	public void setRoutyp(String routyp) {
		this.routyp = routyp;
	}

	public int getSeqNum() {
		return this.seqNum;
	}

	public void setSeqNum(int seqNum) {
		this.seqNum = seqNum;
	}

	public String getStreet1() {
		return this.street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return this.street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getStreet3() {
		return this.street3;
	}

	public void setStreet3(String street3) {
		this.street3 = street3;
	}

	public String getTelefax() {
		return this.telefax;
	}

	public void setTelefax(String telefax) {
		this.telefax = telefax;
	}

	public String getTelephone1() {
		return this.telephone1;
	}

	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}

	public String getTelephone2() {
		return this.telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	public String getTelex() {
		return this.telex;
	}

	public void setTelex(String telex) {
		this.telex = telex;
	}

	public String getTzcode() {
		return this.tzcode;
	}

	public void setTzcode(String tzcode) {
		this.tzcode = tzcode;
	}

	public String getTzdesc() {
		return this.tzdesc;
	}

	public void setTzdesc(String tzdesc) {
		this.tzdesc = tzdesc;
	}

	public String getAddUpdateFlag() {
		return addUpdateFlag;
	}

	public void setAddUpdateFlag(String addUpdateFlag) {
		this.addUpdateFlag = addUpdateFlag;
	}

}