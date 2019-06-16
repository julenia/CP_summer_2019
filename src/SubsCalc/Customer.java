package SubsCalc;

public class Customer {
    private Integer custID;

    private String firstName;

    private String lastName;

    private String companyName;

    private Integer numbServices;

    private Double customerBalance;

    public Customer(Integer custID, String firstName, String lastName, String companyName, Integer numbServices, Double customerBalance) {
        this.custID = custID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.numbServices = numbServices;
        this.customerBalance = customerBalance;
    }

    public Integer getCustID() {
        return custID;
    }

    public void setCustID(Integer custID) {
        this.custID = custID;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getNumbServices() {return numbServices;}

    public void setNumbServices(Integer numbServices){
        this.numbServices = numbServices;
    }

    public Double getCustomerBalance() {return customerBalance;}

    public void setCustomerBalance (Double customerBalance) {
        this.customerBalance = customerBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + custID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + companyName + '\'' +
                '}';
    }


}
