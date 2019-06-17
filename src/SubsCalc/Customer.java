package SubsCalc;

public class Customer {
    private Integer custID;

    private String firstName;

    private String lastName;

    private String companyName;

    private Integer numbServices;

    private Double customerBalance;

    private Double customerVAT;

    private Double customerPerc;

    public Customer(Integer custID, String firstName, String lastName, String companyName, Integer numbServices, Double customerBalance, Double customerVAT, Double customerPerc) {
        this.custID = custID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.numbServices = numbServices;
        this.customerBalance = customerBalance;
        this.customerVAT = customerVAT;
        this.customerPerc = customerPerc;
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

    public Integer getNumbServices() {
        return numbServices;
    }

    public void setNumbServices(Integer numbServices) {
        this.numbServices = numbServices;
    }

    public Double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(Double customerBalance) {
        this.customerBalance = customerBalance;
    }

    public Double getCustomerVAT() {
        return customerPerc;
    }

    public void setCustomerVAT(Double customerVAT) {
        this.customerVAT = customerVAT;
    }

    public Double getCustomerPerc(Double customerPerc) {
        return customerPerc;
    }
    public void setCustomerPerc(Double customerPerc){
        this.customerPerc = customerPerc;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "custID=" + custID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", numbServices=" + numbServices +
                ", customerBalance=" + customerBalance +
                ", customerVAT=" + customerVAT +
                ", customerPerc=" + customerPerc +
                '}';
    }
}
