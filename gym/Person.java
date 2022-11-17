
package gym;

public abstract class Person implements GymInterface {
    private String ID;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String age;
    private String medicalCase;
    private String phoneNumber;
    //this is constructor.
    public Person (String id , String fName , String lName , String BD , String Age , String mCase,String PNumber) {
    this.ID=id;
    this.firstName=fName;
    this.lastName=lName;
    this.birthDate=BD;
    this.age=Age;
    this.medicalCase=mCase;
    this.phoneNumber=PNumber;
}

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMedicalCase() {
        return medicalCase;
    }

    public void setMedicalCase(String medicalCase) {
        this.medicalCase = medicalCase;
    }
    
    @Override
    public String toString() {
        return "Person{" + "ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", age=" + age + ", medicalCase=" + medicalCase + ", phoneNumber=" + phoneNumber + '}';
    }


}
