package datastructures;

public class BigOab {

    public static void printItems(int a, int b){
        for(int i = 0; i < a; i++){
            System.out.println(i);
        }
        for(int j = 0; j < b; j++){
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        printItems(10, 20);
    }

    // O(a) + O(b) = O(a + b)

}
