package com.project.model.entity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import PL.TNfeProc;
import br.inf.portalfiscal.nfe.TProcEvento;

//import br.inf.portalfiscal.nfe.TProcEvento;

public class Test {
	
	private TNfeProc tNfeProc;
	private TProcEvento tProcEvento;
	
	public static void main(String args[]) throws JAXBException, FileNotFoundException {
		
		JAXBContext jaxbContext     = JAXBContext.newInstance( TNfeProc.class );
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		InputStream inStream = new FileInputStream( "D:\\Dev\\NF\\NFs\\xml\\test2.xml" );
		TNfeProc tNfeProc = (TNfeProc) jaxbUnmarshaller.unmarshal( inStream );
		System.out.println(tNfeProc.getNFe().getInfNFe().getEmit().getCNPJ());
		System.out.println(tNfeProc.getNFe().getInfNFe().getIde().getCUF());
		System.out.println(tNfeProc.getNFe().getInfNFe().getDet().get(0).getProd().getCProd());
		System.out.println(tNfeProc.getNFe().getInfNFe().getDet().get(0).getProd().getUTrib());
		System.out.println(tNfeProc.getNFe().getInfNFe().getDet().size());
//		
//		JAXBContext jaxbContext     = JAXBContext.newInstance( TProcEvento.class );
//		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//		InputStream inStream = new FileInputStream( "D:\\Dev\\NF\\NFs\\xml\\test3.xml" );
//		TProcEvento tProcEvento = (TProcEvento) jaxbUnmarshaller.unmarshal( inStream );
//		System.out.println(tProcEvento.getEvento().getInfEvento().getCOrgao());
		
	}
	
}
