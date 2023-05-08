public class Main {
    public static void main(String[] args) {


        // Account
        Account account = new Account("1", "Mohammed", 5000);
        System.out.println("Accout Info");
        System.out.println("The balance after credit is: "+ account.credit(300));
        System.out.println("The balance after debit is: "+ account.debit(300));
        System.out.println(account.toString());

        // Employee
        System.out.println("\n\nEmployee Info");
        Employee employee = new Employee("1", "Mohammed", 5000);
        System.out.println("Raise Salary is: "+ employee.raiseSalary(10));
        System.out.println("Annual Salary is: "+ employee.getAnnualSalary());
        System.out.println(employee.toString());


    }
}