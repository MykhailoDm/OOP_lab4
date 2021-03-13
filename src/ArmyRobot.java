// Клас ArmyRobot з приватними полями Equipment, геттерами,
// громізким конструктором, методом, що надає інформацію про робота
public class ArmyRobot {

    private Equipment arms;
    private Equipment head;
    private Equipment legs;
    private Equipment torso;
    private Equipment back;

    public ArmyRobot(Equipment arms, Equipment head, Equipment legs, Equipment torso, Equipment back) {
        this.arms = arms;
        this.head = head;
        this.legs = legs;
        this.torso = torso;
        this.back = back;
    }

    public Equipment getArms() {
        return arms;
    }

    public Equipment getHead() {
        return head;
    }

    public Equipment getLegs() {
        return legs;
    }

    public Equipment getTorso() {
        return torso;
    }

    public Equipment getBack() {
        return back;
    }

    public void status(){
        System.out.println("The following equipment is found working fine: " + arms.getName() + ", "
                + head.getName() + ", "+ legs.getName() + ", "+ torso.getName() + ", "+ back.getName() + ".");
    }
}
