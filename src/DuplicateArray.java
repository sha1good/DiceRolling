import java.util.*;

public class DuplicateArray {

    public static void main(String[] args) {
        int[] array = new int[]{11, 11, 11, 13,13,20};

//         LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
//
//         for(int i = 0; i < array.length; i++) {
//             set.add(array[i]);
//         }
//
//      System.out.println(set);

   HashMap<Integer, Boolean> mp = new HashMap<Integer, Boolean>();

   for(int i = 0; i < array.length; i++) {

       if(mp.get(array[i]) == null){
           System.out.print(array[i]  + " ");
           mp.put(array[i], true);
       }
   }

    }

//    public static int[] modifiedAray(int[] input1){
//
//        int frequency = 1;
//
//        Map<Integer,Integer> arraySet = new HashMap<Integer, Integer>();
//         for(int i=0; i<input1.length; i++){
//             if(arraySet.containsKey(input1[i])){
//                  arraySet.put(i, arraySet.getOrDefault(input1[i],0) + 1);
//                 System.out.println("Printing : " + arraySet.get(i));
//             }else{
//                 arraySet.put(i,frequency);
//             }
//         }
//
//
//        int[]  array = new int[arraySet.size()];
//
//        for(int i=0; i<arraySet.size(); i++){
//            array[i] = arraySet.get(i);
//        }
//
//
//        return array;
//
//    }
}


