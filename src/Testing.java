import java.util.*;
import java.util.stream.Collectors;

public  class Testing{
        public static void main(String args[]){
            //Creating a list of fruits
//            List<String> list1=new ArrayList<String>();
//            list1.add("Mango");
//            list1.add("Apple");
//            list1.add("Banana");
//            list1.add("Grapes");
//            //Sorting the list
//            Collections.sort(list1);
//            //Traversing list through the for-each loop
//            for(String fruit:list1)
//                System.out.println(fruit);
//
//            System.out.println("Sorting numbers...");
//            //Creating a list of numbers
//            List<Integer> list2=new ArrayList<Integer>();
//            list2.add(21);
//            list2.add(11);
//            list2.add(51);
//            list2.add(1);
//            //Sorting the list
//            Collections.sort(list2);
//            //Traversing list through the for-each loop
//            for(Integer number:list2)
//                System.out.println(number);

            List<String> list = new ArrayList<String>();
            //initialize list to strings
            list.add("Java");
            list.add("Xml");
            list.add("Python");
            list.add("Ruby");
            list.add("JavaScript");

            //Contain list  DEmo
           List<String> myList  = new ArrayList<String>();
            myList.add("Ruby");
            myList.add("Python");

            if(list.containsAll(myList)){
                System.out.println("List contains strings 'Ruby' and 'Python'");
            }


            // original list
            List<Integer> intlist = new ArrayList<>(
                    Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5,6,5,3,4));
            // Print the list
            System.out.println("Original ArrayList: "
                    + intlist);

            // using distinct() method of Java 8 stream remove duplicates from original List
            //and generate a new list without duplicates
            List<Integer>  distinct_list = intlist.stream().distinct().collect(Collectors.toList());

             System.out.println("ArrayList after removing duplicates: "  +  distinct_list);


    }

    }

