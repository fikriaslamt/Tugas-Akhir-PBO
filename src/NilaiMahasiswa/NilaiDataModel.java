
package NilaiMahasiswa;

import NilaiMahasiswa.DB.DBHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class NilaiDataModel {
    
    final Connection con;

    public NilaiDataModel(String driver) throws SQLException {
        
        this.con = DBHelper.getConnection(driver);
        
    }
    
    public void InputNilai (NilaiDosen dosen) throws SQLException{
        
        String insertNilai = "INSERT INTO nilai (npm, nama, mk, nilai) VALUES (?,?,?,?)";
        String insertNilaiDosen = "INSERT INTO nilaidosen (npm, dosen) VALUES (?,?)";
        
        PreparedStatement nNilai = con.prepareStatement(insertNilai);
        nNilai.setInt(1,dosen.getNpm());
        nNilai.setString(2,dosen.getNama());
        nNilai.setString(3,dosen.getMk());
        nNilai.setDouble(4,dosen.getNilai());
        nNilai.execute();
        
        PreparedStatement nNilaiDosen = con.prepareStatement(insertNilaiDosen);
        nNilaiDosen.setInt(1,dosen.getNpm());
        nNilaiDosen.setString(2,dosen.getDosen());
        nNilaiDosen.execute();
        
    }
    
    public void InputNilai(NilaiPraktikum prak) throws SQLException{
        String insertNilai = "INSERT INTO nilai (npm, nama, mk, nilai) VALUES (?,?,?,?)";
        String insertNilaiPraktikum = "INSERT INTO nilaipraktikum (npm, asdos) VALUES (?,?)";
        
        PreparedStatement nNilai = con.prepareStatement(insertNilai);
        nNilai.setInt(1,prak.getNpm());
        nNilai.setString(2,prak.getNama());
        nNilai.setString(3,prak.getMk());
        nNilai.setDouble(4,prak.getNilai());
        nNilai.execute();
        
        PreparedStatement nNilaiPraktikum = con.prepareStatement(insertNilaiPraktikum);
        nNilaiPraktikum.setInt(1,prak.getNpm());
        nNilaiPraktikum.setString(2,prak.getAsdos());
        nNilaiPraktikum.execute();
        
    }
    
    
    
     public ObservableList<NilaiDosen> getNilaiDosenbaru(){
        ObservableList<NilaiDosen> data = FXCollections.observableArrayList();
        String sql="SELECT `npm`, `nama`,`mk`, `dosen`, `nilai` "
                + "FROM `nilai` NATURAL JOIN `nilaidosen` "
                + "ORDER BY npm";
        try {
            ResultSet rs = con.createStatement().executeQuery(sql);
             while (rs.next()){
                data.add(new NilaiDosen(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5)));
             }
            }catch (SQLException ex) {
            Logger.getLogger(NilaiDataModel.class.getName()).log(Level.SEVERE, null, ex);
        }     
        return data;
    }
    
    
     public ObservableList<NilaiPraktikum> getNilaiAsdosbaru(){
        ObservableList<NilaiPraktikum> data = FXCollections.observableArrayList();
        String sql="SELECT `npm`, `nama`,`mk`, `asdos`, `nilai` "
                + "FROM `nilai` NATURAL JOIN `nilaipraktikum` "
                + "ORDER BY npm";
        try {
            ResultSet rs = con.createStatement().executeQuery(sql);
             while (rs.next()){
                data.add(new NilaiPraktikum(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5)));
             }
            }catch (SQLException ex) {
            Logger.getLogger(NilaiDataModel.class.getName()).log(Level.SEVERE, null, ex);
        }     
        return data;
    }
    

    
    
    
}
