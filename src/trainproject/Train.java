public class Train {
    int maxSize;
    String arr[],info[];
    int seats[];
    int head,tail;
    
    
    public Train(){
        this.maxSize=0;
        this.arr=new String[maxSize];
        this.seats=new int[maxSize];
        this.head=0;
        this.tail=0;
    }
    
    public String search(String str){
        for(int i=0;i<tail;i++){
            if(str.equals(arr[i])){
                return arr[i];
            }else{
                return null;
            }
        }return null;
    }
    
    public void book(String name,String IC, String phone){
        searchSeat();
        for(int i=0;i<tail;i++){
            info[i]=name+IC+phone;   
        
        if(isEmpty()){
            arr[head]=info[i];
            tail++;
        }else{
            if(isFull()){
                System.out.println("Train is full.");
            }else{
                arr[tail]=info[i];
                tail++;
            }
        }
        }
    }
    
    public void searchSeat(){
        for(int i=0;i<maxSize;i++){
            if(seats[i]==0){
                seats[i]=1;
            }
            if(seats[i]==1){
                System.out.println("The seat is occupied.");
                break;
            }
        }
    }
    
    public void displayTicket(int a){
        System.out.println("Ticket Info: "+ info[a].toString());
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
}