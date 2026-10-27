import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.oxelen.CountOfElements;

import java.util.Map;

public class CountOfElementsTest {
    @Test
    public void numbersTest() {
        Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 8, 9, 9};
        Map<Integer, Long> expected = Map.of(
                2, 2L,
                3, 1L,
                4, 1L,
                5, 3L,
                8, 1L,
                9, 2L
        );

        Assertions.assertEquals(expected, CountOfElements.countElements(numbers));
    }

    @Test
    public void stringTest() {
        String[] strings = {"a", "a", "test", "d", "d", "d"};
        Map<String, Long> expected = Map.of(
                "a", 2L,
                "test", 1L,
                "d", 3L
        );

        Assertions.assertEquals(expected, CountOfElements.countElements(strings));
    }

    @Test
    public void objTest() {
        TestClass[] array = {
                new TestClass("Test", 1),
                new TestClass("TestAnother", 1),
                new TestClass("Test", 1)
        };

        Map<TestClass, Long> expected = Map.of(
                new TestClass("Test", 1), 2L,
                new TestClass("TestAnother", 1), 1L
        );

        Assertions.assertEquals(expected, CountOfElements.countElements(array));
    }
}
