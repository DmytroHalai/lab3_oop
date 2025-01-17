package utils;

import drawers.PointShape;

import java.awt.*;

public class PointEditor extends ShapeEditor {
    private PointShape currentPoint;

    @Override
    public void onLBdown(Graphics g, int x, int y) {
        super.onLBdown(g, x, y);
        currentPoint = new PointShape();
        currentPoint.set(x, y, x, y);
    }

    @Override
    public void onLBup(Graphics g) {
        super.onLBup(g);
        addShape(currentPoint);
        currentPoint = null;
    }
}
