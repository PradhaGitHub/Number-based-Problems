/*logic==>Example
For number 145:
Digits: 1, 4, 5
Factorials: 1! = 1, 4! = 24, 5! = 120
Sum: 1 + 24 + 120 = 145
Since 145 == 145, it's a strong number.*/
import java.util.*;
public class Strong_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int res=0;
        while(n!=0){
            int rem=n%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            res=fact+res;
            n=n/10;
        }
        if(temp==res){
            System.out.print("Strong Number");
        }
        else{
            System.out.print("Not a Strong Number");
        }
}
}