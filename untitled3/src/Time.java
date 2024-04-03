import javax.security.auth.login.LoginException;
import java.text.ParseException;

public class Time {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public void Time(int hours, int minutes, int seconds){
        if (hours >= 0 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        else {
            throw new RuntimeException("Ошибка ввода времени");
        }
    }

    @Override
    public String toString(){
        return hours + " ч " + minutes + " мин " + seconds + " сек";
    }

    public void addition(int hours1, int minutes1, int seconds1) {
        if (hours1 >= 0 && minutes1 >= 0 && minutes1 < 60 && seconds1 >= 0 && seconds1 < 60) {
            int totalSeconds = 3600 * (hours + hours1) + 60 * (minutes + minutes1) + (seconds + seconds1);
            int totalHours = totalSeconds / 3600;
            int totalMinutes = (totalSeconds - 3600 * totalHours) / 60;
            totalSeconds = totalSeconds - 3600 * totalHours - 60 * totalMinutes;
            hours = totalHours % 24;
            minutes = totalMinutes;
            seconds = totalSeconds;
        }
        else {
            throw new RuntimeException("Ошибка ввода времени");
        }
    }

    public void difference(int hours1, int minutes1, int seconds1) {
        if (hours1 >= 0 && minutes1 >= 0 && minutes1 < 60 && seconds1 >= 0 && seconds1 < 60) {
            int totalSeconds = 3600 * (hours - hours1) + 60 * (minutes - minutes1) + (seconds - seconds1);
            int totalHours = totalSeconds / 3600;
            int totalMinutes = (totalSeconds - 3600 * totalHours) / 60;
            totalSeconds = totalSeconds - 3600 * totalHours - 60 * totalMinutes;
            hours = totalHours % 24;
            minutes = totalMinutes;
            seconds = totalSeconds;
        }
        else {
            throw new RuntimeException("Ошибка ввода времени");
        }
    }
}