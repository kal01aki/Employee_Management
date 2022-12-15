public class Employee_Management {

    int id;
    String staffName;

    private double salary;
    private double pension;

    private double tax;


    void registration (String staffName, int id){
        this.staffName = staffName;
        this.id = id;
        System.out.println(staffName + " is registered.\n" + "His/her ID number is " + id);
    }

    void setSalary(int workingHr, double paymentPerHour, int workingDay){

        salary = paymentPerHour*workingHr*workingDay;
        System.out.println(staffName + "'s salary is " + salary);

    }
    public double getSalary() {
        return salary;
    }

    void tax (){
        if (salary <= 5000) {
            tax = 0.05 * salary;
            System.out.println(staffName + "'s tax is " + tax);
        }
        else if (5000 < salary && salary <= 10000) {
            tax = 0.1 * salary;
            System.out.println(staffName + "'s tax is " + tax);
        }
        else if (10000 < salary && salary <= 20000) {
            tax = 0.15 * salary;
            System.out.println(staffName + "'s tax is " + tax);
        }
        else
            tax = 0.2*salary;
        System.out.println(staffName + "'s tax is " + tax);
    }

    public void setPension() {
        pension = 0.12 * salary;
    }

    public double getPension() {
        System.out.println(staffName + "'s Pension is " + pension);
        return pension;
    }
}
