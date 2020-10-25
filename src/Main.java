import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        List<Cake> cakes = new LinkedList<>();
        final int exit = 0;
        int option = -1;
        Scanner sc = new Scanner(System.in);

        while (option != exit) {
            System.out.println("Dostepne opcje");
            System.out.println("1 - Dodawanie tortów");
            System.out.println("2 - Wyświetlanie tortów");
            System.out.println("3 - Dodawanie zamówień");
            System.out.println("4 - Wyswietlanie zamówień");
            System.out.println("0 - Wyjście");

            System.out.println("Wybierz opcję i naciśnij ENTER:");


            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Dodanie tortu");
                    System.out.println();

                    System.out.println("Podaj nazwę tortu");
                    String name = sc.nextLine();

                    // Dodawanie Biszkoptu
                    System.out.println("Podaj rodzaj biszkoptu:");
                    for (SpongeCake s : SpongeCake.values()) {
                        System.out.println("\t" + (s.ordinal() + 1) + "-" + s.getDescription());
                    }

                    System.out.println("Podaj numer");
                    int liczba = (sc.nextInt() - 1);
                    sc.nextLine();
                    SpongeCake rodzajBiszkoptu = SpongeCake.fromOrdinal(liczba);


                    // Dodawaie kremu na wewnątrz

                    System.out.println("Podaj rodzaj kremu wewnątrz:");
                    for (CreamInside c : CreamInside.values()) {
                        System.out.println("\t" + (c.ordinal() + 1) + "-" + c.getDescription());
                    }
                    System.out.println("Podaj numer");
                    liczba = (sc.nextInt() - 1);
                    sc.nextLine();
                    CreamInside kremWewnatrz = CreamInside.fromOrdinal(liczba);

                    // Dodawanie tynku

                    System.out.println("Podaj rodzaj tynku:");
                    for (CreamOutside c : CreamOutside.values()) {
                        System.out.println("\t" + (c.ordinal() + 1) + "-" + c.getDescription());
                    }

                    liczba = (sc.nextInt() - 1);
                    sc.nextLine();
                    CreamOutside kremNaZewnatrz = CreamOutside.SMIETANOWY.fromOrdinal(liczba);

                    //Numer figurki
                    System.out.println("Podaj numer firurki");
                    liczba = sc.nextInt();
                    sc.nextLine();
                    int numerFirurki = liczba;

                    System.out.println("Podaj ilość kawałków");
                    liczba = sc.nextInt();
                    sc.nextLine();
                    int iloscKawalkow = liczba;


                    Cake cake = new Cake(name, kremWewnatrz, kremNaZewnatrz, rodzajBiszkoptu, numerFirurki, iloscKawalkow);
                    cakes.add(cake);

                    System.out.println("==============================================");
                    break;
                case 2:
                    System.out.println("Wyswietlanie tortów");
                    System.out.println();

                    System.out.println("Twoje dostepne torty");
                    System.out.println();
                    System.out.println(cakes);
                    break;
                case 3:
                    System.out.println("Dodawanie zamówień");
                    System.out.println();
                    System.out.println("Podaj nazwę tortu który chcesz zamówić");

//                        private final List<MyClass> container = new ArrayList<MyClass>();
//
//                        public final MyClass search(params){
//                            for(MyClass storedObject: container){
//                                if(storedObject meets params){
//                                    return storedObject;
//                                }
//                            }
//                        }


//                    List<NewOrder> newOrders = new LinkedList<>();
//                    newOrders.add(0, null);
//
//                    String nazwaTortu = sc.nextLine();
//                    int count = 1;
//                    if (nazwaTortu.equals(cake.getName())) {
//                        count++;
//                        NewOrder newOrder = new NewOrder(count, cakes);
//                        newOrders.add(newOrder);
//                    }
//
//                    System.out.println(newOrders);
                    break;
                case 4:
                    System.out.println("Wyswietlanie zamówień");
                    System.out.println();

                    //NewOrder newOrder = new NewOrder(1,cakes);

                    break;
                case exit:
                    System.out.println("Zamykam program");
                    System.out.println();
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");
                    System.out.println();
            }
        }

    }
}
