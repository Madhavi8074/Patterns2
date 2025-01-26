public class Patterns2 {
    public static void main(String[] args){
     System.out.println("Second Pattern: ");
    int rows=5;
    int columns=5;
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=columns;j++){
            if(j%2==1){
                System.out.print("* ");
            }else{
                System.out.print("# ");
            }
        }
        System.out.println();
    }
}}
