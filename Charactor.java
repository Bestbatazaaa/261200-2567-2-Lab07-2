public class Charactor {
    private int health;
    private int stamina;
    private final int maxhealth = 200;
    private final int maxstamina = 200;

    public Charactor(){
        this.health = maxhealth;
        this.stamina = maxstamina;
        System.out.println("Character created with " + health + " health and " + stamina +" stamina.");

    }

//    public Charactor(int health, int stamina){
//        this.health = health;
//        this.stamina = stamina;
//        System.out.println("Character created with " + health + " health and " + stamina +" stamina.");
//    }

    public void swingSword(){
        if (stamina > 0){
            this.stamina = this.stamina - 50;
        } else {
            this.stamina = 0;
        }

        System.out.println("Character swings sword. Stamina is now " + this.stamina + ".");

        if (stamina ==0){
            System.out.println("Your character needs to cool down.");
        }

    }

    public void takeDamage(int damage) {
        if (damage < 0) {
            System.out.println("Sorry but damage can't be a negative number");
        } else {
            if (this.health > 0) {
                this.health = this.health - damage;
            }
            if (this.health < 0) {
                this.health = 0;
            }

            System.out.println("Character takes " + damage + " damage. Health is now " + this.health + ".");


            if (this.health == 0) {
                System.out.println("Character is dead.");
            }
        }
    }

    public void rest(){
        this.health = maxhealth;
        this.stamina = maxstamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
        System.out.println("Character's health: " + maxhealth + ", stamina: " + maxstamina);
    }


}
