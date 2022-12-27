package org.example.model.service;

import java.util.Arrays;
import java.util.List;
import org.example.model.Food;

/**
 * @author FedorMulashkin
 * @link <a href="https://github.com/FedorMulashkin">My GitHub</a>
 */
public class ShoppingCart {
    private final Food[] cart;

    public ShoppingCart(final Food[] cart) {
        this.cart = cart;
    }

    public double countPriceWithoutDiscount() {
        return Arrays.stream(cart)
            .map(food -> food.getPrice() * food.getAmount())
            .reduce(Double::sum)
            .orElse(0.0);
    }

    public double countPriceWithDiscount() {
        return Arrays.stream(cart)
            .map(food -> food.getPrice() * food.getAmount() * (1 - food.getDiscount() / 100))
            .reduce(Double::sum)
            .orElse(0.0);
    }

    public double countPriceIfVegetarianWithoutDiscount() {
        return Arrays.stream(cart)
            .filter(Food::isVegetarian)
            .map(food -> food.getPrice() * food.getAmount())
            .reduce(Double::sum)
            .orElse(0.0);
    }
}
