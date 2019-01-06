/**Mir Shahiduzzaman*/
package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller
{
    @FXML
    Button blue;
    @FXML
    Button red;
    @FXML
    Button yellow;
    @FXML
    Button green;
    public void bluePress()
    {
        blue.setOpacity(0.5);
    }
    public void redPress()
    {
        red.setOpacity(0.5);
    }
    public void yellowPress()
    {
        yellow.setOpacity(0.5);
    }
    public void greenPress()
    {
        green.setOpacity(0.5);
    }
}
