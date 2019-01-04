/**Mir Shahiduzzaman*/
package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller
{
    @FXML
    private Button blue;
    public void pressButton() {
        blue.setOpacity(0.5);
    }
}
