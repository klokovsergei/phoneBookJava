package phoneBook.objects;

public class Human {
    private String firstName;
    private String lastName;
    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName(){
        StringBuilder sb = new StringBuilder(firstName);
        sb.append(" ");
        return sb.append(lastName).toString();
    }
    public String toString(){
        return getName();
    }

    public void rename(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Human a){
        if (this.getName().equals(a.getName()))
            return true;
        return false;
    }
    public boolean equals(String a){
        if (this.getName().equals(a))
            return true;
        return false;
    }

}
