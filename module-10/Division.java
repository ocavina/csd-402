// Oscar Avina
// 07/26/2026
// Module 10.2 Assignment
// This program provides the shared fields and method requirement for all divisions.

public abstract class Division {

  // these fields are shared by all divisions
  protected String divisionName;
  protected int accountNumber;

  // the subclasses will call this constructor to initialize the shared fields
  public Division(String divisionName, int accountNumber) {
    this.divisionName = divisionName;
    this.accountNumber = accountNumber;
  }
  // each subclass will provide its own display method since its fields are different
  public abstract void display();
}