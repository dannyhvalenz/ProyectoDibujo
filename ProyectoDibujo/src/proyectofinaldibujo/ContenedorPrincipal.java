package proyectofinaldibujo;

import com.jfoenix.controls.JFXButton;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
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
        root.getChildren().add(linea1);
                
        Line linea2 = new Line();
        linea2.setStartX(51);
        linea2.setStartY(210);
        linea2.setEndX(99);
        linea2.setEndY(111);
        linea2.setStrokeWidth(2);
        linea2.setStroke(Color.RED);
        root.getChildren().add(linea2);
        
        Line linea3 = new Line();
        linea3.setStartX(51);
        linea3.setStartY(288);
        linea3.setEndX(214);
        linea3.setEndY(372);
        linea3.setStrokeWidth(2);
        linea3.setStroke(Color.RED);
        root.getChildren().add(linea3);
        
        Line linea4 = new Line();
        linea4.setStartX(133);
        linea4.setStartY(399);
        linea4.setEndX(214);
        linea4.setEndY(374);
        linea4.setStrokeWidth(2);
        linea4.setStroke(Color.RED);
        root.getChildren().add(linea4);
        
        Line linea5 = new Line();
        linea5.setStartX(125);
        linea5.setStartY(173);
        linea5.setEndX(156);
        linea5.setEndY(193);
        linea5.setStrokeWidth(2);
        linea5.setStroke(Color.RED);
        root.getChildren().add(linea5);
        
        Line linea6 = new Line();
        linea6.setStartX(107);
        linea6.setStartY(210);
        linea6.setEndX(132);
        linea6.setEndY(228);
        linea6.setStrokeWidth(2);
        linea6.setStroke(Color.RED);
        root.getChildren().add(linea6);
        
        Line linea7 = new Line();
        linea7.setStartX(68);
        linea7.setStartY(264);
        linea7.setEndX(85);
        linea7.setEndY(240);
        linea7.setStrokeWidth(2);
        linea7.setStroke(Color.RED);
        root.getChildren().add(linea7);
        
        Line linea8 = new Line();
        linea8.setStartX(162);
        linea8.setStartY(149);
        linea8.setEndX(170);
        linea8.setEndY(136);
        linea8.setStrokeWidth(2);
        linea8.setStroke(Color.RED);
        root.getChildren().add(linea8);
        
        Line linea9 = new Line();
        linea9.setStartX(88);
        linea9.setStartY(356);
        linea9.setEndX(122);
        linea9.setEndY(398);
        linea9.setStrokeWidth(2);
        linea9.setStroke(Color.RED);
        root.getChildren().add(linea9);
        
        Line linea10 = new Line();
        linea10.setStartX(123);
        linea10.setStartY(399);
        linea10.setEndX(127);
        linea10.setEndY(393);
        linea10.setStrokeWidth(2);
        linea10.setStroke(Color.RED);
        root.getChildren().add(linea10);
        
        Line linea11 = new Line();
        linea11.setStartX(90);
        linea11.setStartY(390);
        linea11.setEndX(102);
        linea11.setEndY(402);
        linea11.setStrokeWidth(2);
        linea11.setStroke(Color.RED);
        root.getChildren().add(linea11);
        
        Line linea12 = new Line();
        linea12.setStartX(102);
        linea12.setStartY(403);
        linea12.setEndX(97);
        linea12.setEndY(405);
        linea12.setStrokeWidth(2);
        linea12.setStroke(Color.RED);
        root.getChildren().add(linea12);
        
        Line linea13 = new Line();
        linea13.setStartX(52);
        linea13.setStartY(467);
        linea13.setEndX(58);
        linea13.setEndY(474);
        linea13.setStrokeWidth(2);
        linea13.setStroke(Color.RED);
        root.getChildren().add(linea13);
    }

    private void configurarCurvas() {
        
    }

    private void configurarElipses() {
        Ellipse ojoFerb1 = new Ellipse();
        ojoFerb1.setCenterX(116);
        ojoFerb1.setCenterY(157);
        ojoFerb1.setRadiusX(17);
        ojoFerb1.setRadiusY(19);
        ojoFerb1.setFill(Color.WHITE);
        ojoFerb1.setStroke(Color.RED);
        ojoFerb1.setStrokeWidth(2);
        
        root.getChildren().add(ojoFerb1);
    }
}
