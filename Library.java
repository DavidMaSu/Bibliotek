import java.util.ArrayList;

public class Library {
    final ArrayList<Book> bookList = new ArrayList<>();
    final private ArrayList<Loan> loanList = new ArrayList<>();
    final private ArrayList<Member> memberList = new ArrayList<>();

    public void addBook(Book bookNr) {
        bookList.add(bookNr);
    }

    public void addMember(Member member) {
        memberList.add(member);
    }

    public void addLoan(Loan loan) {
        loanList.add(loan);
    }

    public Book getBook(int bookID) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).ID() == bookID) {
                return bookList.get(i);
            }

        }
        return null;
    }

    public boolean isAvailable(int bookID) {
        for (int i = 0; i < loanList.size(); i++) {
            if (loanList.get(i).getBook().ID() == bookID) {
                return false;
            }

        }
        return true;
    }

    public Loan loansByMember(int MemberID) {
        for (int i = 0; i < loanList.size(); i++) {
            if (loanList.get(i).getMember().memberID() == MemberID) {
                return loanList.get(i);
            }

        }
        return null;
    }

    public void returnBook(int bookID) {
        for (int i = 0; i < loanList.size(); i++) {
            if (loanList.get(i).getBook().ID() == bookID) {
                loanList.remove(i);
                IO.println("Book returned");
            }
            else {
                IO.println("Book already in library");
            }
        }
    }

    public Member getMember(int memberID) {
        for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).memberID() == memberID) {
                return memberList.get(i);
            }

        }
        return null;
    }

    public boolean loanBook(int memberID, int bookID) {
        if (getMember(memberID) != null && getBook(bookID) != null) {
            if (isAvailable(bookID)) {
                Loan loan = new Loan(getMember(memberID), getBook(bookID));
                addLoan(loan);
                return true;
            }

        } else {
            return false;
        }

        return false;
    }

    public void inventory() {
        IO.println("Library Books:");
        for (int i = 0; i < bookList.size(); i++) {
            IO.println(bookList.get(i));
        }
    }
}



//    public Loan getLoan(int loanID) {
//        return loanList.get(loanID);
//    }
//
//    public Member getMember(int memberID) {
//        for (int i = 0; i < memberList.size(); i++) {
//            if (memberList.get(i) == memberID);
//
//    }
//
//
//    public void allMembers() {
//        for (int i = 0; i < memberList.size(); i++) {
//            IO.println(memberList.get(i));
//        }
//    }

