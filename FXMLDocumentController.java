/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package midterm_2211105_sec4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField ShowTransactionIDOnClick;
    @FXML
    private TextField showIncomeNameOnClick;
    @FXML
    private TextField showIncomeAmountOnClick;
    @FXML
    private TextField showTaxRateOnClick;
    @FXML
    private TextField showTranIDOnClick;
    @FXML
    private TextField showExpenseNameOnClick;
    @FXML
    private TextField shoeExpenseAmountOnClick;
    @FXML
    private ComboBox<?> shoIncomeCategoryOnClick;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
