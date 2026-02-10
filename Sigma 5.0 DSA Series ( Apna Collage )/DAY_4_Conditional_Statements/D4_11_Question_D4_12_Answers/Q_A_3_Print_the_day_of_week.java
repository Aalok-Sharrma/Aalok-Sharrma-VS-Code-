package DAY_4_Conditional_Statements.D4_11_Question_D4_12_Answers;

import java.util.Scanner;

public class Q_A_3_Print_the_day_of_week{

    public static int week(int a){

        switch(a){
            case 1: System.out.println("Monday");
                
                break;
            case 2:System.out.println("Tuesday");
                
                break;
            case 3:System.out.println("Wednesday");
                
                break;
            case 4:System.out.println("Thursday");
                
                break;
            case 5:System.out.println("Friday");
                
                break;
            case 6:System.out.println("Saturday");
                
                break;
            case 7:System.out.println("Sunday");
                
                break;
        
            default:System.out.println("Enter week number from 1-7"+week(a));
             
                break;
        
        }

            return 0;
    }

    public static int main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter week number (1-7) : ");
        int a=sc.nextInt();

        return week(a);

    }

}


/* package DAY_4.D4_11_Question_D4_12_Answers;

import java.util.Scanner;

public class Q_A_3_Print_the_day_of_week {

    public static int week(int a){

        switch(a){
            case 1: System.out.println("This day is Monday");
                
                break;
            case 2:System.out.println("This day is Tuesday");
                
                break;
            case 3:System.out.println("This day is Wednesday");
                
                break;
            case 4:System.out.println("This day is Thursday");
                
                break;
            case 5:System.out.println("This day is Friday");
                
                break;
            case 6:System.out.println("This day is Saturday");
                
                break;
            case 7:System.out.println("This day is Sunday");
                
                break;
        
            default:System.out.println("Enter week number from 1-7"+week(a));
             
                break;
        
    }

    return 0;
}

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter week number (1-7) : ");
        int a=sc.nextInt();

        week(a);

    }
}

 */

