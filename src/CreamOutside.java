public enum CreamOutside {

    MASLANY("maślany"),
    SMIETANOWY("śmietanowy");

    private final String description;

    private CreamOutside(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static CreamOutside fromDescription(String description) {
        CreamOutside[] values = values();
        for (CreamOutside creamOutside : values) {
            if (creamOutside.getDescription().equals(description))
                return creamOutside;
        }
        return null;
    }
    public static CreamOutside fromOrdinal(int description){
        CreamOutside[] values = values();
        for (CreamOutside creamOutside : values){
            if(creamOutside.ordinal() == description)
                return creamOutside;
        }
        return null;
    }
}
