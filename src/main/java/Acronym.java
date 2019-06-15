public class Acronym {

    String phrase;

    public Acronym(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        String[] arr = phrase.split("[\\s-]");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append(Character.toString(arr[i].charAt(0)).toUpperCase());
        }
        return str.toString();
    }
}