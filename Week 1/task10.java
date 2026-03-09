static String secondWordUpper(String str) {
    String[] words = str.split(" ");
    if (words.length < 2) return "LESS";
    return words[1].toUpperCase();
}
