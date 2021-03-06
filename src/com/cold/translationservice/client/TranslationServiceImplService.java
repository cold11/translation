package com.cold.translationservice.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2015-02-02T15:53:17.491+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "TranslationServiceImplService", 
                  wsdlLocation = "http://localhost:8080/services/translationService?wsdl",
                  targetNamespace = "http://server.translationService.cold.com/") 
public class TranslationServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.translationService.cold.com/", "TranslationServiceImplService");
    public final static QName TranslationServiceImplPort = new QName("http://server.translationService.cold.com/", "TranslationServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/translationService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TranslationServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/translationService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TranslationServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TranslationServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TranslationServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TranslationServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TranslationServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TranslationServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ITranslationService
     */
    @WebEndpoint(name = "TranslationServiceImplPort")
    public ITranslationService getTranslationServiceImplPort() {
        return super.getPort(TranslationServiceImplPort, ITranslationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ITranslationService
     */
    @WebEndpoint(name = "TranslationServiceImplPort")
    public ITranslationService getTranslationServiceImplPort(WebServiceFeature... features) {
        return super.getPort(TranslationServiceImplPort, ITranslationService.class, features);
    }

}
