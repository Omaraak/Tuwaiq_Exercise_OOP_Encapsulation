public class Account {
    private String id, name;
    private int balance = 0;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount){
        if(amount > this.balance){
            System.out.println("Can not make the transaction");
        }else{
            this.balance-=amount;
        }
        return this.balance;
    }

    public int debit(int amount){
        this.balance+=amount;
        return this.balance;
    }

    public int transfer_to(Account another, int amount){
        if(amount > this.balance){
            System.out.println("Can not make the transaction");
        }
        else{
            this.balance-=amount;
            another.setBalance(another.getBalance()+amount);
        }
        return this.balance;
    }

    public String to_string(){
        return "Id:" + this.id + " Name: " + this.name + " Balance: " + this.balance;
    }
}
