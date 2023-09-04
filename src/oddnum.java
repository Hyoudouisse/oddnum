import java.util.*;
public class oddnum {
    public static void main(String args[]) {

            int input = 25;
            printODD(input);
        }
         static int printODD(int input)
        {
            if(input==1)
            {
                System.out.println(input);
            }
            if(input%2!=0)
            {
                System.out.println(input);
                printODD(input-2);
            }
            if(input%2==0)
            {
                printODD(input -1);
            }
            return 1;
        }
    }