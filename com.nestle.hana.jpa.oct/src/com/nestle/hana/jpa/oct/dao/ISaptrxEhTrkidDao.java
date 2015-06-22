package com.nestle.hana.jpa.oct.dao;

import java.util.List;

import com.nestle.hana.jpa.oct.model.SaptrxEhTrkid;

public interface ISaptrxEhTrkidDao {

	
	public SaptrxEhTrkid add(SaptrxEhTrkid ehTrkId);

	public SaptrxEhTrkid update(SaptrxEhTrkid ehTrkId);

	public SaptrxEhTrkid remove(String ehTrkId);

	public SaptrxEhTrkid get(String ehTrkId);

	public List<SaptrxEhTrkid> retriveAll();

	// public List<SaptrxEhInfo> getAllWithStatus(String status);

}
