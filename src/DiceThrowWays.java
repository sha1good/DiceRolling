import java.util.HashMap;

public class DiceThrowWays {

    /*
    Given n dice each with m faces, numbered from 1 to m,
    find the number of ways to get sum X.
     X is the summation of values on each face when all the dice are thrown
     This solution assumes that 1,2,1 is different from 2,1,1 which is different from 1,1 2

     Let the function to find X from n dice is: Sum(m, n, X)
The function can be represented as:
Sum(m, n, X) = Finding Sum (X - 1) from (n - 1) dice plus 1 from nth dice
               + Finding Sum (X - 2) from (n - 1) dice plus 2 from nth dice
               + Finding Sum (X - 3) from (n - 1) dice plus 3 from nth dice
                  ...................................................
                  ...................................................
                  ...................................................
              + Finding Sum (X - m) from (n - 1) dice plus m from nth dice

So we can recursively write Sum(m, n, x) as following
Sum(m, n, X) = Sum(m, n - 1, X - 1) +
               Sum(m, n - 1, X - 2) +
               .................... +
               Sum(m, n - 1, X - m)
    * **/
    public static void main(String[] args) {
        DiceThrowWays dtw = new DiceThrowWays();
        System.out.println(dtw.numberOfWays(6, 3, 8));


    }

    public int numberOfWays(int n, int f, int k){

        int T[][] = new int[n+1][k+1];
        T[0][0] = 1;
    /*  for(int i=0; i < T.length; i++){
            T[0][i] = 1;
        }*/

        for(int i=1; i <= n; i++){
            for(int j =1; j <= i*f && j <= k ; j++){
                if(j == i){
                    T[i][j] = 1;
                    continue;
                }
                if(j < i){
                    continue;
                }
                for(int l =1; l <=f ;l++){
                    if(j >= l){
                        T[i][j] += T[i-1][j-l];
                    }
                }
            }
        }
        return T[n][k];
    }


}