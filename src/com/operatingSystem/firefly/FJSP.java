package com.operatingSystem.firefly;

import jdk.nashorn.internal.scripts.JO;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by surag on 11/14/2016.
 * <p>
 * FJSP constrains
 * 1. The operation sequence for each job is prescribed and the
 * appointed process order must be followed.
 * 2. Each machine can process only one operation at a time.
 * 3. Each operation must be processed on an appointed
 * machine.
 */
public class FJSP {

    private enum Algo {FIREFLY, RANDOM, FCFS, SRTF}
    private HashSet<Job> jobs;
    private HashSet<Machine> machines;

    /*
     * Makespan (Cm) of the jobs, i.e. the completion time of all
     * jobs
     * 2. Maximal machine workload (Wm), i.e. the maximum
     * working time spent on any machine
     * 3. Total workload of the machines (Wt) which represent the
     * total working time over all machines.
     */
    private int makespan;
    private int maximalMachineworkLoad;
    private int totalMachineWorkload;

    public FJSP(HashSet<Job> jobs, HashSet<Machine> machines) {
        this.jobs = jobs;
        this.machines = machines;
    }

    public void scheduleFunctions(Algo algo) {
        switch(algo) {
            case FIREFLY: // TODO send to FIREFLY function.
                break;
            case FCFS:  // TODO send to FCFS function.
                break;
            case RANDOM:    // TODO send to RANDOM function.
                break;
            case SRTF:  // TODO send to SRTF function.
                break;
        }
    }

    /*
     * Inputs will be
     * n total number of jobs
     * m total number of machines
     * ni total number of operations of job i
     */
}
