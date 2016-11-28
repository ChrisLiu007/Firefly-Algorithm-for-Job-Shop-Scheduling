package com.operatingSystem.firefly;

import java.util.ArrayList;

/**
 * Created by surag on 11/14/2016.
 */
public class FireflyAlgo {

    private static int NUMBER_OF_FIREFLY = 10;
    private static int NUMBER_OF_GENERATIONS = 100;
    private static FJSP fjsp;
    private static ArrayList<Firefly> population;

    //    private double W1;
//    private double W2;
//    private double W3;
//    private double Fc;
//    private double f1;
//    private double f2;
//    private double f3;
//    private double[][] r;
//
//    private double calculateDistance();
//    private
    public static class Firefly {
        public int[] machineAssignmentVector;
        public int[] operationSchedulingVector;
        private double objectiveFuntionScore;

        public double getObjectiveFuntionScore() {
            computeObjectiveFuntionScore();
            return objectiveFuntionScore;
        }

        public void computeObjectiveFuntionScore(){

        }
    }


    public static GanttChart schedule(FJSP fjsp1) {
        fjsp = fjsp1;
        Firefly intialSequence = chooseIntialSequence(fjsp);
        ArrayList<Firefly> initialPopulation = getInitialPopulation(intialSequence);
        population = initialPopulation;
        for (int i = 1; i < NUMBER_OF_GENERATIONS ; i++) {
            ArrayList<Double> objectiveFuntionScore = getObjectiveFunctionScore(population);
//            don't know exactly whether to rank the
        }


        return null;
    }

    private static ArrayList<Double> getObjectiveFunctionScore(ArrayList<Firefly> population) {
        return null;
    }

    private static ArrayList<Firefly> getInitialPopulation(Firefly initialSequence) {

        return null;
    }

    private static Firefly chooseIntialSequence(FJSP fjsp) {
        return null;
    }
    // will be the the implementation of algorithm
}