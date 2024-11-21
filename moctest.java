/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moctest;

abstract class MOC {
     abstract String invoicenum();
     abstract boolean taxEligibility();
}

class Shop extends MOC {
    public String invoicenum() {
        return "2023";
    }

    public boolean taxEligibility() {
        return true;
    }
}

class Pharmacy extends MOC {
    public String invoicenum() {
        return "123";
    }

    public boolean taxEligibility() {
        return false;
    }
}

public class moctest {
    public static void main(String[] args) {
        MOC shop = new Shop();
        MOC pharmacy = new Pharmacy();
        
        System.out.println( shop.invoicenum());
        System.out.println( shop.taxEligibility());
         System.out.println(pharmacy.invoicenum());
        System.out.println(pharmacy.taxEligibility());
    }
}


