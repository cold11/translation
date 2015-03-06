
package org.datacontract.schemas._2004._07.translationwcfservice1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LanguageOptions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LanguageOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://schemas.datacontract.org/2004/07/TranslationWcfService1}LanguageOption" minOccurs="0" form="qualified"/>
 *         &lt;element name="Target" type="{http://schemas.datacontract.org/2004/07/TranslationWcfService1}LanguageOption" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageOptions", propOrder = {
    "source",
    "target"
})
public class LanguageOptions {

    @XmlElement(name = "Source")
    protected LanguageOption source;
    @XmlElement(name = "Target")
    protected LanguageOption target;

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LanguageOption }
     *     
     */
    public LanguageOption getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageOption }
     *     
     */
    public void setSource(LanguageOption value) {
        this.source = value;
    }

    /**
     * 获取target属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LanguageOption }
     *     
     */
    public LanguageOption getTarget() {
        return target;
    }

    /**
     * 设置target属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageOption }
     *     
     */
    public void setTarget(LanguageOption value) {
        this.target = value;
    }

}
