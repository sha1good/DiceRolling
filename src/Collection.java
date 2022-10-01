import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class Collection {

    public static void main(String args[]) {

//        // Get the ArrayList
//        ArrayList<String>
//                list = new ArrayList<String>();
//
//        // Populate the ArrayList
//        list.add("Geeks");
//        list.add("For");
//        list.add("ForGeeks");
//        list.add("GeeksForGeeks");
//        list.add("A computer portal");
//
//        // Print the unsorted ArrayList
//        System.out.println("Unsorted ArrayList: "
//                + list);
//
//        // Sorting ArrayList in descending Order
//        // using Collection.sort() method
//        // by passing Collections.reverseOrder() as comparator
//         Collections.sort(list, Collections.reverseOrder());
//
//        // Print the sorted ArrayList
//        System.out.println("Sorted ArrayList "
//                + "in Descending order : "
//                + list);
//
//        System.out.println("This the first element of the cell " + list.get(0));
//    }


        int[] arr = new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};

       // findThreeLargestNumbers(arr);

        String s1 = "geeksforgeeks to Welcome";
        System.out.println(reverseWords(s1));

        String s2 = "I love Java Programming";
        System.out.println(reverseWords(s2));
    }




    static String reverseWords(String str) {

        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");

        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        // is whitespace and store in temp array.
        String[] temp = pattern.split(str);
        String result = "";

        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                //result = temp[i] + result;
            System.out.println("Print  the result "  + temp[i] + result);
//            else
//                result = " " + temp[i] + result;
//        }
           // return null;
        }

//    public static int[] findThreeLargestNumbers(int[] array) {
//        if (array.length < 3) return null;
//        int[] threeLargestNumbers = new int[3];
//        for (int num: array) {
//            updateLargestNumber(threeLargestNumbers, num);
//
//        }
//        return threeLargestNumbers;
//    }
//
//    public static void  updateLargestNumber(int[] threeLargestNumbers, int num){
//       if(threeLargestNumbers[2]== 0 ||  num > threeLargestNumbers[2]){
//            shiftPosition(threeLargestNumbers, num, threeLargestNumbers.length -1);
//       }else if( threeLargestNumbers[1]== 0 ||  num >threeLargestNumbers[1]){
//           shiftPosition(threeLargestNumbers, num, threeLargestNumbers.length -2);
//       }else if( threeLargestNumbers[0]== 0 ||  num > threeLargestNumbers[0]){
//           shiftPosition(threeLargestNumbers, num, threeLargestNumbers.length -3);
//       }
//    }
//
//    public  static void shiftPosition(int[] threeLargestNumbers, int num, int index) {
//        for(int i : (index+1))
//
//         }
//    }


//    public static int[] findThreeLargestNumbers(int[] array) {
//
//        List<Integer> list = new ArrayList<Integer>();
//        int first, second, third;
//        first = second = third = Integer.MIN_VALUE;
//
//        for (int start = 0; start < array.length; start++) {
//            if (array[start] > first) {
//                third = second;
//                second = first;
//                first = array[start];
//            } else if (array[start] > second) {
//                third = second;
//                second = array[start];
//            } else if (array[start] > third) {
//                third = array[start];
//            }
//
//        }
//
//        //System.out.println(new int[first,second,third]);
//        list.add(first);
//        list.add(second);
//        list.add(third);
//
//        int[] sortedArray = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            sortedArray[i] = list.get(i);
//        }
//
//        System.out.print("Three largest element are  " + first + " " + second + " " + third);
//        System.out.print("Three largest element for list  " + Arrays.toString(sortedArray));
//        return sortedArray;


        // }
        return null;
    }
    }