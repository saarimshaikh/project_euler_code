import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class multiples_of_3_or_5 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<1000; i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

}
