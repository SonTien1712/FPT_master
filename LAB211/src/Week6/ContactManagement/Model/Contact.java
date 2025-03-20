package Week6.ContactManagement.Model;

public class Contact
{
    private int id;
    private String fullname;
    private String group;
    private String address;
    private String phone;
    private String fistname;
    private String lastname;

    public Contact(int id, String fullname, String group, String address, String phone, String fistname, String lastname) {
        this.id = id;
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.fistname = fistname;
        this.lastname = lastname;
    }

    public Contact(int id, String fullname, String group, String address, String phone) {
        this.id = id;
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.fistname = getFistname();
        this.lastname = getLastname();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    private String[] parts = fullname.trim().split("\\s+");

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFistname() {
        return parts[0];
    }

//    public void setFistname(String fistname) {
//        this.fistname = fistname;
//    }

    public String getLastname() {
        return (parts.length > 1) ? parts[parts.length - 1] : "";
    }

//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", group='" + group + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", fistname='" + fistname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }


}
