public class Main {
    public static void main(String[] args) {
        // Vi har tidigare skapat klassen Counter, nu är det dags att göra den säker
        //   - Konstruktorn skall sätta intervallet + startvärdet
        //   - Getter och setter för värdet (glöm inte kontrollera att gitigt i settern)

    }
}

class Counter {
    int value;
    int min;
    int max;

    void init(int min, int max) {
        this.min = min;
        this.max = max;
    }

    void inc() {
        if (value < max) {
            value++;
        } else {
            throw new IllegalStateException("Ogiltigt värde");
        }
    }

    void dec() {
        if (value > min) {
            value--;
        } else {
            throw new IllegalStateException("Ogiltigt värde");
        }
    }
}