// Oscar Avina
// 07/26/2026
// Module 10.2 Assignment
// This program creates and displays information for both domestic and international divisions of a company.

public class UseDivision {

  public static void main(String[] args) {
    // creates two international divisions objects
    InternationalDivision argentinaDivision = new InternationalDivision("Argentina Operations", 1001, "Argentina", "Spanish");
    InternationalDivision spainDivision = new InternationalDivision("Spain Operations", 1002, "Spain", "Spanish");

    // creates two domestic divisions objects
    DomesticDivision westDivision = new DomesticDivision("Western Operations", 2001, "California");
    DomesticDivision eastDivision = new DomesticDivision("Eastern Operations", 2002, "New York");

    // each object calls the display method defined in its own class
    argentinaDivision.display();
    spainDivision.display();
    westDivision.display();
    eastDivision.display();
  }
}