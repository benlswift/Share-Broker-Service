/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shares;

import java.awt.*;
import java.io.*;
import javax.jws.*;
import javax.ejb.Stateless;
import java.util.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author bensw
 */
@WebService(serviceName = "shareBroker")
@Stateless()
public class shareBroker {


    /**
     * This is a sample web service operation
     */

    


    /**
     * Web service operation
     */
    public String addCompany(String name, String symbol, int availableShares, int value, String currency) { 
        Company com;
        AllCompanies theCompanies = new AllCompanies();
        java.util.List<Company> companyList =  theCompanies.getCompanyCollection();
        com = new Company();
        com.setName(name);
        com.setSymbol(symbol);
        com.setAvailableShares(availableShares);
        Company.SharePrice price = new shares.Company.SharePrice();
        price.setCurrency(currency);
        price.setValue(value);
        com.setSharePrice(price);
        companyList.add(com);
  
        try {            
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(theCompanies.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File("output.xml");
            marshaller.marshal(theCompanies, file);
            //marshaller.marshal(quickXML, System.out);
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        return "Added " + name + " to shares list";
    }

    /**
     * Web service operation
     */
    public String listShares() {
        //TODO write your implementation code here:
        try {
            
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(this.getClass().getPackage().getName());
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            shareBroker c = (shareBroker) unmarshaller.unmarshal(new java.io.File("output.xml")); //NOI18N
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        
        return null;
    }
   


}
