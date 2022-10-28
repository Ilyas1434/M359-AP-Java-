package Unit5.HeroVillainExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        SuperHero spiderman = new SuperHero("Spiderman", "Shooting webs", 100);
        System.out.println(spiderman.toString());

        Villain venom = new Villain("Venom", "Symbiote - black sludge", 150);
        System.out.println(venom.toString());
    }
    //Set up method header FIRST, then press /**, the Java Doc comments are setup
    /**
     * Simulate one battle between a SuperHero and a Villain, each will take on damage, regardless of
     * who wins/loses
     * @param hero
     * @param villain
     */
    public static void battle(SuperHero hero, Villain villain) {
        int heroStrength = hero.getSuperPower().getStrengthPower();
        int villainStrength = villain.getVillainPower().getStrengthPower();
        // if hero has more strength
        if(heroStrength > villainStrength) {
            // person with most strength has 75% chance of winning
            double battlePercent = Math.random(); // generate [0.0 to 1.0)
            if(battlePercent < 0.75) {
                // hero wins subtract 10 from hero strength
                heroStrength -= 10;
                hero.getSuperPower().setStrengthPower(heroStrength);
                villainStrength -= 25;
                villain.getVillainPower().setStrengthPower(villainStrength);
                // villain loses subtract 25 from villain strength
            }
            else {
                heroStrength -= 25;
                hero.getSuperPower().setStrengthPower(heroStrength);
                villainStrength -= 10;
                villain.getVillainPower().setStrengthPower(villainStrength);
            }
        }

        // else if hero and villain have = strength
        else if(heroStrength == villainStrength) {
            heroStrength -= (int)(Math.random()*15);
            hero.getSuperPower().setStrengthPower(heroStrength);
            villainStrength -= (int)(Math.random()*15);
            villain.getVillainPower().setStrengthPower(villainStrength);
        }
        else {
            double battlePercent = Math.random(); // generate [0.0 to 1.0)
            if(battlePercent < 0.75) {
                heroStrength -= 25;
                hero.getSuperPower().setStrengthPower(heroStrength);
                villainStrength -= 10;
                villain.getVillainPower().setStrengthPower(villainStrength);
            }
            else {
                heroStrength -= 10;
                hero.getSuperPower().setStrengthPower(heroStrength);
                villainStrength -= 25;
                villain.getVillainPower().setStrengthPower(villainStrength);
            }
        }
        // else the hero has less strength
    }
    


}
