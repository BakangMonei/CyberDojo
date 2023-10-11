package Model;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Friday September 2023
 * @Time: 11:14 AM
 */
public class Payment {
    int id;
    String email, username;
    double amount1 = 10, amount2 = 20, amount3 = 50;
    String months;

    public Payment(){
        super();
    }

    public Payment(int id, String email, String username, double amount1, double amount2, double amount3, String months) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.amount1 = amount1;
        this.amount2 = amount2;
        this.amount3 = amount3;
        this.months = months;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getAmount1() {
        return amount1;
    }

    public void setAmount1(double amount1) {
        this.amount1 = amount1;
    }

    public double getAmount2() {
        return amount2;
    }

    public void setAmount2(double amount2) {
        this.amount2 = amount2;
    }

    public double getAmount3() {
        return amount3;
    }

    public void setAmount3(double amount3) {
        this.amount3 = amount3;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }
}
