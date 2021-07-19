/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.heberajbal.sistema;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author informatica
 */
public class FXMLDocumentController implements Initializable {
    
    float dato1, dato2, resultado;
    int op;
    int pun =1;
    int real =1;
    
    
    
    @FXML private TextField txValores;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnCero;
    @FXML private Button btnMenos;
    @FXML private Button btnMas;
    @FXML private Button btnDiv;
    @FXML private Button btnMulti;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private Button btnUnodivx;
    @FXML private Button btnPunto;
    @FXML private Button btnMasMenos;
    @FXML private Button btnPorciento;
    @FXML private Button btnXalaY;
    @FXML private Button btnIgual;
  
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource()== btnUno ){
            txValores.setText(txValores.getText()+ "1");
            if (pun == 3)
                pun=3; 
            else if (pun !=3)
                pun=2;
            real=2;
        }else if (event.getSource() == btnDos ){
           txValores.setText(txValores.getText() + "2");
                if (pun == 3)
                pun=3; 
            else if (pun !=3)
                pun=2;
                real=2;
        
        }else if (event.getSource() == btnTres){
            txValores.setText(txValores.getText()+"3");
            if (pun == 3)
                pun=3; 
            else if (pun !=3)
                pun=2;
            real=2;
        
        }else if (event.getSource() == btnCuatro){
            txValores.setText(txValores.getText() + "4");
            if (pun == 3)
                pun=3; 
            else if (pun !=3)
                pun=2;
            real=2;
        
        }else if (event.getSource() == btnCinco){
            txValores.setText(txValores.getText() + "5");
            if (pun == 3)
                pun=3; 
            else if (pun !=3)
                pun=2;
            real=2;
        
        }else if (event.getSource() == btnSeis){
            txValores.setText(txValores.getText() + "6");
            if (pun == 3)
                pun=3; 
            else if (pun !=3)
                pun=2;
            real=2;
        
        }else if (event.getSource() == btnSiete){
            txValores.setText(txValores.getText() + "7");
            if (pun == 3)
                pun=3; 
            else if (pun !=3)
                pun=2;
            real=2;
        
        }else if (event.getSource() == btnOcho){
            txValores.setText(txValores.getText() + "8");
            if (pun == 3)
                pun=3; 
            else if (pun !=3)
                pun=2;
            real=2;
        
        }else if (event.getSource() == btnNueve){
            txValores.setText(txValores.getText() + "9");
            if (pun == 3)
                pun=3; 
            else if (pun !=3)
                pun=2;
            real=2;
        
        }else if (event.getSource() == btnCero){
            txValores.setText(txValores.getText() + "0");
            if (pun == 3)
                pun=3; 
            else if (pun !=3)
                pun=2;
            real=2;
        
        }else if (event.getSource() == btnPunto){
            switch(pun){
                case 1:
                    txValores.setText("0");
                    pun=3;
                   
                case 2:
                    txValores.setText(txValores.getText()+"."); 
                    pun=3;
                    
            }
            
            
       }else if (event.getSource() == btnMas){
           
            dato1 = Float.parseFloat(txValores.getText());
            txValores.setText("");
            op = 1; 
            pun= 1;
            real=2;
          
            
        }else if (event.getSource() == btnMenos){
            if(real == 1){
                txValores.setText("-");
            }else if(real == 2){
                dato1 = Float.parseFloat(txValores.getText());
                txValores.setText("");
            }
            op = 2;
            pun=1; 
     
            
        }else if (event.getSource() == btnMulti){
            dato1= Float.parseFloat(txValores.getText());
            txValores.setText("");
            op=3; 
            pun= 1;
            real=2;
        }else if (event.getSource() ==  btnDiv){
            dato1= Float.parseFloat(txValores.getText());
            txValores.setText(" ");
            op=4;
            pun= 1;
            real=2;
        
        
        
        
        }else if (event.getSource() == btnXalaY){
            dato1= Float.parseFloat(txValores.getText());
            txValores.setText("");
            op =5;
            pun= 1;
            
            
        }else if (event.getSource() == btnPorciento){
            dato2= Float.parseFloat(txValores.getText());
            txValores.setText("");
            resultado= ((dato2 /100) * dato1) ;
            txValores.setText(String.valueOf(resultado));
            pun= 1;
        
            
        }else if (event.getSource() == btnIgual){
            dato2 = Float.parseFloat(txValores.getText());
            txValores.setText(" ");
            
            
            switch(op){
                case 1: 
                    txValores.setText(" ");
                    resultado=0;
                   
                    resultado = dato1 + dato2;
                    
                    txValores.setText(String.valueOf(resultado)) ;
                    pun= 3;
                    real=2;
                    
                    break;
                    
                case 2:
                    resultado = dato1 - dato2;
                    txValores.setText(String.valueOf(resultado));
                    pun= 3;
                    real=2;
                    break;
                case 3:
                    resultado = dato1 * dato2;
                    txValores.setText(String.valueOf(resultado));
                    pun= 3;
                    real=2;
                    break;
                case 4:
                    resultado = dato1 / dato2;
                    txValores.setText(String.valueOf(resultado));
                    pun= 3;
                    real=2;
                    break;
                case 5:
                    resultado = 1;
                    for (int x = 1; x<= dato2; x++ ){
                
                        resultado = resultado*dato1;   
                    }
                        txValores.setText(String.valueOf(resultado));
                        pun=3;
                        real=2;
                    break;
                
            }
            
            
                    
        }else if (event.getSource() == btnMasMenos){
            
            resultado = Float.parseFloat(txValores.getText()) * -1;
            txValores.setText(String.valueOf(resultado)); 
            pun=3;
            real=2;
        }else if(event.getSource() == btnUnodivx){
            
            resultado = 1 / Float.parseFloat(txValores.getText());
            txValores.setText(String.valueOf(resultado));
            pun=1;
            real=2;
        
        }else if(event.getSource() == btnCE){
            
            txValores.setText("");
            pun=1;
            real=1;
        }else if (event.getSource() == btnC){
            
             txValores.setText("");
            dato1=0;
            dato2=0;
            resultado=0;
            pun=1;
            real=1;
        }
            
        
    }
   

@Override
    public void initialize(URL url, ResourceBundle rb) {     
        // TODO
    }  


    }
    
   
    

