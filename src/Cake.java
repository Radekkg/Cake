public class Cake {
    private String name;
    private CreamInside creamInside;
    private CreamOutside creamOutside;
    private SpongeCake spongeCake;
    private int figurine;
    private int numberOfServings;

    public Cake() {
    }

    public Cake(String name, CreamInside creamInside, CreamOutside creamOutside, SpongeCake spongeCake, int figurine, int numberOfServings) {
        this.name = name;
        this.creamInside = creamInside;
        this.creamOutside = creamOutside;
        this.spongeCake = spongeCake;
        this.figurine = figurine;
        this.numberOfServings = numberOfServings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreamInside getCreamInside() {
        return creamInside;
    }

    public void setCreamInside(CreamInside creamInside) {
        this.creamInside = creamInside;
    }

    public CreamOutside getCreamOutside() {
        return creamOutside;
    }

    public void setCreamOutside(CreamOutside creamOutside) {
        this.creamOutside = creamOutside;
    }

    public SpongeCake getSpongeCake() {
        return spongeCake;
    }

    public void setSpongeCake(SpongeCake spongeCake) {
        this.spongeCake = spongeCake;
    }

    public int getFigurine() {
        return figurine;
    }

    public void setFigurine(int figurine) {
        this.figurine = figurine;
    }

    public int getNumberOfServings() {
        return numberOfServings;
    }

    public void setNumberOfServings(int numberOfServings) {
        this.numberOfServings = numberOfServings;
    }




    @Override
    public String toString() {
        return "\nSkład tortu " + name + "{\n" +
                "\t krem w środku : " + creamInside.getDescription()+ "\n"+
                "\t tynk : " + creamOutside.getDescription()+ "\n" +
                "\t biszkopt : " + spongeCake.getDescription()+ "\n" +
                "\t numer figurki : " + figurine+ "\n" +
                "\t liczba kawałków : " + numberOfServings +
                " }";
    }
}
