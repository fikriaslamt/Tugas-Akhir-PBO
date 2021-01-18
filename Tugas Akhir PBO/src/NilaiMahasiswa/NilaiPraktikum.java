/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiMahasiswa;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ASUS
 */
public class NilaiPraktikum extends Nilai{
    StringProperty asdos;

    public NilaiPraktikum(Integer npm, String nama, String mk,String asdos, Double nilai) {
        super(npm, nama, mk, nilai);
        this.asdos = new SimpleStringProperty(asdos);
    }
    
    
}
