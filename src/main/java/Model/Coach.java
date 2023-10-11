package Model;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Friday September 2023
 * @Time: 11:11 AM
 */
public class Coach {
    int id;
    String firstname, lastname, email, password, gender, phoneNumber, omang, address, username;

    public Coach(){
        super();
    }

    public Coach(int id, String firstname, String lastname, String email, String password, String gender, String phoneNumber, String omang, String address, String username) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.omang = omang;
        this.address = address;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOmang() {
        return omang;
    }

    public void setOmang(String omang) {
        this.omang = omang;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
