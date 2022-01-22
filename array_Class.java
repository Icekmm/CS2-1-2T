import java.util.Arrays;

public class array_Class {
    
    public static void main(String[] args) {
        
        int num_array[] = {10,20,30,40,50,60,70,80,90};
        System.out.print(Arrays.toString(num_array));
        
        int n = num_array.length;
        int newArray[] = new int[n+1];

        int value = 100;

        for(int x = 0; x < n; x++ ){
            newArray[x] = num_array[x];
        }

        newArray[n] = value;
        System.out.println();
        System.out.print(Arrays.toString(newArray));

    }
}
