package nested.test;

public class Library {          // 문제는 맵,리스트 특정도구를 쓰는게 아니라 만든 모음 배열을

    private Book[] books;       // 배열을 변수로
    private int bookCount;      // 북카운트

    public Library(int size) {
        books = new Book[size];     // 변수는 배열
        bookCount = 0;
    }

    public void addBook(String title, String author) {

        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }

    private static class Book {

        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
