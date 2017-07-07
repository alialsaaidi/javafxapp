/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 *
 * @author umroot
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button node;
    @FXML
    private Button line;
    
    @FXML
    private AnchorPane pane_1;
    
    @FXML
    private AnchorPane pane_2;
    
    private boolean check;
    private boolean check2;
    @FXML
    private Button Guard;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleNode(ActionEvent event)  {
        check=true;
       
        
        if(event.getSource().equals(node)){
         pane_1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent me) -> {
            if(check==true){
            if(me.getButton().equals(MouseButton.PRIMARY)) {
                
                Circle circle = new Circle(me.getX(), me.getY(), 25, Color.BLUE);
                addEventHandler(pane_1, (Circle)circle);
                pane_1.getChildren().add(circle);
            }
           check=false; 
         }
                });
       
         
        }
     
                 
    }
    
    
    
    
    
    
    
    
    
    public void addEventHandler(AnchorPane parent, Object circle ) {
        node.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent me) -> {
            if(me.getButton().equals(MouseButton.SECONDARY)) {
                parent.getChildren().remove(node);
            }
        });
    }
     
    public void addEventHandlerline(AnchorPane parent, Object circle ) {
        line.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent me) -> {
            if(me.getButton().equals(MouseButton.SECONDARY)) {
                parent.getChildren().remove(line);
            }
        });
    }
    

    @FXML
    private void Handleline(ActionEvent event) {
        check2=true;
        
        pane_1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
            if(check2==true){
            if(e.getButton().equals(MouseButton.PRIMARY)) {
                Line line = new Line();
                
            
                
                
                line.setStartX(e.getX());
                line.setStartY(e.getY());
                
                pane_1.addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent de) -> {
                     if(de.getButton().equals(MouseButton.PRIMARY)) {
                    
                    line.setEndX(de.getX());
                    line.setEndY(de.getY());
                   
                     }
                
                } );
                
   
                //addEventHandlerline(pane_1, (Line)line);
                pane_1.getChildren().add(line);
                
            }
            check2=false;
            }
        });
        
        
        
    }

    @FXML
    private void handleGuard(ActionEvent event) {
    }

  
    
}
