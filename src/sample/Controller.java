/**Mir Shahiduzzaman*/
package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.Timer;
import java.util.TimerTask;

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

    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            blue.setOpacity(1);
        }
    };

    public void bluePress()
    {
        blue.setOpacity(0.5);
        timer.scheduleAtFixedRate(task,500,500);
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
