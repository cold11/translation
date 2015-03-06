
package org.datacontract.schemas._2004._07.translationwcfservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AssistedTranslationResultUnitComponent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AssistedTranslationResultUnitComponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExampleSentenceChinese" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExampleSentenceEnglish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectionPositions" type="{http://schemas.datacontract.org/2004/07/TranslationWcfService}ArrayOfMatchPosition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssistedTranslationResultUnitComponent", propOrder = {
    "exampleSentenceChinese",
    "exampleSentenceEnglish",
    "result",
    "selectionPositions"
})
public class AssistedTranslationResultUnitComponent {

    @XmlElement(name = "ExampleSentenceChinese")
    protected String exampleSentenceChinese;
    @XmlElement(name = "ExampleSentenceEnglish")
    protected String exampleSentenceEnglish;
    @XmlElement(name = "Result")
    protected String result;
    @XmlElement(name = "SelectionPositions")
    protected ArrayOfMatchPosition selectionPositions;

    /**
     * 获取exampleSentenceChinese属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExampleSentenceChinese() {
        return exampleSentenceChinese;
    }

    /**
     * 设置exampleSentenceChinese属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExampleSentenceChinese(String value) {
        this.exampleSentenceChinese = value;
    }

    /**
     * 获取exampleSentenceEnglish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExampleSentenceEnglish() {
        return exampleSentenceEnglish;
    }

    /**
     * 设置exampleSentenceEnglish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExampleSentenceEnglish(String value) {
        this.exampleSentenceEnglish = value;
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

    /**
     * 获取selectionPositions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMatchPosition }
     *     
     */
    public ArrayOfMatchPosition getSelectionPositions() {
        return selectionPositions;
    }

    /**
     * 设置selectionPositions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMatchPosition }
     *     
     */
    public void setSelectionPositions(ArrayOfMatchPosition value) {
        this.selectionPositions = value;
    }

}
