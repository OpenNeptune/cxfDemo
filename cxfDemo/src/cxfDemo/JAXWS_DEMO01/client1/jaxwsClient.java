package cxfDemo.JAXWS_DEMO01.client1;
/**
 * ���ֵ��÷�ʽ��Щ���⣬��ʱ��Ϊ���Գɹ�
 */
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import cxfDemo.JAXWS_DEMO01.services.helloWS;

public class jaxwsClient {
	private static final QName SERVICE_NAME = new QName("http://services.JAXWS_DEMO01.cxfDemo/","helloWSImplService");
	
	private static final QName PROT_NAME = new QName("http://services.JAXWS_DEMO01.cxfDemo/","helloWSImplPort");
	
	public static void main(String[] args) {
		//ʹ�÷���������һ������
		Service service = Service.create(SERVICE_NAME);
		
		String  address ="http://localhost:8888/services/helloWS";
		
		//Ϊ������Ӷ˿�
		service.addPort(PROT_NAME, SOAPBinding.SOAP11HTTP_BINDING, address);
		
		//��ȡ������Ķ��󲢴���
		helloWS port = service.getPort(helloWS.class);
		
		//������Ӧ�ķ���
		port.sayHello("JAX-WS client");
		
	}
}
