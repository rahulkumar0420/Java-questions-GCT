public class patternprinting2 {
    public static void patternprint(){
        int n=5;
        for (int i=5; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternprint();       
    }   
}