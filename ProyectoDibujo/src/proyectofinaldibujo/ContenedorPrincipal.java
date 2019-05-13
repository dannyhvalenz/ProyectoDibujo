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
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
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
            configurarFerb();
            configurarPhineas();
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
        // BOCA
        Path bocaPhineas = new Path();
        ClosePath cerrarBoca = new ClosePath();
        
        MoveTo moveToBoca = new MoveTo();
        moveToBoca.setX(113);
        moveToBoca.setY(387);
        
        QuadCurveTo cachete1 = new QuadCurveTo();
        cachete1.setX(102);
        cachete1.setY(401);
        cachete1.setControlX(106);
        cachete1.setControlY(384);
        
        LineTo diente1 = new LineTo();
        diente1.setX(90);
        diente1.setY(390);
        
        QuadCurveTo cachete2 = new QuadCurveTo();
        cachete2.setX(90);
        cachete2.setY(356);
        cachete2.setControlX(84);
        cachete2.setControlY(375);
        
        bocaPhineas.getElements().add(moveToBoca);
        bocaPhineas.getElements().add(cachete1);
        bocaPhineas.getElements().add(diente1);
        bocaPhineas.getElements().add(cachete2);
        bocaPhineas.getElements().add(cerrarBoca);
        
        bocaPhineas.setStrokeWidth(1.5);
        bocaPhineas.setStroke(Color.rgb(186,43,8));
        bocaPhineas.setFill(Color.rgb(186,43,8));
        
        root.getChildren().add(bocaPhineas);
        
        //LENGUA
        Path lengua = new Path();
        ClosePath cerrarLengua = new ClosePath();
        
        MoveTo moveToLengua = new MoveTo();
        moveToLengua.setX(87);
        moveToLengua.setY(367);
        
        QuadCurveTo lenguaPhineas = new QuadCurveTo();
        lenguaPhineas.setX(97);
        lenguaPhineas.setY(395);
        lenguaPhineas.setControlX(100);
        lenguaPhineas.setControlY(370);
        
        LineTo linea = new LineTo();
        linea.setX(91);
        linea.setY(390);
        
        lengua.getElements().add(moveToLengua);
        lengua.getElements().add(lenguaPhineas);
        lengua.getElements().add(linea);
        lengua.getElements().add(cerrarLengua);
        
        lengua.setStroke(Color.rgb(235,148,156));
        lengua.setFill(Color.rgb(235,148,156));
        lengua.setStrokeWidth(2);
        
        root.getChildren().add(lengua);
        
        // SILUETA PHINEAS
        Path siluetaPhineas = new Path();
        ClosePath cerrarSilueta = new ClosePath();
        
        MoveTo moveToSilueta = new MoveTo();
        moveToSilueta.setX(51);
        moveToSilueta.setY(288);
        
        LineTo frentePhineas1 = new LineTo();
        frentePhineas1.setX(214);
        frentePhineas1.setY(372);
        
        LineTo narizAbajoPhineas1 = new LineTo();
        narizAbajoPhineas1.setX(133);
        narizAbajoPhineas1.setY(399);
        
        QuadCurveTo bocaArribaPhineas1 = new QuadCurveTo();
        bocaArribaPhineas1.setX(91);
        bocaArribaPhineas1.setY(344);
        bocaArribaPhineas1.setControlX(120);
        bocaArribaPhineas1.setControlY(394);
        
        QuadCurveTo bocaAbajoPhineas1 = new QuadCurveTo();
        bocaAbajoPhineas1.setX(100);
        bocaAbajoPhineas1.setY(408);
        bocaAbajoPhineas1.setControlX(80);
        bocaAbajoPhineas1.setControlY(390);
        
        QuadCurveTo cuelloPhineas1 = new QuadCurveTo();
        cuelloPhineas1.setX(68);
        cuelloPhineas1.setY(426);
        cuelloPhineas1.setControlX(85);
        cuelloPhineas1.setControlY(410);
        
        QuadCurveTo cuelloPhineas2 = new QuadCurveTo();
        cuelloPhineas2.setX(59);
        cuelloPhineas2.setY(403);
        cuelloPhineas2.setControlX(58);
        cuelloPhineas2.setControlY(410);
        
        QuadCurveTo nucaPhineas1 = new QuadCurveTo();
        nucaPhineas1.setX(51);
        nucaPhineas1.setY(321);
        nucaPhineas1.setControlX(70);
        nucaPhineas1.setControlY(380);
        
        siluetaPhineas.getElements().add(moveToSilueta);
        siluetaPhineas.getElements().add(frentePhineas1);
        siluetaPhineas.getElements().add(narizAbajoPhineas1);
        siluetaPhineas.getElements().add(bocaArribaPhineas1);
        siluetaPhineas.getElements().add(bocaAbajoPhineas1);
        siluetaPhineas.getElements().add(cuelloPhineas1);
        siluetaPhineas.getElements().add(cuelloPhineas2);
        siluetaPhineas.getElements().add(nucaPhineas1);
        siluetaPhineas.getElements().add(cerrarSilueta);
        
        siluetaPhineas.setStrokeWidth(2);
        siluetaPhineas.setStroke(Color.rgb(197,120,0));
        siluetaPhineas.setFill(Color.rgb(254,225,200));
        
        root.getChildren().add(siluetaPhineas);
        
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
        orejaPhineas.setStroke(Color.rgb(197,120,0));
        orejaPhineas.setFill(Color.rgb(254,225,200));
        root.getChildren().add(orejaPhineas);
        
        // CAMISA PHINEAS
        Path camisaPhineas = new Path();
        ClosePath cerrarCamisaPhineas = new ClosePath();
        
        MoveTo moveToCamisa = new MoveTo();
        moveToCamisa.setX(52);
        moveToCamisa.setY(470);
        
        LineTo camisa1 = new LineTo();
        camisa1.setX(58);
        camisa1.setY(474);
        
        QuadCurveTo manga = new QuadCurveTo();
        manga.setX(52);
        manga.setY(423);
        manga.setControlX(90);
        manga.setControlY(405);
        
        camisaPhineas.getElements().add(moveToCamisa);
        camisaPhineas.getElements().add(camisa1);
        camisaPhineas.getElements().add(manga);
        camisaPhineas.getElements().add(cerrarCamisaPhineas);
        
        camisaPhineas.setStroke(Color.BLACK);
        camisaPhineas.setStrokeWidth(2);
        camisaPhineas.setFill(Color.rgb(253,241,189));
        root.getChildren().add(camisaPhineas);
        
        Path rayaCamisaPhineas = new Path();
        ClosePath cerrarRayaCamisaPhineas = new ClosePath();
        
        MoveTo moveToRayaCamisa = new MoveTo();
        moveToRayaCamisa.setX(68.2);
        moveToRayaCamisa.setY(444);
        
        LineTo raya1 = new LineTo();
        raya1.setX(54);
        raya1.setY(432);
        
        LineTo raya2 = new LineTo();
        raya2.setX(54);
        raya2.setY(455);
        
        LineTo raya3 = new LineTo();
        raya3.setX(61.2);
        raya3.setY(461);
        
        rayaCamisaPhineas.getElements().add(moveToRayaCamisa);
        rayaCamisaPhineas.getElements().add(raya1);
        rayaCamisaPhineas.getElements().add(raya2);
        rayaCamisaPhineas.getElements().add(raya3);
        rayaCamisaPhineas.getElements().add(cerrarRayaCamisaPhineas);
        
        rayaCamisaPhineas.setFill(Color.rgb(242,153,0));
        rayaCamisaPhineas.setStroke(Color.rgb(242,153,0));
        rayaCamisaPhineas.setStrokeWidth(1.5);
        
        root.getChildren().add(rayaCamisaPhineas);
        
        
        Path cuelloCamisa = new Path();
        ClosePath cerrarCuelloCamisaPhineas = new ClosePath();
        
        MoveTo moveToCuelloCamisa1 = new MoveTo();
        moveToCuelloCamisa1.setX(65);
        moveToCuelloCamisa1.setY(418);
        
        QuadCurveTo cuelloCamisaPhineas1 = new QuadCurveTo();
        cuelloCamisaPhineas1.setX(59);
        cuelloCamisaPhineas1.setY(403);
        cuelloCamisaPhineas1.setControlX(58);
        cuelloCamisaPhineas1.setControlY(410);
        
        CubicCurveTo cuelloCamisaPhineas2 = new CubicCurveTo();
        cuelloCamisaPhineas2.setX(56);
        cuelloCamisaPhineas2.setY(420);
        cuelloCamisaPhineas2.setControlX1(50);
        cuelloCamisaPhineas2.setControlY1(410);
        cuelloCamisaPhineas2.setControlX2(50);
        cuelloCamisaPhineas2.setControlY2(405);
        
        cuelloCamisa.getElements().add(moveToCuelloCamisa1);
        cuelloCamisa.getElements().add(cuelloCamisaPhineas1);
        cuelloCamisa.getElements().add(cuelloCamisaPhineas2);
        cuelloCamisa.getElements().add(cerrarCuelloCamisaPhineas);
        
        cuelloCamisa.setStrokeWidth(1.2);
        cuelloCamisa.setFill(Color.rgb(242,153,0));
        
        root.getChildren().add(cuelloCamisa);
        
        
        
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
        
        // DIENTES
        Line dienteArribaPhineas1 = new Line();
        dienteArribaPhineas1.setStartX(90);
        dienteArribaPhineas1.setStartY(356);
        dienteArribaPhineas1.setEndX(122);
        dienteArribaPhineas1.setEndY(398);
        dienteArribaPhineas1.setStrokeWidth(1.5);
        dienteArribaPhineas1.setStroke(Color.BLACK);
        root.getChildren().add(dienteArribaPhineas1);
        
        Line dienteArribaPhineas2 = new Line();
        dienteArribaPhineas2.setStartX(123);
        dienteArribaPhineas2.setStartY(398);
        dienteArribaPhineas2.setEndX(127);
        dienteArribaPhineas2.setEndY(397);
        dienteArribaPhineas2.setStrokeWidth(1.5);
        dienteArribaPhineas2.setStroke(Color.BLACK);
        root.getChildren().add(dienteArribaPhineas2);
        
        Line dienteAbajoPhineas1 = new Line();
        dienteAbajoPhineas1.setStartX(91);
        dienteAbajoPhineas1.setStartY(390);
        dienteAbajoPhineas1.setEndX(102);
        dienteAbajoPhineas1.setEndY(402);
        dienteAbajoPhineas1.setStrokeWidth(1.5);
        dienteAbajoPhineas1.setStroke(Color.BLACK);
        root.getChildren().add(dienteAbajoPhineas1);
        
        Line dienteAbajoPhineas2 = new Line();
        dienteAbajoPhineas2.setStartX(102);
        dienteAbajoPhineas2.setStartY(403);
        dienteAbajoPhineas2.setEndX(99);
        dienteAbajoPhineas2.setEndY(405);
        dienteAbajoPhineas2.setStrokeWidth(1.5);
        dienteAbajoPhineas2.setStroke(Color.BLACK);
        root.getChildren().add(dienteAbajoPhineas2);
        
        // CABELLO PHINEAS
        Path cabelloPhineas = new Path();
        ClosePath cerrar = new ClosePath();
        
        MoveTo moveTo = new MoveTo();
        moveTo.setX(51);
        moveTo.setY(288);
        
        QuadCurveTo cabello1 = new QuadCurveTo();
        cabello1.setX(78);
        cabello1.setY(295);
        cabello1.setControlX(60);
        cabello1.setControlY(282);
        
        QuadCurveTo cabello2 = new QuadCurveTo();
        cabello2.setX(60);
        cabello2.setY(279);
        cabello2.setControlX(70);
        cabello2.setControlY(280);
        
        QuadCurveTo cabello3 = new QuadCurveTo();
        cabello3.setX(95);
        cabello3.setY(275);
        cabello3.setControlX(70);
        cabello3.setControlY(270);
        
        QuadCurveTo cabello4 = new QuadCurveTo();
        cabello4.setX(55);
        cabello4.setY(267);
        cabello4.setControlX(73);
        cabello4.setControlY(259);
        
        QuadCurveTo cabello5 = new QuadCurveTo();
        cabello5.setX(66);
        cabello5.setY(254);
        cabello5.setControlX(60);
        cabello5.setControlY(259);
        
        QuadCurveTo cabello6 = new QuadCurveTo();
        cabello6.setX(52);
        cabello6.setY(261);
        cabello6.setControlX(53);
        cabello6.setControlY(259);
        
        cabelloPhineas.getElements().add(moveTo);
        cabelloPhineas.getElements().add(cabello1);
        cabelloPhineas.getElements().add(cabello2);
        cabelloPhineas.getElements().add(cabello3);
        cabelloPhineas.getElements().add(cabello4);
        cabelloPhineas.getElements().add(cabello5);
        cabelloPhineas.getElements().add(cabello6);
        cabelloPhineas.getElements().add(cerrar);
        
        cabelloPhineas.setStrokeWidth(2);
        cabelloPhineas.setStroke(Color.rgb(167,33,15));
        cabelloPhineas.setFill(Color.rgb(229,96, 58));
        
        root.getChildren().add(cabelloPhineas);
        
        Path cejaPhineas1 = new Path();
        ClosePath cerrarCeja1 = new ClosePath();
        
        MoveTo moveToCeja1 = new MoveTo();
        moveToCeja1.setX(102);
        moveToCeja1.setY(296);
        
        QuadCurveTo lineaceja1 = new QuadCurveTo();
        lineaceja1.setX(123);
        lineaceja1.setY(294);
        lineaceja1.setControlX(118);
        lineaceja1.setControlY(292);
        
        QuadCurveTo lineaceja2 = new QuadCurveTo();
        lineaceja2.setX(102);
        lineaceja2.setY(296);
        lineaceja2.setControlX(114);
        lineaceja2.setControlY(289);
        
        cejaPhineas1.getElements().add(moveToCeja1);
        cejaPhineas1.getElements().add(lineaceja1);
        cejaPhineas1.getElements().add(lineaceja2);
        cejaPhineas1.getElements().add(cerrarCeja1);
        
        cejaPhineas1.setStrokeWidth(1);
        cejaPhineas1.setStroke(Color.rgb(167,33,15));
        cejaPhineas1.setFill(Color.rgb(229,96, 58));
        
        root.getChildren().add(cejaPhineas1);
        
        Path cejaPhineas2 = new Path();
        ClosePath cerrarCeja2 = new ClosePath();
        
        MoveTo moveToCeja2 = new MoveTo();
        moveToCeja2.setX(145);
        moveToCeja2.setY(299);
        
        QuadCurveTo lineaceja3 = new QuadCurveTo();
        lineaceja3.setX(156);
        lineaceja3.setY(310);
        lineaceja3.setControlX(149.5);
        lineaceja3.setControlY(300);
        
        QuadCurveTo lineaceja4 = new QuadCurveTo();
        lineaceja4.setX(145);
        lineaceja4.setY(299);
        lineaceja4.setControlX(150);
        lineaceja4.setControlY(295);
        
        cejaPhineas2.getElements().add(moveToCeja2);
        cejaPhineas2.getElements().add(lineaceja3);
        cejaPhineas2.getElements().add(lineaceja4);
        cejaPhineas2.getElements().add(cerrarCeja2);
        
        cejaPhineas2.setStrokeWidth(1);
        cejaPhineas2.setStroke(Color.rgb(167,33,15));
        cejaPhineas2.setFill(Color.rgb(229,96, 58));
        
        root.getChildren().add(cejaPhineas2);
        
        // DEDOS PHINEAS
        Ellipse dedoPhineas1 = new Ellipse(); 
        dedoPhineas1.setCenterX(48);
        dedoPhineas1.setCenterY(369);
        dedoPhineas1.setRadiusX(8);
        dedoPhineas1.setRadiusY(4);
        dedoPhineas1.setStroke(Color.rgb(251,193,137));
        dedoPhineas1.setFill(Color.rgb(254,225,200));
        dedoPhineas1.setStrokeWidth(1.7);
        dedoPhineas1.setRotate(5);
        root.getChildren().add(dedoPhineas1);
        
        Ellipse dedoPhineas2 = new Ellipse(); 
        dedoPhineas2.setCenterX(46.5);
        dedoPhineas2.setCenterY(377);
        dedoPhineas2.setRadiusX(9);
        dedoPhineas2.setRadiusY(5);
        dedoPhineas2.setStroke(Color.rgb(251,193,137));
        dedoPhineas2.setFill(Color.rgb(254,225,200));
        dedoPhineas2.setStrokeWidth(1.7);
        dedoPhineas2.setRotate(355);
        root.getChildren().add(dedoPhineas2);
        
        Ellipse dedoPhineas3 = new Ellipse(); 
        dedoPhineas3.setCenterX(48);
        dedoPhineas3.setCenterY(385);
        dedoPhineas3.setRadiusX(8);
        dedoPhineas3.setRadiusY(4);
        dedoPhineas3.setStroke(Color.rgb(251,193,137));
        dedoPhineas3.setFill(Color.rgb(254,225,200));
        dedoPhineas3.setStrokeWidth(1.7);
        dedoPhineas3.setRotate(350);
        root.getChildren().add(dedoPhineas3);
        
        Ellipse dedoPhineas4 = new Ellipse(); 
        dedoPhineas4.setCenterX(48);
        dedoPhineas4.setCenterY(402.5);
        dedoPhineas4.setRadiusX(8);
        dedoPhineas4.setRadiusY(4);
        dedoPhineas4.setStroke(Color.rgb(251,193,137));
        dedoPhineas4.setFill(Color.rgb(254,225,200));
        dedoPhineas4.setStrokeWidth(1.7);
        dedoPhineas4.setRotate(355);
        root.getChildren().add(dedoPhineas4);
        
        Ellipse dedoPhineas5 = new Ellipse(); 
        dedoPhineas5.setCenterX(46.5);
        dedoPhineas5.setCenterY(412);
        dedoPhineas5.setRadiusX(9);
        dedoPhineas5.setRadiusY(5);
        dedoPhineas5.setStroke(Color.rgb(251,193,137));
        dedoPhineas5.setFill(Color.rgb(254,225,200));
        dedoPhineas5.setStrokeWidth(1.7);
        dedoPhineas5.setRotate(348);
        root.getChildren().add(dedoPhineas5);
        
        Ellipse dedoPhineas6 = new Ellipse(); 
        dedoPhineas6.setCenterX(48);
        dedoPhineas6.setCenterY(420);
        dedoPhineas6.setRadiusX(8);
        dedoPhineas6.setRadiusY(4);
        dedoPhineas6.setStroke(Color.rgb(251,193,137));
        dedoPhineas6.setFill(Color.rgb(254,225,200));
        dedoPhineas6.setStrokeWidth(1.7);
        dedoPhineas6.setRotate(350);
        root.getChildren().add(dedoPhineas6);
    }
    
    private void configurarFerb() {
        
        Path SiluetaFerb = new Path();
        ClosePath cerrarSiluetaFerb = new ClosePath();
        
        MoveTo moveToSilueta = new MoveTo();
        moveToSilueta.setX(184);
        moveToSilueta.setY(110);
        
        LineTo frente = new LineTo();
        frente.setX(142);
        frente.setY(184);
        
        LineTo narizArriba = new LineTo();
        narizArriba.setX(156);
        narizArriba.setY(193);
        
        QuadCurveTo puntaNariz = new QuadCurveTo();
        puntaNariz.setX(132);
        puntaNariz.setY(228);
        puntaNariz.setControlX(150);
        puntaNariz.setControlY(220);
        
        LineTo narizAbajo = new LineTo();
        narizAbajo.setX(110);
        narizAbajo.setY(210);
        
        QuadCurveTo narizBoca = new QuadCurveTo();
        narizBoca.setX(95);
        narizBoca.setY(245);
        narizBoca.setControlX(96);
        narizBoca.setControlY(220);
        
        QuadCurveTo labio = new QuadCurveTo();
        labio.setX(85);
        labio.setY(240);
        labio.setControlX(85);
        labio.setControlY(240);
        
        LineTo cuelloDelante = new LineTo();
        cuelloDelante.setX(51);
        cuelloDelante.setY(286);
        
        LineTo linea2 = new LineTo();
        linea2.setX(52);
        linea2.setY(210);
        
        LineTo cuelloFerb = new LineTo();
        cuelloFerb.setX(110);
        cuelloFerb.setY(90);
        
        SiluetaFerb.getElements().add(moveToSilueta);
        SiluetaFerb.getElements().add(frente);
        SiluetaFerb.getElements().add(narizArriba);
        SiluetaFerb.getElements().add(puntaNariz);
        SiluetaFerb.getElements().add(narizAbajo);
        SiluetaFerb.getElements().add(narizBoca);
        SiluetaFerb.getElements().add(labio);
        SiluetaFerb.getElements().add(cuelloDelante);
        SiluetaFerb.getElements().add(linea2);
        SiluetaFerb.getElements().add(cuelloFerb);
        SiluetaFerb.getElements().add(cerrarSiluetaFerb);
        
        SiluetaFerb.setStroke(Color.rgb(197,120,0));
        SiluetaFerb.setFill(Color.rgb(254,225,200));
        SiluetaFerb.setStrokeWidth(2);
        
        root.getChildren().add(SiluetaFerb);
        
        // OJOS FERB
        Path ojoFerb2 = new Path();
        ClosePath cerrarOjo = new ClosePath();
        
        MoveTo moveToOjo = new MoveTo();
        moveToOjo.setX(119);
        moveToOjo.setY(169);
        
        CubicCurveTo ojo = new CubicCurveTo();
        ojo.setX(148);
        ojo.setY(187.5);
        ojo.setControlX1(166);
        ojo.setControlY1(107);
        ojo.setControlX2(172);
        ojo.setControlY2(169);
        
        ojoFerb2.getElements().add(moveToOjo);
        ojoFerb2.getElements().add(ojo);
        ojoFerb2.getElements().add(cerrarOjo);
        
        ojoFerb2.setStroke(Color.BLACK);
        ojoFerb2.setStrokeWidth(1.7);
        ojoFerb2.setFill(Color.WHITE);
        root.getChildren().add(ojoFerb2);
        
        Ellipse ojoFerb1 = new Ellipse();
        ojoFerb1.setCenterX(116);
        ojoFerb1.setCenterY(157);
        ojoFerb1.setRadiusX(17);
        ojoFerb1.setRadiusY(19);
        ojoFerb1.setFill(Color.WHITE);
        ojoFerb1.setStroke(Color.BLACK);
        ojoFerb1.setStrokeWidth(1.7);
        ojoFerb1.setRotate(20);
        
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
        ojosFerb.getChildren().addAll(ojoFerb1, pupilaFerb1, pupilaFerb2, pupilaBlancaFerb1, pupilaBlancaFerb2);
        root.getChildren().add(ojosFerb);
        
        // PARTES SILUETA FERB
        Line narizArribaFerb = new Line();
        narizArribaFerb.setStartX(127);
        narizArribaFerb.setStartY(174);
        narizArribaFerb.setEndX(156);
        narizArribaFerb.setEndY(193);
        narizArribaFerb.setStrokeWidth(2);
        narizArribaFerb.setStroke(Color.rgb(197,120,0));
        root.getChildren().add(narizArribaFerb);
        
        QuadCurve labioFerb = new QuadCurve();
        labioFerb.setStartX(81);
        labioFerb.setStartY(234);
        labioFerb.setEndX(96);
        labioFerb.setEndY(245);
        labioFerb.setControlX(85);
        labioFerb.setControlY(240);
        labioFerb.setStrokeWidth(2);
        labioFerb.setStroke(Color.rgb(197,120,0));
        labioFerb.setFill(Color.TRANSPARENT);
        root.getChildren().add(labioFerb);
        
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
        orejaFerb.setStroke(Color.rgb(197,120,0));
        orejaFerb.setFill(Color.rgb(254,225,200));
        root.getChildren().add(orejaFerb);
        
        // CABELLO FERB
        Path cabelloFerb = new Path();
        ClosePath cerrar = new ClosePath();
        
        MoveTo moveTo = new MoveTo();
        moveTo.setX(182);
        moveTo.setY(168);
        
        CubicCurveTo cabelloFerb21 = new CubicCurveTo();
        cabelloFerb21.setX(172);
        cabelloFerb21.setY(85);
        cabelloFerb21.setControlX1(212);
        cabelloFerb21.setControlY1(123);
        cabelloFerb21.setControlX2(186);
        cabelloFerb21.setControlY2(86);
        
        QuadCurveTo cabelloFerb22 = new QuadCurveTo();
        cabelloFerb22.setX(200);
        cabelloFerb22.setY(89);
        cabelloFerb22.setControlX(189);
        cabelloFerb22.setControlY(83);
        
        CubicCurveTo cabelloFerb23 = new CubicCurveTo();
        cabelloFerb23.setX(120);
        cabelloFerb23.setY(79);
        cabelloFerb23.setControlX1(170);
        cabelloFerb23.setControlY1(61);
        cabelloFerb23.setControlX2(121);
        cabelloFerb23.setControlY2(78);
        
        QuadCurveTo cabelloFerb24 = new QuadCurveTo();
        cabelloFerb24.setX(108);
        cabelloFerb24.setY(66);
        cabelloFerb24.setControlX(115);
        cabelloFerb24.setControlY(72);
        
        QuadCurveTo cabelloFerb25 = new QuadCurveTo();
        cabelloFerb25.setX(110);
        cabelloFerb25.setY(78);
        cabelloFerb25.setControlX(110);
        cabelloFerb25.setControlY(72);
        
        QuadCurveTo cabelloFerb26 = new QuadCurveTo();
        cabelloFerb26.setX(74);
        cabelloFerb26.setY(85);
        cabelloFerb26.setControlX(90);
        cabelloFerb26.setControlY(72);
        
        QuadCurveTo cabelloFerb27 = new QuadCurveTo();
        cabelloFerb27.setX(94);
        cabelloFerb27.setY(89);
        cabelloFerb27.setControlX(79);
        cabelloFerb27.setControlY(82);
        
        QuadCurveTo cabelloFerb28 = new QuadCurveTo();
        cabelloFerb28.setX(73);
        cabelloFerb28.setY(107);
        cabelloFerb28.setControlX(75);
        cabelloFerb28.setControlY(97);
        
        QuadCurveTo cabelloFerb29 = new QuadCurveTo();
        cabelloFerb29.setX(97);
        cabelloFerb29.setY(101);
        cabelloFerb29.setControlX(88);
        cabelloFerb29.setControlY(100);
        
        QuadCurveTo cabelloFerb30 = new QuadCurveTo();
        cabelloFerb30.setX(92);
        cabelloFerb30.setY(115);
        cabelloFerb30.setControlX(90);
        cabelloFerb30.setControlY(115);
        
        QuadCurveTo cabelloFerb31 = new QuadCurveTo();
        cabelloFerb31.setX(124);
        cabelloFerb31.setY(102);
        cabelloFerb31.setControlX(103);
        cabelloFerb31.setControlY(104);
        
        LineTo cabelloFerb32 = new LineTo();
        cabelloFerb32.setX(136);
        cabelloFerb32.setY(126);
        
        QuadCurveTo cabelloFerb33 = new QuadCurveTo();
        cabelloFerb33.setX(143);
        cabelloFerb33.setY(108);
        cabelloFerb33.setControlX(142);
        cabelloFerb33.setControlY(115);
        
        QuadCurveTo cabelloFerb34 = new QuadCurveTo();
        cabelloFerb34.setX(181);
        cabelloFerb34.setY(168);
        cabelloFerb34.setControlX(167);
        cabelloFerb34.setControlY(118);
        
        cabelloFerb.getElements().add(moveTo);
        cabelloFerb.getElements().add(cabelloFerb21);
        cabelloFerb.getElements().add(cabelloFerb22);
        cabelloFerb.getElements().add(cabelloFerb23);
        cabelloFerb.getElements().add(cabelloFerb24);
        cabelloFerb.getElements().add(cabelloFerb25);
        cabelloFerb.getElements().add(cabelloFerb26);
        cabelloFerb.getElements().add(cabelloFerb27);
        cabelloFerb.getElements().add(cabelloFerb28);
        cabelloFerb.getElements().add(cabelloFerb29);
        cabelloFerb.getElements().add(cabelloFerb30);
        cabelloFerb.getElements().add(cabelloFerb31);
        cabelloFerb.getElements().add(cabelloFerb32);
        cabelloFerb.getElements().add(cabelloFerb33);
        cabelloFerb.getElements().add(cabelloFerb34);
        
        cabelloFerb.setStroke(Color.DARKGREEN);
        cabelloFerb.setStrokeWidth(2);
        cabelloFerb.setFill(Color.rgb(55,165,54));
        
        root.getChildren().add(cabelloFerb);
        
        // DEDOS FERB
        Ellipse dedoFerb1 = new Ellipse(); 
        dedoFerb1.setCenterX(53);
        dedoFerb1.setCenterY(190);
        dedoFerb1.setRadiusX(10);
        dedoFerb1.setRadiusY(8);
        dedoFerb1.setStroke(Color.rgb(251,193,137));
        dedoFerb1.setFill(Color.rgb(254,225,200));
        dedoFerb1.setStrokeWidth(1.7);
        dedoFerb1.setRotate(328);
        
        Ellipse dedoFerb2 = new Ellipse(); 
        dedoFerb2.setCenterX(50);
        dedoFerb2.setCenterY(200);
        dedoFerb2.setRadiusX(9);
        dedoFerb2.setRadiusY(5.5);
        dedoFerb2.setStroke(Color.rgb(251,193,137));
        dedoFerb2.setFill(Color.rgb(254,225,200));
        dedoFerb2.setStrokeWidth(1.7);
        dedoFerb2.setRotate(345);
        
        Ellipse dedoFerb3 = new Ellipse(); 
        dedoFerb3.setCenterX(52);
        dedoFerb3.setCenterY(210);
        dedoFerb3.setRadiusX(9);
        dedoFerb3.setRadiusY(6);
        dedoFerb3.setStroke(Color.rgb(251,193,137));
        dedoFerb3.setFill(Color.rgb(254,225,200));
        dedoFerb3.setStrokeWidth(1.7);
        dedoFerb3.setRotate(350);
        
        Ellipse dedoFerb4 = new Ellipse(); 
        dedoFerb4.setCenterX(53);
        dedoFerb4.setCenterY(232);
        dedoFerb4.setRadiusX(10);
        dedoFerb4.setRadiusY(8);
        dedoFerb4.setStroke(Color.rgb(251,193,137));
        dedoFerb4.setFill(Color.rgb(254,225,200));
        dedoFerb4.setStrokeWidth(1.7);
        dedoFerb4.setRotate(5);
        
        Ellipse dedoFerb5 = new Ellipse(); 
        dedoFerb5.setCenterX(50);
        dedoFerb5.setCenterY(240);
        dedoFerb5.setRadiusX(9);
        dedoFerb5.setRadiusY(5.5);
        dedoFerb5.setStroke(Color.rgb(251,193,137));
        dedoFerb5.setFill(Color.rgb(254,225,200));
        dedoFerb5.setStrokeWidth(1.7);
        dedoFerb5.setRotate(345);
        
        Ellipse dedoFerb6 = new Ellipse(); 
        dedoFerb6.setCenterX(52);
        dedoFerb6.setCenterY(250);
        dedoFerb6.setRadiusX(9);
        dedoFerb6.setRadiusY(6);
        dedoFerb6.setStroke(Color.rgb(251,193,137));
        dedoFerb6.setFill(Color.rgb(254,225,200));
        dedoFerb6.setStrokeWidth(1.7);
        dedoFerb6.setRotate(350);
        
        Group dedosFerb = new Group();
        dedosFerb.getChildren().addAll(dedoFerb1, dedoFerb2, dedoFerb3, dedoFerb4, dedoFerb5, dedoFerb6);
        root.getChildren().add(dedosFerb);
        
        Path sombraCabello1 = new Path();
        ClosePath cerrarSombra1 = new ClosePath();
        
        MoveTo moveToSombra1 = new MoveTo();
        moveToSombra1.setX(141);
        moveToSombra1.setY(98);
        
        LineTo sombra1 = new LineTo();
        sombra1.setX(144);
        sombra1.setY(108);
        
        QuadCurveTo sombra2 = new QuadCurveTo();
        sombra2.setX(182);
        sombra2.setY(165);
        sombra2.setControlX(170);
        sombra2.setControlY(120);
        
        CubicCurveTo sombra3 = new CubicCurveTo();
        sombra3.setX(141);
        sombra3.setY(98);
        sombra3.setControlX1(197);
        sombra3.setControlY1(116);
        sombra3.setControlX2(160);
        sombra3.setControlY2(98);
        
        sombraCabello1.getElements().add(moveToSombra1);
        sombraCabello1.getElements().add(sombra1);
        sombraCabello1.getElements().add(sombra2);
        sombraCabello1.getElements().add(sombra3);
        
        sombraCabello1.setStroke(Color.rgb(35,129,13));
        sombraCabello1.setFill(Color.rgb(35,129,13));
        root.getChildren().add(sombraCabello1);
    }
}
