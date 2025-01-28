public class patterns2{
    public static void main (String[] args){
        int n=3;
        for (int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){//j(colums) value is dependent on the i(rows) 
                System.out.print(" ");//use print statement for execution , whenre printLn prints the statementd in new line.
            }
            System.out.println("*");
        }
        for (int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){//j(colums) value is dependent on the i(rows) 
                System.out.print(" ");//use print statement for execution , whenre printLn prints the statementd in new line.
            }
            System.out.println("*");
        }
        System.out.println("-----------");  
        for (int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){//j(colums) value is dependent on the i(rows) 
                System.out.print("*");//use print statement for execution , whenre printLn prints the statementd in new line.
            }
            System.out.print("\n");
        }
        System.out.println("-----------");
        for(int i=n;i>=1;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");   
            } 
            System.out.println();   
        }
        System.out.println("-----------"); 

    }
}