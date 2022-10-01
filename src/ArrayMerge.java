import java.util.Arrays;
import java.util.LinkedList;

public class ArrayMerge {

    public static void main(String[] args) {

        int[][] array = new int[][]{{1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}};

        int[][] outputArray = array(array);

        System.out.print(Arrays.deepToString(outputArray));

    }


    public static int[][] array(int[][] array){
        if(array.length < 2){
             return  array;
        }
        Arrays.sort(array, (a,b) -> Integer.compare(a[0],b[0]));

        LinkedList<int[]>  mergedArray = new LinkedList<>();

        mergedArray.add(array[0]);

        for(int i=1; i<array.length; i++){

            if(mergedArray.getLast()[1] < array[i][0]){
                mergedArray.add(array[i]);
            }else{
                 mergedArray.getLast()[1] = Math.max(mergedArray.getLast()[1], array[i][1]);
            }
        }

         return  mergedArray.toArray(new int[mergedArray.size()][]);
        //System.out.println(Arrays.toString(mergedArray.getLast()[1]));




    }
}
