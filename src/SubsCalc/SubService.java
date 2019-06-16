package SubsCalc;

public class SubService {

    private String subServiceName;
    private Double subServicePrice;
    private Service service;
    private Customer customer;
    private String serviceName;

    public SubService(Customer customer, String serviceName, Double subServicePrice, Service service, String subServiceName) {
        this.customer=customer;
        this.serviceName=serviceName;
        this.subServiceName = subServiceName;
        this.service=service;
        this.subServicePrice = subServicePrice;
    }
}
