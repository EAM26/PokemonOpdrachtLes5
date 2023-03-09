public abstract class Pokemon {
    private String name;
    private int level;
    private int healthPoints;
    private int experiencePoints;

    public void eats() {
        System.out.println("I'm eating!");
    }

    public void speaks(String sentence) {
        System.out.println(sentence);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public Pokemon(String name, int level, int healthPoints, int experiencePoints) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
        this.experiencePoints = experiencePoints;
    }
}