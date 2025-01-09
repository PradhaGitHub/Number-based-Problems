/*logic ==>
Check if 121 is a palindrome:
Original Number: 121
Initial res = 0.
Iteration 1:
Extract last digit: 121 % 10 = 1.
Update reversed: res = 0 * 10 + 1 = 1.
Remove last digit: 121 / 10 = 12.
Iteration 2:
Extract last digit: 12 % 10 = 2.
Update reversed: res = 1 * 10 + 2 = 12.
Remove last digit: 12 / 10 = 1.
Iteration 3:
Extract last digit: 1 % 10 = 1.
Update reversed: res = 12 * 10 + 1 = 121.
Remove last digit: 1 / 10 = 0.
Compare: 121 == 121 → Palindrome.
*/
import java.util.*;
public class Palindrome_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0,temp=n;
        while(n!=0){
            int rev=n%10;
            res=res*10+rev;
            n=n/10;
        }
        if(temp==res){
            System.out.print("Palindrome Number");
        }
        else{
            System.out.print("Not a Palindrome Number");
        }
    }
        
}
