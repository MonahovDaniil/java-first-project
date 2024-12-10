public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 50;
        int d = 30;

        int max = findMax(a, b, c, d);
        System.out.println("Максимальное значение: " + max);
    }

    public static int findMax(int a, int b, int c, int d) {
        int maxNumber = a;
        if (b > maxNumber) {
            maxNumber = b;
        }
        if (c > maxNumber) {
            maxNumber = c;
        }
        if (d > maxNumber) {
            maxNumber = d;
        }
        return maxNumber;
    }
}

