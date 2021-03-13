// Behavioral design pattern: Visitor
// додатковий функціонал для манекену і робота-військовика
// доречний, оскільки сам манекен чи роот не повинні перейматись перевіркою,
// чи відповідають вони усовам випуску
public interface Visitor {

    public boolean isStandardMannequin(Mannequin mannequin);

    public boolean isStandardArmyRobot(ArmyRobot armyRobot);
}
