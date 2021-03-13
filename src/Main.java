import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // процес створення манекену чи робота, залежно від вибору
        try {
            System.out.println("Do you want to build a mannequin or an army robot?");
            String answer = scanner.nextLine();
            while (!areEqualIgnoreCase(answer, "mannequin") && !areEqualIgnoreCase(answer, "army robot")) {
                System.out.println("Please enter correct name.");
                answer = scanner.nextLine();
            }

            List<Equipment> equipmentList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the name of a piece of equipment number: " + (i + 1));
                String name = scanner.nextLine();

                System.out.println("Is it a weapon? (true/false)");
                boolean isWeapon = scanner.nextBoolean();
                scanner.nextLine();
                Equipment equipment = new Equipment(isWeapon, name);
                equipmentList.add(equipment);
            }

            Facade facade = new Facade();
            if (areEqualIgnoreCase(answer,"mannequin")){
                Optional<Mannequin> mannequin = facade.createMannequin(equipmentList);
                if (mannequin.isEmpty())
                    System.out.println("Your mannequin is not fit for commissioning.");
                else
                    mannequin.get().garmentCatalogue();
            } else {
                Optional<ArmyRobot> armyRobot = facade.createArmyRobot(equipmentList);
                if (armyRobot.isEmpty())
                    System.out.println("Your army robot is not fit for commissioning.");
                else
                    armyRobot.get().status();
            }
        } catch (InputMismatchException inputMismatchException){
            System.out.println("Erroneous input. Stopping execution.");
        }
    }

    public static boolean areEqualIgnoreCase(String first, String second){
        return first.compareToIgnoreCase(second) == 0;
    }
}