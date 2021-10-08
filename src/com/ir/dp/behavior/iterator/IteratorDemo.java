package com.ir.dp.behavior.iterator;

import com.ir.dp.behavior.iterator.core.Iterator;
import com.ir.dp.behavior.iterator.core.NameRepository;

/**
 * @author i-rain
 */
public class IteratorDemo {

    public static void main(String[] args) {

        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
