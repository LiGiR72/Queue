import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());
        Person guest;
        while(!queue.isEmpty()){
            guest = queue.poll();
            System.out.println(guest.getName() + " " + guest.getSurname() + " прокатился(ась) на атраккционе");
            guest.useTicket();
            if(guest.getTickets() != 0){
                queue.offer(guest);
            }
        }

    }
    public static List<Person> generateClients(){
        List<Person> list = new LinkedList<>();
        list.add(new Person("Bob","Pearson", 2));
        list.add(new Person("Boris","Jonson", 5));
        list.add(new Person("Mister","Negative", 4));
        list.add(new Person("Blair","Kowinski", 2));
        list.add(new Person("Green","Lizard", 1));
        return list;
    }
}