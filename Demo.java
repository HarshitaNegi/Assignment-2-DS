
package linked.list;

import java.util.Scanner;

class Node{    
 int data;
 Node next;
 
 Node (int data){
   this.data = data;
 }
}
class LinkedList{
   Node head;
   public void insertEnd(int data){
       Node node = new Node(data);
       if(head == null){
       head = node;
    }
       else{
       Node current;
       current = head;
       while(current.next != null){
          current = current.next;
       }
       current.next = node;
       }
   }
   public void insertBeg(int data){
    Node node = new Node(data);
    if(head == null){
       head = node;   
    }
    else{
    node.next = head;
    head = node;
    }
   }
   public void insertPos( int data, int pos){
   Node new_node = new Node(data);
   if(head == null){
    System.out.println("List is empty");
   }
   else{
   Node node = head;
    for(int i=1  ; i<pos-1 ; i++)
    {
    node = node.next;
    }
    Node curr = node.next;
    new_node.next = curr;
    node.next = new_node;  
   }
   }  
   public void traverse(){
   if(head == null){
    System.out.println("List is empty");
   }
   else{
    Node current;
    current = head;
    System.out.println(" List elements are: ");
    while(current != null){
     System.out.println(current.data);
     current = current.next;
    }
   }
   } 
   
   public void traverseReverse(Node node){
   if(node == null){
   return;
   }
   traverseReverse(node.next);
   System.out.println(node.data);
   }
   
   public void alternate(Node node){
   if(head == null){
   System.out.println("List is empty");
   }
   else{
   Node current;
   current = head;
   while(current != null){
   System.out.println(current.data);
   current = current.next;
   if(current != null){
   current = current.next;
   }
   }
   }
   }
   
   public void printMiddle(){
   Node fast = head;
   Node slow = head;
   while(fast !=null){
   fast = fast.next;
   if(fast !=null){
   fast = fast.next;
   slow =slow.next;
   }
   }
   System.out.println(slow.data); 
   }
   
    public void deleteBeg(){
    if(head == null){
    System.out.println("List is empty");
    }
    else{
    Node temp = head;
    head = temp.next;
    temp.next = null;
    }  
    }
   
   public void deleteEnd(){
    if(head == null){
    System.out.println("List is empty");
    }
    else{
       Node current;
       Node pre;
       pre = head;
       current = head;
       while(current.next != null){
       pre = current;
       current = current.next;
       }
       if(pre == current){
       head = null;
       }
       pre.next = null;
       }
   
   }
   
    public void deletePos(int pos){
        if(head == null){
         System.out.println("List is empty");    
        }
        else
        {
        Node node = head;
        for(int i=1 ; i<pos-1 ; i++){
        node = node.next;
        }
        Node curr = node.next.next;
        node.next = curr;
            }
        }
    }
public class Demo {
  public static void main(String[] args){
      LinkedList list = new LinkedList();
      Node node = null;
      Scanner sc = new Scanner(System.in);
      list.insertEnd(10);
      list.insertEnd(20);
      list.insertEnd(30);
      list.insertEnd(40);
      list.insertEnd(50);
      
      list.traverse();
      System.out.println("Middle element is: ");
      list.printMiddle();  
      list.traverse();
      System.out.println("Alternate elements are :  ");
      list.alternate(node);
      list.traverse();
      System.out.println("Deletion from begin:  ");
      list.deleteBeg();
      list.traverse();
      list.deleteEnd();
      System.out.println("Deletion from end: ");
      list.traverse();
      System.out.println("Enter the position to delete");
      int pos = sc.nextInt();
      System.out.println("After element del: ");
      list.deletePos(pos);
      list.traverse();
     // list.insertBeg(10);
     // list.insertBeg(20);
     // list.insertBeg(30);
     // list.insertBeg(40);
     // list.insertBeg(50);
       // list.traverse();
  }   
}
