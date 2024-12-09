package rubrica.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ElencoPreferitiController {
    @FXML
    public TextField barraDiRicercaPreferiti;

    @FXML
    public Button contatti;

    @FXML
    public Button preferiti;

    public void onContattiClickButton(ActionEvent getActionEvent) {
        if(SupportControllers.getDisplayMode() == true){
            SupportControllers.cambioSchermataLight(contatti, "/rubrica/Views/ElencoContattiView.fxml");
        }else{
            SupportControllers.cambioSchermataDark(contatti, "/rubrica/Views/ElencoContattiView.fxml");
        }
    }

    public void onPreferitiClickButton(ActionEvent getActionEvent) {
        if(SupportControllers.getDisplayMode() == true) {
            SupportControllers.cambioSchermataLight(preferiti, "/rubrica/Views/ElencoPreferitiView.fxml");
        }else{
            SupportControllers.cambioSchermataDark(preferiti, "/rubrica/Views/ElencoPreferitiView.fxml");
        }
    }

    //Metodo per passare dalla vis.Preferiti alla vis.Contatti
    // cliccando sulla barra di ricerca di vis.Preferiti

    /*public void onBarraDiRicercaMouseReleased(ActionEvent getActionEvent) {
        barraDiRicercaPreferiti.setFocusTraversable(false);
        try {
            Parent nuovaScenaRoot = FXMLLoader.load(getClass().getResource("/rubrica/Views/ElencoContattiView.fxml"));
            Scene nuovaScena = new Scene(nuovaScenaRoot);

            Stage stage = (Stage) barraDiRicercaPreferiti.getScene().getWindow();
            stage.setScene(nuovaScena);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    /* DISPLAY MODE ZONE :') */
    @FXML
    public MenuItem lightMode;

    @FXML
    public MenuItem darkMode;

    @FXML
    public SplitPane rootSplitPane;


    public void onLightClickMouse(ActionEvent getActionEvent) {
        // Decido che false sia la modalità scura
        //     mentre true la modalità luminosa
        SupportControllers.setDisplayMode(true);
        rootSplitPane.getStylesheets().clear();
    }

    public void onDarkClickMouse(ActionEvent getActionEvent) {
        // Decido che false sia la modalità scura
        //     mentre true la modalità luminosa
        SupportControllers.setDisplayMode(false);
        rootSplitPane.getStylesheets().add(getClass().getResource("/CSS/DarkMode.css").toExternalForm());
    }
}
