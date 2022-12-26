package com.schule.schule.pen_and_paper;

import com.schule.schule.pen_and_paper.interfaces.Selection;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class PenAndPaper {

    static String getInputFromUser() {
        Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        return switch (input) {
            case "p" -> Selection.paper;
            case "s" -> Selection.scrissors;
            case "x" -> Selection.rock;
            default -> Selection.invalid;
        };
    }

    static String getInputFromComputer() {
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            return Selection.paper;
        } else if (random == 1) {
            return Selection.scrissors;
        } else {
            return Selection.rock;
        }
    }

    public static void getPenPaperInput() {
        // get input from user
        System.out.println("Enter your selection: ");

        String input = getInputFromUser();
        String computerInput = getInputFromComputer();

        System.out.println("You selected: " + input);
        System.out.println("Computer selected: " + computerInput);

        // compare input with computer input
        switch (input) {
            case Selection.paper:
                if (computerInput.equals(Selection.paper)) {
                    System.out.println("It's a tie!");
                } else if (computerInput.equals(Selection.scrissors)) {
                    System.out.println("Computer wins!");
                } else {
                    System.out.println("You win!");
                }
                break;
            case Selection.scrissors:
                if (computerInput.equals(Selection.paper)) {
                    System.out.println("You win!");
                } else if (computerInput.equals(Selection.scrissors)) {
                    System.out.println("It's a tie!");
                } else {
                    System.out.println("Computer wins!");
                }
                break;
            case Selection.rock:
                if (computerInput.equals(Selection.paper)) {
                    System.out.println("Computer wins!");
                } else if (computerInput.equals(Selection.scrissors)) {
                    System.out.println("You win!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }

    }

    public static void main(String[] args) {
        getPenPaperInput();
    }
}
