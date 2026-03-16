public class Special_AalokSharrma_Pattern_Question {
    
    public static void pattern(int n){
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if((i==j)||(i==3 && j==1)||(i==4 && j==2)){
                    System.out.print(" * ");
                } else{
                    System.out.print("  ");
                }
            } 
            System.out.println();
        }
        
        int x=n-1;
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=x; j++){
                if((i==j)||(i==1 && j==3)||(i==3 && j==1)){
                    System.out.print(" * ");
                } else{
                    System.out.print("  ");
                }
            } 
            x--;
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        
        pattern(4);
        
    }
}
