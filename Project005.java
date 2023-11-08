import java.util.*;
public class Project005 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("enter a number:");
        int n = input.nextInt();
        String type= (n % 2==0)?"even" :"odd";
        
        System.out.format("%d is an %s number\n", n,type);
    }
    
}
