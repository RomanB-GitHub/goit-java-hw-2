class NameEncoderDecoder {
    public String encode(String name) {
        String one = name.strip();
        String two = name.replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");
        return "NOTFORYOU" + two + "YESNOTFORYOU";

    }

    public String decode(String name) {
        String one = name.strip();
        String unmodification = name.replace("NOTFORYOU", "")
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a")
                .replace("YES", "");

        return unmodification;
    }

    public static void main (String[] args) {
        NameEncoderDecoder code = new NameEncoderDecoder();

        //Should be NOTFORYOUCr5bYESNOTFORYOU
        String makeCodeName = code.encode("Crab");
        System.out.println("code.encode\"Crab\" = " + code.encode("Crab"));

        //Should be Crab
        String makeDecodeName = code.decode("NOTFORYOUCrabYESNOTFORYOU");
        System.out.println("code.decode\"NOTFORYOUCr5bYESNOTFORYOU\" = " + code.decode("NOTFORYOUCr5bYESNOTFORYOU"));

        //Should be NOTFORYOU
        String makeDecodeName2 = code.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU");
        System.out.println("code.decode\"NOTFORYOUNOTFORYOUYESNOTFORYOU\" = " + code.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
    }
    

}
