public class matriz0{
    
   /*  public int[][] getMatrizinicial() {
        return matrizinicial;
    }
    public void setMatrizinicial(int[][] matrizinicial) {
        this.matrizinicial = matrizinicial;
    }
    public int[][] getMatrizfinal() {
        return matrizfinal;
    }
    public void setMatrizfinal(int[][] matrizfinal) {
        this.matrizfinal = matrizfinal;
    }
    class movement{

    } */
    public static int show(int matriz1[][],int matriz2[][])
    {
        int mov;
        int matrizinicial[][]=new int[3][3],matrizfinal[][]=new int[3][3];
        System.out.println("\n");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++){
                matrizinicial[i][j]=matriz1[i][j];
                System.out.print(matrizinicial[i][j]+" ");  
            }
            System.out.println("");
        }
        System.out.println("\n");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++){
                matrizfinal[i][j]=matriz2[i][j];
                System.out.print(matrizfinal[i][j]+" ");  
            }
            System.out.println("");
        }
        System.out.println("\n");
        //movimiento
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++){
                
                System.out.print(matrizinicial[i][j]+" ");  
            }
            System.out.println("");
        }
        
        return 0;
    }
    public static void main(String[] args) {
        int matrizinicial[][]={{2,8,3},{1,6,4},{7,0,5}};
        int matrizfinal[][]={{1,2,3},{8,0,4},{7,6,5}};
        show(matrizinicial, matrizfinal);
    }
}