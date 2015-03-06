
package com.cold.translationservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>translationParameter complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="translationParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="languageOptions" type="{http://server.translationService.cold.com/}LanguageOptions" minOccurs="0"/>
 *         &lt;element name="originalText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="translationClass" type="{http://server.translationService.cold.com/}TranslationClass" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "translationParameter", propOrder = {
    "languageOptions",
    "originalText",
    "translationClass",
    "userId"
})
public class TranslationParameter {

    protected LanguageOptions languageOptions;
    protected String originalText;
    protected TranslationClass translationClass;
    protected String userId;

    /**
     * ��ȡlanguageOptions���Ե�ֵ��
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
     * ����languageOptions���Ե�ֵ��
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
     * ��ȡoriginalText���Ե�ֵ��
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
     * ����originalText���Ե�ֵ��
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
     * ��ȡtranslationClass���Ե�ֵ��
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
     * ����translationClass���Ե�ֵ��
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
     * ��ȡuserId���Ե�ֵ��
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
     * ����userId���Ե�ֵ��
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
