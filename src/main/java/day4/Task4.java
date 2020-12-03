package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10_000);
        }

        int temp;
        int sum = 0;
        int idx = 0;
        for (int i = 1; i < arr.length - 1 ; i++) {
            temp = arr[i - 1] + arr[i] + arr[i + 1];
            if (temp >= sum) {
                sum = temp;
                idx = i - 1;
            }
        }
        System.out.println(sum);
        System.out.println(idx);
    }
}