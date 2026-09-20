public record Book(String author, String title, String ISBN, int ID) {
    @Override
    public String toString() {
        return String.format("""
                Title: \t\t %s 
                Author: \t %s
                ISBN Nr: \t %s
                ID: \t\t %d
                """, author, title, ISBN, ID);

    }
}
