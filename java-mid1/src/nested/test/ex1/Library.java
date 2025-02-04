package nested.test.ex1;

public class Library {
    Book[] books;
    int count;

    private class Book
    {
        private String title;
        private String author;

        public Book(String title, String author)
        {
            this.title = title;
            this.author = author;
        }
    }

    public Library(int size)
    {
        books = new Book[size];
        count = 0;
    }

    public void addBook(String title, String author)
    {
        if (count < books.length) {
            books[count++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다");
        }
    }

    public void showBooks()
    {
        for (int i=0;i<count;i++)
        {
            System.out.println("제목: " + books[i].title + ", 저자명: " + books[i].author);
        }
    }
}
