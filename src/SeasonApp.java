import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {

        askTheSeason();

    }

//metoda zbioracza z efetem dla pytajacego
    public static void askTheSeason() {
        String ask = askClient();
        Season answer = veryfication(ask);
        if (answer == null) {
            System.out.println( ask + "... nie ma takiej proy roku.");
        } else
            System.out.println(answer);
    }

//metoda do sprawdzania wskazanych danych
    private static Season veryfication(String ask) {
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
        return askSeason;
    }

//metoda do pobierania danych
    public static String askClient() {
        System.out.println("Podaj porę roku...");
        Scanner sc = new Scanner(System.in);
        String ask = sc.nextLine();
        return ask;
    }



    /*
//jedna długa metoda

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

              System.out.println(askSeason);

 */
/*
//zbędny switch

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
   */
}
