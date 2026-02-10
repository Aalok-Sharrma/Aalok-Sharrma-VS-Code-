package DAY_3_Operators.D3_8_Question_D3_9_Answers;

public class Q_A_1_What_will_be_the_output {
    public static void main(String[] args) {
        
        // Here we need to use BODMAS rule.
        // Any mathematical expression in bracket first get calculated then get change according to datatype and get store in any variable.

        int x=2,y=5;
        int exp1=(x*y/x);
        int exp2=(x*(y/x));
        System.out.println("Output of x*y/x is : "+exp1);
        System.out.println("Output of x*(y/x) is : "+exp2);

    }
    
}
