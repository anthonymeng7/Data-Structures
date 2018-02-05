package linkedlist;
public class Linkedlist<E> {
    private node<E> head = null;
    private node<E> tail = null;
    private int size = 0;
    public Linkedlist(){
    }
    public boolean isempty(){
        return size==0;
    }
    public E first(){
        if(size==0){
            return null;
        }
        return head.data();
    }
    public E last(){
        if(size==0){
            return null;
        }
        return tail.data();
    }
    public void addfirst(E x){
        head = new node(x,head);
        if(size==0){
            tail=head;
        }
        size++;
    }
    public void addlast(E x){
        node temp = new node(x,null);
        if(this.isempty()){
            head=temp;
        }
        else{
            tail.setnext(temp);
        }
        tail = temp;
        size++;
    }
    public E removefirst(){
        if(this.isempty()){
            return null;
        }
        E temp = head.data();
        head = head.next();
        size--;
        if(size==0){
            tail=null;
        }
        return temp;
    }
    public E peekfirst(){
        return head.data();
    }
    public int getsize(){
        return size;
    }
}