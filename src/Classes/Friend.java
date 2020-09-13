

package Classes;

import java.time.LocalDate;

public class Friend {

    private String serialNumber;
    private String firstName,middleName,lastName;

    public LocalDate getdOB() {
        return dOB;
    }

    public void setdOB(LocalDate dOB) {
        if(dOB.getYear()>=1930 && dOB.getMonthValue()<=12 && dOB.getDayOfMonth()<=31)
        this.dOB = dOB;
        else
            System.out.print("Error");
    }

    private LocalDate dOB;
    private String homeAdress;
    private String phoneNumber;


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if(isValidNumber(serialNumber))
        this.serialNumber = serialNumber;
        else
            this.serialNumber ="Error";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(isValidName(firstName))
        this.firstName = firstName;
        else
            this.firstName ="Error;";
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if(isValidName(middleName))
        this.middleName = middleName;
        else
            this.middleName ="Error";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(isValidName(lastName))
        this.lastName = lastName;
        else
            this.lastName ="Error";
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Friend(String serialNumber, String firstName, String middleName, String lastName, LocalDate dOB, String homeAdress, String phoneNumber) {
        this.serialNumber = serialNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dOB = dOB;
        this.homeAdress = homeAdress;
        this.phoneNumber = phoneNumber;
    }


    // Validations
    public Boolean isValidName(String name)
    {
        for (int i=0;i<=name.length();i++) {
            if(!Character.isAlphabetic(name.charAt(i)))
                return false;
        }
        return true;
    }

    public Boolean isValidNumber(String value)
    {
        for (int i=0;i<=value.length();i++) {
            if(!Character.isDigit(value.charAt(i)))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Friend{"+ serialNumber + '\'' +
                ",'" + firstName + '\'' +
                ",'" + middleName + '\'' +
                ",'" + lastName + '\'' +
                "," + dOB +
                ",'" + homeAdress + '\'' +
                "," + phoneNumber + '\'' +
                '}';
    }
}
