import java.util.*;
public class Project007 {
    public static void main(String[] args) {
        System.out.println("enter number from [1 to 7]");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String day;
        String type="";
        switch (n) {
            case 1:
                day = "saturday";
                type = "even";
                break;
            case 2:
                day = "sunday";
                type = "odd";
                break;
            case 3:
                day = "monday";
                type = "even";
                break;
            case 4:
                day = "tuesday";
                type = "odd";
                break;
            case 5:
                day = "wednesday";
                type = "even";
                break;
            case 6:
                day = "thursday";
                type = "odd";
                break;
            case 7:
                day = "friday";
                type = "nor odd nor even";
                break;
            default:
                day = "";


        }
        if (!day.isEmpty()) {
            System.out.format("#%d in week is %s\n ", n, day);
            if (!day.isEmpty()) {
                System.out.format("%s in week is %s\n ", day, type);
            } else {
                System.out.format("%s is not even or odd day\n", day);
            }
        }else{
                System.out.println("you have entered an invalid number");
            }
        }
    }
