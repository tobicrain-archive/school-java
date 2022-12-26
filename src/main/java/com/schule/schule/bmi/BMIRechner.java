package com.schule.schule.bmi;

import com.schule.schule.bmi.interfaces.BMIResult;
import com.schule.schule.bmi.interfaces.WeightHeight;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class BMIRechner {

    static List<BMIResult> bmiResults = new ArrayList<>();

    // function to calculate BMI
    public double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    static Scanner scanner = new Scanner(System.in);

    // function to get variables from user
    public WeightHeight getInputValues() {

        System.out.print("Gewicht in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Größe in m: ");
        double height = scanner.nextDouble();

        return new WeightHeight() {
            @Override
            public double getWeight() {
                return weight;
            }

            @Override
            public double getHeight() {
                return height;
            }
        };
    }

    // function to determine the BMI category
    public String getBMICategory(double bmi) {
        // switch case to determine the BMI category
        if (bmi < 18.5) {
            return "Untergewicht";
        } else if (bmi < 25) {
            return "Normalgewicht";
        } else if (bmi < 30) {
            return "Übergewicht";
        } else if (bmi < 35) {
            return "Adipositas Grad I";
        } else if (bmi < 40) {
            return "Adipositas Grad II";
        } else {
            return "Adipositas Grad III";
        }
    }

    public void main(String[] args) {

        boolean again = true;

        while (again) {
            WeightHeight weightHeight = getInputValues();

            // calculate BMI
            double bmi = calculateBMI(weightHeight.getWeight(), weightHeight.getHeight());

            // determine BMI category
            String bmiCategory = getBMICategory(bmi);

            // create BMIResult object
            BMIResult bmiResult = new BMIResult() {
                @Override
                public double getBMI() {
                    return bmi;
                }

                @Override
                public String getBMICategory() {
                    return bmiCategory;
                }
            };

            // add BMIResult object to list
            bmiResults.add(bmiResult);

            // print BMI and BMI category
            System.out.println("BMI: " + bmi);
            System.out.println("BMI-Kategorie: " + bmiCategory);

            System.out.print("Nochmal? (j/n): ");

            String answer = scanner.next();
            again = answer.equals("j");
        }

        System.out.println("Auf Wiedersehen!");

        double averageBMI = bmiResults.stream()
                .mapToDouble(BMIResult::getBMI)
                .average()
                .orElse(0);

        System.out.println("Durchschnittlicher BMI: " + averageBMI);

        scanner.close();
    }
}
