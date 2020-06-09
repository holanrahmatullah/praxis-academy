package kasus;

import io.reactivex.Flowable;

public interface BooksFetcher {
    Flowable<Book> fetchBooks();
}