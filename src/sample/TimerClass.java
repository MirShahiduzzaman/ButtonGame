package sample;

import java.util.Timer;
import java.util.TimerTask;

public class TimerClass
{
    Timer timer1;
    private int timeCounter = 0;

    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            setTimeCounter(getTimeCounter()+1);
        }
    };

    public TimerClass()
    {
        timer1 = new Timer();
    }

    public int getTimeCounter()
    {
        return timeCounter;
    }

    public void setTimeCounter(int time)
    {
        timeCounter = time;
    }
}
