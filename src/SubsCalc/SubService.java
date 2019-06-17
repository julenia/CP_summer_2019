package SubsCalc;

public class SubService {

    private Double subServicePrice;
    private Service service;
    private Customer customer;
    private String subServiceName;

    public SubService(Customer customer,  Service service, String subServiceName,Double subServicePrice) {
        this.customer=customer;
        this.subServiceName = subServiceName;
        this.service=service;
        this.subServicePrice = subServicePrice;
    }

    public Customer getCustomer (){return customer;}

    public void setCustomer(Customer customer){this.customer=customer;}

    public Double getSubServicePrice (){return subServicePrice;}

    public void setSubServicePrice(Double subServicePrice){this.subServicePrice=subServicePrice;}

    public String getSubServiceName (){return subServiceName;}

    public void setSubServiceName(String subServiceName){this.subServiceName=subServiceName;}

    public Service getService() {return service;}

    public void setService(Service service){this.service=service;}
}
