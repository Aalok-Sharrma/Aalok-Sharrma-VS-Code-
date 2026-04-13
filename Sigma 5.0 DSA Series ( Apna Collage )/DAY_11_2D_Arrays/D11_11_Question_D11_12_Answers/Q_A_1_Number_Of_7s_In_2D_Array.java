package DAY_11_2D_Arrays.D11_11_Question_D11_12_Answers;


public class Q_A_1_Number_Of_7s_In_2D_Array {
    
    public static class NumberOf7s{

        public static int numberOf7s(int a[][]){

            int noOf7s=0;
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a[0].length; j++){
                    if (a[i][j]==7) {
                        noOf7s++;
                    }
                }
            }
            return noOf7s;
        }
    }

    public static void main(String[] args) {
        
        // NumberOf7s n7 = new NumberOf7s(); 
        
        // Here in this case we don't need to create a object for a class as we can call 
        // "numberOf7s()" static method by it class name "NumberOf7s" as the method is a static method

        int a[][]={{1,2,7,3,7},{7,7,1,9,7}};
        System.out.println("There are "+NumberOf7s.numberOf7s(a)+"Total numbers of 7's in array a[][]");

        /* In above line I can call "numberOf7s()" method of "NumberOf7s" class by it's class object(n7) 
           also like "n7.numberOf7s(a)" as we call every method in OOPs but in this case "numberOf7s()" 
           method is a static method of "NumberOf7s" class and it is a java convention that we should 
           call a static method by it's class name like "NumberOf7s.numberOf7s(a)" and as Here in this 
           case we don't need to create a object for a class as we can call "numberOf7s()" static method 
           by it class name "NumberOf7s" as the method is a static method */
        
    }
    
}
