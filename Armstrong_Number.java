/*logic==>
Example
For number 153:
Digits: 1, 5, 3
Number of digits: 3
Calculate: 
1^3+5^3+3^3=1+125+27=153
Since 153 == 153, it's an Armstrong number.*/
import java.util.*;
public class Armstrong_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;;
        int sec=0;
        for(int i=1;i<=3;i++){
            int rem=n%10;
            int b=(int)Math.pow(rem,3);
            sec=sec+b;
            n=n/10;
        }
        if(temp==sec){
            System.out.print("Armstrong Number");
        }
        else{
            System.out.print("Not a Armstrong Number");
        }
}
}