public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character archer = new Character();

        archer.strength = 4;
        archer.agility = 8;
        archer.intelligence = 2;
        archer.name = "Monozi";
        archer.sayMyName();
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();


        Character priest = new Character();

        priest.strength = 5;
        priest.agility = 6;
        priest.intelligence = 10;
        priest.name = "Father Kervs";
        priest.sayMyName();
        priest.sayMyStrength();
        priest.sayMyAgility();
        priest.sayMyIntelligence();


    }
}
