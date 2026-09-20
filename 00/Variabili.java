public class Variabili{
    // Scatole in cui inseriamo dei valori
    // Ogni variabile ha un peso in byte

    void main(){
        // Variabili numeriche
        int intero = 10; // peso 4 byte
        long interoLungo = 1000000000L; // peso 8 byte

        float decimale = 3.14f; // peso 4 byte
        double decimaleLungo = 3.141592653589793; // peso 8 byte

        byte bit8 = 127; // peso 1 byte
        short bit16 = 32767; // peso 2 byte

        // Variabili di testo
        char carattere = 'A'; // peso 2 byte
        String stringa = "Ciao"; // peso variabile sarebbe considerato come una sequenza di caratteri quindi non ha un peso fisso

        // Variabili booleane
        boolean veroFalso = true; // peso 1 byte (non un bit perché gli altri bit sono significativi o così non utilizzati)

        IO.println("Valore intero: " + intero);
        IO.println("Valore intero lungo: " + interoLungo);
        IO.println("Valore decimale: " + decimale);
        IO.println("Valore decimale lungo: " + decimaleLungo);
        IO.println("Valore bit8: " + bit8);
        IO.println("Valore bit16: " + bit16);
        IO.println("Valore carattere: " + carattere);
        IO.println("Valore stringa: " + stringa);
        IO.println("Valore booleano: " + veroFalso);

    }
}