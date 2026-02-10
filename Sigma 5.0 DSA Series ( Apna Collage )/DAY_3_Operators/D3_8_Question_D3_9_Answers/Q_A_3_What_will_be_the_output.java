package DAY_3_Operators.D3_8_Question_D3_9_Answers;

public class Q_A_3_What_will_be_the_output {
    public static void main(String[] args) {
        
        // Here we need to use BODMAS rule.
        // Any mathematical expression in bracket first get calculated then get change according to datatype and get store in any variable.

        int x,y,z;
        x=y=z=2;
        x+=y;
        y-=z;
        z/=(x+y);
        System.out.println("x="+x+", y="+y+", z="+z);

    }
}
