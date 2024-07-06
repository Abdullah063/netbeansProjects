
package algoritma2_ders_notları;


public class Algoritma2_Ders_Notları {

        public static void print(int a ,int ub )
        {
                int [] [] array = new int[a][a];
                for (int i = 0; i <array.length; i++) {
                        for (int j = 0; j < array[0].length; j++) {
                                array[i][j] = (int) Math.random()*ub;
                        }
                }
        }
        public static void main(String[] args) {
                
        }
        public static int determinant2(int[][] matrix) {
                int determinant = (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);
                return determinant;
        }
        
        
               
}
