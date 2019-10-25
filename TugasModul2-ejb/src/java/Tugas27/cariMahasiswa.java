/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas27;

import javax.ejb.Stateful;

/**
 *
 * @author Hunter
 */
@Stateful
public class cariMahasiswa implements cariMahasiswaLocal {

    String [] Nama = {"Praktikan 1", "Praktikan 2"};
    String [] Nim = {"21120116120009", "21120116120026"};
private String checkNama(String param){
    for (int i = 0; i < Nama.length; i++){
        if(param.equals(Nama[i])){
            return "Nama Praktikan : " +Nama[i]+"("+Nim[i]+")";
        }
    }
    return null;
}
private String checkNIM(String param){
    for (int i = 0; i < Nim.length; i++) {
        if(param.equals(Nim[i])){
            return "Nama Praktikan : " +Nama[i]+"("+Nim[i]+")";
        }
    }
    return null;
}

public String search(String param){
    if (checkNama(param) != null) {
        return checkNama(param);
    }
    else if (checkNIM(param) !=null) {
        return checkNIM(param);
    }
    else {
        return "Nope";
    }
};
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
