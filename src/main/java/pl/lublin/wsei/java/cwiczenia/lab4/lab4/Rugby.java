package pl.lublin.wsei.java.cwiczenia.lab4.lab4;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rugby extends Kulka {
    private double rx;
    private double ry;

    public Rugby(double xPos, double yPos, double xSpeed, double ySpeed, double rx, double ry, Color color) {
        super(xPos,yPos,xSpeed,ySpeed,color);
        this.rx = rx;
        this.ry = ry;
        }

    @Override
    public void draw (GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(xPos - rx, yPos - ry, 2*rx, 2*ry);
        gc.restore();

}
}
