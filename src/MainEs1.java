import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MainEs1 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di parole:");
        int N = scanner.nextInt();
        scanner.nextLine();
        Set<String>paroleDiverse= new HashSet<>();
        Set<String>paroleDoppie = new HashSet<>();
        for (int i=0; i<N ; i++){
            System.out.println("Inserisci una parola:");
            String parola= scanner.nextLine();
            boolean aggiunta = paroleDiverse.add(parola);
            if (aggiunta== false){
                paroleDoppie.add(parola);
            }
        }
        System.out.println("Parole doppie:");
for (String p: paroleDoppie){
        System.out.println(p);}
        System.out.println("Numero di paorle diverse:");
        System.out.println(paroleDiverse.size());
        System.out.println("Parole diverse:");
for (String pDiv: paroleDiverse){
        System.out.println(pDiv);}
        scanner.close();
    }
}
