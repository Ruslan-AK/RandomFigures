package parameters;

public enum FigureType {
    TETRAGON {
        public String toString() {
            return "квадрат";
        }
    }, TRIANGLE {
        public String toString() {
            return "треугольник";
        }
    }, CIRCLE {
        public String toString() {
            return "круг";
        }
    }, TRAPEZIUM {
        public String toString() {
            return "трапеция";
        }
    }
}
