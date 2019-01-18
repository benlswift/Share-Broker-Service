/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shares;

import docwebservices.CurrencyConversionWSService;
import java.awt.*;
import java.io.*;
import javax.jws.*;
import javax.ejb.Stateless;
import java.util.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;
import java.util.*;

/**
 *
 * @author bensw
 */
@WebService(serviceName = "shareBroker")
@Stateless()
public class shareBroker {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/CurrencyConvertor/CurrencyConversionWSService.wsdl")
    private CurrencyConversionWSService service;


    /**
     * This is a sample web service operation
     */

    


    /**
     * Web service operation
     */
    public String addCompany(String name, String symbol, int availableShares, int value, String currency) throws IOException, JAXBException { 
        Company com;
        AllCompanies theCompanies = new AllCompanies();
        java.util.List<Company> companyList =  theCompanies.getCompanyCollection();
        
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            Company com1 = listShares().getCompanyCollection().get(i);
            companyList.add(com1);
        }
        
        com = new Company();
        com.setName(name);
        com.setSymbol(symbol);
        com.setAvailableShares(availableShares);
        Company.SharePrice price = new shares.Company.SharePrice();
        price.setCurrency(currency);
        price.setValue(value);
        com.setSharePrice(price);
        companyList.add(com);
        FileOutputStream fout = new FileOutputStream("fileout.xml");
        try {            
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(theCompanies.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            //BufferedWriter writer = new BufferedWriter(new FileWriter("‪C:\\\\Users\\\\bensw\\\\OneDrive - Nottingham Trent University\\\\Year 3\\\\Cloud Computing\\\\Assignment\\\\Working Version\\\\shareBrokeringWS\\\\shareBrokeringWS\\\\shareBrokeringWS/samplefile1.txt"));
            //File file = new File("‪C:\\Users\\bensw\\Desktop/output2.xml");
            marshaller.marshal(theCompanies, fout);
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
    public AllCompanies listShares() throws JAXBException {
        //TODO write your implementation code here:
        AllCompanies theCompanies = new AllCompanies();

        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(theCompanies.getClass().getPackage().getName());
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            theCompanies = (AllCompanies) unmarshaller.unmarshal(new java.io.File("C:\\Users\\bensw\\OneDrive - Nottingham Trent University\\Year 3\\Cloud Computing\\Assignment\\Working Version\\shareBrokeringWS\\shareBrokeringWS\\shareBrokeringWS/output.xml")); //NOI18N
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        System.out.println(theCompanies);
        Company com;
        com = theCompanies.getCompanyCollection().get(0);
        System.out.println(com.getName());
        return theCompanies;
    }
   
    public String listSymbol(String name) throws JAXBException
    {
        String sym = new String();
        
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            if (listShares().getCompanyCollection().get(i).getName().equals(name))
            {
               sym = listShares().getCompanyCollection().get(i).getSymbol();
            }
        }
        return sym;
    }
        public int listAvailableShares(String name) throws JAXBException
    {
        int shares = 0;
        
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            if (listShares().getCompanyCollection().get(i).getName().equals(name))
            {
               shares = listShares().getCompanyCollection().get(i).getAvailableShares();
            }
        }
        return shares;
    }
        
