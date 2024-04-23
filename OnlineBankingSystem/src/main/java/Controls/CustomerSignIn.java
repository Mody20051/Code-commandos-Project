package Controls;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
public class CustomerSignIn {
        Label email;
        Label password;
        TextField emailTextfield;
        PasswordField passwordField;
        Button signInButton;
        Button signUpButton;
        ImageView LogoimageView;

        GridPane gridPane;
        CustomerSignIn() {
            InitalizedControl();
            Control();
        }

        void InitalizedControl(){
            email=new Label("Email");
            password=new Label("Password");
            emailTextfield=new TextField();
            passwordField=new PasswordField();
            signInButton=new Button("SignIn");
            signUpButton=new Button("SignUp");
            LogoimageView=new ImageView("https://imgs.search.brave.com/o-QFW3oQMUtXIwER8FF5SPb4wyZuo_OpQZYXPHeO5y8/rs:fit:860:0:0/g:ce/aHR0cHM6Ly90NC5m/dGNkbi5uZXQvanBn/LzA3LzYxLzgzLzY1/LzM2MF9GXzc2MTgz/NjU0M196aFI5MnBp/UFZkcnpQSThOamN5/MVRSckhuenBpQ3I4/Sy5qcGc");

            gridPane=new GridPane();
        }

        void Control(){
            gridPane.add(email,0,0);
            gridPane.add(emailTextfield,0,1);
            gridPane.add(password,1,0);
            gridPane.add(passwordField,1,1);
            gridPane.add(signInButton,0,2);
            gridPane.add(signUpButton,1,2);
            gridPane.add(LogoimageView,0,3,2,1);
            gridPane.setHgap(20);
            gridPane.setVgap(20);
        }

        Scene getScene(){
            return new Scene(gridPane,600,540);
        }

    }
