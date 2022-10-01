import java.util.Scanner;

public class Array {

    public static void main(String args[]){
//        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
//          //printing 2D array
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//           System.out.println();
//        }
//        int[]  arr1 = new int [] {1,2,3,4,5};
//        int[] arr2 = new int[]{6,7,8,9,10};
//
//          for(int i=0; i<arr2.length; i++){
//              arr1[i] = arr2[i];
//          }
//
//          System.out.println("Elements of the original ");
//
//        for(int i=0; i<arr1.length; i++){
//            System.out.print(arr1[i] + " ");
//        }
//
//       System.out.println("");
//
//        System.out.println("Elements of the new Array  ");
//
//        for(int i=0; i<arr2.length; i++){
//            System.out.print(arr2[i] + " ");
//        }
//
//        System.out.println("");

        //Java program to   rotate the array towards the left

//        int [] arr = new int [] {1, 2, 3, 4, 5};
//
//        //n determine the number of times an array should be rotated
//        int n = 3;
//
//        //Displays original array
//        System.out.println("Original array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        for(int i=0; i<n; i++){
//            int j,first;
//
//            first = arr[0];
//            for(j=0; j<arr.length-1; j++){
//                arr[j] = arr[j+1];
//            }
//            arr[j] = first;
//
//        }
//        System.out.println();
//        //Displays resulting array after rotation
//        System.out.println("Array after left rotation: ");
//        for(int i = 0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

//
//        int [] arr = new int [] {1, 2, 3, 4, 5};
//         int smallerInd = 0;
//         int largerInd = arr.length -1;
//
//         for(int i=arr.length-1; i>=0; i--){
//             System.out.print(arr[i]);
//         }


//        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
//        System.out.println("Duplicate elements in given array: ");
//         for(int i=0; i<arr.length; i++){
//
//             for(int j= i+1; j< arr.length; j++){
//                 if(arr[i]== arr[j]){
//                     System.out.println(arr[j]);
//                 }
//             }
//         }
//        //We are determining the max value in the array
//        int [] array = new int [] {25, 11, 7, 75, 56};
//            int max = array[0];
//
//            for(int i = 0; i < array.length; i++){
//                if(array[i] > max){
//                    max = array[i];
//                }
//            }
//            System.out.println("The maximum element is  " + max);


//        int [] arr = new int [] {25, 11, 7, 75, 56};
//        //Initialize min with first element of array.
//        int min = arr[0];
//        //Loop through the array
//        for (int i = 0; i < arr.length; i++) {
//            //Compare elements of array with min
//            if(arr[i] < min)
//                min = arr[i];
//        }
//        System.out.println("Smallest element present in given array: " + min);
//
//        int [] arrays = new int [] {1, 2, 3, 4, 5};
//        int sum = 0;
//        //Loop through the array to calculate sum of elements
//        for (int i = 0; i < arrays.length; i++) {
//            sum = sum + arrays[i];
//        }
//        System.out.println("Sum of all the elements of an array: " + sum);



//        //Initialize array
//        int [] arr = new int [] {5, 2, 8, 7, 1};
//        int temp = 0;

//        //Displaying elements of original array
//        System.out.println("Elements of original array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        //Sort the array in ascending order
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] > arr[j]) {
//                     temp = arr[i];
//                     arr[i] = arr[j];
//                      arr[j] = temp;
//                }
//
//            }
//        }
//
//        System.out.println();
//
//        //Displaying elements of array after sorting
//        System.out.println("Elements of array sorted in ascending order: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        //Initialize array
//        int [] array = new int [] {5, 2, 8, 7, 1};
//        int temps = 0;
//
//        //Displaying elements of original array
//        System.out.println("Elements of original array: ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//
//        //Sort the array in descending order
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if(array[i] < array[j]) {
//                    //temp = array[i];
//                    array[i] = array[j];
//                    //array[j] = temp;
//                }
//            }
//        }
//
//        System.out.println();
//
//        //Displaying elements of array after sorting
//        System.out.println("Elements of array sorted in descending order: ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }


        Scanner s = new Scanner(System.in);
        int[][]  array = new int[3][3];
        System.out.println("Please  enter the element ");

        for(int i = 0; i < 3; i++){
            for(int j=0; j<3; j++){
                array[i][j] = s.nextInt();
            }
        }
       System.out.println("Normal Arrays :  ");
        for(int i = 0; i < 3; i++){
            for(int j=0; j<3; j++){
                System.out.print(array[i][j] + " ") ;

            }

            System.out.println();
        }

        System.out.println("Triangular Arrays :  ");
        for(int i = 0; i < 3; i++){
            for(int j=0; j<3; j++){
                if(j>i){
                    System.out.print(0+ " \t") ;
                }else{

                    System.out.print(array[i][j] + " \t") ;

                }
            }

            System.out.println();
        }



        int rows, cols;

        //Initialize matrix a
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //Calculates number of rows and columns present in given matrix
        rows = a.length;
        cols = a[0].length;

        //Declare array t with reverse dimensions
        int t[][] = new int[cols][rows];

        //Calculates transpose of given matrix
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                //Converts the row of original matrix into column of transposed matrix
                t[i][j] = a[j][i];
            }
        }

        System.out.println("Transpose of given matrix: ");
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

    }


}
