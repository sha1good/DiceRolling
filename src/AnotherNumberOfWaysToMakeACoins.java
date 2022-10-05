public class AnotherNumberOfWaysToMakeACoins {

    public static void main(String[] args) {

        AnotherNumberOfWaysToMakeACoins nm = new AnotherNumberOfWaysToMakeACoins();
        int  total = 5;
        int  coins[] = {1,2,3};
        System.out.println(nm.makeACoins(total, coins));

    }

    private int  makeACoins(int total, int[] coins) {

        int[] temp = new int[total+1];

         temp[0] =1;
        if(coins.length ==0) return 0;

        for(int coin : coins){
            for(int i=1; i<=total; i++){
                if(i >=coin){
                    temp[i]+= temp[i-coin];
                }
            }
        }
        return temp[temp.length -1];
    }
}
