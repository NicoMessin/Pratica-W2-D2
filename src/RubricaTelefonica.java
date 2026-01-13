import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {


    private HashMap<String, String> contatti = new HashMap<>();


    public void inserisciContatto(String nome, String telefono) {
        contatti.put(nome, telefono);
        System.out.println("Contatto inserito: " + nome + "  " + telefono);
    }


    public void cancellaContatto(String nome) {
        if (contatti.containsKey(nome)) {
            contatti.remove(nome);
            System.out.println("Contatto eliminato: " + nome);
        } else {
            System.out.println("Contatto non trovato: " + nome);
        }
    }


    public String cercaPersona(String numero) {
        for () {

            }
        }
        return null;
    }


    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();


        rubrica.inserisciContatto("Mario Rossi", "123456789");
        rubrica.inserisciContatto("Luigi Bianchi", "987654321");
        rubrica.inserisciContatto("Anna Verdi", "555123456");

        System.out.println();


        String persona = rubrica.cercaPersona("987654321");
        if (persona != null) {
            System.out.println("Il numero 987654321 appartiene a: " + persona);
        } else {
            System.out.println("Numero non trovato.");
        }

        System.out.println();


        rubrica.cancellaContatto("Mario Rossi");


        persona = rubrica.cercaPersona("123456789");
        if (persona != null) {
            System.out.println("Il numero 123456789 appartiene a: " + persona);
        } else {
            System.out.println("Numero 123456789 non trovato (cancellato).");
        }
    }
}