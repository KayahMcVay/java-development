public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeId, String name, double hoursWorked, double payRate){

        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }

    public void setEmployeeId(int employeeId){

        this.employeeId = employeeId;

    }

    public int getEmployeeId(){

        return this.employeeId;

    }

    public void setName(String name){

        this.name = name;

    }

    public String getName(){

        return this.name;

    }

    public void setHoursWorked(){

    }

    public double getHoursWorked(){

        return this.hoursWorked;

    }

    public void setPayRate(){

    }

    public double getPayRate(){

        return this.payRate;

    }

    public double calculateGrossPay(double hoursWorked, double payRate){

      return (hoursWorked * payRate);

    }

} 
