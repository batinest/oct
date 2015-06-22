package com.nestle.hana.jpa.oct.exception;

import javax.xml.ws.WebFault;

@WebFault(name="OctServiceFault",targetNamespace="http://ws.oct.hana.nestle.com/")
public class OctServiceException extends Exception {


	private static final long serialVersionUID = -6647544772732631047L;
	private OctServiceFault fault;
	
	public OctServiceException() {
		// TODO Auto-generated constructor stub
	}
	
	protected OctServiceException(OctServiceFault fault) {
        super(fault.getFaultString()); 
        this.fault = fault;
     }
	
	public OctServiceException(String message, OctServiceFault faultInfo){
		super(message);
        this.fault = faultInfo;
	}
	
	public OctServiceException(String message, OctServiceFault faultInfo, Throwable cause){
		super(message,cause);
        this.fault = faultInfo;
	}
	
	public OctServiceFault getFaultInfo(){
		return fault;
	}
	
	
	public OctServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public OctServiceException(String code, String message) {
		super(message);
		this.fault = new OctServiceFault();
	    this.fault.setFaultString(message);
	    this.fault.setFaultCode(code);
	}

	public OctServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public OctServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}