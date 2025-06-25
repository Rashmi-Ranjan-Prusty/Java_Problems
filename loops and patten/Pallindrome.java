import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        int test, rem, pall=0;
        Scanner sc = new Scanner(System.in);  
        int num=sc.nextInt();
        for ( test=num; test!=0; test/=10) {
            rem=test%10;
            pall=pall*10+rem;
        }
        System.out.println(pall);
        if (pall==num) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not");
        }
    }
    
}
