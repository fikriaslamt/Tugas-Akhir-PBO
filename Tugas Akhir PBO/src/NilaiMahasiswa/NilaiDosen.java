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
public class NilaiDosen extends Nilai{
    StringProperty dosen;

    public NilaiDosen(Integer npm, String nama, String mk, String dosen, Double nilai) {
        super(npm, nama, mk, nilai);
        this.dosen = new SimpleStringProperty(dosen);
    }

    public String getDosen() {
        return dosen.get();
    }

    public void setDosen(String dosen) {
        this.dosen.set(dosen);
    }
    
    
    
    
}
