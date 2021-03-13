// Перевіряє на придатність манекени та роботів-військових
public class Validator implements Visitor{


    @Override
    public boolean isStandardMannequin(Mannequin mannequin) {
        if (mannequin.getArms().isWeapon() || mannequin.getHead().isWeapon() || mannequin.getBack().isWeapon()
                || mannequin.getTorso().isWeapon() || mannequin.getLegs().isWeapon())
            return false;
        return true;
    }

    @Override
    public boolean isStandardArmyRobot(ArmyRobot armyRobot) {
        if (armyRobot.getArms().isWeapon() && armyRobot.getHead().isWeapon() && armyRobot.getBack().isWeapon()
                && armyRobot.getTorso().isWeapon() && armyRobot.getLegs().isWeapon())
            return true;
        return false;
    }
}
