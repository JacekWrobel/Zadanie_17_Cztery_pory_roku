import java.util.Arrays;

public enum Season {
    SPRING("wiosna", new String[]{"kwi", "maj", "cze"}),
    SUMMER("lato", new String[]{"lip", "sie", "wrz"}),
    AUTUMN("jesień", new String[]{"paz", "lis", "gru"}),
    WINTER("zima", new String[]{"sty", "lut", "mar"});

    private String translation;
    String[] mont;

    Season(String translation, String[] mont) {
        this.translation = translation;
        this.mont = mont;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return  Arrays.toString(mont) ;
    }
}
