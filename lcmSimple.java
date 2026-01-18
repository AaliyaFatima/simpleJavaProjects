package practice_Java;

import java.util.*;

public class lcmSimple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int lcm=Math.max(a, b);

        while(true){
            if(lcm % a == 0 && lcm % b == 0){
                System.out.print(lcm);
                break;
            }
            lcm++;
        }sc.close();        
    }
}