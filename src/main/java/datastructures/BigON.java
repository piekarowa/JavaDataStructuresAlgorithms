package datastructures;

public class BigON {

    public static void printItems(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
        for(int j = 0; j < n; j++){
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }
 // n + n = 2n operations   O(2n) = O(n) dropping constances
}
