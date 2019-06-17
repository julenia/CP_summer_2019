package SubsCalc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubsCalc {
    public static void main(String[] args) {
        MasterUser masterUser = new MasterUser("Admin");



        Scanner in = new Scanner(System.in);
        System.out.println("Ile usług chcesz dodać? ");
        Integer nS=in.nextInt();
        Double total=0.0;
        Customer c1 = masterUser.newCustomer(1, "Jan", "Kowalski", "XXX", nS, 0.0,0.23, 0.33);
        Customer c2 = masterUser.newCustomer(2, "Anna", "Nowak", "YYY", 2, 0.0, 0.23, 0.33);
        Service s1= masterUser.NewService(c1, "Telefon", 20.0, 2, 1000, 0.0);
        Service s2 = masterUser.NewService(c1, "Internet", 30.0, 3, 1001, 0.0);
        SubService ss1=masterUser.NewSubService(c1, s1, "tel tata", 15.0);
        System.out.println(masterUser.ServiceSumTotal(c1));
        System.out.println(masterUser.calcPercNetto(c1));




       // Service [] service = new Service[nS];

       //2 Map customerServices = new HashMap();
    /*    for (int i=1; i<=nS; i++){

            System.out.print("Nazwa usługi: ");
            String ServiceName = in.next();
            System.out.print("Cena usługi: ");
            Double ServicePrice = in.nextDouble();
            System.out.println("Ile podusług chcesz dodać? ");
            int nSS = in.nextInt();
            customerServices.put(ServiceName, ServicePrice);
            Service s=masterUser.NewService(c1, ServiceName, ServicePrice, nSS, i);
            s=service[(i-1)];
   */     }


     //   System.out.println(masterUser.getCustBalance());
     //   System.out.println(masterUser);








    }


  /*      Map customerServices = new HashMap();
        //User should fill it in
        int nservice=2;
        //User should fill it in (for every service separatelly
        int nSS=1;





    }

}
*/
