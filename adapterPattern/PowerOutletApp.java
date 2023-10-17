package SoftEng1.adapaterPattern;

import java.util.Scanner;

public class PowerOutletApp {

    public static void main(String[]args){

        Scanner plug = new Scanner(System.in);
        System.out.println("---⚡Welcome to PowerOutlet App⚡---");

        while(true){
            System.out.println("Available Adapter for devices:");
            System.out.println("1.) Refrigerator Adapter");
            System.out.println("2.) Laptop Adapter");
            System.out.println("3.) SmartPhone Adapter");
            System.out.println("4.) Exit");
            System.out.print("Enter desired Adaptor to display its details: ");
            int adapt = plug.nextInt();
            if(adapt == 1 | adapt == 2 | adapt == 3){
                plugIn(adapt);
            }
            else if (adapt == 4) {
                System.out.println("\n--!!App Shutting Down!!--");
                System.exit(0);
            } else {
                System.out.println("\nIncorrect Number!! Please Try Again!!\n");
            }
        }

    }

    public static void plugIn (int adapt){
        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorPI = new RefrigeratorAdapter(refrigerator);

        Laptop laptop = new Laptop();
        PowerOutlet laptopPI = new LaptopAdapter(laptop);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet spPI = new SmartphoneAdapter(smartphoneCharger);
        Scanner adapter = new Scanner(System.in);
        System.out.println("");
        switch (adapt){
            case 1:
                System.out.println("Power Outlet Voltage: 220V⚡");
                System.out.println("Refrigerator Voltage: 210V⚡");
                System.out.print("\nDo you want to use the adapter for this appliance? y/n?:");
                char yn = adapter.next().charAt(0);
                if (yn == 'y'){
                    System.out.println(refrigerator.startCooling());
                }
                else if (yn == 'n'){
                    System.out.println("Returning you to Main Menu!!\n");
                    return;
                }
                else{
                    System.out.println("Invalid character! Returning you to Main Menu\n");
                    return;
                }
                break;
            case 2:
                System.out.println("Power Outlet Voltage: 220V⚡");
                System.out.println("Laptop Voltage: 240V⚡");
                System.out.print("\nDo you want to use the adapter for this appliance? y/n?: ");
                yn = adapter.next().charAt(0);
                if (yn == 'y'){
                    System.out.println(laptop.charge());
                }
                else if (yn == 'n'){
                    System.out.println("Returning you to Main Menu!!\n");
                    return;
                }
                else{
                    System.out.println("Invalid character! Returning you to Main Menu\n");
                    return;
                }
                break;
            case 3:
                System.out.println("Power Outlet Voltage: 220V⚡");
                System.out.println("SmartPhoneCharger Voltage: 125V⚡");
                System.out.print("\nDo you want to use the adapter for this appliance? y/n?: ");
                yn = adapter.next().charAt(0);
                if (yn == 'y'){
                    System.out.println(smartphoneCharger.chargePhone());
                }
                else if (yn == 'n'){
                    System.out.println("Returning you to Main Menu!!\n");
                    return;
                }
                else{
                    System.out.println("Invalid character! Returning you to Main Menu\n");
                    return;
                }
                break;
            default:
        }

    }
}
