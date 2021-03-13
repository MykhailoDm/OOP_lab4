import java.util.List;
import java.util.Optional;

// Імплементовано Structural Design Pattern: Facade
public class Facade {

    // Створення манекену лише за допомогою додавання ліста Equipment з перевіркою на придатність -
    // повертає Optional, який буде empty, при непридатному манекені (недостатньо деталей або одна деталь є
    // зброєю)
    public Optional<Mannequin> createMannequin(List<Equipment> equipmentList){
        int size = equipmentList.size();
        if(size < 5){
            return Optional.empty();
        }

        MannequinBuilder mannequinBuilder = new MannequinBuilder();

        mannequinBuilder.setArmsEquipment(equipmentList.get(0));
        mannequinBuilder.setBackEquipment(equipmentList.get(1));
        mannequinBuilder.setHeadEquipment(equipmentList.get(2));
        mannequinBuilder.setLegsEquipment(equipmentList.get(3));
        mannequinBuilder.setTorsoEquipment(equipmentList.get(4));

        Mannequin mannequin = mannequinBuilder.getMannequin();

        Validator validator = new Validator();

        if (!validator.isStandardMannequin(mannequin)){
            return Optional.empty();
        }

        return Optional.of(mannequin);
    }

    // Створення робота-військового лише за допомогою додавання ліста Equipment з перевіркою на придатність -
    // повертає Optional, який буде empty, при непридатному роботі (недостатньо деталей або одна деталь не є
    // зброєю)
    public Optional<ArmyRobot> createArmyRobot(List<Equipment> equipmentList){
        int size = equipmentList.size();

        if(size < 5){
            return Optional.empty();
        }

        ArmyRobotBuilder armyRobotBuilder = new ArmyRobotBuilder();

        armyRobotBuilder.setArmsEquipment(equipmentList.get(0));
        armyRobotBuilder.setBackEquipment(equipmentList.get(1));
        armyRobotBuilder.setHeadEquipment(equipmentList.get(2));
        armyRobotBuilder.setLegsEquipment(equipmentList.get(3));
        armyRobotBuilder.setTorsoEquipment(equipmentList.get(4));

        ArmyRobot armyRobot = armyRobotBuilder.getArmyRobot();

        Validator validator = new Validator();

        if (!validator.isStandardArmyRobot(armyRobot)){
            return Optional.empty();
        }

        return Optional.of(armyRobot);
    }
}
