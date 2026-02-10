package DAY_3_Operators.D3_8_Question_D3_9_Answers;

public class Q_A_4_What_will_be_the_output {
    public static void main(String[] args) {
        
        // Here we need to use BODMAS rule.
        // Any mathematical expression in bracket first get calculated then get change according to datatype and get store in any variable.

        int x=9,y=12;
        int a=2,b=4,c=6;
        int exp=4/3*(x+34)+9*(a+b*c)+(3+y*(2+a))/(a+b*y);
        System.out.println(" Output of 4/3*(x+34)+9*(a+b*c)+(3+y*(2+a))/(a+b*y) is : "+exp);
        
    }
}
