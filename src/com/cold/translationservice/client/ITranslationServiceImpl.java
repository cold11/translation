
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.cold.translationservice.client;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2015-02-02T15:53:17.477+08:00
 * Generated source version: 2.7.11
 * 
 */

@javax.jws.WebService(
                      serviceName = "TranslationServiceImplService",
                      portName = "TranslationServiceImplPort",
                      targetNamespace = "http://server.translationService.cold.com/",
                      wsdlLocation = "http://localhost:8080/services/translationService?wsdl",
                      endpointInterface = "com.cold.translationservice.client.ITranslationService")
                      
public class ITranslationServiceImpl implements ITranslationService {

    private static final Logger LOG = Logger.getLogger(ITranslationServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.cold.translationservice.client.ITranslationService#translate(com.cold.translationservice.client.TranslationParameter  arg0 )*
     */
    public com.cold.translationservice.client.TranslationResult translate(com.cold.translationservice.client.TranslationParameter arg0) throws Exception_Exception    { 
        LOG.info("Executing operation translate");
        System.out.println(arg0);
        try {
            com.cold.translationservice.client.TranslationResult _return = new com.cold.translationservice.client.TranslationResult();
            org.datacontract.schemas._2004._07.translationwcfservice.AssistedTranslationResult _returnAssistedTranslationResult = new org.datacontract.schemas._2004._07.translationwcfservice.AssistedTranslationResult();
            org.datacontract.schemas._2004._07.translationwcfservice.ArrayOfAssistedTranslationResultUnit _returnAssistedTranslationResultAssistedResults = new org.datacontract.schemas._2004._07.translationwcfservice.ArrayOfAssistedTranslationResultUnit();
            java.util.List<org.datacontract.schemas._2004._07.translationwcfservice.AssistedTranslationResultUnit> _returnAssistedTranslationResultAssistedResultsAssistedTranslationResultUnit = new java.util.ArrayList<org.datacontract.schemas._2004._07.translationwcfservice.AssistedTranslationResultUnit>();
            _returnAssistedTranslationResultAssistedResults.getAssistedTranslationResultUnit().addAll(_returnAssistedTranslationResultAssistedResultsAssistedTranslationResultUnit);
            _returnAssistedTranslationResult.setAssistedResults(_returnAssistedTranslationResultAssistedResults);
            _returnAssistedTranslationResult.setOriginalText("OriginalText-96407099");
            _returnAssistedTranslationResult.setResult("Result-1675851269");
            _return.setAssistedTranslationResult(_returnAssistedTranslationResult);
            org.datacontract.schemas._2004._07.translationwcfservice.MachineTranslationResult _returnMachineTranslationResult = new org.datacontract.schemas._2004._07.translationwcfservice.MachineTranslationResult();
            _returnMachineTranslationResult.setOrderedResult("OrderedResult1935205640");
            _returnMachineTranslationResult.setOriginalText("OriginalText765318896");
            _returnMachineTranslationResult.setUnorderedResult("UnorderedResult-1373602433");
            _returnMachineTranslationResult.setCorrespondingRelation("CorrespondingRelation-710901338");
            _return.setMachineTranslationResult(_returnMachineTranslationResult);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new Exception_Exception("Exception...");
    }

}