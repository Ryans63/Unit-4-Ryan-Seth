public class BankAccountClient {

public String firstName;
public String lastName;
public Account acc;
public double Balance = acc.balance;
int defaultBalance = 100;


public BankAccountClient(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
 }


public BankAccountClient() {
    firstName = "Bob";
    lastName = "Jones";
 }


public void addAccount(double Balance) {
    acc = new Account();
    acc.accountId = "Account ID: " + Account.getNextId();
    Balance = initialBalance;
 }


public void addAccount() {
    addAccount(100);
 }

}
