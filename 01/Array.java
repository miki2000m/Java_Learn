public class Array {
    void main(){
        // un array è sostanzialmente una lista o una grande scatola che contiene altre piccole scatole
        // tipo[] nome = new tipo[lunghezza] o {elementi da inserire}
        int[] array = new int[10];
        int[] array2 = {1,2,3,4,5,6};

        // per stampare un Array a livello logico
        // così scorriamo usando la lunghezza dell'array, l'array stesso
        for(int i = 0; i < array2.length; i++){
            // gli array cominciano a contare da indice 0
            
            // questa stampa dice 
            // stampa -> index: (variabile che fa da indice) poi stampa elemnt: (il valore dell'array all'indie i)
            IO.println("index: " + i + " element: " + array2[i]);
        }

        // questo for qua sopra è più carino scriverlo così 
        // perché il concetto di scorrere gli elementi è lo stesso ma il modo in cui viene scritto il for è diverso 
        for(int numero: array2){
            // in questo caso non esiste un indice c'è solo l'elemento 
            // perché in questo caso numero è il numero x di array partendo dal primo e scorrendolo sempre dal primo elemento 
            // BigO -> BigO(n) -> più numeri ci sono più è lungo
            IO.println("elemento: " + numero);
        }
    }
}
