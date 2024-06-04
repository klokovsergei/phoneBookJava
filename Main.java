package phoneBook;

import phoneBook.objects.*;


//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

public class Main {
    public static void main(String[] args) {

        Phonebook pb1 = new Phonebook();
        System.out.println(pb1.addContact("Sergey", "Klokov", 79052698889L));
        System.out.println(pb1.toString());

        System.out.println(pb1.addContact("Sergey", "Klokov", 79012345678L));
        System.out.println(pb1.toString());

        System.out.println(pb1.addContact("Sergey", "Petrov", 79052698889L));
        System.out.println(pb1.toString());

        System.out.println(pb1.addContact("Sergey", "Ivanov", 79012345678L));
        System.out.println(pb1.toString());
    }
}
