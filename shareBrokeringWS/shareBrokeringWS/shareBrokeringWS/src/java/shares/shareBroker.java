/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shares;

import docwebservices.CurrencyConversionWSService;
import java.awt.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
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
        String filepath = "output.xml";
        FileOutputStream fout = new FileOutputStream("C:\\Users\\bensw\\OneDrive - Nottingham Trent University\\Year 3\\Cloud Computing\\Assignment\\Working Version\\shareBrokeringWS\\shareBrokeringWS\\shareBrokeringWS/output.xml");
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
               curr = listShares().getCompanyCollection().get(i).getSharePrice().getCurrency();
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
        int priceInGBP = 0;
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            priceInGBP = (int) convert(listShares().getCompanyCollection().get(i).getSharePrice().getCurrency(),"GBP",listShares().getCompanyCollection().get(i).getSharePrice().getValue());
            if (priceInGBP >= highPrice)
            {//convert into GBP and compare
                highPrice = priceInGBP;
                highCompany = i;
            }
        }
        return "The company with the highest share price is " + listShares().getCompanyCollection().get(highCompany).getName() + " at " + highPrice + listShares().getCompanyCollection().get(highCompany).getSharePrice().getCurrency() ;
    }
        public String searchLowestValue() throws JAXBException
    {
        int lowPrice = 0;
        int lowCompany = 0;
        int priceInGBP = 0;
        //initialise lowest price as first company in GBP
        lowPrice = (int) convert(listShares().getCompanyCollection().get(0).getSharePrice().getCurrency(),"GBP",listShares().getCompanyCollection().get(0).getSharePrice().getValue());
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            priceInGBP = (int) convert(listShares().getCompanyCollection().get(i).getSharePrice().getCurrency(),"GBP",listShares().getCompanyCollection().get(i).getSharePrice().getValue());

            if (listShares().getCompanyCollection().get(i).getSharePrice().getValue() <= lowPrice)
            {
                lowPrice = priceInGBP;
                lowCompany = i;
            }
        }
        return "The company with the lowest share price is " + listShares().getCompanyCollection().get(lowCompany).getName() + " at " + lowPrice + listShares().getCompanyCollection().get(lowCompany).getSharePrice().getCurrency() ;
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
     * @param symbol
     * @return 
     * @throws java.lang.Exception
     */
    public ArrayList<String> searchBySymbol(String symbol) throws Exception {
        ArrayList<String> name = new ArrayList();
        int counter = 0;
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            if (listShares().getCompanyCollection().get(i).getSymbol().contains(symbol)){
                counter += 1;
                name.add(listShares().getCompanyCollection().get(i).getName());
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
        convert = getConversionRate(intitialCurrency,newCurrency);//get conversion rate between two currencies
        System.out.println("Conversion Rate: " + convert);
        newPrice = price * convert;//multiply conversion rate by old price to get converted value
       
        return newPrice;
    }
         
     public AllCompanies updateCurrencyPrice(String newCurrency, double newPrice, String name) throws JAXBException, FileNotFoundException
    {
        Company com;
        AllCompanies theUpdatedCompanies = new AllCompanies();
        java.util.List<Company> companyList =  theUpdatedCompanies.getCompanyCollection();//list of all companies 
        int idNum = 0;
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            Company com1 = listShares().getCompanyCollection().get(i);//get each company 
            companyList.add(com1);
            if (listShares().getCompanyCollection().get(i).getName().equals(name))//if this company needs updating
            {
                idNum = i;
                listShares().getCompanyCollection().get(i).sharePrice.setValue((int) newPrice);//set company value to new price
                listShares().getCompanyCollection().get(i).sharePrice.setCurrency(newCurrency);//set currency to new currency
                System.out.println("Updated company: " + listShares().getCompanyCollection().get(i).getName());
            }
        }
        
        theUpdatedCompanies.getCompanyCollection().get(idNum).sharePrice.setCurrency(newCurrency);
        theUpdatedCompanies.getCompanyCollection().get(idNum).sharePrice.setValue((int) newPrice);
                
        //Make and populate new xml
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

  public String removeCompany(String name) throws JAXBException, FileNotFoundException{
        AllCompanies theCompanies = new AllCompanies();
        java.util.List<Company> companyList =  theCompanies.getCompanyCollection();
        //iterate through all companies and add them to the companies list apart from the company to be removed
        for (int i = 0; i < listShares().getCompanyCollection().size();i++)
        {
            if (listShares().getCompanyCollection().get(i).getName().equals(name))
            {
                //do nothing
            }
            else{
            Company com1 = listShares().getCompanyCollection().get(i);
            companyList.add(com1);
            }
        }

        FileOutputStream fout = new FileOutputStream("C:\\Users\\bensw\\OneDrive - Nottingham Trent University\\Year 3\\Cloud Computing\\Assignment\\Working Version\\shareBrokeringWS\\shareBrokeringWS\\shareBrokeringWS/output.xml");
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
        return "Company removed";
  }
  
  public double updateSharePrice(String symbol) throws NumberFormatException, MalformedURLException, IOException, ParseException{ //MOVE TO SHAREBROKER
       
      //connect to api
      URL url = new URL("https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=" + symbol + "&apikey=VIQKMWQYY1TF44IM&datatype=JSON");
       HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 
        conn.setRequestMethod("GET");
        conn.connect(); 
        String inline = new String();
        double updatedPrice = 0;
        
        int responsecode = conn.getResponseCode(); 
        System.out.println(responsecode);
        if(responsecode != 200) throw new RuntimeException("HttpResponseCode: " +responsecode);
        else
        {
            Scanner sc = new Scanner(url.openStream());
            while(sc.hasNext())
            {
                //scan each line
                inline = sc.nextLine();
                inline = sc.nextLine();
                //search for "close" in the response
                if (inline.contains("close"))//get value at close
                {
                    System.out.println(inline);
                    String newPrice = inline.substring(25, 31);//get the values 
                    System.out.println(newPrice);
                    updatedPrice = Double.parseDouble(newPrice);

                    break;
                }
            }
            sc.close();
        }

     return updatedPrice;    
    }
  
  public AllCompanies updatePriceXML(double updatedPrice, String name) throws FileNotFoundException, JAXBException
  {
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
            listShares().getCompanyCollection().get(i).sharePrice.setValue((int) updatedPrice);
            listShares().getCompanyCollection().get(i).sharePrice.setCurrency("GBP");//updated price is always in GBP
            System.out.println("Updated company: " + listShares().getCompanyCollection().get(i).getName());
        }
    }

    theUpdatedCompanies.getCompanyCollection().get(idNum).sharePrice.setCurrency("GBP");
    theUpdatedCompanies.getCompanyCollection().get(idNum).sharePrice.setValue((int) updatedPrice);

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
  
  public double getNewValue(String symbol)
  {
    double res = 0;
    String inline = new String();
        try {
            URL url = new URL("https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=" + symbol + "&apikey=VIQKMWQYY1TF44IM&datatype=JSON");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
// Check for successful response code or throw error
            if (conn.getResponseCode() != 200) {
                throw new IOException(conn.getResponseMessage());
            }
            BufferedReader ins = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inString; 
            StringBuilder sb = new StringBuilder();
            while ((inString = ins.readLine()) != null) {
                         Scanner sc = new Scanner(url.openStream());
                         System.out.println(sc.nextLine());
            while(sc.hasNext())
            {
                inline = sc.nextLine();
                inline = sc.nextLine();
                if (inline.contains("close"))//get value at close
                {
                    System.out.println(inline);
                    String newPrice = inline.substring(25, 31);
                    System.out.println(newPrice);
                    res = Double.parseDouble(newPrice);

                    break;
                }
            }
            sc.close();
            sb.append(inString + "\n");
            }
            //String result = sb.substring(sb.indexOf(":") + 1, sb.indexOf("}"));
            //res = Double.parseDouble(result);
            ins.close();
        }
        catch (MalformedURLException me) {
            System.out.println("MalformedURLException: " + me); 
        }
        catch (IOException ioe) {
            System.out.println("IOException: " + ioe);
        }
    
        return res;
}
  public ArrayList<String> searchPrice(int from, int to) throws JAXBException
  {
      ArrayList<String> listOfCompanies = new ArrayList();
      int sharePrice = 0;
      for (int i = 0; i < listShares().companyCollection.size(); i++)
      {
          sharePrice = (int) convert(listShares().getCompanyCollection().get(i).getSharePrice().getCurrency(),"GBP",listShares().getCompanyCollection().get(i).getSharePrice().getValue());
          if (sharePrice < to && sharePrice > from)
          {
              listOfCompanies.add(listShares().getCompanyCollection().get(i).getName());
          }
      }
      
      return listOfCompanies;
  }
}
