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
    private Double totalSubServices;

    public Service (Customer customer, String serviceName, Double servicePrice, Integer nSubServices, Integer serviceID, Double totalSubServices) {
        this.customer=customer;
        this.serviceName=serviceName;
        this.servicePrice=servicePrice;
        this.nSubServices=nSubServices;
        this.serviceID=serviceID;
        this.totalSubServices=totalSubServices;
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

    public Double getTotalSubServices() {return totalSubServices;}

    public void  setTotalSubServices(Double totalSubServices) {this.totalSubServices=totalSubServices;}


    @Override
    public String toString() {
        return "Service{" +
                "serviceName='" + serviceName + '\'' +
                ", servicePrice=" + servicePrice +
                ", customer=" + customer +
                ", serviceID=" + serviceID +
                ", nSubServices=" + nSubServices +
                ", totalSubServices=" +totalSubServices +
                '}';
    }
}



