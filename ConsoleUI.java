public class ConsoleUI {
    Library library = new Library();

    public ConsoleUI (Library library) {
        this.library = library;
    }

    public void run(){
        boolean running = true;
        while (running){
            showMenu();
            int choice = Integer.parseInt(IO.readln("Select Menu: "));
                switch (choice){
                    case 1 -> borrowBook();
                    case 2 -> returnBook();
                    case 3 -> showLoans();
                    case 0 -> running = false;
                    default -> IO.println("Invalid choice.");
                }

        }
    }

    private void showMenu() {
        IO.println();
        IO.println("1. Loan Book");
        IO.println("2. Return Book");
        IO.println("3. Show all current loans");
        IO.println("0. Exit");
        IO.println();
    }

    private void borrowBook (Loan loan) {

    }

    public void borrowBook(){
        library.inventory();
        int memberNumber = Integer.parseInt(IO.readln("Scan loaner ID "));
        // should check id is true from list
        int id = Integer.parseInt(IO.readln("Scan ID of book "));
        // should check id is true from list
        if(library.loanBook(memberNumber, id)){
            IO.println("You have borrowed:\n" + library.getBook(id));
        } else {
            IO.println("Error");
        }
    }

    public void returnBook(){
        library.inventory();
        int id = Integer.parseInt(IO.readln("Hvilken bog vil du returnere? "));
        library.returnBook(id);
    }

    public void showLoans(){
        int memberNumber = Integer.parseInt(IO.readln("Scan loaner ID: "));
        if (library.loansByMember(memberNumber) != null) {
            IO.println(library.loansByMember(memberNumber));
        } else {
            IO.println("");
            IO.println("No Active Loans.");
        }
    }
}
