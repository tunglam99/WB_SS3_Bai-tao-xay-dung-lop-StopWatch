
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date andTime;

    public StopWatch() {
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getAndTime() {
        return this.andTime;
    }

    public void start(){
        this.startTime = new Date();
    }

    public void stop() {
        this.andTime = new Date();
    }

    public double getElapsedTime() {
        return this.andTime.getTime() - this.startTime.getTime();
    }


}
