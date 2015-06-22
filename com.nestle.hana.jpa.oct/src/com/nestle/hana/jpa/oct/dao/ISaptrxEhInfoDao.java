package com.nestle.hana.jpa.oct.dao;

import java.util.List;

import com.nestle.hana.jpa.oct.model.SaptrxEhInfo;

public interface ISaptrxEhInfoDao {

	public SaptrxEhInfo add(SaptrxEhInfo ehInfo);

	public SaptrxEhInfo update(SaptrxEhInfo ehInfo);

	public SaptrxEhInfo remove(String ehGuid);

	public SaptrxEhInfo get(String ehGuid);

	public List<SaptrxEhInfo> retriveAll();

	// public List<SaptrxEhInfo> getAllWithStatus(String status);

}
