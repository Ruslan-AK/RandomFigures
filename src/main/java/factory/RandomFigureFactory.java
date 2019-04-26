package factory;

import base.Figure;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class RandomFigureFactory {

    private Figure getRandomFigure(List<Class<? extends Figure>> list, ApplicationContext context) {
        return context.getBean((list.get((int) (Math.random() * list.size()))));
    }

    public List<Figure> getRandomFigureListFromContext(List<Class<? extends Figure>> inputList, ApplicationContext context, int count) {
        List<Figure> resultList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            resultList.add(getRandomFigure(inputList,context));
        }
        return resultList;
    }
}
