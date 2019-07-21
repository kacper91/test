public class Main {
    public static void main(String[] args){
        Phonebook phonebook = new Phonebook();
        phonebook.addContact("Kacper", "Orlowski", "531023456");
        phonebook.addContact("Marcin", "Affek", "5123413432");
        phonebook.addContact("Tomasz", "askdsakd", "3243244234");
        phonebook.addContact("Tomasz", "Orlowski", "631023456");

       // phonebook.showContacts();
        phonebook.findNumber("Orlowski");

    }



}
