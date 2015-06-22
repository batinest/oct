package com.nestle.hana.jpa.oct.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.nestle.hana.jpa.oct.dao.IContainerDao;
import com.nestle.hana.jpa.oct.dao.ISaptrxEhCntrlDao;
import com.nestle.hana.jpa.oct.dao.ISaptrxEhEvmsgDao;
import com.nestle.hana.jpa.oct.dao.ISaptrxEhExpevDao;
import com.nestle.hana.jpa.oct.dao.ISaptrxEhHdrDao;
import com.nestle.hana.jpa.oct.dao.ISaptrxEhInfoDao;
import com.nestle.hana.jpa.oct.dao.ISaptrxEhTrkidDao;
import com.nestle.hana.jpa.oct.dao.ISaptrxEvmHdrDao;
import com.nestle.hana.jpa.oct.dao.impl.ContainerJPADao;
import com.nestle.hana.jpa.oct.dao.impl.SaptrxEhCntrlJPADao;
import com.nestle.hana.jpa.oct.dao.impl.SaptrxEhEvmsgJPADao;
import com.nestle.hana.jpa.oct.dao.impl.SaptrxEhExpevJPADao;
import com.nestle.hana.jpa.oct.dao.impl.SaptrxEhHdrJPADao;
import com.nestle.hana.jpa.oct.dao.impl.SaptrxEhInfoJPADao;
import com.nestle.hana.jpa.oct.dao.impl.SaptrxEhTrkidJPADao;
import com.nestle.hana.jpa.oct.dao.impl.SaptrxEvmHdrJPADao;
import com.nestle.hana.jpa.oct.exception.OctServiceException;
import com.nestle.hana.jpa.oct.exception.OctServiceFault;
import com.nestle.hana.jpa.oct.model.Container;
import com.nestle.hana.jpa.oct.model.SaptrxEhCntrl;
import com.nestle.hana.jpa.oct.model.SaptrxEhEvmsg;
import com.nestle.hana.jpa.oct.model.SaptrxEhExpev;
import com.nestle.hana.jpa.oct.model.SaptrxEhHdr;
import com.nestle.hana.jpa.oct.model.SaptrxEhInfo;
import com.nestle.hana.jpa.oct.model.SaptrxEhTrkid;
import com.nestle.hana.jpa.oct.model.SaptrxEvmHdr;

@WebService(targetNamespace = "http://ws.oct.hana.nestle.com/", endpointInterface = "com.nestle.hana.jpa.oct.ws.AddUpdateTables", portName = "AddUpdateTablesPort", serviceName = "AddUpdateTablesService")
public class AddUpdateTables {

	@WebMethod
	public void addUpdateContainer(List<Container> contrList) {

		for (Container contr : contrList) {
			try {

				if ("ADD".equalsIgnoreCase(contr.getAddUpdateFlag())) {
					IContainerDao contrDao = new ContainerJPADao();
					contrDao.add(contr);
				} else {
					IContainerDao contrDao = new ContainerJPADao();
					contrDao.update(contr);
				}
			} catch (Exception e) {
				System.out.println("exception occured for record ID ::::: "
						+ contr.getOid());
				continue;
			}
		}

	}
	
	@WebMethod
	public String getContainers()
	{
		IContainerDao contrDao = new ContainerJPADao();
		List <com.nestle.hana.jpa.oct.model.Container> contrList = contrDao.retriveAll();
		StringBuffer contrListStr = new StringBuffer("");
		for (Container cntr : contrList) {
			contrListStr.append(cntr.getOid() +" - ");
		}
		return contrListStr.toString();
	}

	@WebMethod
	public String getSaptrxEhCntrl() {
		ISaptrxEhCntrlDao contrDao = new SaptrxEhCntrlJPADao();
		List<com.nestle.hana.jpa.oct.model.SaptrxEhCntrl> saptrxEhCntrlList = contrDao
				.retriveAll();
		StringBuffer contrListStr = new StringBuffer("");
		for (SaptrxEhCntrl cntr : saptrxEhCntrlList) {
			contrListStr.append(cntr.getEhGuid() + " - ");
		}
		return contrListStr.toString();
	}

