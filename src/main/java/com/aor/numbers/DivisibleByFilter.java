package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter {
    Integer divisor;
    DivisibleByFilter(Integer div) {
        divisor = div;
    }
    @Override
    public boolean accept(Integer number) {
        if(number%divisor == 0) return true;
        return false;
    }
}
