package implementation;

import base.Figure;
import parameters.Color;
import parameters.FigureType;

public class Trapezium extends Figure {

    private double height;
    private double base1;
    private double base2;

    public Trapezium(Color color, double base1, double base2, double height) {
        super.setFigureType(FigureType.TRAPEZIUM);
        super.setColor(color);
        super.setSquare(calculateSquare(base1, base2, height));
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
    }

    private double calculateSquare(double base1, double base2, double height) {
        return Math.round(0.5 * height * (base1 + base2) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println("Рисую трапецию");
    }

    @Override
    public String toString() {
        return "Фигура: " + super.getFigureType() +
                ", площадь: " + super.getSquare() +
                " кв. ед., высота: " + height +
                " ед., основание а: " + base1 +
                " ед., основание b: " + base2 +
                " ед., цвет: " + super.getColor();
    }
}
