package arena;

public class Arena {
    private Player playerA;
    private Player playerB;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void fight() {
        Player attacker, defender;

        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerA.getHealth() <= playerB.getHealth()) {
                attacker = playerA;
                defender = playerB;
            } else {
                attacker = playerB;
                defender = playerA;
            }

            int attackRoll = Dice.roll();
            int defendRoll = Dice.roll();

            int attackDamage = attacker.getAttack() * attackRoll;
            int defendDamage = defender.getStrength() * defendRoll;

            int damage = attackDamage - defendDamage;
            if (damage > 0) {
                defender.setHealth(defender.getHealth() - damage);
            }

            System.out.println("Attacker: " + attacker + " rolled: " + attackRoll + " attack damage: " + attackDamage);
            System.out.println("Defender: " + defender + " rolled: " + defendRoll + " defend damage: " + defendDamage);
            System.out.println("Defender health: " + defender.getHealth());
        }

        System.out.println("Winner: " + (playerA.isAlive() ? "Player A" : "Player B"));
    }
}
