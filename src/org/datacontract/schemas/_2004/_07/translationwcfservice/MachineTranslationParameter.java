
package org.datacontract.schemas._2004._07.translationwcfservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.translationwcfservice1.LanguageOptions;
import org.datacontract.schemas._2004._07.translationwcfservice1.TranslationClass;


/**
 * <p>MachineTranslationParameter complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MachineTranslationParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LanguageOptions" type="{http://schemas.datacontract.org/2004/07/TranslationWcfService}LanguageOptions" minOccurs="0"/>
 *         &lt;element name="OriginalText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TranslationClass" type="{http://schemas.datacontract.org/2004/07/TranslationWcfService}TranslationClass" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MachineTranslationParameter", propOrder = {
    "languageOptions",
    "originalText",
    "translationClass",
    "userId"
})
public class MachineTranslationParameter {

    @XmlElement(name = "LanguageOptions")
    protected LanguageOptions languageOptions;
    @XmlElement(name = "OriginalText")
    protected String originalText;
    @XmlElement(name = "TranslationClass")
    protected TranslationClass translationClass;
    @XmlElement(name = "UserId")
    protected String userId;

    /**
     * 获取languageOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LanguageOptions }
     *     
     */
    public LanguageOptions getLanguageOptions() {
        return languageOptions;
    }

    /**
     * 设置languageOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageOptions }
     *     
     */
    public void setLanguageOptions(LanguageOptions value) {
        this.languageOptions = value;
    }

    /**
     * 获取originalText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalText() {
        return originalText;
    }

    /**
     * 设置originalText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalText(String value) {
        this.originalText = value;
    }

    /**
     * 获取translationClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TranslationClass }
     *     
     */
    public TranslationClass getTranslationClass() {
        return translationClass;
    }

    /**
     * 设置translationClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TranslationClass }
     *     
     */
    public void setTranslationClass(TranslationClass value) {
        this.translationClass = value;
    }

    /**
     * 获取userId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
