public class Main {
    public static void main(String[] args) {

        //Accounts
        System.out.println("Accounts");

        //constructor 1
        Account account1 = new Account("001","Ana");

        //constructor 2
        Account account2 = new Account("010","Doomfist",100);
        Account account3 = new Account("100","Rain",10);

        //setters
        System.out.println("\nsetters\n");
        System.out.println("before the setter:\n" + account1.to_string() + "\n");

        account1.setId("01");
        account1.setName("Sombra");
        account1.setBalance(10);

        System.out.println("after the setter:\n" + account1.to_string());

        //credit
        System.out.println("\ncredit\n");

        //case 1 amount is more then balance
        System.out.println("case 1 credit 100 from account1");
        System.out.println("balance before credit: " + account1.getBalance());
        int temp = account1.getBalance();
        account1.credit(100);
        if (account1.getBalance() != temp)
            System.out.println("balance after credit: " + account1.getBalance());

        //case 2 amount is less or equal then balance
        System.out.println("\ncase 2 credit 100 from account2");
        System.out.println("balance before credit: " + account2.getBalance());
        account2.credit(100);
        System.out.println("balance after credit: " + account2.getBalance());

        //debit
        System.out.println("\ndebit\n");
        System.out.println("balance before debit: " + account1.getBalance());
        account1.debit(100);
        System.out.println("balance after debit: " + account1.getBalance());

        //transfer to
        System.out.println("\ntransfer to\n");

        //case 1 amount is more then balance
        System.out.println("case 1 transfer 100 from account3 to account2");
        System.out.println("balance before credit: " + account3.getBalance());
        int temp1 = account3.getBalance();
        account3.transfer_to(account2,100);
        if (account3.getBalance() != temp1) {
            System.out.println("balance after credit: " + account3.getBalance());
            System.out.println("recipient balance: " + account2.getBalance());
        }

        //case 2 amount is less or equal then balance
        System.out.println("\ncase 2 transfer 100 from account1 to account3");
        System.out.println("balance before credit: " + account1.getBalance());
        account1.transfer_to(account3,100);
        System.out.println("balance after credit: " + account1.getBalance());

        System.out.println("recipient balance: " + account3.getBalance());

        //to string
        System.out.println("\nto string\n");
        System.out.println(account1.to_string() + "\n" + account2.to_string() + "\n" + account3.to_string());



        //Employee
        System.out.println("\nEmployee\n");

        Employee employee1 = new Employee("001","Ana",100);
        Employee employee2 = new Employee("010","Doomfist",200);
        Employee employee3 = new Employee("100","Rain",300);

        //setters
        System.out.println("\nsetters\n");
        System.out.println("before the setter:\n" + employee1.to_string() + "\n");

        employee1.setId("01");
        employee1.setName("Sombra");
        employee1.setSalary(400);

        System.out.println("after the setter:\n" + employee1.to_string());

        //annual salary
        System.out.println("\nannual salary\n");

        System.out.println("name:" + employee1.getName() + " " + employee1.annual_salary());
        System.out.println("name:" + employee2.getName() + " " + employee2.annual_salary());
        System.out.println("name:" + employee3.getName() + " " + employee3.annual_salary());

        //raised salary
        System.out.println("\nraised salary\n");
        System.out.println("balance before : " + employee1.getSalary());
        System.out.println("balance after : " + employee1.raised_salary(10));

        //to string
        System.out.println("\nto string\n");
        System.out.println(employee1.to_string() + "\n" + employee2.to_string() + "\n" + employee3.to_string());

    }
}