import java.util.Arrays;

public class NumberOfWaysToMakeACoins {

    public static void main(String[] args) {

        NumberOfWaysToMakeACoins nm = new NumberOfWaysToMakeACoins();
        int  total = 5;
        int  coins[] = {1,2,3};
         System.out.println(nm.makeACoins(total, coins));

    }

    public static int makeACoins(int total, int coins[]){

        int[][] temp = new int[coins.length +1][total +1];
        for(int i = 0; i < coins.length; i++){
            temp[i][0] = 1;
        }
        printAmountCoins(temp);

        for(int i=1;  i<=coins.length; i++){
            for(int j=1; j<=total; j++){
                if(coins[i-1] > j){
                    temp[i][j] = temp[i-1][j];

                }else{
                temp[i][j] = temp[i-1][j] +  temp[i][j-coins[i]];
                }
                printAmountCoins(temp);
            }
        }

        return temp[coins.length][total];
    }

    public  static void printAmountCoins(int[][] arr){
         for(int i=0; i< arr.length; i++){
             System.out.println(Arrays.toString(arr[i]));
         }
         System.out.println();
    }


}
