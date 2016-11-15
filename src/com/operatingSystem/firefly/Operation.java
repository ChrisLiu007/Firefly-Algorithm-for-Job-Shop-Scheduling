package com.operatingSystem.firefly;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by surag on 11/14/2016.
 */
public class Operation {

    private static final AtomicInteger count = new AtomicInteger(0);
    /**
     * Each operation Oij (i=1,2,…,n;
     * j=1,2,…,ni) of job (Ji) can be processed by one machine mij
     * in the set of eligible machines Mij. Pijk denotes the processing
     * time of operation Oij on machine k∈Mij.
     */

    // DS to store the processing time of each machine for a particular job
    private int operationId;
    private Job job;
    private HashMap<Machine, Integer> machineProcessTime;
    private Machine machineThatExecutedThe;

    public Operation(HashMap<Machine, Integer> machineProcessTime, Job job) {
        this.machineProcessTime = machineProcessTime;
        this.job = job;
        this.operationId = count.incrementAndGet();
    }

    public HashMap<Machine, Integer> getMachineProcessTime() {
        return machineProcessTime;
    }

    public void setMachineProcessTime(HashMap<Machine, Integer> machineProcessTime) {
        this.machineProcessTime = machineProcessTime;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Machine getMachineThatExecutedThe() {
        return machineThatExecutedThe;
    }

    public void setMachineThatExecutedThe(Machine machineThatExecutedThe) {
        this.machineThatExecutedThe = machineThatExecutedThe;
    }

    public int getOperationId() {
        return operationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operation)) return false;

        Operation operation = (Operation) o;

        if (getOperationId() != operation.getOperationId()) return false;
        if (getMachineProcessTime() != null ? !getMachineProcessTime().equals(operation.getMachineProcessTime()) : operation.getMachineProcessTime() != null)
            return false;
        return getJob().equals(operation.getJob());

    }

    @Override
    public int hashCode() {
        int result = getMachineProcessTime() != null ? getMachineProcessTime().hashCode() : 0;
        result = 31 * result + getJob().hashCode();
        result = 31 * result + getOperationId();
        return result;
    }

    //might have to change this in future
    @Override
    public String toString() {
        return "Operation{" +
                "operationId=" + operationId +
                ", job=" + job.getJobId() +
                ", machineProcessTime=" + machineProcessTime.toString() +
                ", machineThatExecutedThe=" + machineThatExecutedThe +
                '}';
    }
}
