// Дозволяє створювати об'єкт класу Mannequin поступово
public class MannequinBuilder implements Builder{

    private Equipment arms;
    private Equipment head;
    private Equipment legs;
    private Equipment torso;
    private Equipment back;

    public Mannequin getMannequin(){
        return new Mannequin(arms,head,legs,torso,back);
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
