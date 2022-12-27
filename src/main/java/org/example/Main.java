package org.example;

import org.example.model.Apple;
import org.example.model.Food;
import org.example.model.Meat;
import org.example.model.constants.Colour;
import org.example.model.service.ShoppingCart;

/**
 * @author FedorMulashkin
 * @link <a href="https://github.com/FedorMulashkin">My GitHub</a>
 */
public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApples = new Apple(10, 50, Colour.RED);
        Food greenApples = new Apple(8, 60, Colour.GREEN);
        Food[] cart = new Food[] {meat, redApples, greenApples};
        ShoppingCart shoppingCart = new ShoppingCart(cart);

        System.out.println(shoppingCart.countPriceWithoutDiscount());
        System.out.println(shoppingCart.countPriceWithDiscount());
        System.out.println(shoppingCart.countPriceIfVegetarianWithoutDiscount());
    }
}
