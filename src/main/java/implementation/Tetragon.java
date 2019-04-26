package implementation;

import base.Figure;
import parameters.Color;
import parameters.FigureType;

public class Tetragon extends Figure {

    private double side;

    public Tetragon(Color color, double side) {
        super.setFigureType(FigureType.TETRAGON);
        super.setColor(color);
        this.side = side;
        super.setSquare(calculateSquare(side));
    }

    private double calculateSquare(double side) {
        return Math.round(side * side * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println("Рисую квадрат");
    }

    @Override
    public String toString() {
        return "Фигура: " + super.getFigureType() +
                ", площадь: " + super.getSquare() +
                " кв. ед., сторона: " + side +
                " ед., цвет: " + super.getColor();
    }
}
