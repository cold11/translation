
package org.datacontract.schemas._2004._07.translationwcfservice1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.translationwcfservice.MachineTranslationParameter;
import org.datacontract.schemas._2004._07.translationwcfservice.MachineTranslationResult;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.translationwcfservice1 package. 
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

    private final static QName _MachineTranslationParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService1", "MachineTranslationParameter");
    private final static QName _LanguageOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService1", "LanguageOption");
    private final static QName _TranslationClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService1", "TranslationClass");
    private final static QName _LanguageOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService1", "LanguageOptions");
    private final static QName _MachineTranslationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService1", "MachineTranslationResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.translationwcfservice1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LanguageOptions }
     * 
     */
    public LanguageOptions createLanguageOptions() {
        return new LanguageOptions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MachineTranslationParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService1", name = "MachineTranslationParameter")
    public JAXBElement<MachineTranslationParameter> createMachineTranslationParameter(MachineTranslationParameter value) {
        return new JAXBElement<MachineTranslationParameter>(_MachineTranslationParameter_QNAME, MachineTranslationParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService1", name = "LanguageOption")
    public JAXBElement<LanguageOption> createLanguageOption(LanguageOption value) {
        return new JAXBElement<LanguageOption>(_LanguageOption_QNAME, LanguageOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranslationClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService1", name = "TranslationClass")
    public JAXBElement<TranslationClass> createTranslationClass(TranslationClass value) {
        return new JAXBElement<TranslationClass>(_TranslationClass_QNAME, TranslationClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService1", name = "LanguageOptions")
    public JAXBElement<LanguageOptions> createLanguageOptions(LanguageOptions value) {
        return new JAXBElement<LanguageOptions>(_LanguageOptions_QNAME, LanguageOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MachineTranslationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService1", name = "MachineTranslationResult")
    public JAXBElement<MachineTranslationResult> createMachineTranslationResult(MachineTranslationResult value) {
        return new JAXBElement<MachineTranslationResult>(_MachineTranslationResult_QNAME, MachineTranslationResult.class, null, value);
    }

}
