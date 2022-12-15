public class Contract_Employee  extends Employee_Management implements Employee {

private double pension;

    void registration(String staffName, int id) {
        this.staffName = staffName;
        this.id = id;
        System.out.println("\n" + staffName + " is registered.\n" + "His/her ID number is " + id + "\n" + staffName + "is a Contract Employee");
    }

    @Override
    void setSalary(int workingHr, double paymentPerHour, int workingDay) {
        super.setSalary(workingHr, paymentPerHour, workingDay);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    void tax() {
        super.tax();
    }

    public void workingHr(double workingHr){
      System.out.println("The working hour for Contract Employee is " + workingHr);
    }

     public void paymentPerHr(double paymentPerHour) {
      System.out.println("The Payment per hr. is " + paymentPerHour);
    }

    @Override
    public void setPension() {
        pension = 0.11 *getSalary();
    }

    @Override
    public double getPension() {
        System.out.println(staffName + "'s Pension is " + pension);
        return pension;
    }
}
