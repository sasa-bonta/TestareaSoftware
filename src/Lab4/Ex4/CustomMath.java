package Lab4.Ex4;

public class CustomMath {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int division(int x, int y) throws IllegalArgumentException {
        if (y == 0) {
            throw new IllegalArgumentException("devider is 0");
        }
        return (x / y);
    }

    public static void main(String[] args) {

    }
}

