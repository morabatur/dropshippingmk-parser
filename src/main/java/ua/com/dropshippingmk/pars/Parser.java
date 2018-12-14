package ua.com.dropshippingmk.pars;

import ua.com.dropshippingmk.entity.Product;

import java.util.List;

public interface Parser {
    void init();
    List<Product> pars();
}
