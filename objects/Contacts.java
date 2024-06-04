package phoneBook.objects;

import java.util.ArrayList;
import java.util.List;

public class Contacts implements Comparable<Contacts>{
    private ArrayList<Long> contacts;

    public Contacts(Long number){
        contacts = new ArrayList<>();
        contacts.add(number);
    }

    public boolean addNumber(Long number){
        return this.contacts.add(number);
    }

    public boolean dellNumber(Long number){
        return this.contacts.remove(number);
    }

    public String toString(){
        return contacts.toString();
    }

    @Override
    public int compareTo(Contacts o) {
        return this.contacts.size() - o.contacts.size();
    }
}
