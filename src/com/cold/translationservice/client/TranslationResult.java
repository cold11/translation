
package com.cold.translationservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.translationwcfservice.AssistedTranslationResult;
import org.datacontract.schemas._2004._07.translationwcfservice.MachineTranslationResult;


/**
 * <p>translationResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="translationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assistedTranslationResult" type="{http://schemas.datacontract.org/2004/07/TranslationWcfService}AssistedTranslationResult" minOccurs="0"/>
 *         &lt;element name="machineTranslationResult" type="{http://schemas.datacontract.org/2004/07/TranslationWcfService}MachineTranslationResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "translationResult", propOrder = {
    "assistedTranslationResult",
    "machineTranslationResult"
})
public class TranslationResult {

    protected AssistedTranslationResult assistedTranslationResult;
    protected MachineTranslationResult machineTranslationResult;

    /**
     * ��ȡassistedTranslationResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AssistedTranslationResult }
     *     
     */
    public AssistedTranslationResult getAssistedTranslationResult() {
        return assistedTranslationResult;
    }

    /**
     * ����assistedTranslationResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AssistedTranslationResult }
     *     
     */
    public void setAssistedTranslationResult(AssistedTranslationResult value) {
        this.assistedTranslationResult = value;
    }

    /**
     * ��ȡmachineTranslationResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MachineTranslationResult }
     *     
     */
    public MachineTranslationResult getMachineTranslationResult() {
        return machineTranslationResult;
    }

    /**
     * ����machineTranslationResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MachineTranslationResult }
     *     
     */
    public void setMachineTranslationResult(MachineTranslationResult value) {
        this.machineTranslationResult = value;
    }

}
