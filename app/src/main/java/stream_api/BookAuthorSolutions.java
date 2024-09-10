package stream_api;

import java.util.List;

public class BookAuthorSolutions {

    public record Author(String name,  List<Book> books) {}

    public record Book(String name, int pages, Author author) {}

    /**
     * @return список книг всех авторов, отсортированных по имени книги
     */
    public List<Book> getAllBooksSortedByName(List<Author> authors) {
        return null;
    }

    /**
     * @return вывести список авторов, у которых каждая книга больше 100 страниц
     */
    public List<Author> getAllAuthorsWithBookPagesGreater100(List<Author> authors) {
        return null;
    }
}
