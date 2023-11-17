import java.util.*;
public class Project006 {
    public static void main(String[] args){
        System.out.println("please enter  a number  from [1 to 7]:\n");
        Scanner input=new Scanner(System.in);
        int n =input.nextInt();
        String day;
        if (n==1)
           day ="Saturday";
        else if (n==2)
            day="Sunday";
        else if (n==3)
            day="Monday";
        else if (n==4)
            day="Tuesday";
        else if (n==5)
            day="Wednesday";
        else if (n==6)
            day="Thursday";
        else if (n==7)
            day="Friday";
        else
            day="";
        if (!day.isEmpty())
        System.out.format("#%d is %s",n,day);
        else{
            System.out.format("%d you have entered an invalid number",n);
         }
     }

    }





    }
}
