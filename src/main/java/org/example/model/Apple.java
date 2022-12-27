package org.example.model;

import org.example.model.constants.Colour;
import org.example.model.constants.Discount;

/**
 * @author FedorMulashkin
 * @link <a href="https://github.com/FedorMulashkin">My GitHub</a>
 */
public class Apple extends Food implements Discountable{
    private String colour;

    public Apple(final int amount, final double price, final String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals(Colour.RED)
            ? Discount.RED_APPLE
            : Discount.DEFAULT;
    }
}
