package cxfDemo.JAXWS_DEMO01.services;
/**
 * @summary
 * 		SEI��ʵ����
 */
import javax.jws.WebService;


@WebService
public class helloWSImpl implements helloWS {

	@Override
	public String sayHello(String name) {
		String result = "Services say:hello "+name;
		System.out.println(result);
		return result;
	}

}
