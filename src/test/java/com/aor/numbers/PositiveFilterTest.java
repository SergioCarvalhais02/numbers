package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {
    Integer testnumber;
    PositiveFilter filtro = new PositiveFilter();
    boolean res;
    @BeforeEach
    public void helper() {
        testnumber = 2;
    }
    @Test
    public void Accept() {
        res = filtro.accept(testnumber);
        Assertions.assertEquals(true,res);
    }

}
