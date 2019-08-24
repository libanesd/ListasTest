package com.unitins;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");

        //display elements(alist);
        System.out.println(alist);

        //Adding "steve" at the fourth position
        alist.add(3,"Steve");

        //Displaying elements
        System.out.println(alist);

        //Removing "Steve" & "Angela"

        alist.remove("Angela");
        alist.remove("Steve");
        alist.remove("Steve");

        //displaying elements again
        System.out.println(alist);

        //removing 3rd element
        alist.remove(2);

        //displaying elements again
        System.out.println(alist);

        //Print ArrayList Size
        System.out.println("Size after operations: "+alist.size());


    }
}

/*
 *1) boolean add(Object item): It adds the item at the end of the list.
  llistobj.add("Hello");

 *2) void add(int index, Object item): It adds an item at the given index of the the list.
  llistobj.add(2, "bye");

 *3) boolean addAll(Collection c): It adds all the elements of the specified collection c to the list.
   It throws NullPointerException if the specified collection is null. Consider the below example –
    LinkedList<String> llistobj = new LinkedList<String>();
    ArrayList<String> arraylist= new ArrayList<String>();
    arraylist.add("String1");
    arraylist.add("String2");
    llistobj.addAll(arraylist);

 *4) boolean addAll(int index, Collection c): It adds all the elements of collection c to the list
   starting from a give index in the list. It throws NullPointerException if the collection c is
   null and IndexOutOfBoundsException when the specified index is out of the range.
  llistobj.add(5, arraylist);

 *5) void addFirst(Object item): It adds the item (or element) at the first position in the list.
  llistobj.addFirst("text");

 *6) void addLast(Object item): It inserts the specified item at the end of the list.
  llistobj.addLast("Chaitanya");

 *7) void clear(): It removes all the elements of a list.
 llistobj.clear();

   * CHECK THE REST OF THE 26 METHODS @ https://beginnersbook.com/2013/12/linkedlist-in-java-with-example/

 */


