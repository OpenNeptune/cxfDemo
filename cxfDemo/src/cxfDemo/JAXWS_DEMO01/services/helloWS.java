package cxfDemo.JAXWS_DEMO01.services;

/**
 * 
 * @ʹ��ע��ʵ��JAX-WS
 */
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


//ʹ��@WebServiceע������������һ��SEI(web services�������ӿ�)
@WebService
public interface helloWS {

	//ʹ��@WebMethod����һ��webservices�˵ķ���
	@WebMethod
	public String sayHello(
			//ʹ��@WebParamָ��WSDL�ĵ��иķ����ĵ�һ������Ϊname������ָ������ʾarg0
			@WebParam(name="name")
			String name);
}
