package cxfDemo.JAXWS_DEMO01.client2;

import cxfDemo.JAXWS_DEMO01.client2.demo.HelloWS;
import cxfDemo.JAXWS_DEMO01.client2.demo.HelloWSImplService;

/**
 * 
 * @summary:
 * 		ʹ��JDK��wsimport�������ɿͻ��˴��룬Ȼ���д������
 * @ע�⣺
 * 		�˰��µ�demo���µ������඼��ͳһ������������
 * 	src>wsimport -keep -p cxfDemo.JAXWS_DEMO01.client2.demo http://localhost:8888/services/helloWS?Wsdl
 */
public class wsimportClient {
	public static void main(String[] args) {
		HelloWSImplService factory = new HelloWSImplService();
		HelloWS helloWSImplPort = factory.getHelloWSImplPort();
		System.out.println(helloWSImplPort.sayHello("JDK-WSimport Client call"));
	}
}
