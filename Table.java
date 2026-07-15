import java.util.Random;
import java.util.Scanner;

public class Table {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int size = readArraySize();

        int[][] table = generateTable(size);

        System.out.println("\nGenerated 2D array:");
        printTable(table, -1);

        int highlight = readHighlightNumber();

        System.out.println("\nArray with " + highlight + " highlighted:");
        int count = printTable(table, highlight);

        System.out.println("\nNumber " + highlight + " appeared " + count + " time(s)");
    }

    static int readArraySize() {

        while (true) {

            System.out.print("Enter array size (for P×P array): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
                continue;
            }

            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Array size must be greater than 0.");
                continue;
            }

            return n;
        }
    }

    static int[][] generateTable(int size) {

        Random random = new Random();

        int[][] arr = new int[size][size];

        int[] even = {2,4,6,8,10,12,14,16};

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=even[random.nextInt(even.length)];
            }
        }

        return arr;
    }


    static int readHighlightNumber() {

        while (true) {

            System.out.print("\nEnter a number to highlight (even number 2–16): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
                continue;
            }

            int x = sc.nextInt();

            if (x < 2 || x > 16 || x % 2 != 0) {
                System.out.println("Please enter an EVEN number between 2 and 16.");
                continue;
            }

            return x;
        }
    }

    static int printTable(int[][] arr, int highlight) {

        int n = arr.length;
        int count = 0;

        System.out.print("    ");
        for(int i=0;i<n;i++){
            System.out.printf("%4s ", String.format("%02d ", i));
        }
        System.out.println();

        printBorder(n);

        for(int i=0;i<n;i++){

            System.out.printf("%02d ",i);

            for(int j=0;j<n;j++){

                if(arr[i][j]==highlight){

                    System.out.printf("|[%2d]",arr[i][j]);
                    count++;

                }else{

                    System.out.printf("| %2d ",arr[i][j]);

                }

            }

            System.out.println("|");
            printBorder(n);
        }

        return count;
    }

   
    static void printBorder(int n){

        System.out.print("   ");

        for(int i=0;i<n;i++){

            System.out.print("+----");

        }

        System.out.println("+");
    }
}
