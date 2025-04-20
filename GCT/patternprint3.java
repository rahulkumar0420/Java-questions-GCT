public class patternprint3 {
    public static void patternprint(){
        for (int i = 0; i<5; i++){
            for (int j=0; j<5; j++){
                if ((i==0||i==1||i==2) &&(j==0||j==4)){
                    System.out.print("* ");
                } else if (i==3 && (j==1 || j==3)) {
                    System.out.print("* ");
                } else if (i==4 && j==2) {
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        patternprint();       
    }   

}


