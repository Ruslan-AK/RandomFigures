package implementation;

import base.Figure;
import parameters.Color;
import parameters.FigureType;

public class Triangle extends Figure {

    private double hypotenuse;
    private double leg1;
    private double leg2;
    private double angle;

    public Triangle(Color color, double leg1, double leg2, double angle) {
        super.setFigureType(FigureType.TRIANGLE);
        super.setColor(color);
        super.setSquare(calculateSquare(leg1, leg2, angle));
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.angle = angle;
        this.hypotenuse = calculateHypotenuse(leg1, leg2, angle);
    }

    private double calculateHypotenuse(double leg1, double leg2, double angle) {
        return Math.round(Math.sqrt(leg1 * leg1 + leg2 * leg2 - 2 * leg1 * leg2 * Math.cos(angle*Math.PI/180)) * 10) / 10;
    }

    private double calculateSquare(double leg1, double leg2, double angle) {
            return Math.round(0.5 * leg1 * leg2 * Math.sin(angle*Math.PI/180)*10) / 10;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public void draw() {
        System.out.println("Рисую треугольник");
    }

    @Override
    public String toString() {
        return "Фигура: " + super.getFigureType() +
                ", площадь: " + super.getSquare() +
                " кв. ед., гипотенуза: " + getHypotenuse() +
                " ед., катет а: " + leg1 +
                " ед., катет b: " + leg2 +
                " ед., угол: " + angle +
                " ед., цвет: " + super.getColor();
    }
}
