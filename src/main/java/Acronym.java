class Acronym {

    private final String acronym;

    Acronym(String phrase) {
        StringBuilder sbuf = new StringBuilder();
        String[] chunks = phrase.split("[\\s\\-]");
        for(String chunk: chunks){
            sbuf.append(chunk.charAt(0));
        }
        this.acronym = sbuf.toString().toUpperCase();
    }

    String get() {
        return this.acronym;
    }

}
