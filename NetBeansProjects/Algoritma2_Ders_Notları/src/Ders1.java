
import java.util.Scanner;

public class Ders1 {

        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int N = input.nextInt();
                int A[] = new int[N];
                for (int i = 0; i < N; i++) {
                        System.out.println("Lütfen " + i + ". elemanı giriniz:");
                        A[i] = input.nextInt();
                }
                for (int i = 0; i < N - 1; i++) // 2---5---1
                {
                        for (int j = i + 1; j < N; j++) {
                                if (A[j] < A[i]) {
                                        int tmp = A[i];
                                        A[i] = A[j];
                                        A[j] = tmp;
                                }
                        }
                }
                yazdir(A);
        }

        public static void yazdir(int[] array) {
                for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + ", ");
                        String açıklam;
                }
        }
}
