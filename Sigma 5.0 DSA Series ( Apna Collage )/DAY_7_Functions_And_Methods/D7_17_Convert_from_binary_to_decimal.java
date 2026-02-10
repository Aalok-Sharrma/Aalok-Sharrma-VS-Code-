package DAY_7_Functions_And_Methods;

public class D7_17_Convert_from_binary_to_decimal {
    public static void main(String[] args) {
        
        // Logic 

        // In coding we needed three variables

        // Pow = 0; DecNum = 0; LastDigit = BinNum % 10;

        // dec = dec+LastDigit*2^pow = 0

        // Binary number whose decimal number we want is n=10100011

        // (i)   LastDigit = 1, pow = 0, dec = dec+LastDigit*2^0 = 0+1(2^0) = 1      therefore dec = 1
        
        // (ii)  LastDigit = 1, pow++ (pow = 1), dec = dec+1*2^1 = 1+1(2) = 3       therefore dec = 3

        // (iii) LastDigit = 0, pow++ (pow = 2), dec = ........
        
    }
}
