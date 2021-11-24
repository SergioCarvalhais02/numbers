package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    private List<Integer> list;
    private List<Integer> expected;


    @BeforeEach
    public void helper() {
        list = Arrays.asList(1,2,4,2,5);
        expected = Arrays.asList(1,2,4,5);
    }

    @Test
    public void deduplicate() {
        /*class StubListSorter implements GenericSorter{
            @Override
            public List<Integer> sort() {
                return  Arrays.asList(1, 2, 2, 4, 5);
            }
        }*/
        GenericSorter stubsort = Mockito.mock(GenericSorter.class);
        Mockito.when(stubsort.sort()).thenReturn(Arrays.asList(1, 2, 2, 4, 5));
        //StubListSorter stubsort = new StubListSorter();
        ListDeduplicator deduplicated =  new ListDeduplicator();
        List<Integer> res = deduplicated.deduplicate(list);

        Assertions.assertEquals(expected, res);
    }
}