package ru.netology;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CartService {
    private final List<modelPurchaseItem> items = new ArrayList<>();

    public void add(modelPurchaseItem item) {
        items.add(item);
    }

    public List<modelPurchaseItem> sortedBy(Comparator<modelPurchaseItem> comparator){
        List<modelPurchaseItem> result = new LinkedList<>(items);
        result.sort(comparator);
        return result;
    }
}
