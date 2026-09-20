public class For {
    void main(){
        // Il ciclo for è un ciclo con ripetizione limitata 
        // noi quando costruiamo un for abbiamo dei parametri e una condizione
        // creiamo una variabile index che sarà il nostro indice e la impostiamo a 0
        // dopo il primo ; c'è la condizione se index è minore di 10 io ripeto il ciclo
        // dopo il secondo ; c'è l'incemento di index se no il ciclo si ripeterebbe all'infinito
        for (int index = 0; index < 10; index++){
            IO.println("index: " + index);
        }
    }
}
