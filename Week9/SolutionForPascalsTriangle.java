package Week9;

import java.util.*;

public class SolutionForPascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();
        
        // Generate Pascal's Triangle
        int[][] triangle = generatePascalsTriangle(numRows);
        
        // Print Pascal's Triangle
        printPascalsTriangle(triangle);
        scanner.close();
    }
    
    // Function to generate Pascal's Triangle
    public static int[][] generatePascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][];
        
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // First element in each row is always 1
            triangle[i][i] = 1; // Last element in each row is always 1
            
            // Calculate middle elements of each row
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        
        return triangle;
    }
    
    // Function to print Pascal's Triangle
    public static void printPascalsTriangle(int[][] triangle) {
        System.out.println("Pascal's Triangle:");
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
