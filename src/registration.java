public class registration {

    public static void main(String []args){


        Employee_Management aCT = new Employee_Management();
        aCT.registration("Henok", 1109);
        aCT.setSalary(6,600,20);
        aCT.tax();
        aCT.setPension();
        aCT.getPension();
        aCT.getSalary();

        Contract_Employee aCTContract = new Contract_Employee();

        aCTContract.registration("Sara", 0153);
        aCTContract.setSalary(6,600,20);
        aCTContract.tax();
        aCTContract.setPension();
        aCTContract.getPension();
        aCTContract.getSalary();



        Full_Time_Employee aCTFullTime = new Full_Time_Employee();
        aCTFullTime.registration("Mesfin", 2142);
        aCTFullTime.setSalary(6,600,20);
        aCTFullTime.tax();
        aCTFullTime.getSalary();
        aCTFullTime.setPension();
        aCTFullTime.getPension();

    }
}
