package com.ir.dp.behavior.memento;

import com.ir.dp.behavior.memento.core.CareTaker;
import com.ir.dp.behavior.memento.core.Originator;

public class MementoDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState(1);

        CareTaker careTaker = new CareTaker();
        careTaker.add(originator.saveToMemento());

        originator.setState(3);
        System.out.println(originator.getState());
        originator.getFromMemento(careTaker.get(0));
        System.out.println(originator.getState());
    }
}
