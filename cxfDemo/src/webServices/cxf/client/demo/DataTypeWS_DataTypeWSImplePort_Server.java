
package webServices.cxf.client.demo;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2014-07-05T13:56:00.562+08:00
 * Generated source version: 2.5.9
 * 
 */
 
public class DataTypeWS_DataTypeWSImplePort_Server{

    protected DataTypeWS_DataTypeWSImplePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new DataTypeWSImpl();
        String address = "http://localhost:8080/J2EE/services/datatype";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new DataTypeWS_DataTypeWSImplePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
