package cxfDemo.myInterceptor;

import java.util.List;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.message.Message;

import cxfDemo.myInterceptor.Interceptor.myInterceptor;
import cxfDemo.myInterceptor.SEIImpl.MyInterceptorWSImpl;

/**
 * 
 * @summary:
 * 		����webservice����δ������һ���Զ���������
 */
public class publishWS {
	public static void main(String[] args) {
		String address ="http://localhost:8888/services/myinterceptor/interceptorWS";
		Endpoint endpoint = Endpoint.publish(address, new MyInterceptorWSImpl());
		EndpointImpl endpointImpl = (EndpointImpl) endpoint;
		
		List<Interceptor<? extends Message>> inInterceptors = endpointImpl.getInInterceptors();
		inInterceptors.add(new myInterceptor("admin", "admin"));
		
		System.out.println("WebServices�����ɹ�!");
	}
}
