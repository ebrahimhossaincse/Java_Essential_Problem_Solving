package me.ebrahimhossain;

import java.util.ArrayList;
import java.util.Scanner;


public class App 
{
    public static void main(String[] args) {
        ArrayList<String> classNames = new ArrayList<>();

        classNames.add("Problem_1_IntegerOrDecimal");
        classNames.add("Problem_2_CircleArea");
        classNames.add("Problem_3_BooleanOpposite");
        classNames.add("Problem_4_TemperatureRange");
        classNames.add("Problem_5_StringToNumber");
        classNames.add("Problem_6_PoundsToKilograms");
        classNames.add("Problem_7_FloatToDouble");
        classNames.add("Problem_8_PercentageCalculation");
        classNames.add("Problem_9_KelvinToCelsius");
        classNames.add("Problem_10_EvenOrOdd");
        classNames.add("Problem_11_ArithmeticOperation");
        classNames.add("Problem_12_LeapYearCheck");
        classNames.add("Problem_13_LargestOfThree");
        classNames.add("Problem_14_CompoundInterest");
        classNames.add("Problem_15_VotingEligibility");
        classNames.add("Problem_16_DiscountedPrice");
        classNames.add("Problem_17_NumberSignCheck");
        classNames.add("Problem_18_DayOfTheWeek");
        classNames.add("Problem_19_VowelOrConsonant");
        classNames.add("Problem_20_FactorialCalculation");
        classNames.add("Problem_21_GradePoints");
        classNames.add("Problem_22_SumOfEvenNumbers");
        classNames.add("Problem_23_ValidNumberInput");
        classNames.add("Problem_24_StoreAndPrintNames");
        classNames.add("Problem_25_SumOfIntegers");
        classNames.add("Problem_26_UniqueValues");
        classNames.add("Problem_27_LargestNumberInArrayList");
        classNames.add("Problem_28_ReverseStrings");
        classNames.add("Problem_29_AverageOfPositiveNumbers");
        classNames.add("Problem_30_NumberSearchInArrayList");
        classNames.add("Problem_31_SquareOfNumber");
        classNames.add("Problem_32_StringLength");
        classNames.add("Problem_33_EvenNumberCheck");
        classNames.add("Problem_34_PowerCalculation");
        classNames.add("Problem_35_StringReverse");
        classNames.add("Problem_36_SumOfArrayList");
        classNames.add("Problem_37_GreatestCommonDivisor");
        classNames.add("Problem_38_ArmstrongNumberCheck");
        classNames.add("Problem_39_LeastCommonMultiple");
        classNames.add("Problem_40_PalindromeCheck");
        classNames.add("Problem_41_VowelCount");
        classNames.add("Problem_42_CubeOfNumber");
        classNames.add("Problem_43_FibonacciSequence");
        classNames.add("Problem_44_SumOfSquares");
        classNames.add("Problem_45_DivisibilityBy3And5");

        // Print the ArrayList
        //System.out.println("List of class names: " + classNames.size());

        for (String className : classNames){
            String s = "touch " + className+".java";
            System.out.println(s);
        }

    }
}
