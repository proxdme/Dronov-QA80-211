package ru.netology;

import lombok.val;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CartService service = new CartService();
        service.add(new modelPurchaseItem(1, 1_000, 1));
        service.add(new modelPurchaseItem(2, 2_000, 3));
        service.add(new modelPurchaseItem(3, 4_000, 1));
        service.add(new modelPurchaseItem(4, 7_000, 4));
        service.add(new modelPurchaseItem(5, 6_000, 2));
        service.add(new modelPurchaseItem(6, 3_000, 10));


        System.out.println(service.sortedBy((o1, o2) -> o1.getItemPrice() - o2.getItemPrice()));
        System.out.println(service.sortedBy((o1, o2) -> o1.getItemPrice() - o2.getItemPrice()));
    }
};


