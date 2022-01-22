import java.util.ArrayList;
import java.util.Arrays;

public class myArrayliet {
    
    public static void main(String[] args) {
        Integer num_array[] = {10,20,30,40,50,60,70,80,90};
        System.out.print("Initial array values     : " + Arrays.toString(num_array));

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(num_array));

        arrayList.add(100);
        num_array = arrayList.toArray(num_array);

        System.out.println();
        System.out.print("Array after adding value : " + Arrays.toString(num_array));
    }
}
