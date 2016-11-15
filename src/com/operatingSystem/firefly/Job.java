package com.operatingSystem.firefly;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by surag on 11/14/2016.
 */
public class Job {

    private static final AtomicInteger count = new AtomicInteger(0);
    private HashSet<Operation> operations;
    private int jobId;

    public Job(HashSet<Operation> operations) {
        this.operations = operations;
        this.jobId = count.incrementAndGet();
    }

    public HashSet<Operation> getOperations() {
        return operations;
    }

    public void setOperations(HashSet<Operation> operations) {
        this.operations = operations;
    }

    public int getJobId() {
        return jobId;
    }


    // by overriding equals function we can compare two jobs in terms of the jobId and operations that it holds
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;

        Job job = (Job) o;

        if (getJobId() != job.getJobId()) return false;
        return getOperations().equals(job.getOperations());

    }

    @Override
    public int hashCode() {
        int result = getOperations().hashCode();
        result = 31 * result + getJobId();
        return result;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", operations=" + operations.toString() +
                '}';
    }
}
