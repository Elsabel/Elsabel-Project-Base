/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

/**
 *
 * @author Elsa
 */
public class Settings {
   
    public void cekNumber(KeyEvent evt,JLabel LabelNotif){
        if ((Character.isAlphabetic(evt.getKeyChar())) ){
            evt.consume();
            LabelNotif.setText("Masukkan angka");
        }
        else{
            LabelNotif.setText("");

        }
    }
    public void cekAlphabet(KeyEvent evt,JLabel LabelNotif){
        if ((Character.isAlphabetic(evt.getKeyChar())) ){
            evt.consume();
            LabelNotif.setText("");
        }
        else{
            LabelNotif.setText("Masukkan huruf");

        }
    }
}
