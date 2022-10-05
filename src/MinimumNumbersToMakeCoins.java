import java.util.Arrays;

public class MinimumNumbersToMakeCoins {


    public static void main(String[] args) {

        MinimumNumbersToMakeCoins nm = new MinimumNumbersToMakeCoins();
        int total = 10;
        int coins[] = {1, 5, 6, 9};
        System.out.println(nm.makeACoins(total, coins));
    }

    private int makeACoins(int total, int[] coins) {
        if (coins.length == 0) return 0;

        int[] temp = new int[total + 1];

        Arrays.fill(temp,  total+1);
        temp[0] = 0;
    System.out.print(Arrays.toString(temp));
        for (int i = 0; i<= total; i++) {
            for (int j = 0; j <coins.length; j++) {
                if (coins[j] <= i) {
                    temp[i] = Math.min(temp[i], 1 + (i- coins[j]));
                }
            }
        }
        return temp[total] > total ? -1 : temp[total];

    }
}