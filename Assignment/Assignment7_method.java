import org.w3c.dom.ls.LSOutput;

public class Assignment7_method {
    static void multiplication(int a){
        System.out.println("Question 1: print multiplication table of number n");
        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",a,i,a*i);
        }
    }

    static void patter1(int n){
        System.out.println();
        System.out.println("Question 2: print the pattern");
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumRect(int n){

        if(n==1){
            return 1;
        }
         return n + sumRect(n-1);
        }

        static int fibo(int n){
        if(n==1 || n== 2){
            return n-1;
        }
        else {
            return fibo(n-1) +fibo(n-2);
        }
        }
        public static void main(String[] args) {
multiplication(5);

patter1(4);

System.out.println();
System.out.println("Question 3: print the sum of first n natural number with recursion");
int c = sumRect(3);

System.out.println(c);
System.out.println("Question 4: print the fibo of n number with recursion");
int result = fibo(7);
System.out.println(result);

    }
}
