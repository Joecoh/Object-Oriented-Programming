import java.util.Scanner;

public class Seq_Search {
  
    public static int linearSearch(int arr[], int x) {
        int n = arr.length;

      
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 }; 
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the element to search:");
        int x = in.nextInt(); 

       
        int result = linearSearch(arr, x);

        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present at index " + result);
        }

        in.close();
    }
}
