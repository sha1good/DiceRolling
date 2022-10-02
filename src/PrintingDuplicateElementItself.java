import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PrintingDuplicateElementItself {

    public static void main(String[] args) {
        int[] a = new int[]{11, 11, 11, 13, 13, 20};

        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i=0; i<a.length; i++) {
          if(m.containsKey(a[i])){
              m.put(a[i], m.get(a[i]) + 1);
          }else{
              m.put(a[i],1);
          }

        }

        for(Map.Entry<Integer,Integer> map : m.entrySet()){
            if(map.getValue() > 2)
                System.out.println(map.getKey());
        }

//       for(int i=0; i<a.length; i++){
//           if(m.get(a[i]) != -1){
//               System.out.println(a[i] + " :" + m.get(a[i]));
//               m.put(a[i],-1);
//           }
//       }
    }
}
