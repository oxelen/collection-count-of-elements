package ru.oxelen;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfElements {
    public static <T> Map<T, Long> countElements(T[] array) {
        return Arrays.stream(array)
                .collect(Collectors.groupingBy(
                        obj -> obj,
                        Collectors.counting()
                ));
    }
}
