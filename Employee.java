public class Employee {

    private String id,name;
    private double salary;

    public Employee(String id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double annual_salary(){
        return salary*12;
    }

    public double raised_salary(double percent){
        percent/=100;
        percent+=1;
        this.salary = this.salary * percent;
        return this.salary;
    }

    public String to_string(){
        return "Id:" + this.id + " Name:" + this.name + " Salary:" + this.salary;
    }
}
