
package com.checkbox.ftpresponseexporter.responsedata;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ResponseDataService", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://dev.checkboxonline.com/Services/ResponseDataService.svc?wsdl")
public class ResponseDataService
    extends Service
{

    private final static URL RESPONSEDATASERVICE_WSDL_LOCATION;
    private final static WebServiceException RESPONSEDATASERVICE_EXCEPTION;
    private final static QName RESPONSEDATASERVICE_QNAME = new QName("http://tempuri.org/", "ResponseDataService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://dev.checkboxonline.com/Services/ResponseDataService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESPONSEDATASERVICE_WSDL_LOCATION = url;
        RESPONSEDATASERVICE_EXCEPTION = e;
    }

    public ResponseDataService() {
        super(__getWsdlLocation(), RESPONSEDATASERVICE_QNAME);
    }

    public ResponseDataService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESPONSEDATASERVICE_QNAME, features);
    }

    public ResponseDataService(URL wsdlLocation) {
        super(wsdlLocation, RESPONSEDATASERVICE_QNAME);
    }

    public ResponseDataService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESPONSEDATASERVICE_QNAME, features);
    }

    public ResponseDataService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ResponseDataService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IResponseDataService
     */
    @WebEndpoint(name = "BasicHttpBinding_IResponseDataService")
    public IResponseDataService getBasicHttpBindingIResponseDataService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IResponseDataService"), IResponseDataService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IResponseDataService
     */
    @WebEndpoint(name = "BasicHttpBinding_IResponseDataService")
    public IResponseDataService getBasicHttpBindingIResponseDataService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IResponseDataService"), IResponseDataService.class, features);
    }

    /**
     * 
     * @return
     *     returns IResponseDataService
     */
    @WebEndpoint(name = "BasicHttpBinding_IResponseDataService1")
    public IResponseDataService getBasicHttpBindingIResponseDataService1() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IResponseDataService1"), IResponseDataService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IResponseDataService
     */
    @WebEndpoint(name = "BasicHttpBinding_IResponseDataService1")
    public IResponseDataService getBasicHttpBindingIResponseDataService1(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IResponseDataService1"), IResponseDataService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESPONSEDATASERVICE_EXCEPTION!= null) {
            throw RESPONSEDATASERVICE_EXCEPTION;
        }
        return RESPONSEDATASERVICE_WSDL_LOCATION;
    }

}
