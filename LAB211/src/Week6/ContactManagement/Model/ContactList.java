package Week6.ContactManagement.Model;

import Week6.ContactManagement.Controller.DataInput;

import java.util.ArrayList;

public class ContactList
{
    private ArrayList<Contact> contacts = new ArrayList<>();

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact)
    {
        contacts.add(contact);
    }

    public void displayAll()
    {
        for(Contact contact : contacts)
        {
            System.out.println(contact);
        }
    }

    public void updateContact(int id)
    {
        for(Contact contact : contacts)
        {
            if(contact.getId()==id)
            {
                contact.setAddress(DataInput.InputNullString());
                contact.setGroup(DataInput.InputNullString());
                contact.setPhone(DataInput.InputNullString());
                contact.setFullname(DataInput.InputNullString());
            }
        }
    }

    public int addId()
    {
        if(contacts.isEmpty())
        {
            return 1;
        }else
        {
            return contacts.size()+1;
        }
    }

    public void renewId()
    {
        if(!contacts.isEmpty()) {
            for(Contact contact : contacts)
            {
                
            }

        }

    }


}
