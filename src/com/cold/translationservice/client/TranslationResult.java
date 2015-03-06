
package com.cold.translationservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.translationwcfservice.AssistedTranslationResult;
import org.datacontract.schemas._2004._07.translationwcfservice.MachineTranslationResult;


/**
 * <p>translationResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取assistedTranslationResult属性的值。
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
     * 设置assistedTranslationResult属性的值。
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
     * 获取machineTranslationResult属性的值。
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
     * 设置machineTranslationResult属性的值。
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
