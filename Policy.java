import java.util.Scanner;
import java.text.DecimalFormat;

public class Policy {
   private int policyNumber ;
   private String providerName ;
   private String firstName ;
   private String lastName ;
   private int age ;
   private String smokingStatus ;
   private double height ;
   private double weight ;
   
   public Policy(int policyNumber, String providerName, String firstName, String lastName, int age,
   String smokingStatus, double height, double weight) {
   
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
      }
   public int getPolicyNumber() {
      return policyNumber;
   }
   public void setPolicyNumber(int policyNumber) {
      this.policyNumber = policyNumber;
   }
   public String getProviderName() {
      return providerName;
   }
   public void setProviderName(String providerName) {
      this.providerName = providerName;
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
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public String getSmokingStatus() {
      return smokingStatus;
   }
   public void setSmokingStatus(String smokingStatus) {
      this.smokingStatus = smokingStatus;
   }
   public double getHeight() {
      return height;
   }
   public void setHeight(double height) {
      this.height = height;
   }
   public double getWeight() {
      return weight;
   }
   public void setWeight(double weight) {
      this.weight = weight;
   }
   public double calculateBMI() {
      return (this.weight * 703) / (this.height * this.height) ;
   }
   public double price() {
      double basePrice = 600 ;
      if(this.age > 50) {
         basePrice += 75 ;
      }  
      String temp = this.smokingStatus.toLowerCase() ;
         if(temp.contentEquals("smoker")) {
         basePrice += 100 ;
         }
         if(this.calculateBMI() > 35) {
         basePrice = basePrice + (this.calculateBMI() - 35) * 20 ;
         }
      return basePrice;
   }

   public String toString() {
      return "\nPolicy Number: " + policyNumber + "\nProvider Name: " + providerName + "\nPolicyholder's First Name: " + firstName
      + "\nPolicyholder's Last Name: " + lastName + "\nPolicyholder's Age: " + age + "\nPolicyholder's Smoking Status: " + smokingStatus + 
      "\nPolicyHolder's Height: " + height + "\nPolicyholder's Weight: " + weight + "\nPolicyholder's BMI: " + calculateBMI()) + "\nPolicy Price: $" + price();
   }
}