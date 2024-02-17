package firstAssignment;

class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
}

class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

public class Q1Inheritance{
    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee employee3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee employee4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        SalariedEmployee employee5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee employee6 = new BaseEmployee("Mike", "Davenport", "666-66-6666",  95000);
        CommissionEmployee employee7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);


        System.out.println("FirstName:-"+employee1.getFirstName()) ;
        System.out.println( "LastName " + employee1.getLastName());
        System.out.println("SSN " + employee1.getSocialSecurityNumber());
        System.out.println("WeeklySalary " + employee1.getWeeklySalary());
        System.out.println("-------------------------------------------------------------------");

        System.out.println("FirstName: " + employee2.getFirstName());
        System.out.println("LastName: " + employee2.getLastName());
        System.out.println("SSN: " + employee2.getSocialSecurityNumber());
        System.out.println("Wage: " + employee2.getWage());
        System.out.println("HoursWorked: " + employee2.getHoursWorked());
        System.out.println("-------------------------------------------------------------------");

        System.out.println("FirstName: " + employee3.getFirstName());
        System.out.println("LastName: " + employee3.getLastName());
        System.out.println("SSN: " + employee3.getSocialSecurityNumber());
        System.out.println("Wage: " + employee3.getWage());
        System.out.println("HoursWorked: " + employee3.getHoursWorked());
        System.out.println("-------------------------------------------------------------------");

        System.out.println("FirstName: " + employee4.getFirstName());
        System.out.println("LastName: " + employee4.getLastName());
        System.out.println("SSN: " + employee4.getSocialSecurityNumber());
        System.out.println("CommissionRate: " + employee4.getCommissionRate());
        System.out.println("GrossSales: $" + employee4.getGrossSales());
        System.out.println("-------------------------------------------------------------------");

        System.out.println("FirstName: " + employee5.getFirstName());
        System.out.println("LastName: " + employee5.getLastName());
        System.out.println("SSN: " + employee5.getSocialSecurityNumber());
        System.out.println("WeeklySalary: " + employee5.getWeeklySalary());
        System.out.println("-------------------------------------------------------------------");

        System.out.println("FirstName: " + employee6.getFirstName());
        System.out.println("LastName: " + employee6.getLastName());
        System.out.println("SSN: " + employee6.getSocialSecurityNumber());
        System.out.println("BaseSalary: $" + employee6.getBaseSalary());
        System.out.println("-------------------------------------------------------------------");

        System.out.println("FirstName: " + employee7.getFirstName());
        System.out.println("LastName: " + employee7.getLastName());
        System.out.println("SSN: " + employee7.getSocialSecurityNumber());
        System.out.println("CommissionRate: " + employee7.getCommissionRate());
        System.out.println("GrossSales: $" + employee7.getGrossSales());
        System.out.println("-------------------------------------------------------------------");
    }
}