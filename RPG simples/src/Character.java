public class Character {

    protected String name;
    protected int strength; // protected torna o membro acessível às classes do mesmo pacote ou através de herança
    protected int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack (Character opponent) {
        System.out.println(this.name + " attacks " + opponent.getName() + "!");
        int damage = this.strength;
        opponent.receiveDamage(damage);
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " received " + damage + " damage. Remaining life: " + this.health);
        if (this.health <= 0) {
            System.out.println(this.name + " is defeated!");
        }
    }
        public boolean isAlive() {
            if (health <= 0) {
                System.out.println(name + " is defeated!");
                return false;
            } else {
                System.out.println(name + " is still alive with " + health + " health.");
                return true;
            }
        }

    }
