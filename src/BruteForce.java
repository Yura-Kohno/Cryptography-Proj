public class BruteForce {
    private static String ALFA = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!,.-? :\"";


    public static void bruteForce(String message) {

        for (int shift = 0; shift < 34; shift++) {
            String decryptedMessage = "";
            for (int i = 0; i < message.length(); i++) {
                char c = message.charAt(i);
                int index = ALFA.indexOf(c);

                if (index != -1) {
                    int shiftedIndex = (index - shift + ALFA.length()) % ALFA.length();
                    decryptedMessage += ALFA.charAt(shiftedIndex);
                } else {
                    decryptedMessage += c;
                }
            }
            System.out.println("Shift " + shift + ": " + decryptedMessage);
        }
    }
}
