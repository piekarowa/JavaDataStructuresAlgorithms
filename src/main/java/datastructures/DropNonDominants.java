package datastructures;

public class DropNonDominants {

    public static void printItems(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }

        for(int k= 0; k < n; k++){
            System.out.println(k);
        }

    }

    public static void main(String[] args) {
        printItems(10);
    }

    // n * n + n = n^2 + n = O(n^2 + n) = O(n^2)   (+n is not important comparing to n^2)

}
