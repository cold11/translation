
package org.datacontract.schemas._2004._07.translationwcfservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.translationwcfservice package. 
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

    private final static QName _AssistedTranslationResultUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "AssistedTranslationResultUnit");
    private final static QName _LanguageOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "LanguageOptions");
    private final static QName _MachineTranslationParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "MachineTranslationParameter");
	private final static QName _MachineTranslationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "MachineTranslationResult");
	private final static QName _AssistedTranslationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "AssistedTranslationResult");
    private final static QName _AssistedTranslationResultUnitComponent_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "AssistedTranslationResultUnitComponent");
    private final static QName _AssistedTranslationParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "AssistedTranslationParameter");
    private final static QName _ArrayOfAssistedTranslationResultUnitComponent_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "ArrayOfAssistedTranslationResultUnitComponent");
    private final static QName _ArrayOfAssistedTranslationResultUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "ArrayOfAssistedTranslationResultUnit");
    private final static QName _MatchPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "MatchPosition");
    private final static QName _ArrayOfMatchPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "ArrayOfMatchPosition");
    private final static QName _LanguageOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "LanguageOption");
    private final static QName _TranslationClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/TranslationWcfService", "TranslationClass");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.translationwcfservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AssistedTranslationResultUnit }
     * 
     */
    public AssistedTranslationResultUnit createAssistedTranslationResultUnit() {
        return new AssistedTranslationResultUnit();
    }

    /**
     * Create an instance of {@link AssistedTranslationResultUnitComponent }
     * 
     */
    public AssistedTranslationResultUnitComponent createAssistedTranslationResultUnitComponent() {
        return new AssistedTranslationResultUnitComponent();
    }

    /**
     * Create an instance of {@link AssistedTranslationResult }
     * 
     */
    public AssistedTranslationResult createAssistedTranslationResult() {
        return new AssistedTranslationResult();
    }

    /**
     * Create an instance of {@link ArrayOfAssistedTranslationResultUnitComponent }
     * 
     */
    public ArrayOfAssistedTranslationResultUnitComponent createArrayOfAssistedTranslationResultUnitComponent() {
        return new ArrayOfAssistedTranslationResultUnitComponent();
    }

    /**
     * Create an instance of {@link LanguageOptions }
     * 
     */
    public LanguageOptions createLanguageOptions() {
        return new LanguageOptions();
    }

    /**
     * Create an instance of {@link AssistedTranslationParameter }
     * 
     */
    public AssistedTranslationParameter createAssistedTranslationParameter() {
        return new AssistedTranslationParameter();
    }

    /**
     * Create an instance of {@link ArrayOfAssistedTranslationResultUnit }
     * 
     */
    public ArrayOfAssistedTranslationResultUnit createArrayOfAssistedTranslationResultUnit() {
        return new ArrayOfAssistedTranslationResultUnit();
    }

    /**
     * Create an instance of {@link MatchPosition }
     * 
     */
    public MatchPosition createMatchPosition() {
        return new MatchPosition();
    }

    /**
     * Create an instance of {@link ArrayOfMatchPosition }
     * 
     */
    public ArrayOfMatchPosition createArrayOfMatchPosition() {
        return new ArrayOfMatchPosition();
    }

    /**
     * Create an instance of {@link MachineTranslationParameter }
     * 
     */
    public MachineTranslationParameter createMachineTranslationParameter() {
        return new MachineTranslationParameter();
    }

    /**
     * Create an instance of {@link MachineTranslationResult }
     * 
     */
    public MachineTranslationResult createMachineTranslationResult() {
        return new MachineTranslationResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssistedTranslationResultUnit }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "AssistedTranslationResultUnit")
    public JAXBElement<AssistedTranslationResultUnit> createAssistedTranslationResultUnit(AssistedTranslationResultUnit value) {
        return new JAXBElement<AssistedTranslationResultUnit>(_AssistedTranslationResultUnit_QNAME, AssistedTranslationResultUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "LanguageOptions")
    public JAXBElement<LanguageOptions> createLanguageOptions(LanguageOptions value) {
        return new JAXBElement<LanguageOptions>(_LanguageOptions_QNAME, LanguageOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MachineTranslationParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "MachineTranslationParameter")
    public JAXBElement<MachineTranslationParameter> createMachineTranslationParameter(MachineTranslationParameter value) {
        return new JAXBElement<MachineTranslationParameter>(_MachineTranslationParameter_QNAME, MachineTranslationParameter.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link MachineTranslationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "MachineTranslationResult")
    public JAXBElement<MachineTranslationResult> createMachineTranslationResult(MachineTranslationResult value) {
        return new JAXBElement<MachineTranslationResult>(_MachineTranslationResult_QNAME, MachineTranslationResult.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssistedTranslationResult }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "AssistedTranslationResult")
    public JAXBElement<AssistedTranslationResult> createAssistedTranslationResult(AssistedTranslationResult value) {
        return new JAXBElement<AssistedTranslationResult>(_AssistedTranslationResult_QNAME, AssistedTranslationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssistedTranslationResultUnitComponent }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "AssistedTranslationResultUnitComponent")
    public JAXBElement<AssistedTranslationResultUnitComponent> createAssistedTranslationResultUnitComponent(AssistedTranslationResultUnitComponent value) {
        return new JAXBElement<AssistedTranslationResultUnitComponent>(_AssistedTranslationResultUnitComponent_QNAME, AssistedTranslationResultUnitComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssistedTranslationParameter }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "AssistedTranslationParameter")
    public JAXBElement<AssistedTranslationParameter> createAssistedTranslationParameter(AssistedTranslationParameter value) {
        return new JAXBElement<AssistedTranslationParameter>(_AssistedTranslationParameter_QNAME, AssistedTranslationParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssistedTranslationResultUnitComponent }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "ArrayOfAssistedTranslationResultUnitComponent")
    public JAXBElement<ArrayOfAssistedTranslationResultUnitComponent> createArrayOfAssistedTranslationResultUnitComponent(ArrayOfAssistedTranslationResultUnitComponent value) {
        return new JAXBElement<ArrayOfAssistedTranslationResultUnitComponent>(_ArrayOfAssistedTranslationResultUnitComponent_QNAME, ArrayOfAssistedTranslationResultUnitComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAssistedTranslationResultUnit }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "ArrayOfAssistedTranslationResultUnit")
    public JAXBElement<ArrayOfAssistedTranslationResultUnit> createArrayOfAssistedTranslationResultUnit(ArrayOfAssistedTranslationResultUnit value) {
        return new JAXBElement<ArrayOfAssistedTranslationResultUnit>(_ArrayOfAssistedTranslationResultUnit_QNAME, ArrayOfAssistedTranslationResultUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchPosition }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "MatchPosition")
    public JAXBElement<MatchPosition> createMatchPosition(MatchPosition value) {
        return new JAXBElement<MatchPosition>(_MatchPosition_QNAME, MatchPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMatchPosition }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "ArrayOfMatchPosition")
    public JAXBElement<ArrayOfMatchPosition> createArrayOfMatchPosition(ArrayOfMatchPosition value) {
        return new JAXBElement<ArrayOfMatchPosition>(_ArrayOfMatchPosition_QNAME, ArrayOfMatchPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "LanguageOption")
    public JAXBElement<LanguageOption> createLanguageOption(LanguageOption value) {
        return new JAXBElement<LanguageOption>(_LanguageOption_QNAME, LanguageOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranslationClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TranslationWcfService", name = "TranslationClass")
    public JAXBElement<TranslationClass> createTranslationClass(TranslationClass value) {
        return new JAXBElement<TranslationClass>(_TranslationClass_QNAME, TranslationClass.class, null, value);
    }

}
