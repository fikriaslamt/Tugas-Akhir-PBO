/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiMahasiswa;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ASUS
 */
public abstract class Nilai {
    
    private IntegerProperty npm;
    private StringProperty nama;
    private StringProperty mk;
    private DoubleProperty nilai;

    public Nilai(Integer npm, String nama, String mk, Double nilai) {
        this.npm = new SimpleIntegerProperty(npm);
        this.nama = new SimpleStringProperty(nama);
        this.mk = new SimpleStringProperty(mk);
        this.nilai = new SimpleDoubleProperty(nilai);
    }

    public Integer getNpm() {
        return npm.get();
    }

    public void setNpm(Integer npm) {
        this.npm.set(npm);
    }
    
    public String getNama() {
        return nama.get();
    }

    public void setNama(String nama) {
        this.nama.set(nama);
    }
    
    public String getMk() {
        return mk.get();
    }

    public void setMk(String mk) {
        this.mk.set(mk);
    }

    public Double getNilai() {
        return nilai.get();
    }

    public void setNilai(Double nilai) {
        this.nilai.set(nilai);
    }
    
    
    public IntegerProperty npmProperty(){
        return npm;
    }
    
    public StringProperty namaProperty(){
        return nama;
    }
    
    public StringProperty mkProperty(){
        return mk;
    }
    
    public DoubleProperty nilaiProperty(){
        return nilai;
    }

 
}
