package DAY_11_2D_Arrays.D11_11_Question_D11_12_Answers;

public class Q_A_2_Sum_Of_2nd_Row_Of_A_Array {
    
    class SumOf2ndRow{

        public int sumOf2ndRow(int a[][]){

            int sum=0;

            for(int i=0; i<a[0].length; i++){

                sum+=a[1][i];
            }

            return sum;
        }
    }

    public static void main(String[] args) {
        
        int a[][]={{1,2,3},{5,6,7}};

        Q_A_2_Sum_Of_2nd_Row_Of_A_Array qa2 = new Q_A_2_Sum_Of_2nd_Row_Of_A_Array();

        Q_A_2_Sum_Of_2nd_Row_Of_A_Array.SumOf2ndRow s2 = qa2.new SumOf2ndRow(); 

        System.out.println(s2.sumOf2ndRow(a));

        /* Here  "SumOf2ndRow" is a inner class of "Q_A_2_Sum_Of_2nd_Row_Of_A_Array" outer class 
        so to call inner class(SumOf2ndRow) in a main method(public static void main(String[] args)) 
        we should understand below concept..

        To call or instantiate an inner class in Java, the approach depends on whether the inner class is non-static (member inner class) or static (static nested class). 
         1. Calling a Non-Static Inner Class
            A non-static inner class is tied to an instance of the outer class. To instantiate it, you must first create an object of the outer class. 

            Syntax: OuterClass.InnerClass inner = outerObject.new InnerClass();.
            
            Example:

            class Outer {
                class Inner {
                  void show() { System.out.println("In Inner Class"); }
                }
            }

            public class Main {
                public static void main(String[] args) {
                    Outer outer = new Outer(); // Step 1: Create Outer object
                    Outer.Inner inner = outer.new Inner(); // Step 2: Create Inner object
                    inner.show();
                }
            }

        2. Calling a Static Nested Class
           Static nested classes do not require an instance of the outer class for instantiation. They behave like other top-level classes but are nested for packaging convenience. 

           Syntax: OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();.
           
           Example:

           class Outer {
             static class StaticInner {
               void show() { System.out.println("In Static Nested Class"); }
             }
           }

           public class Main {
              public static void main(String[] args) {
                Outer.StaticInner inner = new Outer.StaticInner(); // Direct instantiation
                 inner.show();
              }
           }

           3. Other Specialized Types
              Method-Local Inner Class: Defined inside a method and can only be instantiated within that specific method.
              Anonymous Inner Class: Declared and instantiated simultaneously in a single statement, often used for one-time implementations of interfaces or abstract classes. 

              For more detailed technical documentation, you can refer to the official Oracle Java Tutorial on Nested Classes or W3Schools' Java Inner Classes guide
        */

    }
}
