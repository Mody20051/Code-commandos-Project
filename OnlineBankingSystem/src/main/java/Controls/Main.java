package Controls;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    CustomerSignIn signIn;
    CustomerSignUp signUp;
    public void start(Stage stage) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("menu.fxml"));
        signIn =new CustomerSignIn();
        signUp=new CustomerSignUp();
        stage.setScene(new Scene(root));
        stage.show();

    }

    public static void main(String[] args) {

        launch(args);
    }
}