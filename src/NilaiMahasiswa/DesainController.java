/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiMahasiswa;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.ConditionalFeature.FXML;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class DesainController implements Initializable {

   
     @FXML
    private Tab tabnilaidosen;

    @FXML
    private TextField tfnama;

    @FXML
    private TextField tfmk;

    @FXML
    private TextField tfnilai;

    @FXML
    private Button btninput;

    @FXML
    private Button btnclear;

    @FXML
    private TextField tfnpm;

    @FXML
    private TextField tfdosen;

    @FXML
    private TableView<NilaiDosen> tabelnilai;

    @FXML
    private TableColumn<NilaiDosen,Integer> kolomnpm;

    @FXML
    private TableColumn<NilaiDosen, String> kolomnama;

    @FXML
    private TableColumn<NilaiDosen, String> kolommk;

    @FXML
    private TableColumn<NilaiDosen, String> kolomdosen;

    @FXML
    private TableColumn<NilaiDosen, Double> kolomnilai;

    @FXML
    private Label notif1;
    
    @FXML
    private Label led1;
    
    @FXML
    private Tab tabnilaipraktikum;

    @FXML
    private TextField tfnpm2;

    @FXML
    private TextField tfmk2;

    @FXML
    private TextField tfasdos;

    @FXML
    private Button btninput2;

    @FXML
    private Button btnclear2;

    @FXML
    private TextField tfnama2;

    @FXML
    private TextField tfnilai2;

    @FXML
    private TableView<NilaiPraktikum> tabelnilai2;
    

    @FXML
    private Label notif2;
    
   
    
    @FXML
    private Label led2;
    
    @FXML
    private TableColumn<NilaiPraktikum, Integer> kolomnpm2;

    @FXML
    private TableColumn<NilaiPraktikum, String> kolomnama2;

    @FXML
    private TableColumn<NilaiPraktikum, String> kolommk2;

    @FXML
    private TableColumn<NilaiPraktikum, String> kolomasdos2;

    @FXML
    private TableColumn<NilaiPraktikum, String> kolomnilai2;

    private NilaiDataModel mdm;
     @FXML
    void HandleClear(ActionEvent event) {
//            ObservableList<NilaiDosen> data = mdm.getNilaiDosenbaru();
//            kolomnpm.setCellValueFactory(new PropertyValueFactory<>("npm"));
//            kolomnama.setCellValueFactory(new PropertyValueFactory<>("nama"));
//            kolommk.setCellValueFactory(new PropertyValueFactory<>("mk"));
//            kolomdosen.setCellValueFactory(new PropertyValueFactory<>("dosen"));
//            kolomnilai.setCellValueFactory(new PropertyValueFactory<>("nilai"));
//            tabelnilai.setItems(null);
//            tabelnilai.setItems(data);
    }

    @FXML
    void HandleClear2(ActionEvent event) {
           
    }

    @FXML
    void handleInput(ActionEvent event) {
            NilaiDosen dosen = new NilaiDosen(Integer.parseInt(tfnpm.getText()),tfnama.getText(),tfmk.getText(),tfdosen.getText(),Double.parseDouble(tfnilai.getText()));
            
         try {
             
            mdm.InputNilai(dosen);
        
            notif1.setText("Input Berhasil");
            
            
             
             
             tfnpm.setText("");
             tfnama.setText("");
             tfmk.setText("");
             tfdosen.setText("");
             tfnilai.setText("");
             
         } catch (SQLException ex) {
             notif1.setText("Input Gagal"); 
             Logger.getLogger(DesainController.class.getName()).log(Level.SEVERE, null, ex);
             
         }
    }

    @FXML
    void handleInput2(ActionEvent event) {
            NilaiPraktikum prak = new NilaiPraktikum(Integer.parseInt(tfnpm2.getText()),tfnama2.getText(),tfmk2.getText(),tfasdos.getText(),Double.parseDouble(tfnilai2.getText()));
            
         try {
             mdm.InputNilai(prak);
             notif2.setText("Input Berhasil");
             tfnpm2.setText("");
             tfnama2.setText("");
             tfmk2.setText("");
             tfasdos.setText("");
             tfnilai2.setText("");
             
             
         } catch (SQLException ex) {
             notif2.setText("Input Gagal"); 
             Logger.getLogger(DesainController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
   
         try {
             mdm = new NilaiDataModel("MYSQL");
             led1.setText("*");
             led2.setText("*");
         } catch (SQLException ex) {
             led1.setText("x");
             led2.setText("x");
             Logger.getLogger(DesainController.class.getName()).log(Level.SEVERE, null, ex);
         }

    }    
    
}
