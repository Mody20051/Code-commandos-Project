package Controls;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    CustomerSignIn signIn;
    CustomerSignUp signUp;
    public void start(Stage stage) {
        signIn =new CustomerSignIn();
        signUp=new CustomerSignUp();
        stage.setScene(signUp.getScene());
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}