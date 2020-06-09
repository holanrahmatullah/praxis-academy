package example.micronaut;

/**
 * InventoryClient
 */
import io.micronaut.http.client.annotation.Client;
import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Get;
import io.reactivex.Maybe;

/**
 * InventoryClient
 */
@Client("inventory")
@Requires(notEnv = Environment.TEST)
public interface InventoryClient extends InventoryFetcher {

	@Override
    @Get("/api/inventory/{isbn}")
    Maybe<Integer> inventory(String isbn);
}