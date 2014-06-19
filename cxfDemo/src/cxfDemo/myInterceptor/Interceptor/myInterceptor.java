package cxfDemo.myInterceptor.Interceptor;
/**
 * @summary:
 * 		���ø����������ڽ���Web Services�������ʱУ��ͻ��˵��û�����Ϣ
 *
 */
import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;

public class myInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
	private	String username;
	private String password;
	
	
	public myInterceptor(String username,String password) {
		//ָ���ڵ��÷���˵ķ���ʱ���ø�������
		super(Phase.INVOKE);
		this.username = username;
		this.password = password;
	}
	/**
	 * ������У��ͻ��˷��͵��ͻ��˷��͵�SOAP���Ƿ������µ���Ϣ
	 * 
	 * 		<envelope>
	 * 			<head>
	 * 				<user>
	 * 					<username>xxx</username>
	 * 					<password>xxx</password>
	 * 				</user>
	 * 			</head>
	 * 			<body></body>
	 * 		</envelope>
	 */
	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		String user="";
		String pass="";
		QName qName = new QName("user");
		//�жϿͻ��˵�SOAP��Ϣͷ�Ƿ���userԪ��
		if(message.hasHeader(qName)){
			Header header = message.getHeader(qName);
			Element element = (Element) header.getObject();
			if(element.getFirstChild() != null){
				user =  element.getFirstChild().getTextContent();	
			}
			if(element.getLastChild() != null){
				pass= element.getLastChild().getTextContent();
			}
			System.out.println("myInterceptor:=>"+user+"<>"+pass);
			if(user.equals(username) && pass.equals(password)){
				System.out.println("�û���ϢУ��ɹ�:=>"+user+"<>"+pass);
			}else{
				System.out.println("�û���ϢУ��ʧ��:=>"+user+"<>"+pass);
				//�˴��׳�һ���쳣���ͻ��˵��ó���Ȼ����ֹ�����ִ��
				throw new RuntimeException("�û���ϢУ��ʧ��");
			}
		}else{
			System.out.println("δ��Ȩ�û����������");
			//�˴��׳�һ���쳣���ͻ��˵��ó���Ȼ����ֹ�����ִ��
			throw new RuntimeException("δ��Ȩ�û����������");			
		}
	}

}
