
package doubly.linked.list;

class Node{
  Node pre;
  int data;
  Node next;
  Node(int data){
  this.data = data;
  this.pre = null;
  this.next = null;
  }
}
class DoublyList{
 Node head;
 Node tail;
 
 public void Traverse(){
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
 
 public void TraverseReverse(){
  if(tail == null){
  System.out.println("List is empty");
  }
  else{
  Node current;
  current = tail;
   System.out.println(" List elements after rev: ");
  while(current != null){
  System.out.println(current.data);
  current = current.pre;
  }
  } 
}
 
 public void insertBeg(int data){
 Node node = new Node(data);
 if(head == null){
 head = node;
 tail = node;
 }
 else{
 head.pre = node;
 node.next = head;
 head = node;
 }
 }
 public void insertEnd(int data){
 Node node = new Node(data);
   if(head == null){
   head  = node;
   tail = node;
 }
   else{
   tail.next = node;
   node.pre = tail;
   tail = node;
   }
 }
 
 public void deleteBeg(){

 if(head == null){
 System.out.println("List is empty");
 }
 else{
 Node node = head;
 if(head == tail){
 tail = null;
 }
 else{
 head.next.pre = null;
 }
 head = head.next;
 node.next = null;
 
 }
 }
  
 public void deleteEnd(){
 if(head == null){
 System.out.println("List is empty");
 }
 else{
 Node node = tail;
 if(head == tail){
 head = null;
 }
 else{
 tail.pre.next = null;
 }
 tail = tail.pre;
 node.pre = null;
 }
 }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
    DoublyList list = new DoublyList();
    //list.insertBeg(10);    
    //list.insertBeg(20);
    //list.insertBeg(30);  
    //list.insertBeg(40);  
    //list.insertBeg(50);  
    list.insertEnd(10);
    list.insertEnd(20); 
    list.insertEnd(30);
    list.insertEnd(40);
    list.insertEnd(50); 
    
    list.Traverse();
    list.TraverseReverse();
    list.Traverse();
    list.deleteBeg();
    System.out.println("delete from beg: ");
    list.Traverse();
    list.deleteEnd();
    System.out.println("delete from end: ");
    list.Traverse();
   
    }
    
}
