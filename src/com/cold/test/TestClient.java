package com.cold.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.datacontract.schemas._2004._07.translationwcfservice.MachineTranslationResult;

import com.cold.translationservice.client.Exception_Exception;
import com.cold.translationservice.client.ITranslationService;
import com.cold.translationservice.client.LanguageOption;
import com.cold.translationservice.client.LanguageOptions;
import com.cold.translationservice.client.TranslationClass;
import com.cold.translationservice.client.TranslationParameter;
import com.cold.translationservice.client.TranslationResult;
import com.cold.translationservice.client.TranslationServiceImplService;

public class TestClient {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://localhost:8080/services/translationService?wsdl");
			TranslationServiceImplService ss = new TranslationServiceImplService(url);
			ITranslationService port = ss.getTranslationServiceImplPort();  
			TranslationParameter translationParameter = new TranslationParameter();
			LanguageOptions languageOptions = new LanguageOptions();
			languageOptions.setSource(LanguageOption.EN);
			languageOptions.setTarget(LanguageOption.ZH);
			translationParameter.setLanguageOptions(languageOptions);
			translationParameter.setTranslationClass(TranslationClass.H);
			translationParameter.setOriginalText("It is contemplated that additional and/or different configurations of circuits");
			TranslationResult translationResult = port.translate(translationParameter);
			MachineTranslationResult result = translationResult.getMachineTranslationResult();
			System.out.println(result.getOrderedResult());
			System.out.println(result.getCorrespondingRelation());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
