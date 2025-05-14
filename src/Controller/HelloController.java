package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import model.Customer;

import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    public TextField txtUserName;
    public PasswordField txtPwd;
    public Button btnLogin;
    public Label txtmsg;

    Customer [] customerList=new Customer[0];

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }


//    public void btnLoginOnAction(ActionEvent actionEvent) {
//
//        final String cemail="Lakvindu@gmail.com";
//        final String cpwd="1234";
//        String email=txtUserName.getText();
//        String pwd=txtPwd.getText();
//        txtUserName.setText("");
//        txtPwd.setText("");
//
//        if(cemail.equals(email) && cpwd.equals(pwd)){
//            Customer c1=new Customer(email,pwd);
//            addCustomer(c1);
//            txtmsg.setText("Login Success..!");
//            new Alert(Alert.AlertType.INFORMATION,"Login Success").show();
//
//        }else{
//            txtmsg.setText("Login Failed...!");
//            new Alert(Alert.AlertType.ERROR,"Login Failed").show();
//
//        }
//
//
//
//
//    }
//
//    public void extenArray(){
//
//        Customer [] temArray=new Customer[customerList.length+1];
//        for(int i=0;i<customerList.length;i++){
//            temArray[i]=customerList[i];
//
//        }
//        customerList=temArray;
//    }
//
//    public void addCustomer(Customer c1){
//        extenArray();
//        customerList[customerList.length-1]=c1;
//
//        System.out.println("customer object : "+c1);
//
//    }
}
