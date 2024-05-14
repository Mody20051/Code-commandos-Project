package Controls;
import Controls.CustomerSignIn;
import Controls.CustomerSignUp;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FxMain extends Application {
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