package com.ir.dp.behavior.observer;

import com.ir.dp.behavior.observer.core.AppleObserver;
import com.ir.dp.behavior.observer.core.OrangeObserver;
import com.ir.dp.behavior.observer.core.PearObserver;
import com.ir.dp.behavior.observer.core.Subject;

/**
 * @author i-rain
 */
public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new AppleObserver(subject);
        new OrangeObserver(subject);
        new PearObserver(subject);

        subject.setState(15);
        subject.setState(10);
    }
}
