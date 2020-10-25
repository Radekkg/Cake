public enum CreamInside {

    SMIETANOWYZOWOCAMI("śmietana z owocami"),
    SMIETANAZCZEKOLADA("śmietana z czekoladą"),
    SMIETANAZDODATKAMI("śmietana z dodatkami"),
    MASLANYCZEKOLADABIALA("maślany z białą czekoladą"),
    MASLANYCZEKOLADACIEMNA("maślany z ciemną czekolada");

    private final String description;

    CreamInside(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static CreamInside fromDiscription(String description) {
        CreamInside[] values = values();
        for (CreamInside creamInside : values) {
            if (creamInside.getDescription().equals(description))
                return creamInside;
        }
        return null;
    }
    public static CreamInside fromOrdinal(int description){
        CreamInside[] values = values();
        for (CreamInside creamInside : values){
            if(creamInside.ordinal() == description)
                return creamInside;
        }
        return null;
    }
}
