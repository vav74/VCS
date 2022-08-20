# Анализ статистики продаж

![Лого](https://it-24.pro/wp-content/uploads/2019/11/Marketing.png)

## Первая версия

Перед вами даже первая версия такого сервиса:

1. *Класс SalesManager*
1. *Kласс Main*

**Класс SalesManager**

```java
public class SalesManager {
    protected int[] sales;
    public SalesManager(int[] sales) {
        this.sales = sales;
    }
    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
```
**Класс Main**
```java
public class Main {
    public static void main(String[] args) {
        int[] sales = {100, 60, 30, 40, 50};
        SalesManager Vasya = new SalesManager(sales);
        System.out.println(Vasya.max());
    }
}
```