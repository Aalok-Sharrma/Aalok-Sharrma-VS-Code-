package DAY_3_Operators.D3_8_Question_D3_9_Answers;

public class Q_A_2_What_will_be_the_output {
    public static void main(String[] args) {
        
        // Here we need to use BODMAS rule.
        // Any mathematical expression in bracket first get calculated then get change according to datatype and get store in any variable.

        int x=200,y=50,z=100;
        if(x>y && y>z){
            System.out.println("Aalok_Sharrma");
        }
        if(z>y && z<x){
            System.out.println("Aalok Sharrma");
        }
        if((y+200)<x && (y+150)<z){
            System.out.println("Aalok-Sharrma");
        }
        
    }
}
