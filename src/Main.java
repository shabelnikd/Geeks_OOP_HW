
public class Main {
    public static void main(String[] args) {
        // Шаг 3
        Boss boss = new Boss();

        boss.setHealth(1000);
        boss.setDamage(60);
        boss.setDefence("Magic");

        System.out.printf("Boss Health: %d | Damage: %d | Defence: %s\n\n",
                boss.getHealth(),
                boss.getDamage(),
                boss.getDefence()
        );

        Hero[] heroes = createHeroes();
        // Вывод информации
        for (Hero hero : heroes) {
            System.out.printf("Hero Health: %d | Damage: %d | Superpower: %s\n",
                    hero.getHealth(),
                    hero.getDamage(),
                    hero.getSuperpower() != null ? hero.getSuperpower() : "None"
            );
        }

    }

    public static Hero[] createHeroes() {
        // Шаг 4
        Hero firstHero = new Hero("Magic", 250, 40);
        Hero secondHero = new Hero(220, 70);
        Hero thirdHero = new Hero("Kinetic", 230, 30);

        return new Hero[] { firstHero, secondHero, thirdHero };





    }
}