package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {
    private List<Integer> list;
    private List<Integer> expected;
    private List<Integer> l2;

    @BeforeEach
    public void helper() {
        list = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        l2 = Arrays.asList(1, 2, 4, 2);
    }

    @Test
    public void sort() {

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(l2);

        Assertions.assertEquals(expected, sorted);
    }
}
