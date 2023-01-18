package lesson07;

public class SoldierFactory {
    public static void main(String[] args) {
        // creating an instance of Soldier
        Soldier mySoldier = new Soldier();
        mySoldier.health = 5; // directly manipulating the state

        // testing our new constructor
        Soldier femaleSoldier = new Soldier('F');
    }
}
