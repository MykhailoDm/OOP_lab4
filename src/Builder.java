// Інтерфейс для імплементація creational design pattern: Builder
// У даній програмі манекен і робот-військовий - це два різні класи з багатьма схожими полями,
// тому Builder є досить доречним
public interface Builder {

    void setArmsEquipment(Equipment arms);
    void setHeadEquipment(Equipment head);
    void setLegsEquipment(Equipment legs);
    void setTorsoEquipment(Equipment torso);
    void setBackEquipment(Equipment back);
}
