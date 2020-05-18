package com.company;


public class ComputerLogics extends Main {
    int matches = 17;

    public int getMatches() {
        return matches;
    }

    public void countPlayer(int count, int matches) {
        matches -= count;
        this.matches = matches;
    }

    public void countComputer(int count, int matches) {
        int ComputerCount = 4 - count;
        matches -= ComputerCount;
        this.matches = matches;
    }

}
