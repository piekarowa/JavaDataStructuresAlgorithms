package datastructures;

public class BigOaTimesb {

    public static void printItems(int a, int b){
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.println(i + " " + j);
            }
        }
    }

    // O(a) * O(b) = O (a * b)
    public static void main(String[] args) {
        printItems(3, 5);
    }

}
