package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ComputerLogics computerLogics = new ComputerLogics();
        Output output = new Output();
        Scanner num = new Scanner(System.in);
        output.StartGame();
        while (true) {
            output.PlayerTurn(computerLogics.getMatches());
            int count = num.nextInt();
            if (count >= 1 && count <= 3) {
                computerLogics.countPlayer(count, computerLogics.getMatches());
                output.ComputerTurn(count, computerLogics.getMatches());
                computerLogics.countComputer(count, computerLogics.getMatches());
            } else {
                output.countMatchesError();
            }
            if (computerLogics.getMatches() == 1) {
                output.GameOver();
                break;
            }
        }
        num.close();
    }
}



