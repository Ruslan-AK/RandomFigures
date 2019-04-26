package parameters;

public enum Color {
    WHITE {
        public String toString() {
            return "белый";
        }
    }, RED {
        public String toString() {
            return "красный";
        }
    }, GREEN {
        public String toString() {
            return "зеленый";
        }
    }, BLACK {
        public String toString() {
            return "черный";
        }
    }, BLUE {
        public String toString() {
            return "синий";
        }
    }, YELLOW {
        public String toString() {
            return "желтый";
        }
    }
}
