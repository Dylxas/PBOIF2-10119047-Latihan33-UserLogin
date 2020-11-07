/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM LOGIN USER
 */

public class logIn {
    private String user;
    private String pass;
    private boolean status;
    
    private boolean akun(String parUser, String parPass){
        if(("RizkiAdam".equals(parUser))&&("terbaikselalu".equals(parPass))){
            status = true;
        }else{
            status = false;
        }
        return status;
        
    }
    
    private void hasil(boolean status, String parUser){
        if(status == true){
            System.out.println("******HALLO " + parUser + "******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else{
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    
        public void cekLogin(String parUser, String parPass){
        akun(parUser, parPass);
        hasil(status, parUser);
    }
    
}
