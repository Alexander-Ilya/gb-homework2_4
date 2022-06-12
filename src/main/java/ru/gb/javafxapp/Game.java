package ru.gb.javafxapp;

import java.util.*;

public class Game {
    public static class BullAndCowApplication {
        private final int bulls;
        private final int cows;

        public BullAndCowApplication(int bullshit, int cows) {
            this.bulls = bullshit;
            this.cows = cows;
        }

        public int getBulls() {
            return bulls;
        }

        public int getCows() {
            return cows;
        }
    }

    private final int[] guessNum;

    public Game() {
        guessNum = generateNumbers();
        System.out.println(Arrays.toString(guessNum));
    }

    public String getGuessNum() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
           stringBuilder.append(guessNum[i]);
        }
        return stringBuilder.toString();
    }

    public BullAndCowApplication calculateBullsAndCow(String playerNum) {
        int bulls = 0, cows = 0;
        for (int i = 0; i < guessNum.length; i++) {
            if (guessNum[i] == playerNum.charAt(i) - '0') {
                bulls++;
            } else if (playerNum.contains(String.valueOf(guessNum[i]))) {
                cows++;
            }
        }
        return new BullAndCowApplication(bulls, cows);

    }

    private int[] generateNumbers() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        Collections.shuffle(numbers);
        return new int[]{numbers.get(0), numbers.get(1), numbers.get(2), numbers.get(3)};
    }
}
