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
        

        // -------------------(Way-1 to call a static method (or) inner class static method )-------------------

        // Here in this case we don't need to create a object for a class as we can call 
        // "numberOf7s()" static method by it class name "NumberOf7s" as the method is a static method

        int a[][]={{1,2,7,3,7},{7,7,1,9,7}};
        System.out.println("There are "+NumberOf7s.numberOf7s(a)+" Total numbers of 7's in array a[][]");

        /* In above line I can call "numberOf7s()" method of "NumberOf7s" class by it's class object(n7) 
           also like "n7.numberOf7s(a)" as we call every method in OOPs but in this case "numberOf7s()" 
           method is a static method of "NumberOf7s" class and it is a java convention that we should 
           call a static method by it's class name like "NumberOf7s.numberOf7s(a)" and as Here in this 
           case we don't need to create a object for a class as we can call "numberOf7s()" static method 
           by it class name "NumberOf7s" as the method is a static method */
        

        // -------------------(Way-2 to call a static method (or) inner class static method )-------------------

        Q_A_1_Number_Of_7s_In_2D_Array.NumberOf7s n7 = new Q_A_1_Number_Of_7s_In_2D_Array.NumberOf7s();

        System.out.println("There are "+n7.numberOf7s(a)+" Total numbers of 7's in array a[][]");


        /* Here  "NumberOf7s" is a inner class of "Q_A_1_Number_Of_7s_In_2D_Array" outer class 
        so to call inner class(NumberOf7s) in a main method(public static void main(String[] args)) 
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
