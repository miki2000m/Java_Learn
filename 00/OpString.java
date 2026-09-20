public class OpString {
    void main(){
        String stringa1 = "Ciao";
        String stringa2 = "Mondo";
        String stringa3 = stringa1 + " " + stringa2; // concatenazione di stringhe

        IO.println("Stringa 1: " + stringa1);
        IO.println("Stringa 2: " + stringa2);
        IO.println("Stringa concatenata: " + stringa3);

        // Operazioni sulle stringhe

        // Stampa di un determinato carattere che si trova in una posizione x cioè index
        int index = 0;
        IO.print(stringa1.charAt(index));

        // Controlliamo se una stringa è identica a un altra 
        if (stringa1.equals(stringa3)){
            IO.print("Queste 2 stringhe sono identiche");
        }
        else if (stringa1.equalsIgnoreCase(stringa3)){
            IO.print("Queste 2 stringhe sono identiche ma con differenze di maiuscole e minuscole");
        }
        else IO.print("Queste 2 stringhe sono diverse");

        /* 
         caso sconsigliato per oraratori ternari 
         if-eatch NO perché è brutto alla vista
         String resualt = (stringa1.equals(stringa3)) ? "Queste 2 stringhe sono identiche" : (stringa1.equalsIgnoreCase(stringa3) ? "Queste 2 stringhe sono identiche ma con differenze di maiuscole e minuscole" : "Queste 2 stringhe sono diverse");
         IO.print(resualt);
        */

        // Proviamo a prendere dei pezzi della string
        int index1 = 2;
        int index2 = 4;
        String result = stringa1.substring(index1, index2);

        IO.print("La sottostringa di " + stringa1 + " che va dall'indice " + index1 + " all'indice " + index2 + " è: " + result);
    }
}
