import java.util.Scanner;

public class Auto {
    // Definiëren: Variabelen
    static Scanner invoer = new Scanner(System.in);
    private int snelheid = 100;
    private String merk = "Toyota";
    private int kilometerstand = 12000;
    // Einde Definiëren: Variabelen

    public static void main(String[] args) { // Main

        Auto auto = new Auto();
        System.out.print("\nSnelheid: " + auto.snelheid);
        System.out.print("\nMerk: " + auto.merk);
        System.out.print("\nKilometerstand: " + auto.kilometerstand);
        System.out.println();
        Auto.motorGegevens();

        System.out.print("\n―――――――――――――――――――――――――\n");
        Auto Tesla = new Auto("Tesla", 180, 22000);
//        Tesla.setMerk("Tesla");
        System.out.print("\nSnelheid: " + Tesla.snelheid);
        System.out.print("\nMerk: " + Tesla.merk);
        System.out.print("\nKilometerstand: " + Tesla.kilometerstand);
        System.out.println();
        Auto.motorGegevens();

        System.out.print("\n―――――――――――――――――――――――――\n");
        System.out.print("\nVoer merk in: ");
        String invoerMerk = invoer.nextLine();

        System.out.print("\nVoer snelheid als getallen in: ");
        boolean checkInvoer = false;
        int invoerSnelheid = 0;
        while (!checkInvoer) {
            try {
                invoerSnelheid = Integer.parseInt(invoer.nextLine());
                checkInvoer = true;
            } catch (NumberFormatException e) {
                System.out.print("\nIk zei toch dat je als getallen moest invoeren! Voer nogmaals snelheid als getallen in: ");
                checkInvoer = false;
            }
        }

        checkInvoer = false;

        System.out.print("\nVoer kilometerstand als getallen in: ");
        int invoerKilometerStand = 0;
        while (!checkInvoer) {
            try {
                invoerKilometerStand = Integer.parseInt(invoer.nextLine());
                checkInvoer = true;
            } catch (NumberFormatException e) {
                System.out.print("\nZucht, nogmaals, gaarne als getallen invoeren! Voer nogmaals kilometerstand als getallen in: ");
                checkInvoer = false;
            }
        }

        Auto autoInvoer = new Auto(invoerMerk, invoerSnelheid, invoerKilometerStand);

        System.out.print("\nSnelheid: " + autoInvoer.snelheid);
        System.out.print("\nMerk: " + autoInvoer.merk);
        System.out.print("\nKilometerstand: " + autoInvoer.kilometerstand);
        System.out.println();
        Auto.motorGegevens();


    } // Einde Main

//    public Auto() {
//        snelheid = 0;
//        merk = "Toyota";
//        kilometerstand = 20000;
//    }


    public Auto() {
        this.merk = merk;
        this.snelheid = snelheid;
        this.kilometerstand = kilometerstand;
    }


    // Constructor Auto
    public Auto(String merk, int snelheid, int kilometerstand) {
        this.merk = merk;
        this.snelheid = snelheid;
        this.kilometerstand = kilometerstand;

//        System.out.print("\nVoer merk in: ");
//        this.merk = invoer.nextLine();

//        setMerk("merk");
    } // Einde Constructor Auto




    // Definiëren: motorGegevens
    public static String motorGegevens() {
        String motorGegevens = "Motor: Colombo V12 580 pk 980 kilo 3,8 liter";

        System.out.println(motorGegevens);

        return motorGegevens;
    } // Einde motorGegevens

    // Definiëren: Accessor & Mutator: snelheid
    public void setSnelheid(int snelheid) { // Accessor: snelheid
        this.snelheid = snelheid;
    }

    public int getSnelheid() { // Mutator: snelheid
        return snelheid;
    } // Einde Definiëren: Accessor & Mutator: snelheid


    // Definiëren: Accessor & Mutator: merk
    public String getMerk() { // Accessor: merk
        return merk;
    }

    public void setMerk(String merk) { // Mutator: merk
        this.merk = merk;
    } // Einde Definiëren: Accessor & Mutator: merk


    // Definiëren: Accessor & Mutator: kilometerstand
    public int getKilometerstand() { // Accessor: kilometerstand
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) { // Mutator: kilometerstand
        this.kilometerstand = kilometerstand;
    } // Instellen: Accessor & Mutator: kilometerstand
}

