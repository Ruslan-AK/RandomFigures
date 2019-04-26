package implementation;

import base.Figure;
import parameters.Color;
import parameters.FigureType;

public class Circle extends Figure {

    private double radius;

    public Circle(Color color, double radius) {
        super.setFigureType(FigureType.CIRCLE);
        super.setColor(color);
        this.radius = radius;
        super.setSquare(calculateSquare(radius));
    }

    private double calculateSquare(double radius) {
        return Math.round(Math.PI * Math.pow(radius, 2) * 10) / 10;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Фигура: " + super.getFigureType() +
                ", площадь: " + super.getSquare() +
                " кв. ед., радиус: " + getRadius() +
                " ед., цвет: " + super.getColor();
    }

    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }
}
