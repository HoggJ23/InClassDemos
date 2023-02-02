public class Node<E> {

    private E item;
    private Node<E> nextNode;

    public Node(E nodeItem){// Node Constructor
        this.item = nodeItem;
        this.nextNode = null;
    }
    
    public E getItem(){// grabbing the item from the list 
        return this.item;
    }


    public Node<E> getNext(){// getting the next Node
        return this.nextNode;
    }

    public void setNext(Node<E> next){ // changes the value instead of the reference
        this.nextNode = next;
    }

    @Override
    public String toString(){

        if(this.nextNode == null)
            return ("" + item.toString());

        else
             return ("" + item.toString() + "," + this.nextNode.toString());// telling the next node to print itself    
    }
}
