import java.util.Scanner;

public class LinkedList<E> {
    Node<E> head;
    Node<E>tail;
    int size;
    int trainSize;
    String status;
    
    public LinkedList(int a){
    this.head=null;
    this.tail=null;
    this.size=0;
    this.trainSize=a;
    this.status=null;
}
    
    public void addFirst(E str,E IC,E phone){
        Node node=new Node(str,IC,phone);
        node.next=head;
        head=node;
        size++;
        if(tail==null){
            tail=head;
        }
    }
    
    public void addLast(E str,E IC,E phone){
        if(isTrainEmpty()==true){
        if(searchEmptySeat()==true){
            Node<E> current=head;
              for(int i=0;i<size;i++){
                  if(current.name==null){
                      current.name=str;
                      current.ic=IC;
                      current.phone=phone;
                  }
                  current=current.next;
              }
        }
        else{
        if(tail==null){
            head=tail=new Node(str,IC,phone);
        }else{
            tail.next=new Node(str,IC,phone);
            tail=tail.next;
        }
        size++;
        
        }
            status="success";
        }else{
            System.out.println("Train is full.");
            status.equals("fail");
        }
        
        if(status=="success"){
            System.out.println("Your booking is "+status);
            System.out.println("Your ticket number is "+size);
        }
        
    }
    
    public void print() {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            System.out.println(current.name+" "+current.ic+" "+current.phone);
            current=current.next;
        }
    }
    
    public void viewTicket(int seat) {
        
        Node<E> current = head;
        for (int i = 0; i <size; i++) {
            if(i+1==seat){
            System.out.println("Name: "+current.name+"\nIc number: "+current.ic+"\nPhone number: "+current.phone+"\nStatus: "+status );
            }
            current=current.next;
        }
    }
    
    public void changeInfo(int seat,E newName,E newIC,E newPhone){
        Node<E> current=head;
        for(int i=0;i<size;i++){
        if(i+1==seat){
            current.name=newName;
            current.ic=newIC;
            current.phone=newPhone;
        }
        current=current.next;
        }
        
    }
    
    public void deleteTicket(int seat){
            Node<E> current = head;
            for(int i=0;i<size;i++){
        if(i+1==seat){
            current.name=null;
            current.ic=null;
            current.phone=null;
        }
        current=current.next;
        }
    }
    
    public boolean searchEmptySeat(){
        Node<E>current=head;
        for(int i=0;i<size;i++){
            if(current.name==null){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    
    public boolean isTrainEmpty(){
        if(size<trainSize){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isTrainFull(){
        if(size>=trainSize){
            return true;
        }else{
            return false;
        }
    }
    
    public int getSeatEmpty(){
        int seatEmpty=trainSize-size;
        return seatEmpty;
    }
    
    
}