// Клас спорядження, що тримає своє ім'я та поле, що реєструє його як зброю
public class Equipment {
    private boolean isWeapon;
    private String name;

    public Equipment(boolean isWeapon, String name) {
        this.isWeapon = isWeapon;
        this.name = name;
    }

    public boolean isWeapon() {
        return isWeapon;
    }

    public void setWeapon(boolean weapon) {
        isWeapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
