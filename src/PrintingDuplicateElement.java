import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintingDuplicateElement {
    public static void main(String[] args) {
        int[] arraySet = new int[]{11, 11, 11, 13, 13, 20};

        HashMap<Integer, Integer> newMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < arraySet.length; i++) {
            if (newMap.containsKey(arraySet[i])) {
                newMap.put(arraySet[i], (newMap.get(arraySet[i]) +1));
            } else {
                newMap.put(arraySet[i],1);
            }
        }

     for(Map.Entry<Integer, Integer>  m: newMap.entrySet()){
         if(m.getValue() > 2){
             System.out.println(m.getKey());
         }
     }

    }

}

