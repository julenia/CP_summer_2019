package SubsCalc;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SubsCalc {
    public static void main(String[] args) throws IOException {
        MasterUser masterUser = new MasterUser("Admin");
        Scanner in = new Scanner(System.in);
        System.out.print("Ilu klientów chcesz dodać? ");
        Integer nCustomer = in.nextInt();
        Customer cust[] = new Customer[nCustomer];
        String dir= "C:\\Users\\julli\\OneDrive\\Pulpit\\UNI\\compProg\\exportCenaUslug.csv";
        File file = new File(dir);
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append("Rozliczenie cen usług");
        bw.newLine();
        for (int j = 0; j < nCustomer; j++) {
            try {
                bw.append("Klient: ");
                bw.newLine();
                bw.append("Imie" + ',');
                bw.append("Nazwisko" + ',');
                bw.append("Firma" + ',');
                bw.append("Wysokość podatku VAT" + ',');
                bw.append("Procent za usługę" + ',');
                bw.newLine();
                System.out.print("Imię klienta nr " + (j + 1) + " : ");
                String firstName = in.next();
                System.out.print("Nazwisko klienta " + (j + 1) + " : ");
                String lastName = in.next();
                System.out.print("Nazwa firmy klienta " + firstName + " " + lastName + " : ");
                String companyName = in.next();
                System.out.print("Liczba usług dla klienta " + firstName + " " + lastName + " : ");
                Integer numberServices = in.nextInt();
                System.out.print("Podatek VAT dla klienta " + firstName + " " + lastName + " : ");
                Double vat = in.nextDouble();
                System.out.print("Procent dla klienta " + firstName + " " + lastName + " : ");
                Double percVal = in.nextDouble();
                if (percVal >= 1 && percVal <= 100) {
                percVal = percVal / 100;
                    }
                cust[j] = masterUser.newCustomer(firstName, lastName, companyName, numberServices, 0.0, vat, percVal);
                bw.append(firstName + ',' + lastName + ',' + companyName + ',' + vat + ',' + percVal );
                bw.newLine();
                bw.newLine();
                Service serv[] = new Service[numberServices];
                for (int k = 0; k < numberServices; k++) {
                    System.out.print("Nazwa usługi nr " + (k + 1) + " dla klienta " + firstName + " " + lastName + " : ");
                    String serviceName = in.next();
                    System.out.print("Cena usługi nr " + (k + 1) + " dla klienta " + firstName + " " + lastName + " : ");
                    Double servicePrice = in.nextDouble();
                    System.out.print("Ilość podusług dla usługi " + (k + 1) + " dla klienta " + firstName + " " + lastName + " : ");
                    Integer nSubServices = in.nextInt();
                    serv[k] = masterUser.NewService(cust[j], serviceName, servicePrice, nSubServices, 0.0);
                    String[] subsNames = new String[serv[k].getnSubServices()];
                    Double[] subsPrices = new Double[serv[k].getnSubServices()];
                    bw.append(','+ "Nazwa usługi" + ',' + "Cena usługi");
                    bw.newLine();
                    bw.append(',' + serviceName + ',' + servicePrice);
                    bw.newLine();
                    bw.newLine();
                    for (int i = 0; i < nSubServices; i++) {
                        System.out.print("Nazwa podusługi nr " + (i + 1) + " : ");
                        subsNames[i] = in.next();
                        System.out.print("Cena podusługi nr " + (i + 1) + " : ");
                        subsPrices[i] = in.nextDouble();
                        bw.append(","+ ','+ "Nazwa usługi dodatkowej" +','+ "Cena usługi dodatkowej");
                        bw.newLine();
                        bw.append(","+','+subsNames[i]+','+subsPrices[i]);
                        bw.newLine();
                    }
                    masterUser.MultipleSub(serv[k], subsNames, subsPrices);
                }
                System.out.println("Suma brutto wszystkich usług: " + masterUser.ServiceSumTotal(cust[j]));
                System.out.println("Suma netto wszystkich usług: " + masterUser.Netto(cust[j]));
                System.out.println("Wysokość podatku VAT :" + masterUser.calcVAT(cust[j]));
                System.out.println("Kwota Brutto za usługe: " + masterUser.calcPercBrutto(cust[j]));
                System.out.println("Kwota Netto za usługę: " + masterUser.calcPercNetto(cust[j]));
                bw.append("Suma brutto wszystkich usług:"+','+masterUser.ServiceSumTotal(cust[j]));
                bw.newLine();
                bw.append("Suma netto wszystkich usług:"+','+masterUser.Netto(cust[j]));
                bw.newLine();
                bw.append("Wysokość podatku VAT:"+','+masterUser.calcVAT(cust[j]));
                bw.newLine();
                bw.append("Kwota brutto za usługi:"+','+masterUser.calcPercBrutto(cust[j]));
                bw.newLine();
                bw.append("Kwota netto za usługi:"+','+masterUser.calcPercNetto(cust[j]));
                bw.newLine();
                bw.flush();
            }catch (InputMismatchException e){
                throw new InputMismatchException("Podałeś zły format danych");}
            bw.newLine();
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
