import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application {
    //2D and 3D Shape
    private Rectangle rectangle;
    private Polygon polygon;
    private Sphere sphere;
    private Cylinder cylinder;

    //Rotate Transition Buttons
    private Button rotateTransitionButtonPolygon;
    private Button rotateTransitionButtonRectangle;
    private Button rotateTransitionButtonCylinder;
    private Button rotateTransitionButtonSphere;

    //Scale Transition Buttons
    private Button scaleTransitionButtonPolygon;
    private Button scaleTransitionButtonRectangle;
    private Button scaleTransitionButtonCylinder;
    private Button scaleTransitionButtonSphere;

    //Sequential Transition Buttons
    private Button sequentialTransitionButtonPolygon;
    private Button sequentialTransitionButtonRectangle;
    private Button sequentialTransitionButtonCylinder;
    private Button sequentialTransitionButtonSphere;

    private Button fadeTransitionButtonPolygon;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        int rows = 2; //2 rows, 2 columns
        int columns = 2;

        GridPane root = new GridPane();
        FlowPane flowPanePolygon = new FlowPane();
        FlowPane flowPaneRectangle = new FlowPane();
        FlowPane flowPaneSphere = new FlowPane();
        FlowPane flowPaneCylinder = new FlowPane();

        //Setting up the borders
        for (int i = 0; i < columns; i++) {
            //50 pixels wide
            ColumnConstraints columnConstraints = new ColumnConstraints(300);
            root.getColumnConstraints().add(columnConstraints);
        }

        for (int i = 0; i < rows; i++) {
            //50 pixels wide
            RowConstraints rowConstraints = new RowConstraints(300);
            root.getRowConstraints().add(rowConstraints);
        }

        //Set up 2D items, add to flow pane and then root--------------
        setUpPolygon();
        flowPanePolygon.getChildren().add(polygon);

        setUpRectangle();
        flowPaneRectangle.getChildren().add(rectangle);

        //set up 3d items, add to flow pane and then root---------------
        setUpCylinder();
        flowPaneCylinder.getChildren().add(cylinder);

        setUpSphere();
        flowPaneSphere.getChildren().add(sphere);

        //adding flow panes to root grid pane:-----------------------
        root.add(flowPanePolygon, 0, 0);
        root.add(flowPaneRectangle, 1, 0);
        root.add(flowPaneCylinder, 0, 1);
        root.add(flowPaneSphere, 1, 1);

        //Making rotate transition buttons --------------------------------------
        setUpRotateTransitionPolygonButton();
        flowPanePolygon.getChildren().add(rotateTransitionButtonPolygon);

        setUpRotateTransitionRectangleButton();
        flowPaneRectangle.getChildren().add(rotateTransitionButtonRectangle);


        setUpRotateTransitionCylinderButton();
        flowPaneCylinder.getChildren().add(rotateTransitionButtonCylinder);

        setUpRotateTransitionSphereButton();
        flowPaneSphere.getChildren().add(rotateTransitionButtonSphere);

        //Making scale transition buttons-------------------------------
        setUpScaleTransitionPolygonButton();
        flowPanePolygon.getChildren().add(scaleTransitionButtonPolygon);

        setUpScaleTransitionRectangleButton();
        flowPaneRectangle.getChildren().add(scaleTransitionButtonRectangle);

        setUpScaleTransitionCylinderButton();
        flowPaneCylinder.getChildren().add(scaleTransitionButtonCylinder);

        setUpScaleTransitionSphereButton();
        flowPaneSphere.getChildren().add(scaleTransitionButtonSphere);

        //Making sequential transition buttons--------------------------
        setUpSequentialTransitionPolygonButton();
        flowPanePolygon.getChildren().add(sequentialTransitionButtonPolygon);

        setUpSequentialTransitionRectangleButton();
        flowPaneRectangle.getChildren().add(sequentialTransitionButtonRectangle);

        setUpSequentialTransitionSphereButton();
        flowPaneSphere.getChildren().add(sequentialTransitionButtonSphere);

        setUpSequentialTransitionCylinderButton();
        flowPaneCylinder.getChildren().add(sequentialTransitionButtonCylinder);


        //Making fade transition 4 polygon button-----------------------
        setUpFadeTransitionPolygonButton();
        flowPanePolygon.getChildren().add(fadeTransitionButtonPolygon);


        root.setStyle("-fx-background-color: white; -fx-grid-lines-visible: true");
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Animation");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(600);
        primaryStage.show();
    }

    private void setUpFadeTransitionPolygonButton() {
        fadeTransitionButtonPolygon = new Button("Fade Transition");
        fadeTransitionButtonPolygon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.seconds(3), polygon);
                ft.setFromValue(1.0f);
                ft.setToValue(0.3f);
                ft.setCycleCount(2);
                ft.setAutoReverse(true);
                ft.play();
            }
        });
    }

    private void setUpSequentialTransitionPolygonButton() {
        sequentialTransitionButtonPolygon = new Button("Sequential Transition");
        FadeTransition ft = new FadeTransition(Duration.seconds(3));
        ft.setFromValue(1.0f);
        ft.setToValue(0.3f);
        ft.setCycleCount(1);
        ft.setAutoReverse(true);

        TranslateTransition tt = new TranslateTransition(Duration.seconds(3));
        tt.setFromX(-50f);
        tt.setToX(25f);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);

        sequentialTransitionButtonPolygon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SequentialTransition seqT = new SequentialTransition(polygon, ft, tt);
                seqT.play();
            }
        });
    }

    private void setUpSequentialTransitionRectangleButton() {
        sequentialTransitionButtonRectangle = new Button("Sequential Transition");
        FadeTransition ft = new FadeTransition(Duration.seconds(3));
        ft.setFromValue(1.0f);
        ft.setToValue(0.3f);
        ft.setCycleCount(1);
        ft.setAutoReverse(true);

        TranslateTransition tt = new TranslateTransition(Duration.seconds(3));
        tt.setFromX(-50f);
        tt.setToX(25f);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);

        sequentialTransitionButtonRectangle.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SequentialTransition seqT = new SequentialTransition(rectangle, ft, tt);
                seqT.play();
            }
        });
    }

    private void setUpSequentialTransitionCylinderButton() {
        sequentialTransitionButtonCylinder = new Button("Sequential Transition");
        TranslateTransition tt = new TranslateTransition(Duration.seconds(3));
        tt.setFromX(-50f);
        tt.setToX(25f);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);

        RotateTransition rt = new RotateTransition(Duration.seconds(3));
        rt.setByAngle(360);
        rt.setAutoReverse(true);

        sequentialTransitionButtonCylinder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SequentialTransition seqT = new SequentialTransition(cylinder, tt, rt);
                seqT.play();
            }
        });
    }

    private void setUpSequentialTransitionSphereButton() {
        sequentialTransitionButtonSphere = new Button("Sequential Transition");
        TranslateTransition tt = new TranslateTransition(Duration.seconds(3));
        tt.setFromX(-50f);
        tt.setToX(25f);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);

        ScaleTransition st = new ScaleTransition(Duration.seconds(3));
        st.setByX(1.5f);
        st.setByY(1.5f);
        st.setCycleCount(4);
        st.setAutoReverse(true);

        sequentialTransitionButtonSphere.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SequentialTransition seqT = new SequentialTransition(sphere, tt, st);
                seqT.play();
            }
        });
    }

    private void setUpScaleTransitionPolygonButton() {
        scaleTransitionButtonPolygon = new Button("Scale Transition");
        scaleTransitionButtonPolygon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScaleTransition st = new ScaleTransition(Duration.seconds(3), polygon);
                st.setByX(1.5f);
                st.setByY(1.5f);
                st.setCycleCount(4);
                st.setAutoReverse(true);

                st.play();
            }
        });
    }

    private void setUpScaleTransitionRectangleButton() {
        scaleTransitionButtonRectangle = new Button("Scale Transition");
        scaleTransitionButtonRectangle.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScaleTransition st = new ScaleTransition(Duration.seconds(3), rectangle);
                st.setByX(1.5f);
                st.setByY(1.5f);
                st.setCycleCount(4);
                st.setAutoReverse(true);

                st.play();
            }
        });
    }

    private void setUpScaleTransitionCylinderButton() {
        scaleTransitionButtonCylinder = new Button("Scale Transition");
        scaleTransitionButtonCylinder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScaleTransition st = new ScaleTransition(Duration.seconds(3), cylinder);
                st.setByX(1.5f);
                st.setByY(1.5f);
                st.setCycleCount(4);
                st.setAutoReverse(true);

                st.play();
            }
        });
    }

    private void setUpScaleTransitionSphereButton() {
        scaleTransitionButtonSphere = new Button("Scale Transition");
        scaleTransitionButtonSphere.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScaleTransition st = new ScaleTransition(Duration.seconds(3), sphere);
                st.setByX(1.5f);
                st.setByY(1.5f);
                st.setCycleCount(4);
                st.setAutoReverse(true);

                st.play();
            }
        });
    }

    private void setUpRotateTransitionPolygonButton() {
        rotateTransitionButtonPolygon = new Button("Rotate Transition");
        rotateTransitionButtonPolygon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RotateTransition rotateTransition = new RotateTransition(Duration.seconds(3), polygon);
                rotateTransition.setByAngle(360);
                rotateTransition.play();
            }
        });
    }

    private void setUpRotateTransitionRectangleButton() {
        rotateTransitionButtonRectangle = new Button("Rotate Transition");

        rotateTransitionButtonRectangle.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RotateTransition rotateTransition = new RotateTransition(Duration.seconds(3), rectangle);
                rotateTransition.setByAngle(360);
                rotateTransition.play();
            }
        });
    }

    private void setUpRotateTransitionCylinderButton() {
        rotateTransitionButtonCylinder = new Button("Rotate Transition");
        rotateTransitionButtonCylinder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RotateTransition rotateTransition = new RotateTransition(Duration.seconds(3), cylinder);
                rotateTransition.setByAngle(360);
                rotateTransition.play();
            }
        });
    }

    private void setUpRotateTransitionSphereButton() {
        rotateTransitionButtonSphere = new Button("Rotate Transition");
        rotateTransitionButtonSphere.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RotateTransition rotateTransition = new RotateTransition(Duration.seconds(3), sphere);
                rotateTransition.setByAngle(360);
                rotateTransition.play();
            }
        });
    }

    private void setUpPolygon() {
        polygon = new Polygon();
        polygon.getPoints().addAll(0.0, 0.0,
                100.0, 50.0,
                50.0, 100.0);
        polygon.setFill(Color.CORNFLOWERBLUE);
    }

    private void setUpRectangle() {
        rectangle = new Rectangle();
        rectangle.setHeight(100);
        rectangle.setWidth(100);
        rectangle.setFill(Color.ORCHID);
    }

    private void setUpSphere() {
        sphere = new Sphere(100);
        PhongMaterial phongMaterial = new PhongMaterial();
        phongMaterial.setDiffuseColor(Color.DARKSEAGREEN);
        sphere.setMaterial(phongMaterial);
    }

    private void setUpCylinder() {
        cylinder = new Cylinder(100, 200);
        PhongMaterial phongMaterial = new PhongMaterial();
        phongMaterial.setDiffuseColor(Color.LAVENDERBLUSH);
        cylinder.setMaterial(phongMaterial);
    }
}
