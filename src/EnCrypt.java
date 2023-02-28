public class EnCrypt {



    public class CaesarCrypt {

        public CaesarCrypt() {
        }

        //41 + spec symbols -rus
        //  private static String ALFA = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя!,.-? :\"";
        //34 + spec symbols -eng

        //Add big letters
        private static String ALFA = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!,.-? :\"";



        public static String Crypt(String message, int shift) {

            //  message = message.toLowerCase();
            String encryptStr = "";
            for (int i = 0; i < message.length(); i++) {


                int pos = ALFA.indexOf(message.charAt(i));
                int encPos = (pos + shift) % 68;
                char encChar = ALFA.charAt(encPos);
                encryptStr += encChar;
            }

            return encryptStr;
        }

        public static String Decrypt(String message, int shift) {

            return Crypt(message, -shift);
        }


    }
}


