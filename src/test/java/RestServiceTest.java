import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.RestService;

public class RestServiceTest {
    @Test
    void testcalculate1() {
        RestService Service = new RestService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;
        int actual = Service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testcalculate2() {
        RestService Service = new RestService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;
        int actual = Service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}