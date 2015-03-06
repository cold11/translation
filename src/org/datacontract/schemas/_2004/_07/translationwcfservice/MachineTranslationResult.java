
package org.datacontract.schemas._2004._07.translationwcfservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MachineTranslationResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MachineTranslationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderedResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnorderedResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrespondingRelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MachineTranslationResult", propOrder = {
    "orderedResult",
    "originalText",
    "unorderedResult",
    "correspondingRelation"
})
public class MachineTranslationResult {

    @XmlElement(name = "OrderedResult")
    protected String orderedResult;
    @XmlElement(name = "OriginalText")
    protected String originalText;
    @XmlElement(name = "UnorderedResult")
    protected String unorderedResult;
    @XmlElement(name = "CorrespondingRelation")
    protected String correspondingRelation;

    /**
     * 获取orderedResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderedResult() {
        return orderedResult;
    }

    /**
     * 设置orderedResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderedResult(String value) {
        this.orderedResult = value;
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
     * 获取unorderedResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnorderedResult() {
        return unorderedResult;
    }

    /**
     * 设置unorderedResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnorderedResult(String value) {
        this.unorderedResult = value;
    }

    /**
     * 获取correspondingRelation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondingRelation() {
        return correspondingRelation;
    }

    /**
     * 设置correspondingRelation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondingRelation(String value) {
        this.correspondingRelation = value;
    }

}
