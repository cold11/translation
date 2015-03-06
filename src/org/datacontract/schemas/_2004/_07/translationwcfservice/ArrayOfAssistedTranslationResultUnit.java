
package org.datacontract.schemas._2004._07.translationwcfservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAssistedTranslationResultUnit complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAssistedTranslationResultUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssistedTranslationResultUnit" type="{http://schemas.datacontract.org/2004/07/TranslationWcfService}AssistedTranslationResultUnit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssistedTranslationResultUnit", propOrder = {
    "assistedTranslationResultUnit"
})
public class ArrayOfAssistedTranslationResultUnit {

    @XmlElement(name = "AssistedTranslationResultUnit")
    protected List<AssistedTranslationResultUnit> assistedTranslationResultUnit;

    /**
     * Gets the value of the assistedTranslationResultUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assistedTranslationResultUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssistedTranslationResultUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssistedTranslationResultUnit }
     * 
     * 
     */
    public List<AssistedTranslationResultUnit> getAssistedTranslationResultUnit() {
        if (assistedTranslationResultUnit == null) {
            assistedTranslationResultUnit = new ArrayList<AssistedTranslationResultUnit>();
        }
        return this.assistedTranslationResultUnit;
    }

}
