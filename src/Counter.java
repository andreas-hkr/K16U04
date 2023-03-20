public class Counter {
    private int value;
    private int min;
    private int max;

    public Counter(int min, int max, int value) {
        this.min = min;
        this.max = max;
        setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= min && value <= max) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Värdet måste vara i angivet intervall");
        }
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