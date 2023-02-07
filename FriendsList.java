public class FriendsList extends ListADT<Friend> {
    private Node<Friend> head;
    private int numFriends;


    public FriendsList() {
        this.numFriends = 0;
        this.head = null; // we have no friends
    }
    
    public FriendsList (Friend firstFriend){
        this.numFriends = 1;
        this.head = new Node<Friend>(firstFriend);
    } // add the first friend


    @Override
    public boolean isEmpty(){
        return (this.numFriends == 0);// checking if the the list is empty
    }

    @Override
    public int getSize(){
        return this.numFriends; // getting the number of friends
   
    }

    private Node<Friend> getNodeAt(int index){ // retrives the node
        // 0 - return this.head
        // 1 - return this.numFriends
        // this.head.getNext();
        //2 -return
           Node<Friend> node = this.head;
           for(int k = 1; k <= index; k++)// uses the .getNext() method 
                node = node.getNext();
            
        return node;

    }


    @Override
    public Friend get(int index) throws ListException{

    if(index < 0 || index >= this.getSize())
        throw new ListException ("Index" + index + "is invalid for a list of this size" + this.getSize()); //if the index is -1 or greater than the size of list
        
        
        Node<Friend> node = this.getNodeAt(index);
        return node.getItem();
    }

    @Override
    public void add(int index, Friend item) throws ListException {
        if(index < 0 || index > this.getSize())
        throw new ListException ("Index" + index + "is invalid for a list of this size" + this.getSize()); //if the index is -1 or greater than the size of list
        

        if(index == 0) {
            node.setNext(this.head);// sets the new node as the head
            this.head = node; // turns the node into the new head 
        
        }
        else {

          Node<Friend> previous = this.getNodeAt(index - 1);// take the previoud node
        Node<Friend> current = this.previous.getNext();//makes the pointer of 
        Node<Friend> node = new Node <Friend>(newFriend); // creates a new node

            previous.setNext(node);// sets the previous and poits it to the next node 
            node.setNext(current);// take the new node and points it at the current node

        }

        this.numFriends++;

    }



    @Override
    public void remove (int index) throws ListException {

        if(index == 0 ){// if the index is 0, which is removing the head
            this.head = this.head.getNext();// changing the head of the list from the initial head to the next reference becoming the new head 
        }

        else{

        Node<Friend> previous = this.getNodeAt(index - 1);// gets the previous node 
        Node<Friend> nodetoRemove = previous.getNext();// gets the previous node to remove
        Node<Friend> nodeAfter = nodetoRemove.getNext();// gets the node that was removed and grabbed  the next node

        previous.setNext(nodeAfter); // changed the pointers 
        nodetoRemove.setNext(null);// points the removed node to null;
        }
        this.numFriends--;// shrinking the list 
    }

    @Override
    public void removeAll (int index){
        this.numFriends = 0;
        this.head = null;
    }

    
}



