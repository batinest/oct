package com.nestle.hana.jpa.oct.dao;

import java.util.List;

import com.nestle.hana.jpa.oct.model.SaptrxEhCntrl;

public interface ISaptrxEhCntrlDao {

	public SaptrxEhCntrl remove(String ehGuid);

	public SaptrxEhCntrl get(String ehGuid);

	public List<SaptrxEhCntrl> retriveAll();

	public SaptrxEhCntrl update(SaptrxEhCntrl contr);

	public SaptrxEhCntrl add(SaptrxEhCntrl saptrxEhCntrl);

	//public List<SaptrxEhCntrl> getAllWithStatus(String status);

}
