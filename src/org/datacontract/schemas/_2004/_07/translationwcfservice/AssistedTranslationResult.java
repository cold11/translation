
package org.datacontract.schemas._2004._07.translationwcfservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AssistedTranslationResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AssistedTranslationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssistedResults" type="{http://schemas.datacontract.org/2004/07/TranslationWcfService}ArrayOfAssistedTranslationResultUnit" minOccurs="0"/>
 *         &lt;element name="OriginalText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssistedTranslationResult", propOrder = {
    "assistedResults",
    "originalText",
    "result"
})
public class AssistedTranslationResult {

    @XmlElement(name = "AssistedResults")
    protected ArrayOfAssistedTranslationResultUnit assistedResults;
    @XmlElement(name = "OriginalText")
    protected String originalText;
    @XmlElement(name = "Result")
    protected String result;

    /**
     * 获取assistedResults属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssistedTranslationResultUnit }
     *     
     */
    public ArrayOfAssistedTranslationResultUnit getAssistedResults() {
        return assistedResults;
    }

    /**
     * 设置assistedResults属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssistedTranslationResultUnit }
     *     
     */
    public void setAssistedResults(ArrayOfAssistedTranslationResultUnit value) {
        this.assistedResults = value;
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
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

}
