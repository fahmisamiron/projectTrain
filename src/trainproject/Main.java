import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue q1 = new Queue(20);
        Queue q2 = new Queue(20);
        Queue q3 = new Queue(20);
        Queue q4 = new Queue(20);
        Queue q5 = new Queue(20);
        Queue q6 = new Quuee(20);
        Queue q7 = new Queue(20);
        LinkedList l1 = new LinkedList(20);
        LinkedList l2 = new LinkedList(20);
        LinkedList l4 = new LinkedList(20);
        LinkedList l5 = new LinkedList(20);
        LinkedList l6 = new LinkedList(20);
        LinkedList l7 = new LinkedList(20);
        LinkedList l3 = new LinkedList(20);
        String day,Date,proceed,name,IC,phone,action="";
        int ticket;
        String newName,newIC,newPhone;
        
        
        System.out.println("WELCOME TO OUR TRAIN ");
        System.out.println("Please enter the day.");
        day=input.nextLine();
        if(day.equalsIgnoreCase("Monday")){
            System.out.println("The number of seat empty is "+l1.getSeatEmpty());
            System.out.println("Press 'X' if you want to proceed the booking. And 'Y' if you want to cancel");
            proceed=input.nextLine();
            if(proceed.equalsIgnoreCase("X")){
                System.out.println("Enter your name:");
                name=input.nextLine();
                System.out.println("Enter your IC number:");
                IC=input.nextLine();
                System.out.println("Enter your phone number");
                phone=input.nextLine();
                q1.enqueue(name);
                System.out.println("You will be put in waiting list until process succesful");
                l1.addLast(q1.dequeue(),IC,phone);
                System.out.println("Enter 'view' to view your information.\nEnter 'edit' to edit ypur information.\nEnter 'delete' to cancel/delete your booking.\nEnter 'break' to exit. ");
                for(int i=0;i<100;i++){
                    action="Action: "+input.nextLine();
                    
                    if(action.equalsIgnoreCase("view")){
                        System.out.println("Enter your ticket number:");
                        ticket=input.nextInt();
                        l1.viewTicket(ticket);
                    }
                    else if(action.equalsIgnoreCase("edit")){
                        System.out.println("Enter your ticket number:");
                        ticket=input.nextInt();
                        System.out.println("Enter your name:");
                        newName=input.nextLine();
                        System.out.println("Enter your IC number:");
                        newIC=input.nextLine();
                        System.out.println("Enter your phone number");
                        newPhone=input.nextLine();
                        l1.changeInfo(ticket, newName, newIC, newPhone);
                    }
                    else if(action.equalsIgnoreCase("delete")){
                        System.out.println("Enter your ticket number");
                        ticket=input.nextInt();
                        l1.deleteTicket(ticket);
                    }
                    else if(action.equalsIgnoreCase("break")){
                        break;
                    }
                }
            }else if(proceed.equalsIgnoreCase("Y")){
                
            }
            else{
                
            }
        }
        
        
        
        
        
        
     /*   q1.enqueue("najimi");
        q1.enqueue("yap");
        q1.enqueue("sel");
        q1.display();
        l1.addFirst(q1.dequeue(),"99","015");
        l1.print();
        l1.addLast(q1.dequeue(),"99", "012");
        l1.print();
        l1.addLast(q1.dequeue(), "99", "013");
        System.out.println("....");
        l1.changeInfo(1, "khairil", "1999", "011");
        l1.print();
        System.out.println(l1.searchEmptySeat());
        System.out.println("Delete ticket 2");
        l1.deleteTicket(2);
        l1.print();
        System.out.println("...");
        l1.addLast("ayep", "1998", "1234");
        l1.print();*/
     
     

    }

}