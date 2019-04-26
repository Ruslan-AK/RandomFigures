package main;

import factory.RandomFigureFactory;
import implementation.Circle;
import implementation.Tetragon;
import implementation.Trapezium;
import implementation.Triangle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import parameters.Color;

@Configuration
public class AppConfig {
    @Bean
    public RandomFigureFactory figureFactory() {
        return new RandomFigureFactory();//create factory bean
    }
    @Bean
    @Scope("prototype")
    public Circle getCircle(){
        double circleRadius = Math.abs(Math.floor(Math.random()*100)+1);
        return new Circle(Color.values()[(int) (Math.random() * Color.values().length)], circleRadius);
    }
    @Bean
    @Scope("prototype")
    public Tetragon getTetragon(){
        double side = Math.abs(Math.floor(Math.random()*100)+1);
        return new Tetragon(Color.values()[(int) (Math.random() * Color.values().length)], side);
    }
    @Bean
    @Scope("prototype")
    public Triangle getTriangle(){
        double leg1 = Math.abs(Math.floor(Math.random()*100)+1);
        double leg2 = Math.abs(Math.floor(Math.random()*100)+1);
        double angle =90;// Math.abs(Math.floor(Math.random()*180)+1);
        return new Triangle(Color.values()[(int) (Math.random() * Color.values().length)], leg1, leg2, angle);
    }
    @Bean
    @Scope("prototype")
    public Trapezium getTrapezium(){
        double base1 = Math.abs(Math.floor(Math.random()*100)+1);
        double base2 = Math.abs(Math.floor(Math.random()*100)+1);
        double height = Math.abs(Math.floor(Math.random()*100)+1);
        return new Trapezium(Color.values()[(int) (Math.random() * Color.values().length)], base1, base2, height);
    }
}
