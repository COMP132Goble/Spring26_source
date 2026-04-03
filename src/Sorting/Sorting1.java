package Sorting;

import java.util.Arrays;

public class Sorting1 {
    static String[] names = {
        "Trea Turner", "Kyler Schwarber", "Bryce Harper",
        "Alec Bohm", "Bryson Stott", "Adolis Garcia",
        "Brandon Marsh", "J.T. Realmuto", "Justin Crawford", "Cristopher Sánchez"
    };

    public static void main(String[] args) {
        // print the original unsorted array
        System.out.println("");
        printRuleAndArray("Original name list:");

        // sorting by 'natural ordering'
        Arrays.sort(names);
        printRuleAndArray("Sorted by 'natural ordering' " + "(lexicographic):");
    }

    static void printRuleAndArray(String rule) {
        System.out.println(rule);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("");
    }
}
