
package org.datacontract.schemas._2004._07.translationwcfservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AssistedTranslationResultUnitComponent complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡexampleSentenceChinese���Ե�ֵ��
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
     * ����exampleSentenceChinese���Ե�ֵ��
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
     * ��ȡexampleSentenceEnglish���Ե�ֵ��
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
     * ����exampleSentenceEnglish���Ե�ֵ��
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
     * ��ȡresult���Ե�ֵ��
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
     * ����result���Ե�ֵ��
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
     * ��ȡselectionPositions���Ե�ֵ��
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
     * ����selectionPositions���Ե�ֵ��
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
