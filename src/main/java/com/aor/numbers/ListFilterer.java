package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    GenericListFilter filter;
    public ListFilterer(GenericListFilter filter) {
        this.filter = filter;
    }

    public List<Integer> filter(List<Integer> list,GenericListFilter stubfillter) {
        List<Integer> filteredlist = new ArrayList<Integer>();
        for (Integer a: list) {
            if(stubfillter.accept(a)) {
                filteredlist.add(a);
            }
        }
        return filteredlist;
    }
}
