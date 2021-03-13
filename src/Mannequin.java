// Клас Mannequin з приватними полями Equipment, геттерами,
// громізким конструктором, методом, що надає інформацію про манекен
public class Mannequin {

    private Equipment arms;
    private Equipment head;
    private Equipment legs;
    private Equipment torso;
    private Equipment back;

    public Mannequin(Equipment arms, Equipment head, Equipment legs, Equipment torso, Equipment back) {
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

    public void garmentCatalogue(){
        System.out.println("This mannequin displays: " + arms.getName() + ", " + head.getName() + ", "
                + legs.getName() + ", " + torso.getName() + ", "+ back.getName() + ", ");
    }
}
