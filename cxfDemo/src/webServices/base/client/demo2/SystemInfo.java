
package webServices.base.client.demo2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SystemInfo", targetNamespace = "http://service.base.webServices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SystemInfo {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "time", targetNamespace = "http://service.base.webServices/", className = "webServices.base.client.demo2.Time")
    @ResponseWrapper(localName = "timeResponse", targetNamespace = "http://service.base.webServices/", className = "webServices.base.client.demo2.TimeResponse")
    public String time(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mem", targetNamespace = "http://service.base.webServices/", className = "webServices.base.client.demo2.Mem")
    @ResponseWrapper(localName = "memResponse", targetNamespace = "http://service.base.webServices/", className = "webServices.base.client.demo2.MemResponse")
    public String mem();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "network", targetNamespace = "http://service.base.webServices/", className = "webServices.base.client.demo2.Network")
    @ResponseWrapper(localName = "networkResponse", targetNamespace = "http://service.base.webServices/", className = "webServices.base.client.demo2.NetworkResponse")
    public String network();

}
