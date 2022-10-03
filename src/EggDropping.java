import java.util.*;

public class EggDropping {

    static int[][] ef;
    public static void main(String[] args) {

        int eggs= 2, floors= 36;
        System.out.println("Minimum number of trials in worst"
                + " case with "
                + eggs + "  eggs and "
                + floors + " floors is " + minimumMoves(eggs, floors));

    }

    public  static int minimumMoves(int eggs, int floors){

        ef = new int[eggs +1][floors + 1];

        for(int i=0; i<=eggs; i++){
            Arrays.fill(ef[i], -1);
        }
         return minEggDrops(eggs, floors);

        }

      public static int minEggDrops(int eggs, int floors){
          // We need one trial for one floor and 0 trials for 0 floors

          // We always need j trials for one egg and j floors.

           if(eggs ==1 || floors<=1){
                 return ef[eggs][floors] =floors;
           }

          if(ef[eggs][floors] != -1){
                return ef[eggs][floors];
          }

          int minimum = Integer.MAX_VALUE,result;

          for(int x=1; x<=floors; x++){
              result = Math.max(minEggDrops(eggs-1,x-1), minEggDrops(eggs,floors-x));
              minimum = Math.min(result, minimum);
          }
          return ef[eggs][floors] =  1 + minimum;
    }



}


