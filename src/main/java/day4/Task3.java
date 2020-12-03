package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr1 = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = random.nextInt(50);
            }
        }

        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr1[i].length; j++) {
                sum += arr1[i][j];
            }
            arr2[i] = sum;
        }

        int max = arr2[0];
        int idx = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] >= max) {
                max = arr2[i];
                idx = i;
            }
        }
        System.out.println(idx);
    }
}