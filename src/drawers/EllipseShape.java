package drawers;

import java.awt.*;

public class EllipseShape extends Shape {

    @Override
    public void show(Graphics g, boolean isMark) {
        int x = Math.min(xs1, xs2);
        int y = Math.min(ys1, ys2);
        int width = Math.abs(xs2 - xs1);
        int height = Math.abs(ys2 - ys1);

        if (isMark) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.BLACK);
        }
        g.drawOval(x, y, width, height);
    }
}
