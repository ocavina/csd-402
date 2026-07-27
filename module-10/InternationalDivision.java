// Oscar Avina
// 07/26/2026
// Module 10.2 Assignment
// This program defines a division located in another country.

public class InternationalDivision extends Division {

  // these fields are only used by international divisions
  private String country;
  private String language;

  // this constructor receives the shared fields and the international fields
  public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
    super(divisionName, accountNumber);
    this.country = country;
    this.language = language;
  }

  // completes the display method for international divisions
  @Override
  public void display() {
    System.out.println("International Division");
    System.out.println("Division name: " + divisionName);
    System.out.println("Account number: " + accountNumber);
    System.out.println("Country: " + country);
    System.out.println("Language: " + language);
    System.out.println();
  }
}