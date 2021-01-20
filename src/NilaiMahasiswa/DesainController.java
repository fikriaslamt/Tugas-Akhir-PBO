/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiMahasiswa;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    private TableView<?> tabelnilai;

    @FXML
    private TableColumn<?, ?> kolomnpm;

    @FXML
    private TableColumn<?, ?> kolomnama;

    @FXML
    private TableColumn<?, ?> kolommk;

    @FXML
    private TableColumn<?, ?> kolomdosen;

    @FXML
    private TableColumn<?, ?> kolomnilai;

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
    private TableView<?> tabelnilai2;

    @FXML
    private TableColumn<?, ?> kolomnpm2;

    @FXML
    private TableColumn<?, ?> kolomnama2;

    @FXML
    private TableColumn<?, ?> kolommk2;

    @FXML
    private TableColumn<?, ?> kolomasdos2;

    @FXML
    private TableColumn<?, ?> kolomnilai2;

    @FXML
    void HandleClear(ActionEvent event) {

    }

    @FXML
    void handleInput(ActionEvent event) {

    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
