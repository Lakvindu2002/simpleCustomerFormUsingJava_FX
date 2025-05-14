package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerFormController {

    public TextField txtid;
    public TextField txtname;
    public TextField txtphone;
    public TextField txtemail;
    public TextField txtaddress;
    public TextField txtsalary;

   ArrayList <Customer> customerList= new ArrayList<>();//this is array list
//    List <Customer> l1=new ArrayList<>();
    public void addCustomerOnAction(ActionEvent actionEvent) {
        customerList.add(new Customer(txtid.getText(),txtname.getText(),txtphone.getText(),txtemail.getText(),txtaddress.getText(),Double.parseDouble(txtsalary.getText())));

    }


    public void reloadOnAction(ActionEvent actionEvent) {

    }
}
