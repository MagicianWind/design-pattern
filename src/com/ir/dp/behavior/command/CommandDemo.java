package com.ir.dp.behavior.command;

import com.ir.dp.behavior.command.core.Broker;
import com.ir.dp.behavior.command.core.BuyStock;
import com.ir.dp.behavior.command.core.SellStock;
import com.ir.dp.behavior.command.core.Stock;

/**
 * @author i-rain
 */
public class CommandDemo {

    public static void main(String[] args) {
        Broker broker = new Broker();

        broker.addOrder(new BuyStock(new Stock()));
        broker.addOrder(new SellStock(new Stock()));

        broker.executionOrder();
    }
}
