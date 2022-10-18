package lab5.cscd211linkedlist;

import java.util.*;

/**
 * The LinkedList class and Node class.  All parameters will be passed as final.
 *
 * @param <T> A type that implements Comparable and a compareTo method using the Generic
 * @NOTE T item is just a different word for data
 */
public class LinkedList<T extends Comparable <? super T>>
{
	
   private static class Node<T>
   {
      public T data;
      public Node next;
      
      public Node()
      {
    	  this.data = null;
    	  this.next = null;
      }
      
      public Node(final T data)
      {
         this(data, null);
      }
      
      public Node(final T data, final Node next)
      {
         this.data = data;
         this.next = next;
      }
   }// end class Node
   
   private Node head;
   private int size;
   
   /**
    * Constructs a list with no dummy head node containing the elements of the 
    * specified array, that are in the order the array.
    * 
    * @param array Representing the T array
    *
    * @throws IllegalArgumentException if the array is null
    */
   public LinkedList(final T [] array)
   {
	   this.head = null;
	   this.size = 0;
       if (array == null){
           throw new IllegalArgumentException("array cannot be null");
       }
       for(this.size = 0;this.size< array.length;this.size++)
           add(this.size ,array[this.size]);
            
   }// end EVC
   

   /**
    * Inserts the specified element at the beginning of this list.
    *
    * @param item The item to add
    *
    * @throws IllegalArgumentException if item is null
    */
   public void addFirst(final T item) {
        if (item == null){
            throw new IllegalArgumentException("item cannot be null");
        }
   }// end addFirst
   
 
   /**
    * Appends the specified element to the end of this list.
    *
    * @param item The element to be appended to this list
    *
    * @throws IllegalArgumentException if item is null
    */
   public void add(final T item) {
       if (item == null){
           throw new IllegalArgumentException("item cannot be null");
       }
   }// end add
   
   /**
    * Inserts all of the elements in the specified array into this list, 
    * starting at the specified position. Shifts the element currently at that position 
    * (if any) and any subsequent elements to the right (increases their indices). 
    * The new elements will appear in the list in the order that they were in the array
    *
    * @param index at which to insert the first element from the specified array
    * @param array containing elements to be added to this list
    *
    * @throws IllegalArgumentException if the array is null
    * @throws IndexOutOfBoundsException if index less than 0 or greater than size
    */
   public void addAll(final int index, final T [] array)
   {
        if (array == null){
            throw new IllegalArgumentException("array cannot be null");
        }
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("index cannot be greater than size or less than 0");
        }
   }// end addAll
   
   /**
    * Removes all of the elements from this list. 
    * The list will be empty after this call returns.    
    */
   public void clear()
   {

   }// end clear
   
   /**
    * Returns the element at the specified position in this list.
    *
    * @param index The index of the element to return
    * @return T The element at the specified position in this list
    *
    * @throws IndexOutOfBoundsException if index is less than 0 or greater than or equal to size
    */
   public T get(final int index)
   {
       if (index < 0 || index >= size){
           throw new IndexOutOfBoundsException("index cannot be greater than size or less than 0");
       }
      return null;
   }// end get
   
   /**
    * Returns the last element in this list.
    *
    * @return The last element in the list
    *
    * @throws NoSuchElementException if the list is empty
    */
   public T getLast()
   {
      return null;
   }// end getLast
   
   /**
    * Retrieves and removes the head (first element) of this list.
    *
    * @return The head element in the list
    *
    * @throws NoSuchElementException if the list is empty
    */
   public T remove()
   {
      return null;
   }// end remove
   

   
   /**
    * Returns true if all occurrences of data are removed from the list or false otherwise
    *
    * @param data The value for all occurrences to be removed from the list
    * @return boolean Representing if the list was modified or not
    *
    * @throws IllegalArgumentException if data is null
    */
   public boolean removeAllOccurrences(final T data)
   {
       if (data == null){
           throw new IllegalArgumentException("data cannot be null");
       }
      return false;
   }// end removeAllOccurrences
   
   
	/**
	 * Removes and returns the last element from this list.
	 *
	 * @return T the last element from the list
	 *
	 * @throws NoSuchElementException if this list is empty
	 */
	public T removeLast()
	{
      return null;
	}// end removeLast
	
	/**
	 * Removes the element at the specified position in this list. 
	 * Shifts any subsequent elements to the left (subtracts one from their indices). 
	 * Returns the element that was removed from the list.    
	 *
	 * @param index the index of the element to be removed
	 * @return T The element previously at the specified position
	 *
	 * @throws IndexOutOfBoundsException if index is less than 0 or greater than or equal to size
	 */
	public T remove(int index)
	{
        if (index < 0 || index >= this.size){

        }
      return null;
	}// end remove
 
   
   
   /**
    * Returns the number of elements in this list.
    *
    * @return int The size
    */
   public int size()
   {
      return 0;
   }// end size
   
   
   /**
    * Returns an array containing all of the elements in this list in proper 
    * sequence (from first to last element).
    *
    * <br> The returned array will be "safe" in that no references to it are maintained
    * by this list. (In other words, this method must allocate a new array). 
    * The caller is thus free to modify the returned array.
    *
    * @return Object [] an array containing all of the elements in this list in proper sequence 
    */
   public Object [] toArray()
   {
      return null;
   }  // end toArray
   
   
   /**
    * Returns the contents of the list in the format [item, item, item]
    * or Empty List if the list is empty
    *
    * @return String Representing the contents of the list
    */
   public String toString() {
       StringBuilder result = new StringBuilder("[");
       Node<E> curr = head;
       for(int i=0;i<size;i++){
           result.append(curr.element);
           curr=curr.next;
           if(curr != null)
               result.append(", ");
           else
               result.append("]");
       }
       return result.toString();
   }// end toString
   
}// end list