import java.util.*;

public class ArraySequence {


    public static void main(String args[]){
        int[]  array = new int[]{5,1,22,25,6,-1,8,10};
        int[]  seqeunce = new int[]{1,6,-1,10};
        isValidSubsequence(array, seqeunce);
    }

    public static boolean  isValidSubsequence(int[] array, int[] seqeunce){
     int  arrayInd = 0;
     int seqInd =0;
      while( arrayInd < array.length && seqInd < seqeunce.length ){
          if(array[arrayInd] == seqeunce[seqInd]){
              seqInd+=1;
              arrayInd+=1;
          }
          System.out.println(seqInd);
          return seqInd == seqeunce.length;
      }
      return false;
    }

//    List<Integer> num = new  ArrayList<Integer>(array.size());
//    for(int i=0; i<array.size(); i++){
//        if((sequence.contains(array.get(i))) && (num.size() < sequence.size())){
//            num.add(array.get(i));
//        }
//    }
//
//   return num.equals(sequence);

//    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
//
//        int arrayInd = 0;
//        int seqInd = 0;
//
//        if(array.size() < sequence.size()){
//            return false;
//        }
//
//        while(arrayInd <array.size() && seqInd < sequence.size()){
//            if(array.get(arrayInd) == sequence.get(seqInd)){
//                seqInd ++;
//                arrayInd ++;
//            }else{
//                arrayInd++;
//            }
//        }
//        return seqInd == sequence.size();
//    }

}

//    Sorting Array and returning the  square of the arrays
//    public int[] sortedSquaredArray(int[] array) {
//
//        for(int i=0; i<array.length; i++){
//            array[i] =(int)Math.pow(array[i], 2.0);
//        }
//        Arrays.sort(array);
//        return array;
//    }


//    public int[] sortedSquaredArray(int[] array) {
//
//        int[] newArray = new int[array.length];
//        int smallerIdx = 0;
//        int largerIdx =  array.length -1;
//
//        for(int i= array.length-1;  i >=0; i--){
//            int smallerValue = array[smallerIdx];
//            int largerValue = array[largerIdx];
//
//            if(Math.abs(smallerValue) > Math.abs(largerValue)){
//                newArray[i] = (int) Math.pow(smallerValue, 2.0);
//                smallerIdx++;
//            }else{
//                newArray[i] = (int) Math.pow(largerValue,2.0);
//                largerIdx--;
//            }
//        }
//        return newArray;








