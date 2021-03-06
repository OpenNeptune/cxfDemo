
package webServices.base.client.demo03;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a> <strong>\u036c\u01f8\u0524���� Web ��\ufffd\ufffd.5��\u02b1\u0633\u0512\u0614\u00b6\u00af\u00b8\ufffd��\u00ac\u05fc\u0237\u00bf\u027f\u00bf\u00a1\u00a3��\ufffd0 \u00b6\u0e76\u05d0\u00b9\ufffd\u00b3\u020a��\u02e060 \u00b6\u0e76\u00b9\ufffd\u04aa\u00b3\u020a��\ufffd\u014c\ud1f8\u0524����\u02fd\u00be\u0761\u00a3</br>\u00b4\u030c\ud1f8\u0524����Web Services\u022b\u00b2\u00bb\u04aa\u0503\u051a\u024e\u00ba��\u0352\u00b5\u013f\u00b5\u0123\u00ac\u0274\u0510\u0468\u04aa\u022b<a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">j\u03f5\u03d2\u0107</a>\u00a3\u00ac\u00bb\u00b6\u04ed\u00bc\u00bc\u02f5\u00bd\u00bb��\u00a1\u00a3 QQ\u00a3\u00ba8409035<br /><strong>\u02b9\u0503��\u00be\u057e WEB ��\ufffd\u00a2\u0137\u00bb\udac7\udd3d\u04f1\u00be\u057e\u00a3\u00bahttp://www.webxml.com.cn/ \u00b8\u0450\u00bb\u00b4\udbb5\udcb5\u0156��\u00b3\u0526lt;/strong>\u00a3\u00a1<br /><span style="color:#999999;">\u0368\u05aa\u00a3\u00ba\u036c\u01f8\u0524���� WEB ��\ufffd\u00ad4\u02b9\u0503\u00b5\u0656�� http://www.onhap.com/WebServices/WeatherWebService.asmx \u00b5\u0123\u00ac\u022b\u00b8\u0133\u028f\u05d4\u06ca\u00b9\u0503\u00b5\u0137\ufffd�� http://www.webxml.com.cn/WebServices/WeatherWebService.asmx \u00a3\u00ac\u05d8��\u04fd\u0503\u00bc\u00b4\u00bf��\u00a3</span><br /><br />&nbsp;
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "WeatherWebService", targetNamespace = "http://WebXml.com.cn/", wsdlLocation = "file:/C:/Documents%20and%20Settings/Administrator/\u684c\u9762/weather.wsdl")
public class WeatherWebService
    extends Service
{

    private final static URL WEATHERWEBSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(webServices.base.client.demo03.WeatherWebService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = webServices.base.client.demo03.WeatherWebService.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/Documents%20and%20Settings/Administrator/\u684c\u9762/weather.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Documents%20and%20Settings/Administrator/\u684c\u9762/weather.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WEATHERWEBSERVICE_WSDL_LOCATION = url;
    }

    public WeatherWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherWebService() {
        super(WEATHERWEBSERVICE_WSDL_LOCATION, new QName("http://WebXml.com.cn/", "WeatherWebService"));
    }

    /**
     * 
     * @return
     *     returns WeatherWebServiceSoap
     */
    @WebEndpoint(name = "WeatherWebServiceSoap")
    public WeatherWebServiceSoap getWeatherWebServiceSoap() {
        return super.getPort(new QName("http://WebXml.com.cn/", "WeatherWebServiceSoap"), WeatherWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherWebServiceSoap
     */
    @WebEndpoint(name = "WeatherWebServiceSoap")
    public WeatherWebServiceSoap getWeatherWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "WeatherWebServiceSoap"), WeatherWebServiceSoap.class, features);
    }

}