        public int listPrice(String name) throws JAXBException
    {
        int price = 0;
        
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            if (listShares().getCompanyCollection().get(i).getName().equals(name))
            {
               price = listShares().getCompanyCollection().get(i).getSharePrice().getValue();
            }
        }
        return price;
    }
      
    public String listCurrency(String name) throws JAXBException
    {
        String curr = new String();
        
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            if (listShares().getCompanyCollection().get(i).getName().equals(name))
            {
               curr = listShares().getCompanyCollection().get(0).getSharePrice().getCurrency();
            }
        }
        return curr;
    }
    
    public AllCompanies updateShares(String name, int numShares) throws JAXBException, FileNotFoundException
    {
        //get all shares
        //put into AllCompanies instance
        //find company to update
        //update thier shares
        //save to AllCompanies instance
        //jaxbm the same as addCompany
        
        Company com;
        AllCompanies theUpdatedCompanies = new AllCompanies();
        java.util.List<Company> companyList =  theUpdatedCompanies.getCompanyCollection();
        int idNum = 0;
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            Company com1 = listShares().getCompanyCollection().get(i);
            companyList.add(com1);
            if (listShares().getCompanyCollection().get(i).getName().equals(name))
            {
                idNum = i;
                listShares().getCompanyCollection().get(i).setAvailableShares(numShares);
                System.out.println("Updated company: " + listShares().getCompanyCollection().get(i).getName());
            }
        }
        listShares().getCompanyCollection().get(idNum).setAvailableShares(numShares);
        theUpdatedCompanies.getCompanyCollection().get(idNum).setAvailableShares(numShares);
        
        FileOutputStream fout = new FileOutputStream("C:\\Users\\bensw\\OneDrive - Nottingham Trent University\\Year 3\\Cloud Computing\\Assignment\\Working Version\\shareBrokeringWS\\shareBrokeringWS\\shareBrokeringWS/output.xml");
        try {            
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(theUpdatedCompanies.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            //BufferedWriter writer = new BufferedWriter(new FileWriter("‪C:\\\\Users\\\\bensw\\\\OneDrive - Nottingham Trent University\\\\Year 3\\\\Cloud Computing\\\\Assignment\\\\Working Version\\\\shareBrokeringWS\\\\shareBrokeringWS\\\\shareBrokeringWS/samplefile1.txt"));
            //File file = new File("‪C:\\Users\\bensw\\Desktop/output2.xml");
            marshaller.marshal(theUpdatedCompanies, fout);
            System.out.println("File updated:" + fout.toString());
            //marshaller.marshal(quickXML, System.out);
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        return theUpdatedCompanies;
    }


    /**
     * Web service operation
     * @throws java.lang.Exception
     */
    public java.util.List<String> listNames() throws Exception{
        String name = new String();
        java.util.List listName = new ArrayList();
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
               name = listShares().getCompanyCollection().get(i).getName();
               listName.add(name);
        }
        return listName;
    }

    /**
     * Web service operation
     */
    public int add(int i, int j) {
        //TODO write your implementation code here:
        int ans = i+j;
        return ans;
    }
    // 1 unit of arg0 = return value in arg1
    //eg. arg0 = GBP, arg1 = EUR
    //return = 1.17
    //hence GBP1 = EUR1.17
    private double getConversionRate(java.lang.String arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        docwebservices.CurrencyConversionWS port = service.getCurrencyConversionWSPort();
        return port.getConversionRate(arg0, arg1);
    }

    /**
     * Web service operation
     */
    public String searchName(String name) throws Exception {
        //TODO write your implementation code here:
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            if (listShares().getCompanyCollection().get(i).getName().equals(name)){
               name = listShares().getCompanyCollection().get(i).getName();
            }
        }
        return name;
    }

    /**
     * Web service operation
     */
    public String searchHighestPrice() throws Exception {        
        int highPrice = 0;
        int highCompany = 0;
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            if (listShares().getCompanyCollection().get(i).getSharePrice().getValue() >= highPrice)
            {
                highPrice = listShares().getCompanyCollection().get(i).getSharePrice().getValue();
                highCompany = i;
            }
        }
        return "The company with the highest share price is " + listShares().getCompanyCollection().get(highCompany).getName() + " at " + highPrice + listShares().getCompanyCollection().get(highCompany).getSharePrice().getCurrency() ;
    }

    /**
     * Web service operation
     */
    public String searchSymbol(String symbol) throws Exception {
        String company = new String();
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            if (listShares().getCompanyCollection().get(i).getSymbol().equals(symbol)){
               company = listShares().getCompanyCollection().get(i).getName();
            }
        }
        return company;
    }

    private java.util.List<java.lang.String> getCurrencyCodes() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        docwebservices.CurrencyConversionWS port = service.getCurrencyConversionWSPort();
        return port.getCurrencyCodes();
    }

    /**
     * Web service operation
     */
    public String searchBySymbol(String symbol) throws Exception {
        String name = new String();
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            if (listShares().getCompanyCollection().get(i).getSymbol().equals(symbol)){
               name = listShares().getCompanyCollection().get(i).getName();
            }
        }
        return name;
    }

    /**
     * Web service operation
     */
    public double convert(String intitialCurrency, String newCurrency, int price) {
        double convert = 0;
        double newPrice = 0;
        convert = getConversionRate(intitialCurrency,newCurrency);
        newPrice = price * convert;
       
        return newPrice;
    }
    
    

       
}
