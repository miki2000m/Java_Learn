public class Stampe {
    void main(){
        // stampa di un messaggio nel terminale

        // --------- Concanetatori uniscono più elementi l'importante che tra un elemento e l'altro c'è in + ---------
        // print -> non manda a capo (\n -> manda a capo) 
        IO.print("Ciao a tutti\n");

        // println -> manda a capo
        IO.println("Ciao a tutti");

        // --------- Formattatori ---------
        // TABELLA POSIZIONATORI
        // %d -> interi
        // %f -> decimali
        // %.xf -> decimali con x cifre dopo la virgola
        // %s -> stringhe
        // %c -> caratteri
        int numero = 10;
        System.out.printf("%d", numero); // stampa il numero 10

        String format = String.format("Il numero è: %d", numero); // stampa il numero 10
        IO.println(format);
    }
}