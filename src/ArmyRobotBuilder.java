// Дозволяє створювати об'єкт класу ArmyRobot поступово
public class ArmyRobotBuilder implements Builder{

    private Equipment arms;
    private Equipment head;
    private Equipment legs;
    private Equipment torso;
    private Equipment back;

    public ArmyRobot getArmyRobot(){
        return new ArmyRobot(arms,head,legs,torso,back);
    }

    @Override
    public void setArmsEquipment(Equipment arms) {
        this.arms = arms;
    }

    @Override
    public void setHeadEquipment(Equipment head) {
        this.head = head;
    }

    @Override
    public void setLegsEquipment(Equipment legs) {
        this.legs = legs;
    }

    @Override
    public void setTorsoEquipment(Equipment torso) {
        this.torso = torso;
    }

    @Override
    public void setBackEquipment(Equipment back) {
        this.back = back;
    }
}
