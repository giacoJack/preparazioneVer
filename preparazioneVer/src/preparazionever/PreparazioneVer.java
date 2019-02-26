package preparazionever;

import java.util.Scanner;

public class PreparazioneVer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean error = false;
        while(!error){
            System.out.println("Cosa vuoi fare?");
            System.out.println("1 - Quali sono di docenti che ricevono in un determinato giorno");
            System.out.println("2 - Quando riceve un determinato docente");
            Scanner sc = new Scanner(System.in);
            int scelta = sc.nextInt();
            switch(scelta){
                case(1):{
                    System.out.println("Inserisci un giorno");
                    System.out.println("1 - Lunedì");
                    System.out.println("2 - Martedì");
                    System.out.println("3 - Mercoledì");
                    System.out.println("4 - Giovedì");
                    System.out.println("5 - Venerdì");
                    System.out.println("6 - Sabato");
                    break;
                }
                case(2):{

                    break;
                }
                default:{
                    error = true;
                }
            }
        }
        
    
        
    }
    
}