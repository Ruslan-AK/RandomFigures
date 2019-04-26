package base;

import abstraction.IFigure;
import parameters.Color;
import parameters.FigureType;

public class Figure implements IFigure {
    private Color color;
    private double square;
    private FigureType figureType;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public void setFigureType(FigureType figureType) {
        this.figureType = figureType;
    }

    public void draw() {
        System.out.println("Draw figure");
    }
}
