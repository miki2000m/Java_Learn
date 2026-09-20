
public class Metodi {
    void main(){
        // se noi vogliamo una operazione che può essere usata più di una volta senza riscrivere da zero tutte le volte quella 
        // operazione usiamo i metodi 
        int a = 10;
        int b = 15;

        // per fare per esempio la somma di questi due dovremmo scrivere tutte le volte a + b e ed è bruttino da vedere quindi creiamo
        // un metodo che è fuori dalle graffe del main

        IO.println("Somma di a + b: " + somma(a, b));
        IO.println("Sottrazione di a - b: " + sottrazione(a, b));
        IO.println("Divisione di a / b: " + divisione(a, b));
        IO.println("Prodtto di a * b: " + prodotto(a, b));

        saluto("michael");
        salutoStandard();

        // come potete vedere questo è molto molto più bello di veder sempre tipo somma a+b e così avete un clean code
        // che un buon programmatore inanzitutto deve essere bravo a scrivere codice pulito 
    }

    // metodi
    // come potete vedere questo è un metodo e la costruzione è 
    // tipo e elmento che vogliamo che restituisca
    // nome
    // (parametri -> dati richiesti dal metodo come in questo caso 2 numeri)
    // return vuol dire che restituisce quella cosa
    static int somma(int n1, int n2){
        return n1 + n2;
    }

    static int sottrazione(int n1, int n2){
        return n1 - n2;
    }

    static double divisione(int n1, int n2){
        return (double) n1/n2;
    }

    static int prodotto(int n1, int n2){
        return n1 * n2;
    }

    // metodi void che non restituiscono niente ma fanno una azione tipo stampa etc
    static void saluto(String nome){
        IO.println("Ciao " + nome);
    }
    static void salutoStandard(){
        IO.println("Ciao");
    }
}
