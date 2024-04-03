package ru.netology;

import java.util.Comparator;

public class utillPriceAskComporator implements Comparator<modelPurchaseItem> {

    @Override
    public int compare(modelPurchaseItem o1, modelPurchaseItem o2) {
        return o1.getItemPrice() - o2.getItemPrice();
    }
}
