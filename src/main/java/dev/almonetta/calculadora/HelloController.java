package dev.almonetta.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private TextField numeroUno;

    @FXML
    private TextField numeroDos;

    @FXML
    private Label resultex;

    public TextField getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(TextField numeroUno) {
        this.numeroUno = numeroUno;
    }

    public TextField getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(TextField numeroDos) {
        this.numeroDos = numeroDos;
    }

    public Label getResultex() {
        return resultex;
    }

    public void setResultex(Label resultex) {
        this.resultex = resultex;
    }

    @FXML
    public void onSuma() {
        try {
            double numeroUno = Double.parseDouble(this.getNumeroUno().getText());
            double numeroDos = Double.parseDouble(this.getNumeroDos().getText());
            double sum = numeroUno + numeroDos;
            this.getResultex().setText("" + sum);
        } catch (NumberFormatException e) {
            resultex.setText("Error, ingrese numero valido.");
        }
    }

    @FXML
    public void onResta() {
        try {
            double numeroUno = Double.parseDouble(this.getNumeroUno().getText());
            double numeroDos = Double.parseDouble(this.getNumeroDos().getText());
            double resta = numeroUno - numeroDos;
            this.getResultex().setText("" + resta);
        } catch (NumberFormatException e) {
            resultex.setText("Error, Ingrese numero valido.");
        }
    }

    @FXML
    public void onMulti () {
        try {
            double numeroUno = Double.parseDouble(this.getNumeroUno().getText());
            double numeroDos = Double.parseDouble(this.getNumeroDos().getText());
            double multi = numeroUno * numeroDos;
            this.getResultex().setText("" + multi);
        } catch(NumberFormatException e){
            resultex.setText("Error, Ingrese numero valido.");
        }
    }

    @FXML
    private void onDivision () {
        try {
            double numeroUno = Double.parseDouble(this.getNumeroUno().getText());
            double numeroDos = Double.parseDouble(this.getNumeroDos().getText());
            double div;
            if (numeroDos == 0){
                resultex.setText("El numero no se puede dividir por zero");
            }else {
                div = numeroUno / numeroDos;
                this.getResultex().setText("" + div);
            }

        } catch (NumberFormatException e){resultex.setText("Error, Ingrese un numero valido.");}

    }
    @FXML
    private void onModulo(){
        try {
            double numeroUno = Double.parseDouble(this.getNumeroUno().getText());
            double numeroDos = Double.parseDouble(this.getNumeroDos().getText());
            double modulo;
            if(numeroDos==0){resultex.setText("El numero no se puede calular modulo zero,");}
            else {
                modulo = numeroUno % numeroDos;
                this.resultex.setText("" + modulo);

            }
        }catch (NumberFormatException e){resultex.setText("Error, ingrese numero valido.");}
    }
}
