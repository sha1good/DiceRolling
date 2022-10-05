import java.util.Arrays;

public class AnotherToMakeMinimumcoins {

    public static void main(String[] args) {

        AnotherToMakeMinimumcoins nm = new AnotherToMakeMinimumcoins();
        int  total = 10;
        int  coins[] = {1,5,6,9};
        System.out.println(nm.makeACoins(total, coins));

    }

    private int makeACoins(int total, int[] coins) {

        if(coins.length ==0) return 0;

        int[] temp = new int[total +1];
        Arrays.fill(temp,  Integer.MAX_VALUE);
        temp[0] = 0;

        for(int i=0; i<=total; i++){
            for(int j=0; j< coins.length; j++){
                if(coins[j] <= i){
                    int rem = i-coins[j];
                     temp[i] =  Math.min(temp[i],rem+1);
                }
            }
        }
         return temp[total] == Integer.MAX_VALUE ?  -1 : temp[total];

//        int[] temp = new int[total+1];
//        Arrays.sort(coins);
//        Arrays.fill(temp, Integer.MAX_VALUE);
//        temp[0] =0;
//
//
//        for(int denom : coins){
//            for(int j =0; j<=total; j++){
//                if(denom <=j){
//                    int rem = j - denom;
//                    if(temp[rem] == Integer.MAX_VALUE) continue;
//                    temp[j] =  temp[rem] < temp[j] ? temp[rem] +1 : temp[j];
//                }
//            }
//
//        }
//
//        return  temp[total] == Integer.MAX_VALUE ? -1 : temp[total];

    }

}
