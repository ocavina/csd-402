// Oscar Avina
// 07/26/2026
// Module 10.2 Assignment
// This program defines a division located in the United States.

public class DomesticDivision extends Division {

  // this field is only used by domestic divisions
  private String state;

  // this constructor receives the shared fields and the domestic field
  public DomesticDivision(String divisionName, int accountNumber, String state) {
    super(divisionName, accountNumber);
    this.state = state;
  }

  // completes the display method for domestic divisions
  @Override
  public void display() {
    System.out.println("Domestic Division");
    System.out.println("Division name: " + divisionName);
    System.out.println("Account number: " + accountNumber);
    System.out.println("State: " + state);
    System.out.println();
  }
}