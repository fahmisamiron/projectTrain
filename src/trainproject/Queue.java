public class Queue {
     int head,tail,maxSize;
  String[]arr;
  public Queue(int a){
      this.maxSize=a;
      this.head=0;
      this.tail=0;
      this.arr=new String[maxSize];
  }
  public boolean isEmpty(){
      if(tail==0){
          return true;
      }
      else{
          return false;
      }
  }
  public boolean isFull(){
      if(tail>=maxSize){
          return true;
      }
      else{
          return false;
      }
  }
  public void enqueue(String str){
      if(isEmpty()){
          arr[head]=str;
          tail++;
      }
      else{
          if(isFull()){
              System.out.println("Train is full");
          }
          else{
              arr[tail]=str;
              tail++;
          }
      }
  }
  public String dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty....");
            return null;
        }
        else{
            String temp=arr[head];
            for(int i=0;i<tail-1;i++){
                arr[i]=arr[i+1];
                
            }
            tail--;
            return temp;
        }
        
    }
  public void display(){
      for(int i=0;i<tail;i++){
          System.out.println(arr[i]);
      }
  }
  
}