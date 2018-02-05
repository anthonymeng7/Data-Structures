package linkedlist;
public class node<E> {
    private E data;
    private node<E> next;
    public node(E data1, node<E> next1){
        data=data1;
        next=next1;
    }
    public E data(){
        return data;
    }
    public node next(){
        return next;
    }
    public void setnext(node<E> n){
        next=n;
    }
}
