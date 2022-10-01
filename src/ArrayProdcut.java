import java.util.Arrays;

public class ArrayProdcut {

    public static void main(String[] args) {

        int[] array = new int[]{5, 1, 4, 2};
       int[]  modifiedArray = arrayOfProducts(array);
       System.out.println(Arrays.toString(modifiedArray));

    }


        public static int[] arrayOfProducts(int[] array) {

            int[] newArray = new int[array.length];

            int[] leftArray = new int[array.length];
            int[] rightArray = new int[array.length];

            Arrays.fill(leftArray, 1);
            Arrays.fill(rightArray, 1);

            for (int i = 1; i < array.length; i++) {
                leftArray[i] = leftArray[i - 1] * array[i - 1];
            }

            for (int i = array.length - 2; i >= 0; i--) {
                //rightArray[i] =  ((rightArray.length -1) * (array.length -1));
                rightArray[i] = rightArray[i + 1] * array[i + 1];
            }

            for (int i = 0; i < array.length; i++) {
                newArray[i] = leftArray[i] * rightArray[i];
            }
            return newArray;
        }

//            int[] products = new int[array.length];
//
//             for(int i=0; i <array.length; i++){
//
//                 int product = 1;
//               for(int j =0; j<array.length; j++){
//                   if(i != j){
//                       product = product * array[j];
//                   }
//               }
//
//             products[i] = product;
//             }
//
//            return products;
//     }



}
