package rpgGame;



public class Logic {

    public static void main(String[] args) {
        System.out.println("Lets start a game");
        Hero hero1 = new Hero();
        Weapon weapon1 = new Weapon();
        hero1.setAttack(45);
        hero1.setHealth(50);


        System.out.println("Are you ready for the adventure?");

    }
}

