import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int oldContactIndex = findContact(oldContact);
        if (oldContactIndex < 0) {
            return false;
        }
        int newContactName = findContact(newContact.getName());
        if (newContactName > 0) {
            return false;
        }
        myContacts.set(oldContactIndex, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int contactIndex = findContact(contact);
        if (contactIndex < 0) {
            return false;
        }
        myContacts.remove(contact);
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        if (findContact(name) > 0) {
            for (int i = 0; i < myContacts.size(); i++) {
                if (myContacts.get(i).getName().equals(name)) {
                    return myContacts.get(i);
                }
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(
                (i + 1) +
                ". " +
                myContacts.get(i).getName() +
                " ->" +
                myContacts.get(i).getPhoneNumber()
            );
        }
    }
}
