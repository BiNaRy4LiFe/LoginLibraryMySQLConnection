/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author HomePC
 */
public class MainClass extends Application {

        @Override
        public void start(Stage s) throws Exception {
            try {
                s.setTitle("Login Page");
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/login/Login.fxml"));
                s.getIcons().add(new Image("/com/icons/loginPicture.png"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                s.setScene(scene);
                s.show();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        public static void main(String args[]) {
            launch(args);
        }
    }