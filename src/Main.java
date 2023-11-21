public class Main {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign(1, 2);
        printColor(101);
        int a = 10;
        int b = 5;
        compareNumbers(a, b);
    }
    static void printThreeWords() {
        System.out.println("Orange ");
        System.out.println("Banana ");
        System.out.println("Apple ");
    }

    static void checkSumSign(int x, int y) {
        int z = x + y;
        if (z >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor(int z) {
        if (z <= 0) {
            System.out.println("Красный");
        } else if (0 < z && z <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers(int x, int y) {
        if (x >= y) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}