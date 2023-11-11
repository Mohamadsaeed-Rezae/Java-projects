import  java.util.*;
public class Project006 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter an integer[1 to 7]:\n");
        int n =input.nextInt();
        String day; 
        if(n==1)
            day ="Saturday";
        else if (n==2)
            day="sunday";

        else if (n==3)
            day="monday";

        else if (n==4)
            day="tuesday";

        else if (n==5)
            day="wednesday";

        else if (n==6)
            day="thursday";

        else if (n==7)
            day="friday";

        else day="";
        if (day!=""){
            System.out.format("the day #%d is :%s",n,day);
        }else {
           System.out.println("you have entered an invalid number.\n");
        }


    }
}
