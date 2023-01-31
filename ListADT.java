public abstract class ListADT<E> { // Creating a Generic Class
    public abstract boolean isEmpty();
    public abstract int getSize();
    public abstract void add(int index , E item);
    public abstract void remove (int index);
    public abstract void removeall();
    public abstract E get (int index);

}