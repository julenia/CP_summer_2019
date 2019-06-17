package SubsCalc;

import java.util.ArrayList;
import java.util.List;

public class MasterUser {

    private String UserName;
    private Double custBalance;

    public List<Customer> customerList = new ArrayList<Customer>();
    public List<Service> serviceList = new ArrayList<Service>();
    public List<SubService> subServiceList = new ArrayList<SubService>();

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

    public Service NewService(Customer customer, String serviceName, Double servicePrice, Integer nSubServices, Integer serviceID, Double totalSubServices) {
        //Creates new services and adds them to the service list
        Service serv = new Service(customer, serviceName, servicePrice, nSubServices, serviceID, totalSubServices);
        serviceList.add(serv);
        return serv;
    }

    public SubService NewSubService(Customer customer, Service service, String subServiceName, Double subServicePrice){
        SubService subserv = new SubService(customer, service, subServiceName, subServicePrice);
        subServiceList.add(subserv);
        return subserv;
    }

    public void MultipleSub(Service service){
        Integer nS=service.getnSubServices();
        f
    }

    public Double subServiceSum(Service service){
        Double bal = service.getTotalSubServices();
        for (SubService subser : subServiceList) {
            bal=bal+subser.getSubServicePrice();

        }
        service.setTotalSubServices(bal);
        return bal;
    }

    public Double ServiceSumTotal(Customer customer) {
        //Sums costs of different services per 1 customer
        Double bal = customer.getCustomerBalance();
        for (Service ser : serviceList) {
                if (ser.getCustomer() == customer) {
                    bal = bal + ser.getServicePrice()+ subServiceSum(ser);

            }
        }
        return bal;
    }

    public Double calcVAT(Customer customer) {
        Double bal = ServiceSumTotal(customer);
        Double vat = customer.getCustomerVAT();
        return bal*vat;
    }
    public Double Netto(Customer customer) {
        Double bal = ServiceSumTotal(customer);
        Double vat = customer.getCustomerVAT();
        return bal*(1-vat);
    }

    public Double calcPercBrutto(Customer customer){
        Double bal=ServiceSumTotal(customer);
        Double perc=customer.getCustomerPerc();
        return bal*perc;
    }
    public Double calcPercNetto(Customer customer){
        Double bal=Netto(customer);
        Double perc=customer.getCustomerPerc();
        return bal*perc;
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
