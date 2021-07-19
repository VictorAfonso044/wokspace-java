/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Tela_CalculadoraController implements Initializable {

    double valor1 = 0;
    double valor2 = 0;
    double resultado = 0;
    
    String operacao = "";
    
    @FXML
    private javafx.scene.control.TextField telaTexField;
    @FXML
    private Button button9;
    @FXML
    private Button button8;
    @FXML
    private Button button7;
    @FXML
    private Button button6;
    @FXML
    private Button button5;
    @FXML
    private Button button4;
    @FXML
    private Button button3;
    @FXML
    private Button button2;
    @FXML
    private Button button1;
    @FXML
    private Button button0;
    
    @FXML
    private Button soma;
    @FXML
    private Button menos;
    @FXML
    private Button multiplicacao;
    @FXML
    private Button divisao;
    @FXML
    private Button igual;
    @FXML
    private Button apagar;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
               igual.setOnAction(new EventHandler<ActionEvent>()) {
                   if(operacao == '/'){
                       resultado = valor1 / valor2;
                   }else if(operacao == '*'){
                       resultado = valor1 * valor2;
                   }else if(operacao == '-'){
                       resultado = valor1 - valor2;
                   }else if(operacao == '+'){
                       resultado = valor1 + valor2;
                   }
                   return telaTexField.setText(resultado);
        }
               
               
               
               
                             
               somabutton.setOnAction(new EventHandler<ActionEvent>() {
                   @Override
                   public void handle(ActionEvent event) {                       
                    valor1 = Double.parseDouble(telaTexField.getText());
                    telaTexField.setText("");
                    operacao = "+";
                   }
                  });
               menosbutton.setOnAction(new EventHandler<ActionEvent>() {
                   @Override
                   public void handle(ActionEvent event) {                       
                    valor1 = Double.parseDouble(telaTexField.getText());
                    telaTexField.setText("");
                    operacao = "-";
                   }
                  });
               multiplicacaobutton.setOnAction(new EventHandler<ActionEvent>() {
                   @Override
                   public void handle(ActionEvent event) {                       
                    valor1 = Double.parseDouble(telaTexField.getText());
                    telaTexField.setText("");
                    operacao = "*";
                   }
                  });
               divisaobutton.setOnAction(new EventHandler<ActionEvent>() {
                   @Override
                   public void handle(ActionEvent event) {                       
                    valor1 = Double.parseDouble(telaTexField.getText());
                    telaTexField.setText("");
                    operacao = "/";
                   }
                  });
               somabutton.setOnAction(new EventHandler<ActionEvent>() {
                   @Override
                   public void handle(ActionEvent event) {                       
                    valor1 = Double.parseDouble(telaTexField.getText());
                    telaTexField.setText("");
                    operacao = "+";
                   }
                  });
               
    }    
              
}
