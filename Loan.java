import java.time.LocalDate;


public class Loan {
    final private Member borrowedBy;
    final private Book book;
    final private LocalDate borrowDate;
    final private LocalDate today = LocalDate.now();

    public Loan(Member borrowedBy, Book book) {
        this.book = book;
        this.borrowedBy = borrowedBy;
        this.borrowDate = LocalDate.now();

    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return borrowedBy;
    }

    public boolean isAvailable() {
        return borrowedBy == null;
    }

    public String toString() {
        return String.format("""
                                --- Book --- 
                                %s
                                borrowed by: 
                                %s
                                
                                Due by: %s
                                
                                Is overdue? %s
                                """, book,borrowedBy,getDueDate(),isOverDue());
    }

    public boolean isOverDue() {
        if (today.isAfter(getDueDate())) {
            return true;
        } else {
            return false;
        }
    }
    
    public LocalDate getDueDate() {
        if (!(borrowDate == null)) {
            return borrowDate.plusDays(14);
        }
        return null;
    }


}
