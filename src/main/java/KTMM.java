import java.awt.*;

public class KTMM {
    public static void main(String...args) throws Exception {
        Robot robot = new Robot();
        while(true) {
            Thread.sleep(60*1000);
            PointerInfo pointerInfo = MouseInfo.getPointerInfo();
            Point p = pointerInfo.getLocation();
            robot.mouseMove(p.x+1, p.y+1);
            Thread.sleep(100);
            PointerInfo pointerInfo2 = MouseInfo.getPointerInfo();
            Point p2 = pointerInfo2.getLocation();
            robot.mouseMove(p2.x-1, p2.y-1);
        }
    }

}
