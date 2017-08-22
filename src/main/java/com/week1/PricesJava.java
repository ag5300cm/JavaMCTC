package com.week1;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

/**
 * Created by ag5300cm on 8/22/2017.
 */
public class PricesJava {

    //psvm + tab
    public static void main(String[] args) {

        String productName = stringInput("What is the name of the product?");
        double price = doubleInput("What does " + productName + " cost?");
        int quantity = intInput("How many " + productName + " to sell?");

        //Calculate the total price
        double totalPrice = price * quantity;

        System.out.println(
                quantity + " of "
                + productName + " at $"
                + price + " each costs $"
                + totalPrice);

        //Change to commit
    }

}
