package application.SubSystem;

 class HexFormatter {
    public char convert4Byte(String fourBits) {
        int decimalValue = Integer.parseInt(fourBits, 2);
        return Integer.toHexString(decimalValue).charAt(0);
    }
}
