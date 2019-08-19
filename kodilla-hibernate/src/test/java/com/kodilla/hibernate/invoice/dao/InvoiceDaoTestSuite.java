package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    ItemDao itemDao;
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("Juice");
        Product product2 = new Product("Beer");
        Product product3 = new Product("Whisky");
        Product product4 = new Product("Wine");
        Product product5 = new Product("Vodka");

        int p1 = product1.getId();
        int p2 = product2.getId();
        int p3 = product3.getId();
        int p4 = product4.getId();
        int p5 = product5.getId();

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);
        productDao.save(product5);


        Item item1 = new Item(product1, new BigDecimal("100"), 10, new BigDecimal("10000"));
        Item item2 = new Item(product2, new BigDecimal("50"), 20, new BigDecimal("1000"));
        Item item3 = new Item(product3, new BigDecimal("25"), 30, new BigDecimal("750"));
        Item item4 = new Item(product4, new BigDecimal("10"), 40, new BigDecimal("400"));
        Item item5 = new Item(product5, new BigDecimal("1"), 50, new BigDecimal("50"));

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        itemDao.save(item5);

        List<Item> itemList1 = new ArrayList<>();
        itemList1.add(item1);
        itemList1.add(item2);

        List<Item> itemList2 = new ArrayList<>();
        itemList2.add(item3);
        itemList2.add(item4);
        itemList2.add(item5);

        Invoice invoice1 = new Invoice("100/2019", itemList1);
        Invoice invoice2 = new Invoice("101/2019", itemList2);

        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);


//        Invoice invoice1 = new Invoice("001/2019", itemList1);
//        Invoice invoice2 = new Invoice("002/2019", itemList2);


        //When






    }
}
