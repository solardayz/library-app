package com.cz.libraryapp.assignment.day5cleancode;

import java.util.Scanner;

/*
* 1. 변수 및 메소드 이름 변경 : 코드의 가독성을 높임
* 2. 배열 사용 : 각 주사위 숫자에 대한 결과를 배열에 저장
* 3. 메소드 분리 : 주사위 던지기와 결과로 메소드를 분리
* */
public class MainClean {
    public static void main(String[] args) {
        System.out.println("던질 주사위 횟수를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfThrows = scanner.nextInt();

        int[] throwResults = new int[6];
        simulateDiceThrows(numberOfThrows, throwResults);

        printResults(throwResults);
    }

    private static void simulateDiceThrows(int numberOfThrows, int[] throwResults) {
        for (int i = 0; i < numberOfThrows; i++) {
            double randomValue = Math.random() * 6;
            int diceNumber = (int) Math.floor(randomValue);
            throwResults[diceNumber]++;
        }
    }

    private static void printResults(int[] throwResults) {
        for (int i = 0; i < throwResults.length; i++) {
            int diceNumber = i + 1;
            System.out.printf("%d은(는) %d번 나왔습니다.\n", diceNumber, throwResults[i]);
        }
    }
}
