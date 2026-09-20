public class While {
    void main(){
        // esegue l'azione sono se la condizione è verificata

        int x = 0;
        while(x!=10){
            IO.println(x);
            x++;
        }

        // prima viene eseguita l'azione poi se la condizione è verifica ripete 
        int x1 = 0;
        do{
            x1++;
        }while(x1!=10);

        int x2 = 0;
        while(true){
            if(x2 >= 10){
                break; // fermo il ciclo 
            }
            x2++;
        }
    }
}
