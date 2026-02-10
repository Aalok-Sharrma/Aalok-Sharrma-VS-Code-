package DAY_5_Loops_Flow_Control.D5_16_Question_D5_17_Answers;

import java.util.Scanner;

public class Q_A_2_Print_the_sum_of_even_and_odd_integers_in_range {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int sum1=0;    // sum of even integer
        int sum2=0;    // sum of odd integer

        System.out.print("Enter the range till number add : ");
        int n=sc.nextInt();

        for(int i=0; i<=n; i++){
            if(i%2==0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        System.out.println("Sum of even integer is : "+sum1);
        System.out.println("Sum of odd integer is : "+sum2);

    }
}
