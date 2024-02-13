package application.SubSystem;

 class CharacterConverter {
    // Metodo che restituisce il codice del carattere

     public char[] convert(String inputString) {
         char[] chars = new char[inputString.length()];
         for (int i = 0; i < inputString.length(); i++) {
             chars[i] = inputString.charAt(i);
         }
         return chars;
     }
 }
