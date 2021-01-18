
package NilaiMahasiswa;

import NilaiMahasiswa.DB.DBHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class NilaiDataModel {
    
    private final Connection con;

    public NilaiDataModel(String driver) throws SQLException {
        
        this.con = DBHelper.getConnection(driver);
        
    }
    
    public void Input(NilaiDosen data) throws SQLException{
        
        String insertNilai = "INSERT INTO nilai (npm, nama, mk, nilai)" + "VALUES (?,?,?,?)";
        String insertNilaiDosen = "INSERT INTO nilaidosen (npm, dosen)" + "VALUES (?,?)";
        
        PreparedStatement nNilai = con.prepareStatement(insertNilai);
        nNilai.setInt(1,data.getNpm());
        nNilai.setString(2,data.getNama());
        nNilai.setString(3,data.getMk());
        nNilai.setDouble(5,data.getNilai());
        nNilai.execute();
        
        PreparedStatement nNilaiDosen = con.prepareStatement(insertNilaiDosen);
        nNilaiDosen.setInt(1,data.getNpm());
        nNilaiDosen.setString(4,data.getDosen());
        nNilaiDosen.execute();
        
    }
    
    public void InputNilai(NilaiPraktikum data){
        
    }
    
    
    
}
