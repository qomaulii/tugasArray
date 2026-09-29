import java.util.Arrays;

public class Nasabah {  
    public static void main(String[] args) {  
  
        Bank bank = new Bank();  
        bank.addCustomer("Chanyeol", "Park");  
        bank.addCustomer("Baekhyun", "Byun");  
        bank.addCustomer("Suho", "Kim");  
        bank.addCustomer("Xiumin", "Kim");  
        bank.addCustomer("Chen", "Kim");  
        bank.addCustomer("Sehun", "Oh");  
        bank.addCustomer("Kai", "Kim");  
  
        System.out.println("-- BANK EXO --");  
        System.out.println("Jumlah Customer: " + bank.getNumOfCustomers());  

        Account account1 = new Account(50000);  
        Account account2 = new Account(60000);  
        Account account3 = new Account(70000);  
        Account account4 = new Account(75000);  
        Account account5 = new Account(80000);  
        Account account6 = new Account(90000);  
        Account account7 = new Account(100000);  
  
        bank.getCustomer(0).setAccount(account1);  
        bank.getCustomer(1).setAccount(account2);  
        bank.getCustomer(2).setAccount(account3);  
        bank.getCustomer(3).setAccount(account4);  
        bank.getCustomer(4).setAccount(account5);  
        bank.getCustomer(5).setAccount(account6);  
        bank.getCustomer(6).setAccount(account7);  

        Arrays.sort(bank.getCustomers(), 0, bank.getNumOfCustomers(), (c1, c2) ->
            Double.compare(
                c1.getAccount(0).getBalance(),
                c2.getAccount(0).getBalance()
            )
        );
  
        System.out.println("-- Data Nasabah BANK EXO --");  
  
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {  
            Customer customer = bank.getCustomer(i);  
            Account account = customer.getAccount(0);  
  
            System.out.println();  
            System.out.println("Customer ke-" + (i + 1));  
            System.out.println("Nama  : "  
                    + customer.getFirstName() + " "  
                    + customer.getLastName());  
            System.out.println("Saldo : Rp" + account.getBalance());  
        }  
  
        Customer customer = bank.getCustomer(0);  
        Account account = customer.getAccount(0);  
  
        System.out.println();  
        System.out.println("-- TRANSAKSI "  
                + customer.getFirstName() + " "  
                + customer.getLastName() + " --");  
  
        System.out.println("Saldo awal : Rp" + account.getBalance());  
  
        double depositAmount = 50000;  
  
        if (account.deposit(depositAmount)) {  
            System.out.println("Deposit    : Rp" + depositAmount);  
            System.out.println("Deposit berhasil.");  
        } else {  
            System.out.println("Deposit gagal.");  
        }  
  
        System.out.println("Saldo      : Rp" + account.getBalance());  
  
        double withdrawAmount = 15000;  
  
        if (account.withdraw(withdrawAmount)) {  
            System.out.println("Withdraw   : Rp" + withdrawAmount);  
            System.out.println("Withdraw berhasil.");  
        } else {  
            System.out.println("Withdraw gagal. Saldo tidak cukup.");  
        }  
  
        System.out.println("Saldo      : Rp" + account.getBalance());  
  
        double withdrawAmount2 = 20000;  
  
        if (account.withdraw(withdrawAmount2)) {  
            System.out.println("Withdraw   : Rp" + withdrawAmount2);  
            System.out.println("Withdraw berhasil.");  
        } else {  
            System.out.println("Withdraw gagal. Saldo tidak cukup.");  
        }  
  
        System.out.println("Saldo akhir: Rp" + account.getBalance());  
        System.out.println();  
    }  
}