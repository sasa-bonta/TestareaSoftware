package Triangle;

public class Triangle {

    private int a;
    private int b;
    private int c;

    final int limit = Integer.MAX_VALUE;

    public Triangle() {
    }

    // Check if the input data is valid

    public boolean createTriangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {                      // Check if sides are greater than 0
            if (a < limit && b < limit && c < limit) {      // Check if sides are less than Integer.MAX_VALUE
                if (a + b > c && a + c > b && b + c > a) {  // Check if the triangle is valid
                    System.out.println("+New triangle was created");
                    this.a = a;
                    this.b = b;
                    this.c = c;
                } else {
                    System.out.println("Invalid side's length");
                    return false;
                }
            } else {
                System.out.println("Limit exceed");
                return false;
            }
        } else {
            System.out.println("Size must be greater that 0");
            return false;
        }
        return true;
    }
}
