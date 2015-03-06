
package com.cold.translationservice.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cold.translationservice.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Translate_QNAME = new QName("http://server.translationService.cold.com/", "translate");
    private final static QName _TranslateResponse_QNAME = new QName("http://server.translationService.cold.com/", "translateResponse");
    private final static QName _Exception_QNAME = new QName("http://server.translationService.cold.com/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cold.translationservice.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link TranslateResponse }
     * 
     */
    public TranslateResponse createTranslateResponse() {
        return new TranslateResponse();
    }

    /**
     * Create an instance of {@link Translate }
     * 
     */
    public Translate createTranslate() {
        return new Translate();
    }

    /**
     * Create an instance of {@link TranslationParameter }
     * 
     */
    public TranslationParameter createTranslationParameter() {
        return new TranslationParameter();
    }

    /**
     * Create an instance of {@link LanguageOptions }
     * 
     */
    public LanguageOptions createLanguageOptions() {
        return new LanguageOptions();
    }

    /**
     * Create an instance of {@link TranslationResult }
     * 
     */
    public TranslationResult createTranslationResult() {
        return new TranslationResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Translate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.translationService.cold.com/", name = "translate")
    public JAXBElement<Translate> createTranslate(Translate value) {
        return new JAXBElement<Translate>(_Translate_QNAME, Translate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranslateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.translationService.cold.com/", name = "translateResponse")
    public JAXBElement<TranslateResponse> createTranslateResponse(TranslateResponse value) {
        return new JAXBElement<TranslateResponse>(_TranslateResponse_QNAME, TranslateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.translationService.cold.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
