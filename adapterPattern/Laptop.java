package SoftEng1.adapaterPattern;

public class Laptop {
    public String charge(){
        System.out.println("\n💻Low battery! Please Charge it Immediately!\nCurrent Battery is: 10%🔋");
        return "The laptop is charging!\nCurrent Battery is: 11%🔋\n";
    }
}