	@WebMethod
	public void addUpdateSaptrxEhCntrl(List<SaptrxEhCntrl> contrList) {
		System.out.println("INside addUpdateSaptrxCntrl metod \n");
		for (SaptrxEhCntrl saptrxEhCntrl : contrList) {
			try {
				if ("ADD".equalsIgnoreCase(saptrxEhCntrl.getAddupdateFlag())) {
					System.out.println("Inside ADD condition \n");
					ISaptrxEhCntrlDao contrDao = new SaptrxEhCntrlJPADao();
					contrDao.add(saptrxEhCntrl);
				} else {
					ISaptrxEhCntrlDao contrDao = new SaptrxEhCntrlJPADao();
					contrDao.update(saptrxEhCntrl);
				}
			} catch (Exception e) {
				System.out.println("exception occured for record ID ::::: "
						+ saptrxEhCntrl.getEhGuid() + "\n");
				continue;
			}

		}
		
	}

	@WebMethod
	public String getSaptrxEhEvmsg() {
		ISaptrxEhEvmsgDao contrDao = new SaptrxEhEvmsgJPADao();
		List<com.nestle.hana.jpa.oct.model.SaptrxEhEvmsg> saptrxEhEvmsgList = contrDao
				.retriveAll();
		StringBuffer contrListStr = new StringBuffer("");
		for (SaptrxEhEvmsg cntr : saptrxEhEvmsgList) {
			contrListStr.append(cntr.getEhGuid() + " - ");
		}
		return contrListStr.toString();
	}

	@WebMethod
	public void addUpdateSaptrxEhEvmsg(List<SaptrxEhEvmsg> contrList) {
		System.out.println("INside addUpdateSaptrxEhEvmsg metod \n");
		for (SaptrxEhEvmsg saptrxEhEvmsg : contrList) {
			try {
				if ("ADD".equalsIgnoreCase(saptrxEhEvmsg.getAddUpdateFlag())) {
					System.out.println("Inside ADD condition \n");
					ISaptrxEhEvmsgDao contrDao = new SaptrxEhEvmsgJPADao();
					contrDao.add(saptrxEhEvmsg);
				} else {
					ISaptrxEhEvmsgDao contrDao = new SaptrxEhEvmsgJPADao();
					contrDao.update(saptrxEhEvmsg);
				}
			} catch (Exception e) {
				System.out.println("exception occured for record ID ::::: "
						+ saptrxEhEvmsg.getEhGuid() + "\n");
				e.printStackTrace();
				continue;
			}

		}

	}

	@WebMethod
	public String getSaptrxEhExpev() {
		ISaptrxEhExpevDao contrDao = new SaptrxEhExpevJPADao();
		List<com.nestle.hana.jpa.oct.model.SaptrxEhExpev> saptrxEhExpevList = contrDao
				.retriveAll();
		StringBuffer contrListStr = new StringBuffer("");
		for (SaptrxEhExpev cntr : saptrxEhExpevList) {
			contrListStr.append(cntr.getEhGuid() + " - ");
		}
		return contrListStr.toString();
	}

	@WebMethod
	public void addUpdateSaptrxEhExpev(List<SaptrxEhExpev> contrList) {
		System.out.println("INside addUpdateSaptrxEhExpev metod \n");
		for (SaptrxEhExpev saptrxEhExpev : contrList) {
			try {
				if ("ADD".equalsIgnoreCase(saptrxEhExpev.getAddUpdateFlag())) {
					System.out.println("Inside ADD condition \n");
					ISaptrxEhExpevDao contrDao = new SaptrxEhExpevJPADao();
					contrDao.add(saptrxEhExpev);
				} else {
					ISaptrxEhExpevDao contrDao = new SaptrxEhExpevJPADao();
					contrDao.update(saptrxEhExpev);
				}
			} catch (Exception e) {
				System.out.println("exception occured for record ID ::::: "
						+ saptrxEhExpev.getEhGuid() + "\n");
				e.printStackTrace();
				continue;
			}

		}

	}

