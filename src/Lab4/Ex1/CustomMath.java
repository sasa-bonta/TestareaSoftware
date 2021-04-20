package Lab4.Ex1;

public class CustomMath {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int division(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("devider is 0");
        }
        return (x / y);
    }

    public static void main(String[] args) {
//        if (sum(1, 3) == 4) {
////verificam daca la adunarea numerelor 1 cu 3 se returneaza 4
//            System.out.println("Test1 passed.");
//        } else {
//            System.out.println("Test1 failed.");
//        }
        try {
            int z = division(1, 0);
            System.out.println("Test3 failed.");
        } catch (IllegalArgumentException e) {
//Testul se considera reusit daca incercarea de impartire
//la 0 genereaza exceptia asteptata
            System.out.println("Test3 pased.");
        }
    }
}
