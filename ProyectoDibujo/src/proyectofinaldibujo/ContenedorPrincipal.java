package proyectofinaldibujo;

import com.jfoenix.controls.JFXButton;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
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
        scene.getStylesheets().add(getClass().getResource("/view/styles.css").toExternalForm());
        setScene(scene);
        
        root.getStyleClass().add("fondo");
        
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
        btnDibujar.getStyleClass().add("dibujar");
        btnDibujar.setLayoutX(10);
        btnDibujar.setLayoutY(10);
        btnDibujar.setOnAction(evt -> {
//            configurarLineasRectas();
//            configurarCurvas();
//            configurarElipses();
        });
        
        
        btnComparar = new JFXButton();
        btnComparar.setText("Comparar");
        btnComparar.getStyleClass().add("comparar");
        btnComparar.setLayoutX(100);
        btnComparar.setLayoutY(10);
        btnComparar.setOnAction(evt -> {
            imagenPrueba.setVisible(false);
            
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
        
        Line linea14 = new Line();
        linea14.setStartX(51);
        linea14.setStartY(455);
        linea14.setEndX(62);
        linea14.setEndY(464);
        linea14.setStrokeWidth(2);
        linea14.setStroke(Color.RED);
        root.getChildren().add(linea14);
    }

    private void configurarCurvas() {
        QuadCurve curva1 = new QuadCurve();
        curva1.setStartX(91);
        curva1.setStartY(344);
        curva1.setEndX(133);
        curva1.setEndY(398);
        curva1.setControlX(120);
        curva1.setControlY(394);
        curva1.setStrokeWidth(2);
        curva1.setStroke(Color.RED);
        curva1.setFill(Color.TRANSPARENT);
        root.getChildren().add(curva1);
        
        QuadCurve curva2 = new QuadCurve();
        curva2.setStartX(90);
        curva2.setStartY(344);
        curva2.setEndX(100);
        curva2.setEndY(408);
        curva2.setControlX(80);
        curva2.setControlY(390);
        curva2.setStrokeWidth(2);
        curva2.setStroke(Color.RED);
        curva2.setFill(Color.TRANSPARENT);
        root.getChildren().add(curva2);
        
        QuadCurve curva3 = new QuadCurve();
        curva3.setStartX(51);
        curva3.setStartY(321);
        curva3.setEndX(59);
        curva3.setEndY(403);
        curva3.setControlX(70);
        curva3.setControlY(380);
        curva3.setStrokeWidth(2);
        curva3.setStroke(Color.RED);
        curva3.setFill(Color.TRANSPARENT);
        root.getChildren().add(curva3);
        
        QuadCurve curva4 = new QuadCurve();
        curva4.setStartX(132);
        curva4.setStartY(228);
        curva4.setEndX(156);
        curva4.setEndY(194);
        curva4.setControlX(150);
        curva4.setControlY(220);
        curva4.setStrokeWidth(2);
        curva4.setStroke(Color.RED);
        curva4.setFill(Color.TRANSPARENT);
        root.getChildren().add(curva4);
        
        QuadCurve curva5 = new QuadCurve();
        curva5.setStartX(95);
        curva5.setStartY(245);
        curva5.setEndX(109);
        curva5.setEndY(211);
        curva5.setControlX(96);
        curva5.setControlY(220);
        curva5.setStrokeWidth(2);
        curva5.setStroke(Color.RED);
        curva5.setFill(Color.TRANSPARENT);
        root.getChildren().add(curva5);
        
        QuadCurve curva6 = new QuadCurve();
        curva6.setStartX(81);
        curva6.setStartY(234);
        curva6.setEndX(96);
        curva6.setEndY(245);
        curva6.setControlX(85);
        curva6.setControlY(240);
        curva6.setStrokeWidth(2);
        curva6.setStroke(Color.RED);
        curva6.setFill(Color.TRANSPARENT);
        root.getChildren().add(curva6);
        
        QuadCurve curva7 = new QuadCurve();
        curva7.setStartX(102);
        curva7.setStartY(401);
        curva7.setEndX(113);
        curva7.setEndY(387);
        curva7.setControlX(106);
        curva7.setControlY(384);
        curva7.setStrokeWidth(2);
        curva7.setStroke(Color.RED);
        curva7.setFill(Color.TRANSPARENT);
        root.getChildren().add(curva7);
        
        QuadCurve curva8 = new QuadCurve();
        curva8.setStartX(58);
        curva8.setStartY(423);
        curva8.setEndX(59);
        curva8.setEndY(473);
        curva8.setControlX(87);
        curva8.setControlY(405);
        curva8.setStrokeWidth(2);
        curva8.setStroke(Color.RED);
        curva8.setFill(Color.TRANSPARENT);
        root.getChildren().add(curva8);
        
        QuadCurve lenguaP = new QuadCurve();
        lenguaP.setStartX(87);
        lenguaP.setStartY(367);
        lenguaP.setEndX(97);
        lenguaP.setEndY(395);
        lenguaP.setControlX(100);
        lenguaP.setControlY(370);
        lenguaP.setStrokeWidth(2);
        lenguaP.setStroke(Color.RED);
        lenguaP.setFill(Color.TRANSPARENT);
        root.getChildren().add(lenguaP);

        CubicCurve ojoFerb2 = new CubicCurve();
        ojoFerb2.setStartX(134);
        ojoFerb2.setStartY(151);
        ojoFerb2.setEndX(148);
        ojoFerb2.setEndY(186);
        ojoFerb2.setControlX1(152);
        ojoFerb2.setControlY1(130);
        ojoFerb2.setControlX2(180);
        ojoFerb2.setControlY2(144);
        ojoFerb2.setStrokeWidth(2);
        ojoFerb2.setStroke(Color.RED);
        ojoFerb2.setFill(Color.TRANSPARENT);
        root.getChildren().add(ojoFerb2);
        
        CubicCurve orejaPhineas = new CubicCurve();
        orejaPhineas.setStartX(67);
        orejaPhineas.setStartY(357);
        orejaPhineas.setEndX(65);
        orejaPhineas.setEndY(345);
        orejaPhineas.setControlX1(51);
        orejaPhineas.setControlY1(375);
        orejaPhineas.setControlX2(43);
        orejaPhineas.setControlY2(334);
        orejaPhineas.setStrokeWidth(2);
        orejaPhineas.setStroke(Color.RED);
        orejaPhineas.setFill(Color.WHITE);
        root.getChildren().add(orejaPhineas);
        
        CubicCurve orejaFerb = new CubicCurve();
        orejaFerb.setStartX(71);
        orejaFerb.setStartY(175);
        orejaFerb.setEndX(78);
        orejaFerb.setEndY(159);
        orejaFerb.setControlX1(44);
        orejaFerb.setControlY1(172);
        orejaFerb.setControlX2(69);
        orejaFerb.setControlY2(141);
        orejaFerb.setStrokeWidth(2);
        orejaFerb.setStroke(Color.RED);
        orejaFerb.setFill(Color.WHITE);
        root.getChildren().add(orejaFerb);
        
        CubicCurve ojoPhineas2 = new CubicCurve();
        ojoPhineas2.setStartX(158);
        ojoPhineas2.setStartY(342);
        ojoPhineas2.setEndX(129);
        ojoPhineas2.setEndY(311);
        ojoPhineas2.setControlX1(165);
        ojoPhineas2.setControlY1(332);
        ojoPhineas2.setControlX2(151);
        ojoPhineas2.setControlY2(306);
        ojoPhineas2.setStrokeWidth(2);
        ojoPhineas2.setStroke(Color.RED);
        ojoPhineas2.setFill(Color.TRANSPARENT);
        root.getChildren().add(ojoPhineas2);
        
        CubicCurve cabelloFerb1 = new CubicCurve();
        cabelloFerb1.setStartX(182);
        cabelloFerb1.setStartY(168);
        cabelloFerb1.setEndX(172);
        cabelloFerb1.setEndY(85);
        cabelloFerb1.setControlX1(212);
        cabelloFerb1.setControlY1(123);
        cabelloFerb1.setControlX2(186);
        cabelloFerb1.setControlY2(86);
        cabelloFerb1.setStrokeWidth(2);
        cabelloFerb1.setStroke(Color.RED);
        cabelloFerb1.setFill(Color.TRANSPARENT);
        root.getChildren().add(cabelloFerb1);
    }

    private void configurarElipses() {
        Ellipse ojoFerb1 = new Ellipse();
        ojoFerb1.setCenterX(116);
        ojoFerb1.setCenterY(157);
        ojoFerb1.setRadiusX(17);
        ojoFerb1.setRadiusY(19);
        ojoFerb1.setFill(Color.WHITE);
        ojoFerb1.setStroke(Color.RED);
        ojoFerb1.setFill(Color.TRANSPARENT);
        ojoFerb1.setStrokeWidth(2);
        
        root.getChildren().add(ojoFerb1);
    }
}
