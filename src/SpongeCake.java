public enum SpongeCake {

    CZEKOLADOWY("czekoladowy"),
    ZWYKLY("zwykły");

    private final String description;

    SpongeCake(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public static SpongeCake fromDescription(String description){
        SpongeCake[] values = values();
        for (SpongeCake spongeCake : values){
            if(spongeCake.getDescription().equals(description))
                return spongeCake;
        }
        return null;
    }

    public static SpongeCake fromOrdinal(int description){
        SpongeCake[] values = values();
        for (SpongeCake spongeCake : values){
            if(spongeCake.ordinal() == description)
                return spongeCake;
        }
        return null;
    }

}
