class Employee extends Person{
    String location;
    int Salary;
    //CONSTRUCTOR OVERLOADING TO ACHIEVE POLYMORPHISM
    Employee(int id, String name, String location) {
        super(id, name);
        this.location = location;
    }
    Employee(int id, String name, String location,int Salary) {
        super(id, name);
        this.location = location;
        this.Salary = Salary;
    }
}