package ds_base64;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Base64EncoderDecoderApp extends Application {
    private Base64Encode b64e;
    private Base64Decode b64d;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        b64e = new Base64Encode();
        b64d = new Base64Decode();

        primaryStage.setTitle("Base64 Encoder/Decoder");

        // Input area
        Label inputLabel = new Label("Enter text to encode:");
        TextArea inputTextArea = new TextArea();
        inputTextArea.setPrefRowCount(3);
        inputTextArea.setPrefColumnCount(40);