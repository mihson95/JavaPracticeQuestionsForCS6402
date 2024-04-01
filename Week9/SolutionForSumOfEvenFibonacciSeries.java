package Week9;

import java.util.Scanner;

public class SolutionForSumOfEvenFibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the value of index.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = getFibonacciEvenArray(n);
        System.out.println(calculateSumOfArray(arr));
        scanner.close();
    }

    public static int[] getFibonacciEvenArray(int n) {
        int fibSeries[] = getFibonacciArray(n*2);
        int fibEvenSeries[] = new int[n+1];
        int j = 0;
        for (int i = 0; i < fibSeries.length; i+=2) {
            fibEvenSeries[j++] = fibSeries[i];
        }
        
        return fibEvenSeries;
    }

    public static int[] getFibonacciArray(int n) {
        int fibSeries[] = new int[n+1];
        int a = 0;
        int b = 1;
        int c = 0;
        fibSeries[0] = a;
        fibSeries[1] = b;
        int count = 2;
        while(count < n) {
            c = a + b;
            a = b;
            b = c;
            fibSeries[count++] = c;
        }
        fibSeries[count] = a+b;
        return fibSeries;
    }

    public static int calculateSumOfArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
