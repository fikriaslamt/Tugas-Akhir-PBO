/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiMahasiswa;

import NilaiMahasiswa.DB.DBHelper;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ASUS
 */
public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        
        try {
            
            
//            NilaiDataModel ndm = new NilaiDataModel("MYSQL");
//            NilaiDosen nd = new NilaiDosen(1,"Fikri","pbo","didik",3.5);
//            ndm.Input(nd);
//            System.out.println("input sukses");
            //   launch(args);
           if(DBHelper.getConnection("MYSQL") != null) {
            System.out.println("sukses");
        }
           else
           {System.out.println("gagal");}
            
          
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
}
