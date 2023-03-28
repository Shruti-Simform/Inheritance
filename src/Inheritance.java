class Inheritance{
    public static void main(String[] args) {
        System.out.println("---- EMPLOYEE DETAILS ----");
        Employee emp = new Employee(101,"Shruti","Ahmedabad");
        System.out.println(
                "ID : " + emp.id + "\n"+
                        "Name : "+ emp.name +"\n"+
                        "Location : "+emp.location
        );
        System.out.println("---- EMPLOYEE DETAILS ----");
        emp = new Employee(102,"Swati","Bangalore", 20000);
        System.out.println(
                "ID : " + emp.id + "\n"+
                        "Name : "+ emp.name +"\n"+
                        "Location : "+emp.location+"\n"+
                        "Salary : "+emp.Salary
        );
    }
}
