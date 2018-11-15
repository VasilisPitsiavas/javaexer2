package lesson03;

/**
 *
 * @author Grigorios Tsoumakas
 */
public class ClockDisplayApp {
    public static void main(String[] args) {
        ClockDisplay c = new ClockDisplay();
        c.setTime(14,30);
        c.timeTick();
        String s = c.getDisplayTime();
        System.out.println(s);
    }
}
