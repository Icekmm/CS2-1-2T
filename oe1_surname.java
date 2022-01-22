import java.util.Scanner;
import java.util.Arrays;

public class oe1_surname {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ch, size;
        
        System.out.println("[1] Create Array List");
        System.out.println("[2] Insert in Array");
        System.out.println("[3] Search in Array");
        System.out.println("[4] Delete in Array");
        System.out.println("[0] Exit System");
        System.out.print("Select Operation: ");
        ch = in.nextInt();

        switch(ch){
            case 1:{
                System.out.println("Create the Array List");
                System.out.print("Enter the size of the array : ");
                size = in.nextInt();
                
                int my_array[] = new int[size];

                for(int x = 0; x < size; x++){
                    System.out.print("Enter array element : ");
                    my_array[x] = in.nextInt();
                }
                System.out.print("My Array List : " + Arrays.toString(my_array));
                break;
            }
        }

    }
}