	@WebMethod
	public String getSaptrxEhHdr() {
		ISaptrxEhHdrDao contrDao = new SaptrxEhHdrJPADao();
		List<com.nestle.hana.jpa.oct.model.SaptrxEhHdr> saptrxEhHdrList = contrDao
				.retriveAll();
		StringBuffer contrListStr = new StringBuffer("");
		for (SaptrxEhHdr cntr : saptrxEhHdrList) {
			contrListStr.append(cntr.getEhGuid() + " - ");
		}
		return contrListStr.toString();
	}

	@WebMethod
	public void addUpdateSaptrxEhHdr(List<SaptrxEhHdr> contrList) {
		System.out.println("INside addUpdateSaptrxEhHdr metod \n");
		for (SaptrxEhHdr saptrxEhHdr : contrList) {
			try {
				if ("ADD".equalsIgnoreCase(saptrxEhHdr.getAddUpdateFlag())) {
					System.out.println("Inside ADD condition \n");
					ISaptrxEhHdrDao contrDao = new SaptrxEhHdrJPADao();
					contrDao.add(saptrxEhHdr);
				} else {
					ISaptrxEhHdrDao contrDao = new SaptrxEhHdrJPADao();
					contrDao.update(saptrxEhHdr);
				}
			} catch (Exception e) {
				System.out.println("exception occured for record ID ::::: "
						+ saptrxEhHdr.getEhGuid() + "\n");
				e.printStackTrace();
				continue;
			}

		}
	}

	@WebMethod
	public String getSaptrxEhInfo() {
		ISaptrxEhInfoDao contrDao = new SaptrxEhInfoJPADao();
		List<com.nestle.hana.jpa.oct.model.SaptrxEhInfo> saptrxEhInfoList = contrDao
				.retriveAll();
		StringBuffer contrListStr = new StringBuffer("");
		for (SaptrxEhInfo cntr : saptrxEhInfoList) {
			contrListStr.append(cntr.getEhGuid() + " - ");
		}
		return contrListStr.toString();
	}

	@WebMethod
	public void addUpdateSaptrxEhInfo(List<SaptrxEhInfo> contrList) {
		System.out.println("INside addUpdateSaptrxEhInfo metod \n");
		for (SaptrxEhInfo saptrxEhInfo : contrList) {
			try {
				if ("ADD".equalsIgnoreCase(saptrxEhInfo.getAddUpdateFlag())) {
					System.out.println("Inside ADD condition \n");
					ISaptrxEhInfoDao contrDao = new SaptrxEhInfoJPADao();
					contrDao.add(saptrxEhInfo);
				} else {
					ISaptrxEhInfoDao contrDao = new SaptrxEhInfoJPADao();
					contrDao.update(saptrxEhInfo);
				}
			} catch (Exception e) {
				System.out.println("exception occured for record ID ::::: "
						+ saptrxEhInfo.getEhGuid() + "\n");
				e.printStackTrace();
				continue;
			}

		}

	}

	@WebMethod
	public String getSaptrxEhTrkid() {
		ISaptrxEhTrkidDao contrDao = new SaptrxEhTrkidJPADao();
		List<com.nestle.hana.jpa.oct.model.SaptrxEhTrkid> saptrxEhTrkidList = contrDao
				.retriveAll();
		StringBuffer contrListStr = new StringBuffer("");
		for (SaptrxEhTrkid cntr : saptrxEhTrkidList) {
			contrListStr.append(cntr.getEhGuid() + " - ");
		}
		return contrListStr.toString();
	}

