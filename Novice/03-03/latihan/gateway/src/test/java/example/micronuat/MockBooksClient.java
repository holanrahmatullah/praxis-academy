package example.micronuat;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Body;
import io.reactivex.Flowable;
import javax.inject.Singleton;

import example.micronaut.Book;
import example.micronaut.BooksFetcher;

@Singleton
@Requires(env = Environment.TEST)
public class MockBooksClient implements BooksFetcher {
	@Override
	public Flowable<Book> fetchBooks() {

		return Flowable.just(new Book("1491950358", "Building Microservices"), 
			new Book("1680502395", "Release It!"), 
			new Book("0321601912", "Continuous Delivery:"));
		

	}
}