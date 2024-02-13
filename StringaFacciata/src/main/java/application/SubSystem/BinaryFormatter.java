package application.SubSystem;

 class BinaryFormatter {
    // Metodo che formatta il codice del carattere trasformato in una rappresentazione binaria

     public String format(char character) {
         return String.format("%8s", Integer.toBinaryString((int) character))
                 .replace(' ', '0');
     }
}
