import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class test {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Cake> cakeList = new ArrayList<>();
        ArrayList<Cake> listaPomocnicza1 = new ArrayList<>();

        List<NewOrder> orders1 = new ArrayList<>();


        cakeList.add(new Cake("1", CreamInside.MASLANYCZEKOLADACIEMNA, CreamOutside.SMIETANOWY, SpongeCake.CZEKOLADOWY, 1, 20));
        cakeList.add(new Cake("2", CreamInside.MASLANYCZEKOLADABIALA, CreamOutside.SMIETANOWY, SpongeCake.CZEKOLADOWY, 1, 20));
        cakeList.add(new Cake("3", CreamInside.SMIETANAZCZEKOLADA, CreamOutside.SMIETANOWY, SpongeCake.CZEKOLADOWY, 1, 20));
        cakeList.add(new Cake("4", CreamInside.SMIETANOWYZOWOCAMI, CreamOutside.SMIETANOWY, SpongeCake.CZEKOLADOWY, 1, 20));
        cakeList.add(new Cake("5", CreamInside.MASLANYCZEKOLADACIEMNA, CreamOutside.SMIETANOWY, SpongeCake.CZEKOLADOWY, 1, 20));
        cakeList.add(new Cake("6", CreamInside.SMIETANAZDODATKAMI, CreamOutside.SMIETANOWY, SpongeCake.CZEKOLADOWY, 1, 20));

        int numerTortu = -1;
        int exit = -1;
        int numerZamowienia = 0;
        while (exit != 0) {
            while (numerTortu != 0) {

                System.out.println("Lista tortów");
                System.out.println();
                System.out.println(cakeList);
                System.out.println();
                System.out.println("Podaj cyfer od 1 do 6 jakie torty chcesz zamowić");

                numerTortu = scanner.nextInt();
                scanner.nextLine();
                if (numerTortu != 0)
                    listaPomocnicza1.add(cakeList.get(numerTortu - 1));
            }
            ArrayList<Cake> listaPomocnicza2 = (ArrayList<Cake>) listaPomocnicza1.clone();
            listaPomocnicza1.clear();
            numerTortu = -1;
            orders1.add(new NewOrder(numerZamowienia, listaPomocnicza2));
            numerZamowienia++;
            System.out.println("Dodano zamowienie, 0 koczy dodawanie zamowien i wypisanie wszystkich");
            exit = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < numerZamowienia; i++) {
            System.out.println("===================");
            System.out.println(orders1.get(i));
        }


    }

}

