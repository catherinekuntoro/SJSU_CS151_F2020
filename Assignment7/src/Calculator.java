import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Calculator extends Application {

    //Instance vars
    private TextField outputField;
    private ArrayList<Button> digits;
    private Button plusSign;
    private Button minusSign;
    private Button multSign;
    private Button divSign;
    private Button eqSign;
    private String currentOperation;
    private Double firstOperand;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.currentOperation = "";
        this.firstOperand = 0.0;

        FlowPane root = new FlowPane(); //ok use flowpane? bc use flowlayout @ java awt

        GridPane gridPaneForAllButtons = new GridPane();

        GridPane gridPaneForNumberButtons = new GridPane();
        instantiateNumberButtons();

        int index = 0;
        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col <= 2; col++) {
                gridPaneForNumberButtons.add(digits.get(index), col, row);
                index++;
            }
        }

        GridPane gridPaneForOperatorButtonPanel = new GridPane();
        instantiateOperatorButtons();

        gridPaneForOperatorButtonPanel.add(plusSign, 0, 0);
        gridPaneForOperatorButtonPanel.add(minusSign, 0, 1);
        gridPaneForOperatorButtonPanel.add(multSign, 0, 2);
        gridPaneForOperatorButtonPanel.add(divSign, 0, 3);
        gridPaneForOperatorButtonPanel.add(eqSign, 0, 4);


        digits.get(11).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                resetValues();
            }
        });

        digits.get(10).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String currentText = outputField.getText();
                if (!currentText.contains(".")) {
                    outputField.setText(currentText + ".");
                }
            }
        });

        EventHandler<ActionEvent> eventForDigits = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Button source = (Button) event.getSource();
                if (source == plusSign) {
                    currentOperation = "+";
                } else if (source == minusSign) {
                    currentOperation = "-";
                } else if (source == multSign) {
                    currentOperation = "*";
                } else if (source == divSign) {
                    currentOperation = "/";
                }
                String currentText = outputField.getText();
                try {
                    firstOperand = new Double(currentText);
                    outputField.setText("0");
                } catch (NumberFormatException e) {
                    resetValues();
                }
            }
        };

        plusSign.setOnAction(eventForDigits);
        minusSign.setOnAction(eventForDigits);
        multSign.setOnAction(eventForDigits);
        divSign.setOnAction(eventForDigits);

        for (int i = 0; i <= 9; i++) {
            digits.get(i).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    String currentText = outputField.getText();
                    Button source = (Button) event.getSource();
                    String newDigit = "";

                    if (source == digits.get(0)) {
                        newDigit = "0";
                    } else if (source == digits.get(1)) {
                        newDigit = "1";
                    } else if (source == digits.get(2)) {
                        newDigit = "2";
                    } else if (source == digits.get(3)) {
                        newDigit = "3";
                    } else if (source == digits.get(4)) {
                        newDigit = "4";
                    } else if (source == digits.get(5)) {
                        newDigit = "5";
                    } else if (source == digits.get(6)) {
                        newDigit = "6";
                    } else if (source == digits.get(7)) {
                        newDigit = "7";
                    } else if (source == digits.get(8)) {
                        newDigit = "8";
                    } else if (source == digits.get(9)) {
                        newDigit = "9";
                    }

                    currentText = currentText + newDigit;
                    currentText = currentText.replaceFirst("^0+(?!$)", "");
                    outputField.setText(currentText);
                }
            });
        }

        eqSign.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double result = 0.0;
                String currentText = outputField.getText();
                try {
                    Double secondOperand = new Double(currentText);
                    if (currentOperation == "+") {
                        result = firstOperand + secondOperand;
                    } else if (currentOperation == "-") {
                        result = firstOperand - secondOperand;
                    } else if (currentOperation == "*") {
                        result = firstOperand * secondOperand;
                    } else if (currentOperation == "/") {
                        if (secondOperand != 0.0) {
                            result = firstOperand / secondOperand;
                        } else {
                            resetValues();
                            outputField.setStyle("-fx-background-color: pink");
                        }
                    }
                    outputField.setText(result.toString());
                    firstOperand = result;
                } catch (NumberFormatException e) {
                    resetValues();
                }
            }
        });

        //on the left side, numbers
        gridPaneForAllButtons.add(gridPaneForNumberButtons, 0, 1);
        //on the right side, operator
        gridPaneForAllButtons.add(gridPaneForOperatorButtonPanel, 1, 1);
        outputField = new TextField("0");
        gridPaneForAllButtons.add(outputField, 0, 0);
        //to add all of the other panes
        root.getChildren().addAll(gridPaneForAllButtons);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.setMinHeight(200);
        primaryStage.setMinWidth(500);
        primaryStage.show();
    }

    private void instantiateOperatorButtons() {
        plusSign = new Button("+");
        minusSign = new Button("-");
        multSign = new Button("*");
        divSign = new Button("/");
        eqSign = new Button("=");

        plusSign.setStyle("-fx-background-color: darkseagreen");
        minusSign.setStyle("-fx-background-color: darkseagreen");
        multSign.setStyle("-fx-background-color: darkseagreen");
        divSign.setStyle("-fx-background-color: darkseagreen");
        eqSign.setStyle("-fx-background-color: green");
    }

    private void instantiateNumberButtons() {
        digits = new ArrayList<>();
        digits.add(new Button("0"));
        digits.add(new Button("1"));
        digits.add(new Button("2"));
        digits.add(new Button("3"));
        digits.add(new Button("4"));
        digits.add(new Button("5"));
        digits.add(new Button("6"));
        digits.add(new Button("7"));
        digits.add(new Button("8"));
        digits.add(new Button("9"));
        digits.add(new Button("."));
        digits.add(new Button("AC"));

        digits.get(10).setStyle("-fx-background-color: magenta");
        digits.get(11).setStyle("-fx-background-color: magenta");
    }

    private void resetValues() {
        currentOperation = "";
        firstOperand = 0.0;
        outputField.setText("0");
        outputField.setStyle("-fx-background-color: white");

    }
}
