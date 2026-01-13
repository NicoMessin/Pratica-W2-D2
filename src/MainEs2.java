import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainEs2 {

    // Funzione 1
    public static List<Integer> generaListaCasuale(int N) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            lista.add(random.nextInt(101)); // 0 - 100
        }

        Collections.sort(lista);
        return lista;
    }

    // Funzione 2
    public static List<Integer> listaConInverso(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            nuovaLista.add(lista.get(i));
        }

        for (int i = lista.size() - 1; i >= 0; i--) {
            nuovaLista.add(lista.get(i));
        }

        return nuovaLista;
    }

    // Funzione 3
    public static void stampaPariDispari(List<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.println(lista.get(i));
            }
            if (!pari && i % 2 != 0) {
                System.out.println(lista.get(i));
            }
        }
    }

  // Main
    public static void main(String[] args) {

        List<Integer> lista = generaListaCasuale(5);
        System.out.println("Lista ordinata:");
        System.out.println(lista);

        List<Integer> listaDoppia = listaConInverso(lista);
        System.out.println("Lista con inverso:");
        System.out.println(listaDoppia);

        System.out.println("Valori in posizioni pari:");
        stampaPariDispari(listaDoppia, true);

        System.out.println("Valori in posizioni dispari:");
        stampaPariDispari(listaDoppia, false);
    }
}