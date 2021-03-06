package webServices.cxf.client.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2014-07-05T13:56:00.562+08:00
 * Generated source version: 2.5.9
 * 
 */
@WebService(targetNamespace = "http://inter.serv.cxf.webServices/", name = "DataTypeWS")
@XmlSeeAlso({ObjectFactory.class})
public interface DataTypeWS {

    @WebResult(name = "_return", targetNamespace = "")
    @RequestWrapper(localName = "getStudentsMap", targetNamespace = "http://inter.serv.cxf.webServices/", className = "webServices.cxf.client.demo.GetStudentsMap")
    @WebMethod
    @ResponseWrapper(localName = "getStudentsMapResponse", targetNamespace = "http://inter.serv.cxf.webServices/", className = "webServices.cxf.client.demo.GetStudentsMapResponse")
    public webServices.cxf.client.demo.GetStudentsMapResponse.Return getStudentsMap();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getStudentsList", targetNamespace = "http://inter.serv.cxf.webServices/", className = "webServices.cxf.client.demo.GetStudentsList")
    @WebMethod
    @ResponseWrapper(localName = "getStudentsListResponse", targetNamespace = "http://inter.serv.cxf.webServices/", className = "webServices.cxf.client.demo.GetStudentsListResponse")
    public java.util.List<webServices.cxf.client.demo.Student> getStudentsList();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "addStudent", targetNamespace = "http://inter.serv.cxf.webServices/", className = "webServices.cxf.client.demo.AddStudent")
    @WebMethod
    @ResponseWrapper(localName = "addStudentResponse", targetNamespace = "http://inter.serv.cxf.webServices/", className = "webServices.cxf.client.demo.AddStudentResponse")
    public boolean addStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        webServices.cxf.client.demo.Student arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getStudentById", targetNamespace = "http://inter.serv.cxf.webServices/", className = "webServices.cxf.client.demo.GetStudentById")
    @WebMethod
    @ResponseWrapper(localName = "getStudentByIdResponse", targetNamespace = "http://inter.serv.cxf.webServices/", className = "webServices.cxf.client.demo.GetStudentByIdResponse")
    public webServices.cxf.client.demo.Student getStudentById(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Integer arg0
    );
}
