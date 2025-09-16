package ru.netology.product.repo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopRepositoryTest {

    ShopRepository shopRepository = new ShopRepository();
    Product product = new Product(23, "Сыр", 700);
    Product product2 = new Product(76, "Масло", 450);
    Product product3 = new Product(18, "Колбаса", 789);



    @Test
    public void addNewProducts() {
        shopRepository.add(product);
        shopRepository.add(product2);
        shopRepository.add(product3);

        Product[] expected = {product, product2, product3};
        Product[] actual = shopRepository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeAnyProduct() {
        shopRepository.add(product);
        shopRepository.add(product2);
        shopRepository.add(product3);

        shopRepository.remove(76);

        Product[] expected = {product, product3};
        Product[] actual = shopRepository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}