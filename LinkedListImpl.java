/**
 * COMP 410
 *See inline comment descriptions for methods not described in interface.
 *
*/
package LinkedListA0;

public class LinkedListImpl implements LIST_Interface {
  Node root;//this will be the entry point to your linked list (the head)
  private int size;
  
  public LinkedListImpl(){
    root = new Node(0); //Note that the root's data is not a true part of your data set!
    size = 0;
  }
  
  
  
  /*public Node getRoot(){
    return root;
  }*/

  public boolean insert(Node n, int index) {
	  Node currentNode = root;
	  
	  
	  if(index < 0 || index > size){
		  return false;
	  }
	  for(int i = 0; i < index; i++){
		  if(currentNode.next == null){
			  return false;
		  }
		  currentNode = currentNode.next;
	  }
	  if(currentNode.next != null){
		  n.next = currentNode.next;
	  } else {
		  n.next = null;
	  }
	  currentNode.next = n;
	  size = size + 1;
	  return true;
  }

  public boolean remove(int index) {
	  Node currentNode = root; //currentNode is the node before the removed one
	  Node tempNode = new Node(0); //tempNode is the removed node
	  
	  if(index > size - 1|| index < 0){
		  return false;
	  }
	  for(int i = 0; i < index; i++){
		  currentNode = currentNode.next;  
	  }
	  tempNode = currentNode.next;
	  currentNode.next = tempNode.next;
	  size = size - 1;
	  return true;
  }

  public Node get(int index) {
	  Node currentNode = root;
	 
	  if((index > size - 1) || index < 0){
		  return null;
	  }
	  for(int i = 0; i < index; i++){
		  currentNode = currentNode.next;  
	  }
	  return currentNode.next;
  }

  public int size() {
	  return size;
  }

  public boolean isEmpty() {
	  if (root.next == null){
		  return true;
	  } else {
		  return false;
	  }
  }

  public void clear() {
	  size = 0;
	  root.next = null;
  }
}