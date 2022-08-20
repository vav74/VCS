public class Main {
    public static void main(String[] args) {
        int[] sales = {100, 60, 30, 40, 50};
        SalesManager Vasya = new SalesManager(sales);
        System.out.println(Vasya.max());
    }
}
