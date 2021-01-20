
package NilaiMahasiswa;

import NilaiMahasiswa.DB.DBHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class NilaiDataModel {
    
    private final Connection con;

    public NilaiDataModel(String driver) throws SQLException {
        
        this.con = DBHelper.getConnection(driver);
        
    }
    
    public void Input(NilaiDosen data) throws SQLException{
        
        String insertNilai = "INSERT INTO nilai (npm, nama, mk, nilai)" + " VALUES (?,?,?,?)";
        String insertNilaiDosen = "INSERT INTO nilaidosen (npm, dosen)" + " VALUES (?,?)";
        
        PreparedStatement nNilai = con.prepareStatement(insertNilai);
        nNilai.setInt(1,data.getNpm());
        nNilai.setString(2,data.getNama());
        nNilai.setString(3,data.getMk());
        nNilai.setDouble(4,data.getNilai());
        nNilai.execute();
        
        PreparedStatement nNilaiDosen = con.prepareStatement(insertNilaiDosen);
        nNilaiDosen.setInt(1,data.getNpm());
        nNilaiDosen.setString(2,data.getDosen());
        nNilaiDosen.execute();
        
    }
    
    public void InputNilai(NilaiPraktikum data) throws SQLException{
        String insertNilai = "INSERT INTO nilai (npm, nama, mk, nilai)" + " VALUES (?,?,?,?)";
        String insertNilaiPraktikum = "INSERT INTO nilaipraktikum (npm, asdos)" + " VALUES (?,?)";
        
        PreparedStatement nNilai = con.prepareStatement(insertNilai);
        nNilai.setInt(1,data.getNpm());
        nNilai.setString(2,data.getNama());
        nNilai.setString(3,data.getMk());
        nNilai.setDouble(4,data.getNilai());
        nNilai.execute();
        
        PreparedStatement nNilaiPraktikum = con.prepareStatement(insertNilaiPraktikum);
        nNilaiPraktikum.setInt(1,data.getNpm());
        nNilaiPraktikum.setString(2,data.getAsdos());
        nNilaiPraktikum.execute();
        
    }
    

    
    
    
}
