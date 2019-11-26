public class Node<E> {
    Node<E>next;
    E name,ic;
    E phone;
    
     
    
    public Node(E name,E ic,E phone){
        this.name=name;
        this.ic=ic;
        this.phone=phone;
        this.next=null;
    }

}