	@WebMethod
	public void addUpdateSaptrxEhTrkid(List<SaptrxEhTrkid> contrList) {
		System.out.println("INside addUpdateSaptrxEhTrkid metod \n");
		for (SaptrxEhTrkid saptrxEhTrkid : contrList) {
			try {
				if ("ADD".equalsIgnoreCase(saptrxEhTrkid.getAddUpdateFlag())) {
					System.out.println("Inside ADD condition \n");
					ISaptrxEhTrkidDao contrDao = new SaptrxEhTrkidJPADao();
					contrDao.add(saptrxEhTrkid);
				} else {
					ISaptrxEhTrkidDao contrDao = new SaptrxEhTrkidJPADao();
					contrDao.update(saptrxEhTrkid);
				}
			} catch (Exception e) {
				System.out.println("exception occured for record ID ::::: "
						+ saptrxEhTrkid.getEhGuid() + "\n");
				e.printStackTrace();
				continue;
			}

		}
	}

	@WebMethod
	public String getSaptrxEvmHdr() {
		ISaptrxEvmHdrDao contrDao = new SaptrxEvmHdrJPADao();
		List<com.nestle.hana.jpa.oct.model.SaptrxEvmHdr> saptrxEvmHdrList = contrDao
				.retriveAll();
		StringBuffer contrListStr = new StringBuffer("");
		for (SaptrxEvmHdr cntr : saptrxEvmHdrList) {
			contrListStr.append(cntr.getEhGuid() + " - ");
		}
		return contrListStr.toString();
	}

	@WebMethod
	public void addUpdateSaptrxEvmHdr(List<SaptrxEvmHdr> contrList) {
		System.out.println("INside addUpdateSaptrxEvmHdr metod \n");
		for (SaptrxEvmHdr saptrxEvmHdr : contrList) {
			try {
				if ("ADD".equalsIgnoreCase(saptrxEvmHdr.getAddUpdateFlag())) {
					System.out.println("Inside ADD condition \n");
					ISaptrxEvmHdrDao contrDao = new SaptrxEvmHdrJPADao();
					contrDao.add(saptrxEvmHdr);
				} else {
					ISaptrxEvmHdrDao contrDao = new SaptrxEvmHdrJPADao();
					contrDao.update(saptrxEvmHdr);
				}
			} catch (Exception e) {
				System.out.println("exception occured for record ID ::::: "
						+ saptrxEvmHdr.getEhGuid() + "\n");
				e.printStackTrace();
				continue;
			}

		}

	}

	@WebMethod
	public void addUpdateAllTables(List<SaptrxEhCntrl> saptrxEhCntrlList,
			List<SaptrxEhEvmsg> saptrxEhEvmsgList,
			List<SaptrxEhExpev> saptrxEhExpevList,
			List<SaptrxEhHdr> saptrxEhHdrList,
			List<SaptrxEhInfo> saptrxEhInfoList,
			List<SaptrxEhTrkid> saptrxEhTrkidList,
			List<SaptrxEvmHdr> saptrxEvmHdrList) {
		
		addUpdateSaptrxEhEvmsg(saptrxEhEvmsgList);
		addUpdateSaptrxEhCntrl(saptrxEhCntrlList);
		addUpdateSaptrxEhExpev(saptrxEhExpevList);
		addUpdateSaptrxEhHdr(saptrxEhHdrList);
		addUpdateSaptrxEhInfo(saptrxEhInfoList);
		addUpdateSaptrxEhTrkid(saptrxEhTrkidList);
		addUpdateSaptrxEvmHdr(saptrxEvmHdrList);		
	}
	
	@WebMethod
	public void getAllTablesData(){
		System.out.println("IDs inserted in table SaptrxEhCntrl ::::");
		getSaptrxEhCntrl();
		System.out.println("\n IDs inserted in table SaptrxEhEvmsg ::::");
		getSaptrxEhEvmsg();
		System.out.println("\n IDs inserted in table SaptrxEhExpev ::::");
		getSaptrxEhExpev();
		System.out.println("\n IDs inserted in table SaptrxEhHdr ::::");
		getSaptrxEhHdr();
		System.out.println("\n IDs inserted in table SaptrxEhInfo ::::");
		getSaptrxEhInfo();
		System.out.println("\n IDs inserted in table SaptrxEhTrkid ::::");
		getSaptrxEhTrkid();
		System.out.println("\n IDs inserted in table SaptrxEvmHdr ::::");
		getSaptrxEvmHdr();
	}
}
