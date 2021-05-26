package com.sandra.ConsoleStockApplication;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Stock implements Stocks {
    protected int stock, total = 0;
    protected String t = "\u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665";


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addToStock(int stock) throws UnsupportedEncodingException {
        total = 0;
        if (stock > 10) {
            total = this.stock += (stock + 1);
            addAnExtraProd(stock);

        } else {
            total = this.stock += stock;
        }
        setStock(total);
    }

    private void addAnExtraProd(int stock) throws UnsupportedEncodingException {
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        out.println(t + "\nYou get an extra product \n" + t);
    }

    public void sellFromStock(int stock) {
        if (stock > this.stock) {
            ifSellBiggerThenStockText();
        } else {
            this.stock -= stock;
        }
    }

    private void ifSellBiggerThenStockText() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx \nOoops! \nOnly " + this.stock + " in stock! Redo\nxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
