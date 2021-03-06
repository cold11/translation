
package com.cold.translationservice.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2015-02-02T15:53:17.436+08:00
 * Generated source version: 2.7.11
 * 
 */
public final class ITranslationService_TranslationServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://server.translationService.cold.com/", "TranslationServiceImplService");

    private ITranslationService_TranslationServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = TranslationServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        TranslationServiceImplService ss = new TranslationServiceImplService(wsdlURL, SERVICE_NAME);
        ITranslationService port = ss.getTranslationServiceImplPort();  
        
        {
        System.out.println("Invoking translate...");
        com.cold.translationservice.client.TranslationParameter _translate_arg0 = new com.cold.translationservice.client.TranslationParameter();
        com.cold.translationservice.client.LanguageOptions _translate_arg0LanguageOptions = new com.cold.translationservice.client.LanguageOptions();
        com.cold.translationservice.client.LanguageOption _translate_arg0LanguageOptionsSource = com.cold.translationservice.client.LanguageOption.ZH;
        _translate_arg0LanguageOptions.setSource(_translate_arg0LanguageOptionsSource);
        com.cold.translationservice.client.LanguageOption _translate_arg0LanguageOptionsTarget = com.cold.translationservice.client.LanguageOption.ZH;
        _translate_arg0LanguageOptions.setTarget(_translate_arg0LanguageOptionsTarget);
        _translate_arg0.setLanguageOptions(_translate_arg0LanguageOptions);
        _translate_arg0.setOriginalText("OriginalText-19072503");
        com.cold.translationservice.client.TranslationClass _translate_arg0TranslationClass = com.cold.translationservice.client.TranslationClass.C;
        _translate_arg0.setTranslationClass(_translate_arg0TranslationClass);
        _translate_arg0.setUserId("UserId1319580142");
        try {
            com.cold.translationservice.client.TranslationResult _translate__return = port.translate(_translate_arg0);
            System.out.println("translate.result=" + _translate__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
