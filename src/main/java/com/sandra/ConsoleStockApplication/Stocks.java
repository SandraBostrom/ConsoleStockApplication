package com.sandra.ConsoleStockApplication;

import java.io.UnsupportedEncodingException;

public interface Stocks {

    void addToStock(int stock) throws UnsupportedEncodingException;

    void sellFromStock(int stock);
}
