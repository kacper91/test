import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Phonebook {

    Set<Contact> contactSet = new HashSet<>();

    public void addContact(String name, String lastname, String phoneNumber){
        Contact contact = new Contact(name, lastname, phoneNumber);

        if(contactSet.contains(contact)){
            System.out.println("This contact is availble");
        }
        else {
            contactSet.add(contact);
            System.out.println("Contact " + contact + " add");

        }

    }

    public void showContacts(){

        contactSet.forEach(c -> System.out.println(c));
    }

    public void findNumber(String lastname){
        contactSet.stream()
                .filter(d -> lastname.equals(d.getLastname()))
                .collect(Collectors.toList())
                .forEach(e -> System.out.println(e));


    }


}
