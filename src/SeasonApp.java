import java.util.Arrays;
import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {

        askTheSeason();

    }

    public static void askTheSeason() {
        System.out.println("Podaj porę roku...");
        Scanner sc = new Scanner(System.in);
        String ask = sc.nextLine();
        Season askSeason = null;
        try {
             askSeason = Season.valueOf(ask);
        } catch (IllegalArgumentException e) {
            Season[] season = Season.values();
            for (Season s : season) {
                if (s.getTranslation().equalsIgnoreCase(ask)) {
            askSeason = s;
                }
            }
        }
        switch (askSeason) {
            case SPRING:
                System.out.println(Season.SPRING);
                break;
            case SUMMER:
                System.out.println(Season.SUMMER);
                break;
            case AUTUMN:
                System.out.println(Season.AUTUMN);
                break;
            case WINTER:
                System.out.println(Season.WINTER);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + askSeason);

        }
    }
}