package es.ieslosmontecillos.appusoselector;

import es.ieslosmontecillos.componentes_gomezantonio.SelectorDeslizamiento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class UsoSelectorController implements Initializable {
    ArrayList<String> arraylistSelector = new ArrayList<String>();

    @FXML
    private SelectorDeslizamiento selector1;
    @FXML
    private Label lblTitulo;
    @FXML
    private SelectorDeslizamiento selector2;
    @FXML
    private Label lblSeleccionado;


    @FXML
    public void mostrarPulsado(ActionEvent actionEvent) {
        if(actionEvent.getSource() == selector1)
            lblSeleccionado.setText(selector1.getId());
        else if(actionEvent.getSource() == selector2)
            lblSeleccionado.setText(selector2.getId());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selector1.setRepetitive(true);
        selector2.setRepetitive(true);
        arraylistSelector.add("Uno");
        arraylistSelector.add("Dos");
        arraylistSelector.add("Tres");
        selector1.setItems(arraylistSelector);
        selector2.setItems(arraylistSelector);
    }
}