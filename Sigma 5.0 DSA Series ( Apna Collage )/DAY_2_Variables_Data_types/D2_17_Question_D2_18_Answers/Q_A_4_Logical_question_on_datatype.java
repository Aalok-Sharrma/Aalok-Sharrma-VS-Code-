package DAY_2_Variables_Data_types.D2_17_Question_D2_18_Answers;

public class Q_A_4_Logical_question_on_datatype {
    public static void main(String[] args) {
        
    //  Q - What is the data type of 'g'

        byte   a = 4;
        char   b = 'a';
        short  c = 512;
        int    d = 1000;
        float  e = 3.14f;
        double f = 99.9954;
        double g = (double)(e*a)+(d%b)-(f*c);

        System.out.println("Result of ("+e+"*"+a+")+("+d+"%"+b+")-("+f+"*"+c+") is : "+g);

    }
}
