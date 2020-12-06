public abstract class Employee implements Payable {
  private String employeeId, name;
  protected double averageMonthlySalary = 0.0;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return averageMonthlySalary;
  }

  @Override
  public String toString() {
    return String.format("%s %.2f", name, averageMonthlySalary);
  }
}
