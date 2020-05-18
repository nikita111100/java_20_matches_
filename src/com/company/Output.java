package com.company;

public class Output extends Main {
    public void StartGame() {
        System.out.println("На столе осталось 20 спичек.\n" + "- Количество выбранных компьютером  спичек = 3.");
    }

    public void PlayerTurn(int matches) {
        System.out.println("На столе осталось " + matches + " спичек.");
        System.out.print("- Ход игрока. Введите количество спичек: ");
    }

    public void ComputerTurn(int count, int matches) {
        int ComputerCount = 4 - count;
        System.out.println("На столе осталось " + matches + " спичек.");
        System.out.println("- Количество выбранных компьютером  спичек = " + ComputerCount + ".");
    }

    public void countMatchesError() {
        System.out.println("Некорректное количество спичек!");
    }

    public void GameOver() {
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }
}
