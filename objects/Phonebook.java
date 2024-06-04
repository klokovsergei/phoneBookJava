package phoneBook.objects;

import java.util.*;

public class Phonebook {
    private HashMap<Contacts, Human> pb;

    public Phonebook(){
        pb = new HashMap<>();
    }


    public boolean addContact(String firstName, String lastName, Long number){
        for (Contacts o: pb.keySet()) {
            if (pb.get(o).equals(firstName + " " + lastName)){
                o.addNumber(number);
                return true;
            }
        }
        pb.put(new Contacts(number), new Human(firstName, lastName));
        return false;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        List<Contacts> arr = new ArrayList<>(pb.keySet());
        Collections.sort(arr);
        Collections.reverse(arr);
        for (Contacts i : arr){
            sb.append(pb.get(i).toString());
            sb.append(": ");
            sb.append(i.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
