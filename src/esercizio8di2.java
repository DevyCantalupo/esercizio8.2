public class esercizio8di2 {
    public static void main(String[] args) {
        String nombre = "Devy";
        int nombreLength = nombre.length();

        if(nombreLength > 10){
            System.out.println("Lunghezza maggiore di 10");
        } else if(nombreLength < 10){
            System.out.println("Lunghezza minore di 10" );
        }else {
            System.out.println("Lunghezza pari a 10");
        }
    }
}
