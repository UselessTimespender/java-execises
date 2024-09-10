package stream_api;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import stream_api.BookAuthorSolutions.Author;
import stream_api.BookAuthorSolutions.Book;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookAuthorSolutionsTest {
    static Author alexPac = new Author("Alex Pac", new ArrayList<>());
    static Author josefTrimmer = new Author("Josef Trimmer", new ArrayList<>());
    static Author martaLane = new Author("Marta Lane", new ArrayList<>());

    static Book book1FromAlexPac = new Book("book1 from Alex Pac", 50, alexPac);
    static Book book2FromAlexPac = new Book("book2 from Alex Pac", 150, alexPac);
    static Book book3FromAlexPac = new Book("book3 from Alex Pac", 345, alexPac);
    static Book book1FromJosefTrimmer = new Book("book1 from Josef Trimmer", 70, josefTrimmer);
    static Book book1FromMartaLane = new Book("book1 from Marta Lane", 410, martaLane);
    static Book book2FromMartaLane = new Book("book2 from Marta Lane", 355, martaLane);
    static Book book3FromMartaLane = new Book("book3 from Marta Lane", 212, martaLane);

    static List<Author> authors = List.of(josefTrimmer, alexPac, martaLane);

    static {
        alexPac.books().add(book1FromAlexPac);
        alexPac.books().add(book2FromAlexPac);
        alexPac.books().add(book3FromAlexPac);
        josefTrimmer.books().add(book1FromJosefTrimmer);
        martaLane.books().add(book1FromMartaLane);
        martaLane.books().add(book2FromMartaLane);
        martaLane.books().add(book3FromMartaLane);
    }

    @Test
    void getAllBooksSortedByName() {
        var allBooksSortedByName = new BookAuthorSolutions().getAllBooksSortedByName(authors);
        var expectedResult = List.of(book1FromAlexPac,
                book1FromJosefTrimmer,
                book1FromMartaLane,
                book2FromAlexPac,
                book2FromMartaLane,
                book3FromAlexPac,
                book3FromMartaLane);
        assertThat(allBooksSortedByName).containsExactlyElementsOf(expectedResult);
    }

    @Test
    void getAllAuthorsWithBookPagesGreater100() {
        var allBooksSortedByName = new BookAuthorSolutions().getAllAuthorsWithBookPagesGreater100(authors);
        var expectedResult = List.of(martaLane);
        assertThat(allBooksSortedByName).containsExactlyInAnyOrderElementsOf(expectedResult);
    }
}