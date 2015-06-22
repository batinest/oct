package com.nestle.hana.jpa.oct.dao;

import java.util.List;

import com.nestle.hana.jpa.oct.model.Container;

public interface IContainerDao {
	
	public Container add(Container contr);
	public Container update(Container contr);
	public Container remove(String oid);
	public Container get(String oid);
	public List <Container> retriveAll();
	public List <Container> getAllWithStatus(String status);

}
