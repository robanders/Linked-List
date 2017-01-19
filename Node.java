/**
 * COMP 410
 * Don't modify this file!
*/

package LinkedListA0;

public class Node { //this is your Node object, these are the Objects in your list
  public double data;
  public Node next;
  public Node prev;
  
  public Node(double data){
    this.data=data;
    this.next=null;
    this.prev=null;
  }
  public String toString(){
    return "data: "+data+"\thasNext: "+(next!=null)+"\t\thasPrev: "+(prev!=null);
  }
  
  public boolean isNode(){
    return true;
  }
  public double getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }
  public Node getPrev(){
    return prev;
  }
}