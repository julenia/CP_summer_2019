package SubsCalc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Service {

    private String serviceName;
    private Double servicePrice;
    private Customer customer;
    private Integer serviceID;
    private Integer nSubServices;
    private Integer nS;

    public Service (Customer customer, String serviceName, Double servicePrice, Integer nSubServices, Integer serviceID) {
        this.customer=customer;
        this.serviceName=serviceName;
        this.servicePrice=servicePrice;
        this.nSubServices=nSubServices;
        this.serviceID=serviceID;
    }
    public Customer getCustomer (){return customer;}

    public void setCustomer(Customer customer){this.customer=customer;}

    public String getServiceName (){return serviceName;}

    public void setServiceName(String serviceName){this.serviceName=serviceName;}

    public Double getServicePrice (){return servicePrice;}

    public void setServicePrice(Double servicePrice){this.servicePrice=servicePrice;}

    public Integer getServiceID (){return serviceID;}

    public void setServiceID(Integer serviceID){this.serviceID=serviceID;}

    public Integer getnSubServices (){return nSubServices;}

    public void setnSubServices(Integer nSubServices){this.nSubServices=nSubServices;}


    @Override
    public String toString() {
        return "Service{" +
                "serviceName='" + serviceName + '\'' +
                ", servicePrice=" + servicePrice +
                ", customer=" + customer +
                ", serviceID=" + serviceID +
                ", nSubServices=" + nSubServices +
                ", nS=" + nS +
                '}';
    }
}



