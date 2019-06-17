package SubsCalc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MasterUser {

    private String UserName;
    private Double custBalance;

    public List<Customer> customerList = new ArrayList<Customer>();
    public List<Service> serviceList = new ArrayList<Service>();

    public MasterUser(String UserName) {
        this.UserName = UserName;
    }

    public Customer newCustomer(Integer custID, String firstName, String lastName, String company, Integer numbServices, Double CustomerBalance, Double customerVAT, Double customerPerc) {
        Customer cust = new Customer(custID, firstName, lastName, company, numbServices, CustomerBalance, customerVAT, customerPerc);
        customerList.add(cust);
        return cust;
    }

    public Double getCustBalance() {
        return custBalance;
    }

    public void setCustBalance() {
        this.custBalance = custBalance;
    }

    public Service NewService(Customer customer, String serviceName, Double servicePrice, Integer nSubServices, Integer serviceID) {
        //Creates new services and adds them to the service list
        Service serv = new Service(customer, serviceName, servicePrice, nSubServices, serviceID);
        serviceList.add(serv);
        return serv;
    }

    public Double ServiceSumTotal(Customer customer) {
        //Sums costs of different services per 1 customer
        Double bal = customer.getCustomerBalance();
        for (Service ser : serviceList) {
            for (Customer cust : customerList) {
                if (cust == customer) {
                    bal = bal + ser.getServicePrice();
                }
            }
        }
        return bal;
    }

    public Double calcVAT(Customer customer) {
        Double bal = ServiceSumTotal(customer);
        //Double vat = cust.getCustomerVAT();
        for (Customer cust : customerList) {
            if (cust == customer)  bal * cust.getCustomerVAT();
        }
    }
    public Double Netto(Customer customer) {
        Double bal = ServiceSumTotal(customer);
        for (Customer cust : customerList) {
            if (cust == customer) return bal * (1-cust.getCustomerVAT());
        }
    }







    @Override
    public String toString() {
        return "MasterUser{" +
                "UserName='" + UserName + '\'' +
                ", \ncustomerList=" + customerList + '\''+
                ", \nserviceList=" + serviceList + '\'' +
                '}';
    }
}
