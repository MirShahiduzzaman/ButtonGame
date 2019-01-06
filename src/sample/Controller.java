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

    Timer buttonTimer = new Timer();

    public void bluePress()
    {
        blue.setOpacity(0.5);
        buttonTimer.scheduleAtFixedRate(createNewTask(blue),500,500);
    }
    public void redPress()
    {
        red.setOpacity(0.5);
        buttonTimer.scheduleAtFixedRate(createNewTask(red),500,500);
    }
    public void yellowPress()
    {
        yellow.setOpacity(0.5);
        buttonTimer.scheduleAtFixedRate(createNewTask(yellow),500,500);
    }
    public void greenPress()
    {
        green.setOpacity(0.5);
        buttonTimer.scheduleAtFixedRate(createNewTask(green),500,500);
    }

    /** Afaq Anwar
     * Generates a TimerTask to set the opacity to 1 for a specified Button.
     *      TimerTasks cannot be reused, thus the creation of a new TimerTask is needed.
     *      A more elegant solution would be to use a SequentialTransition with a FillTransition.
     * @param button Any Button within the current Scene.
     * @return TimerTask that sets the button opacity to 1.
     */
    private TimerTask createNewTask(Button button) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                button.setOpacity(1);
            }
        };
        return task;
    }
}
