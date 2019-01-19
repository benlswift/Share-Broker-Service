
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import shares.FileNotFoundException_Exception;
import shares.JAXBException_Exception;
import shares.ListSharesResponse;
import shares.UpdateCurrencyPriceResponse;
import shares.UpdateSharesResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bensw
 */
public class ShareClientGUI extends javax.swing.JFrame {

    /**
     * Creates new form ShareClientGUI
     */
    public ShareClientGUI() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        listNamesListBox = new java.awt.List();
        listNamesBtn = new java.awt.Button();
        detailsListBox = new java.awt.List();
        nameSearchField = new java.awt.TextField();
        searchSymbolBtn = new java.awt.Button();
        symbolSearchField = new java.awt.TextField();
        searchNameBtn1 = new java.awt.Button();
        searchListBox = new java.awt.List();
        highPriceBtn = new java.awt.Button();
        saveConvertCurr = new java.awt.Button();
        ConvertedField = new java.awt.TextField();
        updateShares = new java.awt.Button();
        newSharesField = new java.awt.TextField();
        button1 = new java.awt.Button();
        jComboBox1 = new javax.swing.JComboBox<>();
        convertBtn1 = new java.awt.Button();
        button2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listNamesListBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listNamesListBoxMouseEntered(evt);
            }
        });
        listNamesListBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listNamesListBoxActionPerformed(evt);
            }
        });

        listNamesBtn.setActionCommand("listNamesBtn");
        listNamesBtn.setLabel("List Names");
        listNamesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listNamesBtnActionPerformed(evt);
            }
        });

        detailsListBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsListBoxActionPerformed(evt);
            }
        });

        nameSearchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameSearchFieldMouseClicked(evt);
            }
        });
        nameSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSearchFieldActionPerformed(evt);
            }
        });

        searchSymbolBtn.setLabel("Search Symbol");
        searchSymbolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSymbolBtnActionPerformed(evt);
            }
        });

        symbolSearchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                symbolSearchFieldMouseClicked(evt);
            }
        });
        symbolSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symbolSearchFieldActionPerformed(evt);
            }
        });

        searchNameBtn1.setLabel("Search Name");
        searchNameBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameBtn1ActionPerformed(evt);
            }
        });

        searchListBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchListBoxActionPerformed(evt);
            }
        });

        highPriceBtn.setLabel("Search Highest Price");
        highPriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highPriceBtnActionPerformed(evt);
            }
        });

        saveConvertCurr.setActionCommand("Convert To");
        saveConvertCurr.setLabel("Convert To");
        saveConvertCurr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveConvertCurrActionPerformed(evt);
            }
        });

        updateShares.setLabel("Update Shares");
        updateShares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSharesActionPerformed(evt);
            }
        });

        button1.setLabel("Search Lowest Price");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(getArray());

        convertBtn1.setActionCommand("Save Convert");
        convertBtn1.setLabel("Save Conversion");
        convertBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertBtn1ActionPerformed(evt);
            }
        });

        button2.setLabel("Convert All");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(listNamesListBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listNamesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveConvertCurr, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(button2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 128, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(convertBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 547, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(detailsListBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(updateShares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newSharesField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ConvertedField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                        .addComponent(symbolSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(searchSymbolBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchNameBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(searchListBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(highPriceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listNamesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchNameBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchSymbolBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(symbolSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchListBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addComponent(updateShares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newSharesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(detailsListBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listNamesListBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(highPriceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(ConvertedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(saveConvertCurr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        listNamesListBox.getAccessibleContext().setAccessibleName("listNamesBox");
        listNamesBtn.getAccessibleContext().setAccessibleName("listNamesBtn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void symbolSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symbolSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symbolSearchFieldActionPerformed

    private void searchSymbolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSymbolBtnActionPerformed
        // TODO add your handling code here:
        String sym = new String();
        sym = symbolSearchField.getText();
        String comName = new String();
        searchListBox.removeAll();
        //add error handling -> if not company of that name
        try {
            comName = searchBySymbol(sym);
            searchListBox.add(searchName(comName));
            searchListBox.add(listSymbol(comName));
            searchListBox.add("" + listAvailableShares(comName));
        } catch (Exception ex) {
            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchSymbolBtnActionPerformed

    private void nameSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameSearchFieldActionPerformed

    private void listNamesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listNamesBtnActionPerformed
        listNamesListBox.removeAll();
        try {
            // TODO add your handling code here:

            for (int i = 0; i < listNames().size() ;i++ )
            {
                listNamesListBox.add(listNames().get(i));
            }
        } catch (Exception ex) {
            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listNamesBtnActionPerformed

    private void listNamesListBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listNamesListBoxActionPerformed
        // TODO add your handling code here:
        detailsListBox.removeAll();
        String name = new String();
        name = listNamesListBox.getSelectedItem();
        try {
            detailsListBox.add(listSymbol(name));
            detailsListBox.add("" + listAvailableShares(name));
            detailsListBox.add(listCurrency(name) + listPrice(name));

        } catch (Exception ex) {
            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listNamesListBoxActionPerformed

    private void searchNameBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameBtn1ActionPerformed
        // TODO add your handling code here:
        String name = new String();
        name = nameSearchField.getText();
        searchListBox.removeAll();
        //add error handling -> if not company of that name
        try {
            searchListBox.add(searchName(name));
            searchListBox.add(listSymbol(name));
            searchListBox.add("" + listAvailableShares(name));
        } catch (Exception ex) {
            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchNameBtn1ActionPerformed

    private void searchListBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchListBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchListBoxActionPerformed

    private void nameSearchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameSearchFieldMouseClicked
        nameSearchField.setText("");
    }//GEN-LAST:event_nameSearchFieldMouseClicked

    private void symbolSearchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_symbolSearchFieldMouseClicked
        symbolSearchField.setText("");
    }//GEN-LAST:event_symbolSearchFieldMouseClicked

    private void highPriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highPriceBtnActionPerformed
        try {
            searchListBox.add(searchHighestPrice());
        } catch (Exception ex) {
            searchListBox.removeAll();
            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_highPriceBtnActionPerformed

    private void saveConvertCurrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveConvertCurrActionPerformed
        String name = new String();
        int selectedCode = 0;
        name = listNamesListBox.getSelectedItem();
        selectedCode = jComboBox1.getSelectedIndex();
        String currency = new String();
        String newCurrency = new String();
        int valueBefore = 0;
        try {
            currency = listCurrency(name);
            valueBefore = listPrice(name);
            newCurrency = getCurrencyCodes().get(selectedCode).substring(0, 3);
            ConvertedField.setText("" + convert(currency,newCurrency,valueBefore));
        } catch (Exception ex) {
            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_saveConvertCurrActionPerformed

    private void updateSharesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSharesActionPerformed
        String name = new String();
        name = listNamesListBox.getSelectedItem();
        String currency = new String();
   
        String newCurrency = new String();
        int newShares = 0;
        
        try {
            newShares = Integer.parseInt(newSharesField.getText());
            updateShares(name,newShares);
            listNamesListBox.removeAll();
            detailsListBox.removeAll();
            for (int i = 0; i < listNames().size();i++ )
            {
                listNamesListBox.add(listNames().get(i));
            }
        } catch (Exception ex) {
            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_updateSharesActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        try {        
            searchListBox.add(searchLowestValue());
        } catch (JAXBException_Exception ex) {
            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void listNamesListBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listNamesListBoxMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_listNamesListBoxMouseEntered

    private void convertBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertBtn1ActionPerformed
        String name = new String();
        int selectedCode = 0;
        name = listNamesListBox.getSelectedItem();
        selectedCode = jComboBox1.getSelectedIndex();
        String currency = new String();
        double newPrice = 0;
        String newCurrency = new String();
        int valueBefore = 0;
        try {
            currency = listCurrency(name);
            valueBefore = listPrice(name);
            newCurrency = getCurrencyCodes().get(selectedCode).substring(0, 3);
            newPrice = convert(currency,newCurrency,valueBefore);
            updateCurrencyPrice(newCurrency,newPrice,name);
        } catch (Exception ex) {
            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

 
        listNamesListBox.removeAll();
        detailsListBox.removeAll();
        try {
            for (int i = 0; i < listNames().size();i++ )
            {
                listNamesListBox.add(listNames().get(i));
            }
        } catch (Exception ex) {
            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_convertBtn1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        String name = new String();
        int selectedCode = 0;
        //name = listNamesListBox.getSelectedItem();
        selectedCode = jComboBox1.getSelectedIndex();
        String currency = new String();
        double newPrice = 0;
        String newCurrency = new String();
        int valueBefore = 0;
        try {
            for (int i =0; i < listNames().size();i++)
            {
                name = listNames().get(i);
                currency = listCurrency(name);
                valueBefore = listPrice(name);
                newCurrency = getCurrencyCodes().get(selectedCode).substring(0, 3);
                newPrice = convert(currency,newCurrency,valueBefore);
                updateCurrencyPrice(newCurrency,newPrice,name);
            }
        } catch (Exception ex) {
            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

 
        listNamesListBox.removeAll();
        detailsListBox.removeAll();
        try {
            for (int i = 0; i < listNames().size();i++ )
            {
                listNamesListBox.add(listNames().get(i));
            }
        } catch (Exception ex) {
            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
//        
//        try {
//            //Take all companies
//            //pass them through the currency converter
//            //pass output to update shares function
//            //write new file
//            //update listbox
//            //go again... etc.
//            int selectedCode = 0;
//            String name = new String();
//            String initCurr = new String();
//            String newCurr = new String();
//            double newPrice = 0;
//            for (int i=0; i < listNames().size() ; i++ )
//            {
//                selectedCode = jComboBox1.getSelectedIndex();
//                name = listNames().get(i);
//                initCurr = listCurrency(name);
//                System.out.println(name + " initCurr" + initCurr);
//                newPrice = convert(initCurr,newCurr,listPrice(name));
//                System.out.println("newPrice" + newPrice);
//                newCurr = getCurrencyCodes().get(selectedCode).substring(0, 3);
//                System.out.println("newCurr:" + newCurr);
//                updateCurrencyPrice(newCurr,newPrice,name);
//            }
//            listNamesListBox.removeAll();
//            detailsListBox.removeAll();
//            for (int i = 0; i < listNames().size();i++ )
//            {
//                listNamesListBox.add(listNames().get(i));
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(ShareClientGUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_button2ActionPerformed

    private void detailsListBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsListBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsListBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShareClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShareClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShareClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShareClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShareClientGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField ConvertedField;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button convertBtn1;
    private java.awt.List detailsListBox;
    private java.awt.Button highPriceBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Button listNamesBtn;
    private java.awt.List listNamesListBox;
    private java.awt.TextField nameSearchField;
    private java.awt.TextField newSharesField;
    private java.awt.Button saveConvertCurr;
    private java.awt.List searchListBox;
    private java.awt.Button searchNameBtn1;
    private java.awt.Button searchSymbolBtn;
    private java.awt.TextField symbolSearchField;
    private java.awt.Button updateShares;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<java.lang.String> listNames() throws Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.listNames();
    }

    private static String listSymbol(java.lang.String arg0) throws Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.listSymbol(arg0);
    }

    private static int listAvailableShares(java.lang.String arg0) throws Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.listAvailableShares(arg0);
    }

    private static String listCurrency(java.lang.String arg0) throws Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.listCurrency(arg0);
    }

    private static int listPrice(java.lang.String arg0) throws Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.listPrice(arg0);
    }

    private static String searchName(java.lang.String arg0) throws Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.searchName(arg0);
    }

    private static String searchBySymbol(java.lang.String arg0) throws Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.searchBySymbol(arg0);
    }

    private static String searchHighestPrice() throws Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.searchHighestPrice();
    }

    private static double convert(java.lang.String arg0, java.lang.String arg1, int arg2) {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.convert(arg0, arg1, arg2);
    }


    
  public static void JSON() throws MalformedURLException, IOException, ParseException{
       URL url = new URL("https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=MSFT&apikey=VIQKMWQYY1TF44IM&datatype=JSON");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 
        conn.setRequestMethod("GET");
        conn.connect(); 
        String inline = new String();
        Gson n = new Gson();
        int responsecode = conn.getResponseCode(); 
        if(responsecode != 200) throw new RuntimeException("HttpResponseCode: " +responsecode);
        else
        {
            Scanner sc = new Scanner(url.openStream());
            while(sc.hasNext())
            {
                inline +=sc.nextLine();
            }
            System.out.println("\nJSON data in string format");
            System.out.println(inline);
            sc.close();
        }
        n.toJson(inline);
         JSONParser parse = new JSONParser(); 
         JSONObject jobj = (JSONObject)parse.parse(inline);
         JSONArray jsonarr_1 = (JSONArray) jobj.get("Meta Data");
         //Get data for Results array
         for(int i=0;i<jsonarr_1.size();i++)
         {

//Store the JSON objects in an array

//Get the index of the JSON object and print the values as per the index
             JSONObject jsonobj_1 = (JSONObject)jsonarr_1.get(i);
             System.out.println("Elements under results array");

            
             System.out.println("\nPlace id: " +jsonobj_1.get("Symbol"));
             System.out.println("open: " +jsonobj_1.get("open"));

}
         
        
 
}

    private static java.util.List<java.lang.String> getCurrencyCodes() {
        docwebservices.CurrencyConversionWSService service = new docwebservices.CurrencyConversionWSService();
        docwebservices.CurrencyConversionWS port = service.getCurrencyConversionWSPort();
        return port.getCurrencyCodes();
    }
    
    private static DefaultComboBoxModel getArray(){
        String[] arr = new String[getCurrencyCodes().size()];
        for (int i=0; i < getCurrencyCodes().size(); i++)
        {
            arr[i] = getCurrencyCodes().get(i);
        }
        DefaultComboBoxModel f = new DefaultComboBoxModel(arr);
        return f;
    }

    private static UpdateSharesResponse.Return updateShares(java.lang.String arg0, int arg1) throws FileNotFoundException_Exception, JAXBException_Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.updateShares(arg0, arg1);
    }

    private static ListSharesResponse.Return listShares() throws JAXBException_Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.listShares();
    }


    private static UpdateCurrencyPriceResponse.Return updateCurrencyPrice(java.lang.String arg0, double arg1, java.lang.String arg2) throws JAXBException_Exception, FileNotFoundException_Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.updateCurrencyPrice(arg0, arg1, arg2);
    }

    private static String searchLowestValue() throws JAXBException_Exception {
        shares.ShareBroker_Service service = new shares.ShareBroker_Service();
        shares.ShareBroker port = service.getShareBrokerPort();
        return port.searchLowestValue();
    }



    
}
   
