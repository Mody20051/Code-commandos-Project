package Controls;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
public class CustomerSignUp {
    Label name;
    Label password;
    Label Email;
    TextField nameField;
    PasswordField passwordField;
    TextField emailField;
    ToggleButton male,female;
    ToggleGroup Gender;
    DatePicker datePicker;
    CheckBox checkBox;
    Button signUp;
    GridPane gridpane;



    CustomerSignUp(){
        InitalizedControl();
        control();
    }
    void InitalizedControl(){
        name=new Label("Name");
        Email=new Label("Email");
        password=new Label("Password");
        nameField=new TextField();
        passwordField=new PasswordField();
        emailField=new TextField();
        male =new ToggleButton("Male");
        female=new ToggleButton("Female");
        Gender=new ToggleGroup();
        Gender.getToggles().addAll(male,female);
        datePicker=new DatePicker();
        checkBox=new CheckBox("I agree to all terms");
        signUp=new Button("SignUp");
        gridpane=new GridPane();
    }
    void control(){
        gridpane.add(name,0,0);
        gridpane.add(nameField,0,1);
        gridpane.add(Email,1,0);
        gridpane.add(emailField,1,1);
        gridpane.add(password,0,2);
        gridpane.add(passwordField,1,2);
        gridpane.add(male,0,3);
        gridpane.add(female,1,3);
        gridpane.add(datePicker,0,4,2,1);
        gridpane.add(checkBox,0,5,2,1);
        gridpane.add(signUp,0,6,2,1);
        gridpane.setHgap(10);
        gridpane.setVgap(10);
        gridpane.setAlignment(Pos.CENTER);

    }
    Scene getScene(){
        return new Scene(gridpane,400,400);
    }
}
