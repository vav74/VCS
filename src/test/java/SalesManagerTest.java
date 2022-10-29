import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование: SalesManager")
public class SalesManagerTest {

    private SalesManager salesManager;

    @BeforeEach
    void setUp() {
        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        salesManager = new SalesManager(sales);
    }

    @Test
    @DisplayName("Тестирование max()")
    void max() {
        Assertions.assertEquals(10L, salesManager.max());
    }

    @Test
    @DisplayName("Тестирование min()")
    void min() {
        Assertions.assertEquals(1L, salesManager.min());
    }

    @Test
    @DisplayName("Тестирование croppedAverage()")
    void croppedAverage() {
        Assertions.assertEquals ((2 + 3 + 4 + 5 + 6 + 7 + 8 + 9)/(salesManager.sales.length-2), salesManager.croppedAverage());
    }
}