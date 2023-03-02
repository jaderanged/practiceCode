import java.util.Scanner;
public class Main {
    public static void convertingStuff() {
        Scanner myObj = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        float inch, centi, convert;

        while(!exit) {
            System.out.println("Press One to convert inches to centimeters.");
            System.out.println("Press Two to convert centimeters to inches");
            System.out.println("Press Three to exit");
            Integer choice = input.nextInt();

            if (choice.equals(1)) {
                System.out.println("Enter Inches");
                inch = myObj.nextFloat();
                centi = 2.54F;
                convert = inch * centi;
                System.out.println("Inches: " + inch + " Centimeters: " + convert);
                System.out.println("   ");
            }

            else if(choice.equals(2)){
                System.out.println("Enter Centimeters");
                centi = myObj.nextFloat();
                float other = 2.54F;
                convert = centi / other;
                System.out.println("Centimeters: " + centi + " Inches: " + convert);
                System.out.println("   ");
            }

            else if(choice.equals(3)){
                exit = true;
            }

            else{
                System.out.println("Invalid Input");
            }
        }

        }
    public static void main(String[] args){
        convertingStuff();
    }
}