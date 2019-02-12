
package cancel.linked.list;

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
public void Cancel()
{
        Node current = head; 
        Node next_next; 
        if (head == null)     
            return; 
        while (current.next != null) { 
            if (current.data == current.next.data) { 
                next_next = current.next.next; 
                current.next = null; 
                current.next = next_next; 
            } 
               current = current.next; 
        } 
   }
}
 

public class CancelLinkedList  {
    public static void main(String[] args) {
    DoublyList list = new DoublyList();
 
    list.insertEnd(10);
    list.insertEnd(20); 
    list.insertEnd(30);
    list.insertEnd(30);
    list.insertEnd(50); 
    
    list.Traverse();
    list.Cancel();
    list.Traverse();
   
    }
    
}

