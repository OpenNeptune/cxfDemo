
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package webServices.cxf.client.demo;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2014-07-05T13:56:00.546+08:00
 * Generated source version: 2.5.9
 * 
 */

@javax.jws.WebService(
                      serviceName = "DataTypeWSImpleService",
                      portName = "DataTypeWSImplePort",
                      targetNamespace = "http://impl.serv.cxf.webServices/",
                      wsdlLocation = "http://localhost:8080/J2EE/services/datatype?wsdl",
                      endpointInterface = "webServices.cxf.client.demo.DataTypeWS")
                      
public class DataTypeWSImpl implements DataTypeWS {

    private static final Logger LOG = Logger.getLogger(DataTypeWSImpl.class.getName());

    /* (non-Javadoc)
     * @see webServices.cxf.client.demo.DataTypeWS#getStudentsMap(*
     */
    public webServices.cxf.client.demo.GetStudentsMapResponse.Return getStudentsMap() { 
        LOG.info("Executing operation getStudentsMap");
        try {
            webServices.cxf.client.demo.GetStudentsMapResponse.Return _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see webServices.cxf.client.demo.DataTypeWS#getStudentsList(*
     */
    public java.util.List<webServices.cxf.client.demo.Student> getStudentsList() { 
        LOG.info("Executing operation getStudentsList");
        try {
            java.util.List<webServices.cxf.client.demo.Student> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see webServices.cxf.client.demo.DataTypeWS#addStudent(webServices.cxf.client.demo.Student  arg0 )*
     */
    public boolean addStudent(webServices.cxf.client.demo.Student arg0) { 
        LOG.info("Executing operation addStudent");
        System.out.println(arg0);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see webServices.cxf.client.demo.DataTypeWS#getStudentById(java.lang.Integer  arg0 )*
     */
    public webServices.cxf.client.demo.Student getStudentById(java.lang.Integer arg0) { 
        LOG.info("Executing operation getStudentById");
        System.out.println(arg0);
        try {
            webServices.cxf.client.demo.Student _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
