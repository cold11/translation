
package org.datacontract.schemas._2004._07.translationwcfservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>AssistedTranslationParameter complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AssistedTranslationParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LanguageOptions" type="{http://schemas.datacontract.org/2004/07/TranslationWcfService}LanguageOptions" minOccurs="0"/>
 *         &lt;element name="OriginalTexts" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="TranslationClass" type="{http://schemas.datacontract.org/2004/07/TranslationWcfService}TranslationClass" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssistedTranslationParameter", propOrder = {
    "languageOptions",
    "originalTexts",
    "translationClass",
    "userId",
    "taskId"
})
public class AssistedTranslationParameter {

    @XmlElement(name = "LanguageOptions")
    protected LanguageOptions languageOptions;
    @XmlElement(name = "OriginalTexts")
    protected ArrayOfstring originalTexts;
    @XmlElement(name = "TranslationClass")
    protected TranslationClass translationClass;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "TaskId")
    protected String taskId;

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
     * 获取originalTexts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getOriginalTexts() {
        return originalTexts;
    }

    /**
     * 设置originalTexts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setOriginalTexts(ArrayOfstring value) {
        this.originalTexts = value;
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

    /**
     * 获取taskId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 设置taskId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

}
