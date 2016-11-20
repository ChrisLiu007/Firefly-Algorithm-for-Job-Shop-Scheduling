package com.operatingSystem.firefly;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by surag on 11/14/2016.
 */
public class Machine {

    private static final AtomicInteger count = new AtomicInteger(0);
    HashSet<Operation> operations;
    private int machineId;

    public Machine() {
        this.machineId = count.incrementAndGet();
    }
}
