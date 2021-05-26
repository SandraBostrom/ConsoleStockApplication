package com.sandra.ConsoleStockApplication;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;


public class testStock {

    //Dela upp i testStock och testProd

    @Test
    public void testThatStockStartAt0(){
    Stock prod = new Stock();
    assertEquals(0, prod.getStock());
    }


    @Test
    public void testThatStocksAreAddedCorerctlyWhenCalledMultipleTimes() throws UnsupportedEncodingException {
        Stock prod = new Stock();
        prod.addToStock(2);
        prod.addToStock(2);
        assertEquals(4, prod.getStock());
    }


    @Test
    public void testThatStocksAreSoldCorerctly(){
        Stock prod = new Stock();
        prod.setStock(10);
        prod.sellFromStock(2);
        assertEquals(8,prod.getStock());
    }

}
