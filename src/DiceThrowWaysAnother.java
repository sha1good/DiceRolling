import java.util.Arrays;

public class DiceThrowWaysAnother {

//i is the  dice and j is the  target sum
    public static int findWays(int d, int f, int s){
        int[][] diceRolling = new int[d +1][s+1];
         diceRolling[0][0] = 1;
        int MOD = 1000000007;

         for(int i=1; i<=d; i++){
           for(int j=i; j<=s; j++){
                if(j == i){
                    diceRolling[i][j] = 1;
                    continue;
                }
                if(j < i){
                     continue;
                }
               // k mustn't be larger than face f and target j
                for(int k=1; k<=f && k<=j;  k++){
                      diceRolling[i][j] = (diceRolling[i][j] + diceRolling[i-1][j-k]) % MOD;
                }

           }
         }
          return diceRolling[d][s];
    }
    public static void main(String[] args) {
        System.out.println(findWays(3, 3, 6));

    }

}


