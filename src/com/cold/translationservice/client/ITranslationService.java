package com.cold.translationservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2015-02-02T15:53:17.486+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://server.translationService.cold.com/", name = "ITranslationService")
@XmlSeeAlso({org.tempuri.ObjectFactory.class, org.datacontract.schemas._2004._07.translationwcfservice.ObjectFactory.class, com.microsoft.schemas._2003._10.serialization.ObjectFactory.class, ObjectFactory.class, com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class, org.datacontract.schemas._2004._07.translationwcfservice1.ObjectFactory.class, com.microsoft.schemas._2003._10.serialization1.ObjectFactory.class})
public interface ITranslationService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "translate", targetNamespace = "http://server.translationService.cold.com/", className = "com.cold.translationservice.client.Translate")
    @WebMethod
    @ResponseWrapper(localName = "translateResponse", targetNamespace = "http://server.translationService.cold.com/", className = "com.cold.translationservice.client.TranslateResponse")
    public com.cold.translationservice.client.TranslationResult translate(
        @WebParam(name = "arg0", targetNamespace = "")
        com.cold.translationservice.client.TranslationParameter arg0
    ) throws Exception_Exception;
}