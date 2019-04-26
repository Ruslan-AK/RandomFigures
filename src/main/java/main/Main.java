package main;

import base.Figure;
import factory.RandomFigureFactory;
import implementation.Circle;
import implementation.Tetragon;
import implementation.Trapezium;
import implementation.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        RandomFigureFactory factory = context.getBean(RandomFigureFactory.class);//init factory
        int countFigures = 10;//how much figures will be generated
        factory.getRandomFigureListFromContext(getFigureCandidates(), context, countFigures).forEach(System.out::println);//show
    }

    private static List<Class<? extends Figure>> getFigureCandidates() {//add figure heirs here
        List<Class<? extends Figure>> figures = new ArrayList<>();
        figures.add(Circle.class);
        figures.add(Trapezium.class);
        figures.add(Triangle.class);
        figures.add(Tetragon.class);
        return figures;
    }
}
