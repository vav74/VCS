public class Main {
    public static void main(String[] args) {
        long[] sales = {100, 50, 60, 30, 40, 50};
        SalesManager Vasya = new SalesManager(sales);
        System.out.println("Макс.продажа: " + Vasya.max());
        System.out.println("Мин.продажа: " + Vasya.min());
        System.out.println("Средняя обрезанная продажа: " + Vasya.croppedAverage());
    }
}
