import java.util.Scanner;

public class Input {
    void main(){
        // dobbiamo creare uno scanner
        // che in pratica prende e scannerizza quello che viene inserito dell'utente e lo riporta
        Scanner in = new Scanner(System.in);

        // per le string
        IO.print("scrivi il tuo nome: ");
        String testo = in.nextLine();

        // per interi
        IO.print("\nscrivi un numero: ");
        int numero = in.nextInt();

        IO.println();

        System.out.printf("dati inseriti: %s %d",testo,numero);

        // poi infine bisogna chiudere lo scanner
        in.close();
    }
}
