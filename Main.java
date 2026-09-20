void main() {

    // Load Data
    Library kongBib = new Library();
    ConsoleUI consoleUI = new ConsoleUI(kongBib);


    Book book1 = new Book("Frank Herbert", "Dune", "9781492072508", 1);
    Book book2 = new Book("J.R.R. Tolkien", "Fellowship of the ring", "9781492034566", 2);
    Book book3 = new Book("Ken Follet", "The Pillars of the Earth", "4531492072508", 3);
    Book book4 = new Book("Martin Jensen", "Kongens Hunde", "9264562072508", 4);

    Member Jonas = new Member("Jonas", 233);
    Member Peter = new Member("Peter", 543);
    Member Alice = new Member("Alice", 353);

    // Load data into lists

    kongBib.addMember(Jonas);
    kongBib.addMember(Peter);
    kongBib.addMember(Alice);

    kongBib.addBook(book1);
    kongBib.addBook(book2);
    kongBib.addBook(book3);
    kongBib.addBook(book4);

    consoleUI.run();

}

