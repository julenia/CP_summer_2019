package SubsCalc;

import java.util.ArrayList;
import java.util.List;

public class MasterUser {

    private String UserName;

    private List<Customer> customerList = new ArrayList<Customer>();
    private List<Service> serviceList = new ArrayList<Service>();

    public MasterUser(String UserName) {
        this.UserName = UserName;
    }

    public Customer newCustomer(Integer custID,String firstName, String lastName, String company, Integer numbServices, Double CustomerBalance){
        Customer cust = new Customer(custID, firstName, lastName, company, numbServices, CustomerBalance);
        customerList.add(cust);
        return cust;
    }

    public Service NewService(Customer customer, String serviceName, Double servicePrice, Integer nSubServices, Integer serviceID){
        Service serv = new Service(customer, serviceName, servicePrice, nSubServices, serviceID);
        serviceList.add(serv);
        return serv;
    }
    public void ServiceSumTotal(Double servicePrice){
        for(Service ser:serviceList){

                }

        }




    @Override
    public String toString() {
        return "MasterUser{" +
                "UserName='" + UserName + '\'' +
                ", customerList=" + customerList +
                ", serviceList=" + serviceList +
                '}';
    }
}
