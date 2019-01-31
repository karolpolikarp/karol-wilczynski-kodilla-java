package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("01/2019");

        Product product0 = new Product("product0");
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");

        Item item0 = new Item(product0, new BigDecimal(1), 5 );
        Item item1 = new Item(product1, new BigDecimal(3), 2 );
        Item item2 = new Item(product2, new BigDecimal(8), 3 );

        invoice.getItems().add(item0);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        List<Item> items = new ArrayList<>();

        items.add(item0);
        items.add(item1);
        items.add(item2);

        invoice.setItems(items);

        item0.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);

        int invoiceId = invoice.getId();
        int size = invoice.getItems().size();
        Invoice readInvoice = invoiceDao.findOne(invoiceId);
        String pos0 = invoice.getItems().get(0).getProduct().getName();
        String pos1 = invoice.getItems().get(1).getProduct().getName();
        String pos2 = invoice.getItems().get(2).getProduct().getName();

        //Then
        Assert.assertEquals("01/2019", readInvoice.getNumber());
        Assert.assertEquals(3, size);
        Assert.assertEquals(pos0, "product0");
        Assert.assertEquals(pos1, "product1");
        Assert.assertEquals(pos2, "product2");
        Assert.assertEquals(size, readInvoice.getItems().size());

//        //CleanUp
//        @Transactional || invoiceDao.delete(invoiceId);

    }
}