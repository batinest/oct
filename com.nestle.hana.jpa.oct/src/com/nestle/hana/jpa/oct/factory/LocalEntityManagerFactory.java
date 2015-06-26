package com.nestle.hana.jpa.oct.factory;

import java.util.HashMap;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;

import org.eclipse.persistence.config.PersistenceUnitProperties;

import com.nestle.hana.jpa.oct.exception.OctServiceException;
import com.nestle.hana.jpa.oct.exception.OctServiceFault;

/**
 * Application Lifecycle Listener implementation class LocalEntityManagerFactory
 *
 */

@WebListener 
public class LocalEntityManagerFactory implements ServletContextListener {

	private static String PERSISTSTENCE_UNIT_NAME = "com.nestle.hana.jpa.oct";
	private static EntityManagerFactory emf;
	private static EntityManager em;
    private DataSource ds;
    
	public static EntityManagerFactory getEntityManagerFactory() {  
	        if (emf == null) {  
	        	OctServiceFault fault = new OctServiceFault();
	    		fault.setFaultCode("505");
	    		fault.setFaultString("OCT upload data Service Error");
	    		try {
					throw new OctServiceException("505","Context is not initialized yet.");
				} catch (OctServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	//throw new IllegalStateException("Context is not initialized yet.");  
	        } 
	        return emf;
	    }  

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0){
    	
    	// For local
//    	 	emf = Persistence.createEntityManagerFactory(PERSISTSTENCE_UNIT_NAME);  
    	 
    	 // For Cloud 
         try {
             InitialContext ctx = new InitialContext();
          
             // TODO put it in constant file
             ds = (DataSource) ctx.lookup("java:comp/env/S0014062182");

             Map properties = new HashMap();
             properties.put(PersistenceUnitProperties.NON_JTA_DATASOURCE, ds);
             emf = Persistence.createEntityManagerFactory(PERSISTSTENCE_UNIT_NAME, properties);
         } catch (NamingException e) {
             e.printStackTrace();
         }

    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  {
        emf.close();  
        System.out.println("Context destroyed");
        
    }

    
	
}
