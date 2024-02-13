package application.SubSystem;

public class Facade {
    private Facade(){}
    private static Facade facade;
    public static Facade getInstance(){
        if(facade == null){
            facade = new Facade();
        }
        return facade;
    }

    public  String convertToBinary(String inputString) {
        CharacterConverter characterConverter = new CharacterConverter();
        BinaryFormatter binaryFormatter = new BinaryFormatter();
        StringBuilder binaryString = new StringBuilder();
        char []chars = characterConverter.convert(inputString);
        for (char character : chars) {
            // Converte ogni carattere in rappresentazione binaria a 8 bit (codifica ASCII)
            String binaryRepresentation= binaryFormatter.format(character);
            binaryString.append(binaryRepresentation).append(" ");
        }

        return binaryString.toString().trim();
    }
    public String convertToHex(String string){
        String binaryString=convertToBinary(string);
        binaryString=binaryString.replaceAll("\\s","");

        while (binaryString.length() % 4 != 0) {
            binaryString = "0" + binaryString;
        }


        StringBuilder hexStringBuilder = new StringBuilder();

        HexFormatter hexFormatter=new HexFormatter();
        // Ciclo sui gruppi di 4 bit e converto in esadecimale
        for (int i = 0; i < binaryString.length(); i += 4) {
            hexStringBuilder.append(hexFormatter.convert4Byte(binaryString.substring(i, i + 4)));
        }

        return hexStringBuilder.toString();

    }


}
