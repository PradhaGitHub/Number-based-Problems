/*logic ==>
Check if 18 is a Harshad Number:
Digits: 1+8=9
Division: 18÷9=2 (No remainder)
Conclusion: 18 is a Harshad Number.
*/
import java.util.*;
public class Harshad_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0,temp=n;
        while(n!=0){
            int rev=n%10;
            m=rev+m;
            n/=10;
        }
        if(temp%m==0){
            System.out.print("Harshad Number");
        }
        else{
            System.out.print("Not a Harshad Number");
        }
    }
}