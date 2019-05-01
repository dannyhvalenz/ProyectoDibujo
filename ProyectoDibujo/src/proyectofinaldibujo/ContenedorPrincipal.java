package proyectofinaldibujo;

import com.jfoenix.controls.JFXButton;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author dany
 */
public class ContenedorPrincipal extends Stage {
    private AnchorPane root, panelDibujo;
    private JFXButton btnDibujar, btnComparar;
    public ContenedorPrincipal () {
        root = new AnchorPane();
        Scene scene = new Scene(root, 560, 490);
        setScene(scene);
        
        configurarComponentes();
        configurarLineasRectas();
        configurarCurvas();
        configurarElipses();
    }

    private void configurarComponentes() {
        panelDibujo = new AnchorPane();
        panelDibujo.setPrefHeight(450);
        panelDibujo.setPrefWidth(300);
        panelDibujo.setLayoutX(0);
        panelDibujo.setLayoutY(50);
        
        ImageView imagenPrueba = new ImageView();
        imagenPrueba.setImage(new Image("/resources/phineasyferb.png"));
        imagenPrueba.setLayoutX(0);
        imagenPrueba.setLayoutY(0);
        imagenPrueba.setFitHeight(445);
        imagenPrueba.setFitWidth(270);
        panelDibujo.getChildren().add(imagenPrueba);
        
        btnDibujar = new JFXButton();
        btnDibujar.setText("Dibujar");
        btnDibujar.setLayoutX(10);
        btnDibujar.setLayoutY(10);
        btnDibujar.setOnAction(evt -> {
//            configurarLineasRectas();
//            configurarCurvas();
//            configurarElipses();
        });
        
        
        btnComparar = new JFXButton();
        btnComparar.setText("Comparar");
        btnComparar.setLayoutX(100);
        btnComparar.setLayoutY(10);
        btnComparar.setOnAction(evt -> {
            ImageView imagenOriginal = new ImageView();
            imagenOriginal.setImage(new Image("/resources/phineasyferb.png"));
            imagenOriginal.setLayoutX(290);
            imagenOriginal.setLayoutY(0);
            imagenOriginal.setFitHeight(445);
            imagenOriginal.setFitWidth(270);
            panelDibujo.getChildren().add(imagenOriginal);
        });
        
        Label nombre = new Label("Daniela Hernandez Valenzuela"); 
        nombre.setLayoutX(200);
        nombre.setLayoutY(15);
        
        root.getChildren().addAll(panelDibujo, btnDibujar, btnComparar, nombre);
    }

    private void configurarLineasRectas() {
        Line linea1 = new Line();
        linea1.setStartX(51);
        linea1.setStartY(51);
        linea1.setEndX(51);
        linea1.setEndY(495);
        linea1.setStrokeWidth(2);
        linea1.setStroke(Color.RED);
        
        Line linea2 = new Line();
        linea2.setStartX(51);
        linea2.setStartY(210);
        linea2.setEndX(99);
        linea2.setEndY(111);
        linea2.setStrokeWidth(2);
        linea2.setStroke(Color.RED);
        
        root.getChildren().addAll(linea1, linea2);
        
    }

    private void configurarCurvas() {
        
    }

    private void configurarElipses() {
        
    }
}
