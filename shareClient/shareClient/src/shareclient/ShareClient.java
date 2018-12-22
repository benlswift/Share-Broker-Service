/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shareclient;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author n0699610
 */
public class ShareClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        
        String name;
        String symbol;
        int availableShares;
        int shareValue;
        String currency;
        try{
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a company name: ");
        name = reader.next(); 
        System.out.println("Enter the company symbol: ");
        symbol = reader.next();
        System.out.println("Enter the number of available shares: ");
        availableShares = reader.nextInt(); 
        System.out.println("Enter the share value: ");
        shareValue = reader.nextInt(); 
        System.out.println("Enter the currency: ");
        currency = reader.next(); // Scans the next token of the input as an int.
        //once finished
        

        reader.close();
        
        name = addCompany(name,symbol,availableShares,shareValue,currency);
        System.out.println(name);
        }
        catch (Exception Ex)
        {
            System.out.println("Exception" + Ex );
        }

        
        
    }


    private static String addCompany(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3, java.lang.String arg4) throws Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.addCompany(arg0, arg1, arg2, arg3, arg4);
    }







    
}
