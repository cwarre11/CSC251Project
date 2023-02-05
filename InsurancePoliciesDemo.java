import java.util.Scanner ;
public class InsurancePoliciesDemo {

   public static void main(String[] args) {

   Scanner sc = new Scanner(System.in) ;
   
   System.out.print("Please enter the Policy Number: ");
      int policyNumber = sc.nextInt() ;
      sc.nextLine();
   System.out.print("Please enter Provider Name: ");
      String provider = sc.nextLine() ;
   System.out.print("Please enter the Policyholder's First Name: ");
      String firstName = sc.nextLine() ;
   System.out.print("Please enter the Policyholder's Last Name: ");
      String lastName = sc.nextLine() ;
   System.out.print("Please enter the Policyholder's Age: ");
      int age = sc.nextInt();
      sc.nextLine();
   System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = sc.nextLine() ;
   System.out.print("Please enter the Policyholder's Height (in inches): ");
      double height = sc.nextDouble();
   System.out.print("Please enter the Policyholder's Weight (in pounds:) ");
      double weight = sc.nextDouble();
      
   Policy p = new Policy(policyNumber, provider, firstName, lastName, age, smokingStatus, height, weight);
   System.out.println(p);
}

}