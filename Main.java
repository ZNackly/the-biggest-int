import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] array = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        int maxElement = array[0][0];
        int maxRow = 0;
        int maxColumn = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        
        System.out.println(maxRow + " " + maxColumn);
    }
}
