public class Main {
    public static void main(String[] args) {
        String haslo = "";
        String litery_s = "qwertyuiopasdfghjklzxcvbnm";
        String litery_d = "QWERTYUIOPASDFGHJKLZXCVBNM";

        while (haslo.length() != 24) {
            int losowa_litera = (int) (Math.random() * litery_s.length());
            haslo = haslo + litery_s.charAt(losowa_litera);
        }
        System.out.println(haslo);
    }
}