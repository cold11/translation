
package org.datacontract.schemas._2004._07.translationwcfservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AssistedTranslationResultUnit complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AssistedTranslationResultUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssistedTranslationResultUnitComponents" type="{http://schemas.datacontract.org/2004/07/TranslationWcfService}ArrayOfAssistedTranslationResultUnitComponent" minOccurs="0"/>
 *         &lt;element name="EndOfOriginalText" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EndOfTranslationResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OriginalText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartOfOriginalText" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StartOfTranslationResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isGlossary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssistedTranslationResultUnit", propOrder = {
    "assistedTranslationResultUnitComponents",
    "endOfOriginalText",
    "endOfTranslationResult",
    "originalText",
    "startOfOriginalText",
    "startOfTranslationResult",
    "isGlossary"
})
public class AssistedTranslationResultUnit {

    @XmlElement(name = "AssistedTranslationResultUnitComponents")
    protected ArrayOfAssistedTranslationResultUnitComponent assistedTranslationResultUnitComponents;
    @XmlElement(name = "EndOfOriginalText")
    protected Integer endOfOriginalText;
    @XmlElement(name = "EndOfTranslationResult")
    protected Integer endOfTranslationResult;
    @XmlElement(name = "OriginalText")
    protected String originalText;
    @XmlElement(name = "StartOfOriginalText")
    protected Integer startOfOriginalText;
    @XmlElement(name = "StartOfTranslationResult")
    protected Integer startOfTranslationResult;
    protected Boolean isGlossary;

    /**
     * 获取assistedTranslationResultUnitComponents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssistedTranslationResultUnitComponent }
     *     
     */
    public ArrayOfAssistedTranslationResultUnitComponent getAssistedTranslationResultUnitComponents() {
        return assistedTranslationResultUnitComponents;
    }

    /**
     * 设置assistedTranslationResultUnitComponents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssistedTranslationResultUnitComponent }
     *     
     */
    public void setAssistedTranslationResultUnitComponents(ArrayOfAssistedTranslationResultUnitComponent value) {
        this.assistedTranslationResultUnitComponents = value;
    }

    /**
     * 获取endOfOriginalText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndOfOriginalText() {
        return endOfOriginalText;
    }

    /**
     * 设置endOfOriginalText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndOfOriginalText(Integer value) {
        this.endOfOriginalText = value;
    }

    /**
     * 获取endOfTranslationResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndOfTranslationResult() {
        return endOfTranslationResult;
    }

    /**
     * 设置endOfTranslationResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndOfTranslationResult(Integer value) {
        this.endOfTranslationResult = value;
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
     * 获取startOfOriginalText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartOfOriginalText() {
        return startOfOriginalText;
    }

    /**
     * 设置startOfOriginalText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartOfOriginalText(Integer value) {
        this.startOfOriginalText = value;
    }

    /**
     * 获取startOfTranslationResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartOfTranslationResult() {
        return startOfTranslationResult;
    }

    /**
     * 设置startOfTranslationResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartOfTranslationResult(Integer value) {
        this.startOfTranslationResult = value;
    }

    /**
     * 获取isGlossary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGlossary() {
        return isGlossary;
    }

    /**
     * 设置isGlossary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGlossary(Boolean value) {
        this.isGlossary = value;
    }

}
