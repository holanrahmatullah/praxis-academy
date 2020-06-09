package example.micronaut;

/**
 * BooksFetcher
 */
/**
 * InnerBooksFetcher
 */
    import io.reactivex.Flowable;
    
/**
 * BooksFetcher
 */
public interface BooksFetcher {

    Flowable<Book> fetchBooks();
    
}