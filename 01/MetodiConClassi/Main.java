package MetodiConClassi;

public class Main {
    void main(){
        int a = 10;
        int b = 15;

        IO.println("Somma di a + b: " + Operazioni.somma(a, b));
        IO.println("Sottrazione di a - b: " + Operazioni.sottrazione(a, b));
        IO.println("Divisione di a / b: " + Operazioni.divisione(a, b));
        IO.println("Prodtto di a * b: " + Operazioni.prodotto(a, b));
    }
}
