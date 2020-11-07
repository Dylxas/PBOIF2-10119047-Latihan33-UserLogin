/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan33.userlogin;

import data.logIn;
import java.util.Scanner;

/**
 *
 * @author Aldy
 */
public class PBOIF210119047Latihan33UserLogin {
    private static String userName;
    private static String PassWord;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
                System.out.print("Masukkan Username = ");
        userName = input.next();
        
        System.out.print("Masukkan Password = ");
        PassWord = input.next();
        
        logIn userLogin = new logIn();
        
        System.out.println("");
        userLogin.cekLogin(userName, PassWord);
    }
    
}
