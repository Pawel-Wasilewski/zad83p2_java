public class Main {
    public static void main(String[] args) {
        String haslo = "";
        String litery_s = "qwertyuiopasdfghjklzxcvbnm";
        String litery_d = "QWERTYUIOPASDFGHJKLZXCVBNM";

        while (haslo.length() != 24) {
            int losowa_litera = (int) (Math.random() * litery_s.length());
            double duza_or_mala =  Math.random();

            if (duza_or_mala >= 0.5) {
                haslo = haslo + litery_d.charAt(losowa_litera);
            } else {
                haslo = haslo + litery_s.charAt(losowa_litera);
            }
        }
        System.out.println(haslo);
    }
}