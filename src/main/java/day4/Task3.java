package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }
        int sum1 = 0;
        int idx = 0;
        for(int i = 0; i <arr.length; i++) {
            int sum2 = 0;
            for(int j = 0; j < arr[i].length; j++) {
                sum2 += arr[i][j];
            }
            if(sum2 >= sum1) {
                sum1 = sum2;
                idx = i;
            }
        }
        System.out.println(idx);
    }
}