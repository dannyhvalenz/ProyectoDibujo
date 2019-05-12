package proyectofinaldibujo;

import com.jfoenix.controls.JFXButton;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ClosePath;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.QuadCurveTo;
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
        
    }

    private void configurarComponentes() {
        panelDibujo = new AnchorPane();
        panelDibujo.setPrefHeight(450);
        panelDibujo.setPrefWidth(300);
        panelDibujo.setLayoutX(0);
        panelDibujo.setLayoutY(50);
        
        btnDibujar = new JFXButton();
        btnDibujar.setText("Dibujar");
        btnDibujar.getStyleClass().add("dibujar");
        btnDibujar.setLayoutX(10);
        btnDibujar.setLayoutY(10);
        btnDibujar.setOnAction(evt -> {
            configurarPared();
            configurarPhineas();
            configurarFerb();
        });
        
        
        btnComparar = new JFXButton();
        btnComparar.setText("Comparar");
        btnComparar.getStyleClass().add("comparar");
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

    private void configurarPared() {
        Line pared = new Line();
        pared.setStartX(51);
        pared.setStartY(51);
        pared.setEndX(51);
        pared.setEndY(495);
        pared.setStrokeWidth(2);
        pared.setStroke(Color.BLACK);
        root.getChildren().add(pared);
    }

    private void configurarPhineas(){
        // SILUETA PHINEAS
        Line frentePhineas = new Line();
        frentePhineas.setStartX(51);
        frentePhineas.setStartY(288);
        frentePhineas.setEndX(214);
        frentePhineas.setEndY(372);
        frentePhineas.setStrokeWidth(2);
        frentePhineas.setStroke(Color.rgb(251,193,137));
        root.getChildren().add(frentePhineas);
        
        Line narizAbajoPhineas = new Line();
        narizAbajoPhineas.setStartX(133);
        narizAbajoPhineas.setStartY(399);
        narizAbajoPhineas.setEndX(214);
        narizAbajoPhineas.setEndY(374);
        narizAbajoPhineas.setStrokeWidth(2);
        narizAbajoPhineas.setStroke(Color.rgb(251,193,137));
        root.getChildren().add(narizAbajoPhineas);
        
        QuadCurve nucaPhineas = new QuadCurve();
        nucaPhineas.setStartX(51);
        nucaPhineas.setStartY(321);
        nucaPhineas.setEndX(59);
        nucaPhineas.setEndY(403);
        nucaPhineas.setControlX(70);
        nucaPhineas.setControlY(380);
        nucaPhineas.setStrokeWidth(2);
        nucaPhineas.setStroke(Color.rgb(251,193,137));
        nucaPhineas.setFill(Color.TRANSPARENT);
        root.getChildren().add(nucaPhineas);
        
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
        orejaPhineas.setStroke(Color.rgb(251,193,137));
        orejaPhineas.setFill(Color.WHITE);
        root.getChildren().add(orejaPhineas);
        
        QuadCurve cuelloPhineas = new QuadCurve();
        cuelloPhineas.setStartX(98);
        cuelloPhineas.setStartY(409);
        cuelloPhineas.setEndX(73);
        cuelloPhineas.setEndY(420);
        cuelloPhineas.setControlX(85);
        cuelloPhineas.setControlY(410);
        cuelloPhineas.setStrokeWidth(2);
        cuelloPhineas.setStroke(Color.rgb(251,193,137));
        cuelloPhineas.setFill(Color.TRANSPARENT);
        root.getChildren().add(cuelloPhineas);
        
        QuadCurve bocaArribaPhineas = new QuadCurve();
        bocaArribaPhineas.setStartX(91);
        bocaArribaPhineas.setStartY(344);
        bocaArribaPhineas.setEndX(133);
        bocaArribaPhineas.setEndY(398);
        bocaArribaPhineas.setControlX(120);
        bocaArribaPhineas.setControlY(394);
        bocaArribaPhineas.setStrokeWidth(2);
        bocaArribaPhineas.setStroke(Color.rgb(251,193,137));
        bocaArribaPhineas.setFill(Color.TRANSPARENT);
        root.getChildren().add(bocaArribaPhineas);
        
        QuadCurve bocaAbajoPhineas = new QuadCurve();
        bocaAbajoPhineas.setStartX(90);
        bocaAbajoPhineas.setStartY(344);
        bocaAbajoPhineas.setEndX(100);
        bocaAbajoPhineas.setEndY(408);
        bocaAbajoPhineas.setControlX(80);
        bocaAbajoPhineas.setControlY(390);
        bocaAbajoPhineas.setStrokeWidth(2);
        bocaAbajoPhineas.setStroke(Color.rgb(251,193,137));
        bocaAbajoPhineas.setFill(Color.TRANSPARENT);
        root.getChildren().add(bocaAbajoPhineas);
        
        // CAMISA PHINEAS
        Line camisaPhineas1 = new Line();
        camisaPhineas1.setStartX(52);
        camisaPhineas1.setStartY(467);
        camisaPhineas1.setEndX(58);
        camisaPhineas1.setEndY(474);
        camisaPhineas1.setStrokeWidth(1.5);
        camisaPhineas1.setStroke(Color.BLACK);
        root.getChildren().add(camisaPhineas1);
        
        Line rayaCamisaPhineas1 = new Line();
        rayaCamisaPhineas1.setStartX(53);
        rayaCamisaPhineas1.setStartY(432);
        rayaCamisaPhineas1.setEndX(70);
        rayaCamisaPhineas1.setEndY(444);
        rayaCamisaPhineas1.setStrokeWidth(2);
        rayaCamisaPhineas1.setStroke(Color.rgb(240,155,0));
        rayaCamisaPhineas1.setFill(Color.TRANSPARENT);
        root.getChildren().add(rayaCamisaPhineas1);
        
        Line rayaCamisaPhineas2 = new Line();
        rayaCamisaPhineas2.setStartX(53);
        rayaCamisaPhineas2.setStartY(455);
        rayaCamisaPhineas2.setEndX(62);
        rayaCamisaPhineas2.setEndY(461);
        rayaCamisaPhineas2.setStrokeWidth(2);
        rayaCamisaPhineas2.setStroke(Color.rgb(240,155,0));
        root.getChildren().add(rayaCamisaPhineas2);
        
        QuadCurve mangaPlayeraPhineas = new QuadCurve();
        mangaPlayeraPhineas.setStartX(58);
        mangaPlayeraPhineas.setStartY(423);
        mangaPlayeraPhineas.setEndX(59);
        mangaPlayeraPhineas.setEndY(473);
        mangaPlayeraPhineas.setControlX(87);
        mangaPlayeraPhineas.setControlY(405);
        mangaPlayeraPhineas.setStrokeWidth(1.5);
        mangaPlayeraPhineas.setStroke(Color.BLACK);
        mangaPlayeraPhineas.setFill(Color.TRANSPARENT);
        root.getChildren().add(mangaPlayeraPhineas);
        
        QuadCurve cuelloCamisaPhineas = new QuadCurve();
        cuelloCamisaPhineas.setStartX(59);
        cuelloCamisaPhineas.setStartY(403);
        cuelloCamisaPhineas.setEndX(65);
        cuelloCamisaPhineas.setEndY(418);
        cuelloCamisaPhineas.setControlX(58);
        cuelloCamisaPhineas.setControlY(410);
        cuelloCamisaPhineas.setStrokeWidth(2);
        cuelloCamisaPhineas.setStroke(Color.rgb(240,155,0));
        cuelloCamisaPhineas.setFill(Color.TRANSPARENT);
        root.getChildren().add(cuelloCamisaPhineas);
        
        CubicCurve cuelloCamisaPhineas2 = new CubicCurve();
        cuelloCamisaPhineas2.setStartX(56);
        cuelloCamisaPhineas2.setStartY(423);
        cuelloCamisaPhineas2.setEndX(59);
        cuelloCamisaPhineas2.setEndY(403);
        cuelloCamisaPhineas2.setControlX1(50);
        cuelloCamisaPhineas2.setControlY1(410);
        cuelloCamisaPhineas2.setControlX2(50);
        cuelloCamisaPhineas2.setControlY2(405);
        cuelloCamisaPhineas2.setStrokeWidth(2);
        cuelloCamisaPhineas2.setStroke(Color.BLACK);
        cuelloCamisaPhineas2.setFill(Color.TRANSPARENT);
        root.getChildren().add(cuelloCamisaPhineas2);
        
        // OJOS PHINEAS
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
        ojoPhineas2.setStroke(Color.BLACK);
        ojoPhineas2.setFill(Color.TRANSPARENT);
        root.getChildren().add(ojoPhineas2);
        
        
        CubicCurve pupilaPhineas3 = new CubicCurve();
        pupilaPhineas3.setStartX(150);
        pupilaPhineas3.setStartY(338);
        pupilaPhineas3.setEndX(132);
        pupilaPhineas3.setEndY(329);
        
        pupilaPhineas3.setControlX1(149);
        pupilaPhineas3.setControlY1(320);
        
        pupilaPhineas3.setControlX2(139);
        pupilaPhineas3.setControlY2(320);
        pupilaPhineas3.setStrokeWidth(2);
        pupilaPhineas3.setStroke(Color.MIDNIGHTBLUE);
        pupilaPhineas3.setFill(Color.MIDNIGHTBLUE);
        root.getChildren().add(pupilaPhineas3);
        
        Ellipse pupilaBlanca2 = new Ellipse();
        pupilaBlanca2.setCenterX(141);
        pupilaBlanca2.setCenterY(328);
        pupilaBlanca2.setRadiusX(2.5);
        pupilaBlanca2.setRadiusY(2.5);
        pupilaBlanca2.setFill(Color.WHITE);
        pupilaBlanca2.setStrokeWidth(2);
        pupilaBlanca2.setRotate(30);
        root.getChildren().add(pupilaBlanca2);
        
        Ellipse ojoPhineas1 = new Ellipse();
        ojoPhineas1.setCenterX(115);
        ojoPhineas1.setCenterY(328);
        ojoPhineas1.setRadiusX(25);
        ojoPhineas1.setRadiusY(21);
        ojoPhineas1.setFill(Color.WHITE);
        ojoPhineas1.setStroke(Color.BLACK);
        ojoPhineas1.setStrokeWidth(2);
        ojoPhineas1.setRotate(30);
        root.getChildren().add(ojoPhineas1);
        
        Ellipse pupilaPhineas1 = new Ellipse();
        pupilaPhineas1.setCenterX(113);
        pupilaPhineas1.setCenterY(328);
        pupilaPhineas1.setRadiusX(6.5);
        pupilaPhineas1.setRadiusY(9);
        pupilaPhineas1.setFill(Color.MIDNIGHTBLUE);
        pupilaPhineas1.setStroke(Color.MIDNIGHTBLUE);
        pupilaPhineas1.setStrokeWidth(2);
        //pupilaPhineas1.setRotate(30);
        root.getChildren().add(pupilaPhineas1);
        
        Ellipse pupilaBlanca1 = new Ellipse();
        pupilaBlanca1.setCenterX(112);
        pupilaBlanca1.setCenterY(324);
        pupilaBlanca1.setRadiusX(2.5);
        pupilaBlanca1.setRadiusY(2.5);
        pupilaBlanca1.setFill(Color.WHITE);
        pupilaBlanca1.setStrokeWidth(2);
        pupilaBlanca1.setRotate(30);
        root.getChildren().add(pupilaBlanca1);
        
        
        
        // BOCA
        QuadCurve cachetePhineas = new QuadCurve();
        cachetePhineas.setStartX(102);
        cachetePhineas.setStartY(401);
        cachetePhineas.setEndX(113);
        cachetePhineas.setEndY(387);
        cachetePhineas.setControlX(106);
        cachetePhineas.setControlY(384);
        cachetePhineas.setStrokeWidth(2);
        cachetePhineas.setStroke(Color.rgb(186,43,8));
        cachetePhineas.setFill(Color.TRANSPARENT);
        root.getChildren().add(cachetePhineas);
        
        QuadCurve lenguaPhineas = new QuadCurve();
        lenguaPhineas.setStartX(87);
        lenguaPhineas.setStartY(367);
        lenguaPhineas.setEndX(97);
        lenguaPhineas.setEndY(395);
        lenguaPhineas.setControlX(100);
        lenguaPhineas.setControlY(370);
        lenguaPhineas.setStrokeWidth(2);
        lenguaPhineas.setStroke(Color.rgb(235,148,156));
        lenguaPhineas.setFill(Color.TRANSPARENT);
        root.getChildren().add(lenguaPhineas);
        
        // DIENTES
        Line dienteArribaPhineas1 = new Line();
        dienteArribaPhineas1.setStartX(88);
        dienteArribaPhineas1.setStartY(356);
        dienteArribaPhineas1.setEndX(122);
        dienteArribaPhineas1.setEndY(398);
        dienteArribaPhineas1.setStrokeWidth(1.5);
        dienteArribaPhineas1.setStroke(Color.BLACK);
        root.getChildren().add(dienteArribaPhineas1);
        
        Line dienteArribaPhineas2 = new Line();
        dienteArribaPhineas2.setStartX(123);
        dienteArribaPhineas2.setStartY(399);
        dienteArribaPhineas2.setEndX(127);
        dienteArribaPhineas2.setEndY(395);
        dienteArribaPhineas2.setStrokeWidth(1.5);
        dienteArribaPhineas2.setStroke(Color.BLACK);
        root.getChildren().add(dienteArribaPhineas2);
        
        Line dienteAbajoPhineas1 = new Line();
        dienteAbajoPhineas1.setStartX(90);
        dienteAbajoPhineas1.setStartY(390);
        dienteAbajoPhineas1.setEndX(102);
        dienteAbajoPhineas1.setEndY(402);
        dienteAbajoPhineas1.setStrokeWidth(1.5);
        dienteAbajoPhineas1.setStroke(Color.BLACK);
        root.getChildren().add(dienteAbajoPhineas1);
        
        Line dienteAbajoPhineas2 = new Line();
        dienteAbajoPhineas2.setStartX(102);
        dienteAbajoPhineas2.setStartY(403);
        dienteAbajoPhineas2.setEndX(97);
        dienteAbajoPhineas2.setEndY(405);
        dienteAbajoPhineas2.setStrokeWidth(1.5);
        dienteAbajoPhineas2.setStroke(Color.BLACK);
        root.getChildren().add(dienteAbajoPhineas2);
        
        // CABELLO PHINEAS
        QuadCurve cabelloPhineas1 = new QuadCurve();
        cabelloPhineas1.setStartX(51);
        cabelloPhineas1.setStartY(288);
        cabelloPhineas1.setEndX(78);
        cabelloPhineas1.setEndY(295);
        cabelloPhineas1.setControlX(60);
        cabelloPhineas1.setControlY(282);
        cabelloPhineas1.setStrokeWidth(2);
        cabelloPhineas1.setStroke(Color.RED);
        cabelloPhineas1.setFill(Color.TRANSPARENT);
        root.getChildren().add(cabelloPhineas1);
        
        QuadCurve cabelloPhineas2 = new QuadCurve();
        cabelloPhineas2.setStartX(60);
        cabelloPhineas2.setStartY(279);
        cabelloPhineas2.setEndX(78);
        cabelloPhineas2.setEndY(295);
        cabelloPhineas2.setControlX(70);
        cabelloPhineas2.setControlY(280);
        cabelloPhineas2.setStrokeWidth(2);
        cabelloPhineas2.setStroke(Color.RED);
        cabelloPhineas2.setFill(Color.TRANSPARENT);
        root.getChildren().add(cabelloPhineas2);
        
        QuadCurve cabelloPhineas3 = new QuadCurve();
        cabelloPhineas3.setStartX(60);
        cabelloPhineas3.setStartY(279);
        cabelloPhineas3.setEndX(95);
        cabelloPhineas3.setEndY(275);
        cabelloPhineas3.setControlX(70);
        cabelloPhineas3.setControlY(270);
        cabelloPhineas3.setStrokeWidth(2);
        cabelloPhineas3.setStroke(Color.RED);
        cabelloPhineas3.setFill(Color.TRANSPARENT);
        root.getChildren().add(cabelloPhineas3);
        
        QuadCurve cabelloPhineas4 = new QuadCurve();
        cabelloPhineas4.setStartX(55);
        cabelloPhineas4.setStartY(267);
        cabelloPhineas4.setEndX(95);
        cabelloPhineas4.setEndY(275);
        cabelloPhineas4.setControlX(73);
        cabelloPhineas4.setControlY(259);
        cabelloPhineas4.setStrokeWidth(2);
        cabelloPhineas4.setStroke(Color.RED);
        cabelloPhineas4.setFill(Color.TRANSPARENT);
        root.getChildren().add(cabelloPhineas4);
        
        QuadCurve cabelloPhineas5 = new QuadCurve();
        cabelloPhineas5.setStartX(55);
        cabelloPhineas5.setStartY(267);
        cabelloPhineas5.setEndX(66);
        cabelloPhineas5.setEndY(254);
        cabelloPhineas5.setControlX(60);
        cabelloPhineas5.setControlY(259);
        cabelloPhineas5.setStrokeWidth(2);
        cabelloPhineas5.setStroke(Color.RED);
        cabelloPhineas5.setFill(Color.TRANSPARENT);
        root.getChildren().add(cabelloPhineas5);
        
        QuadCurve cabelloPhineas6 = new QuadCurve();
        cabelloPhineas6.setStartX(66);
        cabelloPhineas6.setStartY(254);
        cabelloPhineas6.setEndX(52);
        cabelloPhineas6.setEndY(261);
        cabelloPhineas6.setControlX(53);
        cabelloPhineas6.setControlY(259);
        cabelloPhineas6.setStrokeWidth(2);
        cabelloPhineas6.setStroke(Color.RED);
        cabelloPhineas6.setFill(Color.TRANSPARENT);
        root.getChildren().add(cabelloPhineas6);
        
        // DEDOS PHINEAS
        Ellipse dedoPhineas1 = new Ellipse(); 
        dedoPhineas1.setCenterX(48);
        dedoPhineas1.setCenterY(369);
        dedoPhineas1.setRadiusX(8);
        dedoPhineas1.setRadiusY(4);
        //dedoPhineas1.setFill(Color.rgb(252,227,199));
        dedoPhineas1.setFill(Color.WHITE);
        //dedoPhineas1.setStroke(Color.RED);
        dedoPhineas1.setStroke(Color.rgb(251,193,137));
        dedoPhineas1.setStrokeWidth(1.7);
        dedoPhineas1.setRotate(5);
        root.getChildren().add(dedoPhineas1);
        
        Ellipse dedoPhineas2 = new Ellipse(); 
        dedoPhineas2.setCenterX(46.5);
        dedoPhineas2.setCenterY(377);
        dedoPhineas2.setRadiusX(9);
        dedoPhineas2.setRadiusY(5);
        //dedoPhineas2.setFill(Color.rgb(252,227,199));
        dedoPhineas2.setFill(Color.WHITE);
        //dedoPhineas2.setStroke(Color.RED);
        dedoPhineas2.setStroke(Color.rgb(251,193,137));
        dedoPhineas2.setStrokeWidth(1.7);
        dedoPhineas2.setRotate(355);
        root.getChildren().add(dedoPhineas2);
        
        Ellipse dedoPhineas3 = new Ellipse(); 
        dedoPhineas3.setCenterX(48);
        dedoPhineas3.setCenterY(385);
        dedoPhineas3.setRadiusX(8);
        dedoPhineas3.setRadiusY(4);
        //dedoPhineas3.setFill(Color.rgb(252,227,199));
        dedoPhineas3.setFill(Color.WHITE);
        //dedoPhineas3.setStroke(Color.RED);
        dedoPhineas3.setStroke(Color.rgb(251,193,137));
        dedoPhineas3.setStrokeWidth(1.7);
        dedoPhineas3.setRotate(350);
        root.getChildren().add(dedoPhineas3);
        
        Ellipse dedoPhineas4 = new Ellipse(); 
        dedoPhineas4.setCenterX(48);
        dedoPhineas4.setCenterY(402.5);
        dedoPhineas4.setRadiusX(8);
        dedoPhineas4.setRadiusY(4);
        //dedoPhineas4.setFill(Color.rgb(252,227,199));
        dedoPhineas4.setFill(Color.WHITE);
        //dedoPhineas4.setStroke(Color.RED);
        dedoPhineas4.setStroke(Color.rgb(251,193,137));
        dedoPhineas4.setStrokeWidth(1.7);
        dedoPhineas4.setRotate(355);
        root.getChildren().add(dedoPhineas4);
        
        Ellipse dedoPhineas5 = new Ellipse(); 
        dedoPhineas5.setCenterX(46.5);
        dedoPhineas5.setCenterY(412);
        dedoPhineas5.setRadiusX(9);
        dedoPhineas5.setRadiusY(5);
        //dedoPhineas5.setFill(Color.rgb(252,227,199));
        dedoPhineas5.setFill(Color.WHITE);
        //dedoPhineas5.setStroke(Color.RED);
        dedoPhineas5.setStroke(Color.rgb(251,193,137));
        dedoPhineas5.setStrokeWidth(1.7);
        dedoPhineas5.setRotate(348);
        root.getChildren().add(dedoPhineas5);
        
        Ellipse dedoPhineas6 = new Ellipse(); 
        dedoPhineas6.setCenterX(48);
        dedoPhineas6.setCenterY(420);
        dedoPhineas6.setRadiusX(8);
        dedoPhineas6.setRadiusY(4);
        //dedoPhineas6.setFill(Color.rgb(252,227,199));
        dedoPhineas6.setFill(Color.WHITE);
        //dedoPhineas6.setStroke(Color.RED);
        dedoPhineas6.setStroke(Color.rgb(251,193,137));
        dedoPhineas6.setStrokeWidth(1.7);
        dedoPhineas6.setRotate(350);
        root.getChildren().add(dedoPhineas6);
    }
    
    private void configurarFerb() {        
        // NARIZ FERB
        QuadCurve puntaNarizFerb = new QuadCurve();
        puntaNarizFerb.setStartX(132);
        puntaNarizFerb.setStartY(228);
        puntaNarizFerb.setEndX(156);
        puntaNarizFerb.setEndY(194);
        puntaNarizFerb.setControlX(150);
        puntaNarizFerb.setControlY(220);
        puntaNarizFerb.setStrokeWidth(2);
        puntaNarizFerb.setStroke(Color.rgb(251,193,137));
        puntaNarizFerb.setFill(Color.TRANSPARENT);
        
        Line narizArribaFerb = new Line();
        narizArribaFerb.setStartX(125);
        narizArribaFerb.setStartY(173);
        narizArribaFerb.setEndX(156);
        narizArribaFerb.setEndY(193);
        narizArribaFerb.setStrokeWidth(2);
        narizArribaFerb.setStroke(Color.rgb(251,193,137));
        
        Line narizAbajoFerb = new Line();
        narizAbajoFerb.setStartX(110);
        narizAbajoFerb.setStartY(210);
        narizAbajoFerb.setEndX(132);
        narizAbajoFerb.setEndY(228);
        narizAbajoFerb.setStrokeWidth(2);
        narizAbajoFerb.setStroke(Color.rgb(251,193,137));
        
        
        // SILUETA FERB
        Line cuelloFerb1 = new Line();
        cuelloFerb1.setStartX(100);
        cuelloFerb1.setStartY(111);
        cuelloFerb1.setEndX(78);
        cuelloFerb1.setEndY(158);
        cuelloFerb1.setStrokeWidth(2);
        cuelloFerb1.setStroke(Color.rgb(251,193,137));
        
        Line cuelloFerb2 = new Line();
        cuelloFerb2.setStartX(69);
        cuelloFerb2.setStartY(177);
        cuelloFerb2.setEndX(64);
        cuelloFerb2.setEndY(186);
        cuelloFerb2.setStrokeWidth(2);
        cuelloFerb2.setStroke(Color.rgb(251,193,137));
        
        Line cuelloDelanteFerb = new Line();
        cuelloDelanteFerb.setStartX(68);
        cuelloDelanteFerb.setStartY(262);
        cuelloDelanteFerb.setEndX(85);
        cuelloDelanteFerb.setEndY(240);
        cuelloDelanteFerb.setStrokeWidth(2);
        cuelloDelanteFerb.setStroke(Color.rgb(251,193,137));
        
        Line frenteFerb = new Line();
        frenteFerb.setStartX(162);
        frenteFerb.setStartY(149);
        frenteFerb.setEndX(170);
        frenteFerb.setEndY(136);
        frenteFerb.setStrokeWidth(2);
        frenteFerb.setStroke(Color.rgb(251,193,137));
        
        QuadCurve narizBocaFerb = new QuadCurve();
        narizBocaFerb.setStartX(95);
        narizBocaFerb.setStartY(245);
        narizBocaFerb.setEndX(109);
        narizBocaFerb.setEndY(211);
        narizBocaFerb.setControlX(96);
        narizBocaFerb.setControlY(220);
        narizBocaFerb.setStrokeWidth(2);
        narizBocaFerb.setStroke(Color.rgb(251,193,137));
        narizBocaFerb.setFill(Color.TRANSPARENT);
        
        QuadCurve labioFerb = new QuadCurve();
        labioFerb.setStartX(81);
        labioFerb.setStartY(234);
        labioFerb.setEndX(96);
        labioFerb.setEndY(245);
        labioFerb.setControlX(85);
        labioFerb.setControlY(240);
        labioFerb.setStrokeWidth(2);
        labioFerb.setStroke(Color.rgb(251,193,137));
        labioFerb.setFill(Color.TRANSPARENT);
        
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
        orejaFerb.setStroke(Color.rgb(251,193,137));
        orejaFerb.setFill(Color.WHITE);
        
        Group contornoFerb = new Group();
        contornoFerb.getChildren().addAll(orejaFerb, labioFerb, narizBocaFerb, frenteFerb, cuelloDelanteFerb, 
                cuelloFerb2, cuelloFerb1, narizAbajoFerb, narizArribaFerb, puntaNarizFerb);
        root.getChildren().add(contornoFerb);
        
        // OJOS FERB
        Ellipse ojoFerb1 = new Ellipse();
        ojoFerb1.setCenterX(116);
        ojoFerb1.setCenterY(157);
        ojoFerb1.setRadiusX(17);
        ojoFerb1.setRadiusY(19);
        ojoFerb1.setFill(Color.WHITE);
        ojoFerb1.setStroke(Color.BLACK);
        ojoFerb1.setFill(Color.TRANSPARENT);
        ojoFerb1.setStrokeWidth(1.7);
        ojoFerb1.setRotate(20);
        
        CubicCurve ojoFerb2 = new CubicCurve();
        ojoFerb2.setStartX(134);
        ojoFerb2.setStartY(151);
        ojoFerb2.setEndX(148);
        ojoFerb2.setEndY(186);
        ojoFerb2.setControlX1(152);
        ojoFerb2.setControlY1(130);
        ojoFerb2.setControlX2(180);
        ojoFerb2.setControlY2(144);
        ojoFerb2.setStrokeWidth(1.7);
        ojoFerb2.setStroke(Color.BLACK);
        ojoFerb2.setFill(Color.TRANSPARENT);
        
        Ellipse pupilaFerb1 = new Ellipse();
        pupilaFerb1.setCenterX(112);
        pupilaFerb1.setCenterY(157);
        pupilaFerb1.setRadiusX(3.5);
        pupilaFerb1.setRadiusY(4.5);
        pupilaFerb1.setStroke(Color.MIDNIGHTBLUE);
        pupilaFerb1.setFill(Color.MIDNIGHTBLUE);
        pupilaFerb1.setStrokeWidth(2);
        pupilaFerb1.setRotate(27);
        
        Ellipse pupilaBlancaFerb1 = new Ellipse();
        pupilaBlancaFerb1.setCenterX(111);
        pupilaBlancaFerb1.setCenterY(156);
        pupilaBlancaFerb1.setRadiusX(.2);
        pupilaBlancaFerb1.setRadiusY(.2);
        pupilaBlancaFerb1.setStroke(Color.WHITE);
        pupilaBlancaFerb1.setFill(Color.WHITE);
        pupilaBlancaFerb1.setStrokeWidth(2);
        
        Ellipse pupilaFerb2 = new Ellipse();
        pupilaFerb2.setCenterX(137);
        pupilaFerb2.setCenterY(168);
        pupilaFerb2.setRadiusX(3.5);
        pupilaFerb2.setRadiusY(4.5);
        pupilaFerb2.setFill(Color.MIDNIGHTBLUE);
        pupilaFerb2.setStroke(Color.MIDNIGHTBLUE);
        pupilaFerb2.setStrokeWidth(2);
        pupilaFerb2.setRotate(25);
        
        Ellipse pupilaBlancaFerb2 = new Ellipse();
        pupilaBlancaFerb2.setCenterX(137);
        pupilaBlancaFerb2.setCenterY(166);
        pupilaBlancaFerb2.setRadiusX(.2);
        pupilaBlancaFerb2.setRadiusY(.2);
        pupilaBlancaFerb2.setStroke(Color.WHITE);
        pupilaBlancaFerb2.setFill(Color.WHITE);
        pupilaBlancaFerb2.setStrokeWidth(2);
        
        Group ojosFerb = new Group();
        ojosFerb.getChildren().addAll(ojoFerb1, ojoFerb2, pupilaFerb1, pupilaFerb2, pupilaBlancaFerb1, pupilaBlancaFerb2);
        root.getChildren().add(ojosFerb);
        
        // CABELLO FERB
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
        cabelloFerb1.setStroke(Color.GREEN);
        cabelloFerb1.setFill(Color.TRANSPARENT);
        
        CubicCurve cabelloFerb2 = new CubicCurve();
        cabelloFerb2.setStartX(181);
        cabelloFerb2.setStartY(168);
        cabelloFerb2.setEndX(145);
        cabelloFerb2.setEndY(108);
        cabelloFerb2.setControlX1(179);
        cabelloFerb2.setControlY1(146);
        cabelloFerb2.setControlX2(167);
        cabelloFerb2.setControlY2(118);
        cabelloFerb2.setStrokeWidth(2);
        cabelloFerb2.setStroke(Color.GREEN);
        cabelloFerb2.setFill(Color.TRANSPARENT);
        
        CubicCurve cabelloFerb3 = new CubicCurve();
        cabelloFerb3.setStartX(198);
        cabelloFerb3.setStartY(87);
        cabelloFerb3.setEndX(120);
        cabelloFerb3.setEndY(79);
        cabelloFerb3.setControlX1(170);
        cabelloFerb3.setControlY1(61);
        cabelloFerb3.setControlX2(121);
        cabelloFerb3.setControlY2(78);
        cabelloFerb3.setStrokeWidth(2);
        cabelloFerb3.setStroke(Color.GREEN);
        cabelloFerb3.setFill(Color.TRANSPARENT);
                
        CubicCurve cabelloFerb4 = new CubicCurve();
        cabelloFerb4.setStartX(200);
        cabelloFerb4.setStartY(89);
        cabelloFerb4.setEndX(170);
        cabelloFerb4.setEndY(86);
        cabelloFerb4.setControlX1(189);
        cabelloFerb4.setControlY1(83);
        cabelloFerb4.setControlX2(179);
        cabelloFerb4.setControlY2(84);
        cabelloFerb4.setStrokeWidth(2);
        cabelloFerb4.setStroke(Color.GREEN);
        cabelloFerb4.setFill(Color.TRANSPARENT);
        
        CubicCurve cabelloFerb5 = new CubicCurve();
        cabelloFerb5.setStartX(124);
        cabelloFerb5.setStartY(102);
        cabelloFerb5.setEndX(92);
        cabelloFerb5.setEndY(115);
        cabelloFerb5.setControlX1(120);
        cabelloFerb5.setControlY1(102);
        cabelloFerb5.setControlX2(103);
        cabelloFerb5.setControlY2(104);
        cabelloFerb5.setStrokeWidth(2);
        cabelloFerb5.setStroke(Color.GREEN);
        cabelloFerb5.setFill(Color.TRANSPARENT);
        
        Line cabelloFerb6 = new Line();
        cabelloFerb6.setStartX(125);
        cabelloFerb6.setStartY(102);
        cabelloFerb6.setEndX(136);
        cabelloFerb6.setEndY(126);
        cabelloFerb6.setStrokeWidth(2);
        cabelloFerb6.setStroke(Color.GREEN);
        cabelloFerb6.setFill(Color.TRANSPARENT);
        
        QuadCurve cabelloFerb7 = new QuadCurve();
        cabelloFerb7.setStartX(143);
        cabelloFerb7.setStartY(108);
        cabelloFerb7.setEndX(138);
        cabelloFerb7.setEndY(126);
        cabelloFerb7.setControlX(142);
        cabelloFerb7.setControlY(115);
        cabelloFerb7.setStrokeWidth(2);
        cabelloFerb7.setStroke(Color.GREEN);
        cabelloFerb7.setFill(Color.TRANSPARENT);
        
        QuadCurve cabelloFerb8 = new QuadCurve();
        cabelloFerb8.setStartX(92);
        cabelloFerb8.setStartY(115);
        cabelloFerb8.setEndX(97);
        cabelloFerb8.setEndY(102);
        cabelloFerb8.setControlX(90);
        cabelloFerb8.setControlY(115);
        cabelloFerb8.setStrokeWidth(2);
        cabelloFerb8.setStroke(Color.GREEN);
        cabelloFerb8.setFill(Color.TRANSPARENT);
        
        QuadCurve cabelloFerb9 = new QuadCurve();
        cabelloFerb9.setStartX(97);
        cabelloFerb9.setStartY(101);
        cabelloFerb9.setEndX(74);
        cabelloFerb9.setEndY(107);
        cabelloFerb9.setControlX(88);
        cabelloFerb9.setControlY(100);
        cabelloFerb9.setStrokeWidth(2);
        cabelloFerb9.setStroke(Color.GREEN);
        cabelloFerb9.setFill(Color.TRANSPARENT);
        
        QuadCurve cabelloFerb10 = new QuadCurve();
        cabelloFerb10.setStartX(73);
        cabelloFerb10.setStartY(107);
        cabelloFerb10.setEndX(95);
        cabelloFerb10.setEndY(89);
        cabelloFerb10.setControlX(75);
        cabelloFerb10.setControlY(97);
        cabelloFerb10.setStrokeWidth(2);
        cabelloFerb10.setStroke(Color.GREEN);
        cabelloFerb10.setFill(Color.TRANSPARENT);
        
        QuadCurve cabelloFerb11 = new QuadCurve();
        cabelloFerb11.setStartX(94);
        cabelloFerb11.setStartY(89);
        cabelloFerb11.setEndX(74);
        cabelloFerb11.setEndY(86);
        cabelloFerb11.setControlX(79);
        cabelloFerb11.setControlY(82);
        cabelloFerb11.setStrokeWidth(2);
        cabelloFerb11.setStroke(Color.GREEN);
        cabelloFerb11.setFill(Color.TRANSPARENT);
        
        QuadCurve cabelloFerb12 = new QuadCurve();
        cabelloFerb12.setStartX(110);
        cabelloFerb12.setStartY(78);
        cabelloFerb12.setEndX(74);
        cabelloFerb12.setEndY(85);
        cabelloFerb12.setControlX(90);
        cabelloFerb12.setControlY(72);
        cabelloFerb12.setStrokeWidth(2);
        cabelloFerb12.setStroke(Color.GREEN);
        cabelloFerb12.setFill(Color.TRANSPARENT);
        
        QuadCurve cabelloFerb13 = new QuadCurve();
        cabelloFerb13.setStartX(110);
        cabelloFerb13.setStartY(78);
        cabelloFerb13.setEndX(108);
        cabelloFerb13.setEndY(66);
        cabelloFerb13.setControlX(110);
        cabelloFerb13.setControlY(72);
        cabelloFerb13.setStrokeWidth(2);
        cabelloFerb13.setStroke(Color.GREEN);
        cabelloFerb13.setFill(Color.TRANSPARENT);
        
        QuadCurve cabelloFerb14 = new QuadCurve();
        cabelloFerb14.setStartX(120);
        cabelloFerb14.setStartY(79);
        cabelloFerb14.setEndX(108);
        cabelloFerb14.setEndY(66);
        cabelloFerb14.setControlX(115);
        cabelloFerb14.setControlY(72);
        cabelloFerb14.setStrokeWidth(2);
        cabelloFerb14.setStroke(Color.GREEN);
        cabelloFerb14.setFill(Color.TRANSPARENT);
        
        Group cabelleraFerb = new Group();
        cabelleraFerb.getChildren().addAll(cabelloFerb1);
        cabelleraFerb.getChildren().addAll(cabelloFerb2);
        cabelleraFerb.getChildren().addAll(cabelloFerb3);
        cabelleraFerb.getChildren().addAll(cabelloFerb4);
        cabelleraFerb.getChildren().addAll(cabelloFerb5);
        cabelleraFerb.getChildren().addAll(cabelloFerb6);
        cabelleraFerb.getChildren().addAll(cabelloFerb7);
        cabelleraFerb.getChildren().addAll(cabelloFerb8);
        cabelleraFerb.getChildren().addAll(cabelloFerb9);
        cabelleraFerb.getChildren().addAll(cabelloFerb10);
        cabelleraFerb.getChildren().addAll(cabelloFerb11);
        cabelleraFerb.getChildren().addAll(cabelloFerb12);
        cabelleraFerb.getChildren().addAll(cabelloFerb13);
        cabelleraFerb.getChildren().addAll(cabelloFerb14);
        
        root.getChildren().add(cabelleraFerb);
        
        // DEDOS PHINEAS
        Ellipse dedoFerb1 = new Ellipse(); 
        dedoFerb1.setCenterX(53);
        dedoFerb1.setCenterY(190);
        dedoFerb1.setRadiusX(10);
        dedoFerb1.setRadiusY(8);
        //dedoFerb1.setFill(Color.rgb(252,227,199));
        dedoFerb1.setFill(Color.WHITE);
        //dedoFerb1.setStroke(Color.RED);
        dedoFerb1.setStroke(Color.rgb(251,193,137));
        dedoFerb1.setStrokeWidth(1.7);
        dedoFerb1.setRotate(328);
        root.getChildren().add(dedoFerb1);
        
        Ellipse dedoFerb2 = new Ellipse(); 
        dedoFerb2.setCenterX(50);
        dedoFerb2.setCenterY(200);
        dedoFerb2.setRadiusX(9);
        dedoFerb2.setRadiusY(5.5);
        //dedoFerb2.setFill(Color.rgb(252,227,199));
        dedoFerb2.setFill(Color.WHITE);
        //dedoFerb2.setStroke(Color.RED);
        dedoFerb2.setStroke(Color.rgb(251,193,137));
        dedoFerb2.setStrokeWidth(1.7);
        dedoFerb2.setRotate(345);
        root.getChildren().add(dedoFerb2);
        
        Ellipse dedoFerb3 = new Ellipse(); 
        dedoFerb3.setCenterX(52);
        dedoFerb3.setCenterY(210);
        dedoFerb3.setRadiusX(9);
        dedoFerb3.setRadiusY(6);
        //dedoFerb3.setFill(Color.rgb(252,227,199));
        dedoFerb3.setFill(Color.WHITE);
        dedoFerb3.setStroke(Color.rgb(251,193,137));
        //dedoFerb3.setStroke(Color.rgb(251,193,137));
        dedoFerb3.setStrokeWidth(1.7);
        dedoFerb3.setRotate(350);
        root.getChildren().add(dedoFerb3);
        
        Ellipse dedoFerb4 = new Ellipse(); 
        dedoFerb4.setCenterX(53);
        dedoFerb4.setCenterY(232);
        dedoFerb4.setRadiusX(10);
        dedoFerb4.setRadiusY(8);
        //dedoFerb4.setFill(Color.rgb(252,227,199));
        dedoFerb4.setFill(Color.WHITE);
        //dedoFerb4.setStroke(Color.RED);
        dedoFerb4.setStroke(Color.rgb(251,193,137));
        dedoFerb4.setStrokeWidth(1.7);
        dedoFerb4.setRotate(5);
        root.getChildren().add(dedoFerb4);
        
        Ellipse dedoFerb5 = new Ellipse(); 
        dedoFerb5.setCenterX(50);
        dedoFerb5.setCenterY(240);
        dedoFerb5.setRadiusX(9);
        dedoFerb5.setRadiusY(5.5);
        //dedoFerb5.setFill(Color.rgb(252,227,199));
        dedoFerb5.setFill(Color.WHITE);
        //dedoFerb5.setStroke(Color.RED);
        dedoFerb5.setStroke(Color.rgb(251,193,137));
        dedoFerb5.setStrokeWidth(1.7);
        dedoFerb5.setRotate(345);
        root.getChildren().add(dedoFerb5);
        
        Ellipse dedoFerb6 = new Ellipse(); 
        dedoFerb6.setCenterX(52);
        dedoFerb6.setCenterY(250);
        dedoFerb6.setRadiusX(9);
        dedoFerb6.setRadiusY(6);
        //dedoFerb6.setFill(Color.rgb(252,227,199));
        dedoFerb6.setFill(Color.WHITE);
        dedoFerb6.setStroke(Color.rgb(251,193,137));
        //dedoFerb6.setStroke(Color.rgb(251,193,137));
        dedoFerb6.setStrokeWidth(1.7);
        dedoFerb6.setRotate(350);
        root.getChildren().add(dedoFerb6);
    }
}
