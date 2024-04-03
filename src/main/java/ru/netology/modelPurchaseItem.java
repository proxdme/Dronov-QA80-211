package ru.netology;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class modelPurchaseItem {
    private int itemId;
    private int itemPrice;
    private int count;
}
