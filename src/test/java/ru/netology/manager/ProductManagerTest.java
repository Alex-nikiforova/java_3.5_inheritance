package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);
    private final Book first = new Book(1, "Исчезнувшая", 459, "Гиллиан Флинн");
    private final Book second = new Book(2, "Sapiens", 680, "Харари Юваль Ной");
    private final Book third = new Book(3, "Утраченный символ", 746, "Дэн Браун");
    private final Smartphone fourth = new Smartphone(4, "MI 10T Pro", 45_990, "Xiaomi");
    private final Smartphone fifth = new Smartphone(5, "P30", 34_990, "Huawei");
    private final Smartphone sixth = new Smartphone(6, "IPhone 11", 59_990, "Apple");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
    }

    @Test
    public void shouldSearchBookByName() {
        Product[] actual = manager.searchBy("исчезнувшая");
        Product[] expected = new Product[]{first};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldSearchBookByAuthor() {
        Product[] actual = manager.searchBy("дэН Браун");
        Product[] expected = new Product[]{third};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldSearchSmartphoneByName() {
        Product[] actual = manager.searchBy("p30");
        Product[] expected = new Product[]{fifth};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldSearchSmartphoneByProducer() {
        Product[] actual = manager.searchBy("ApPle");
        Product[] expected = new Product[]{sixth};

        assertArrayEquals(actual, expected);
    }
}