/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas27;

import javax.ejb.Local;

/**
 *
 * @author Hunter
 */
@Local
public interface cariMahasiswaLocal {
    String search(String param);
}
