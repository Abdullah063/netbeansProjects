
package recursive;

/**
 *
 * @author ABDULLAH
 */
public class NewMain {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                // TODO code application logic here
                System.out.println("pow :"+pow(5, 3));
                System.out.println("fibo :"+fibCarp(4));
        }
        
        
        ///-------------pow-----------------
        static int pow(int a ,int b)
        {
                if (b==0) {
                        return 1;
                }
                return a*pow(a, b-1);
        }
        //---------------fibo-----------------
        static int fibCarp(int a)
        {
                if (a==1) {
                        return 1;
                }
                return fibCarp(a-1)*a;
        }
        static int printFib(int a)
        {
                if (a == 1  && a == 2 ) return a ;
                        
                return a +printFib(a-1);
        }
}
