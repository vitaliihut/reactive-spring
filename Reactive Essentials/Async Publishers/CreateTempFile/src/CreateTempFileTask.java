import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;

import java.util.concurrent.Callable;
import reactor.core.publisher.Mono;

public class CreateTempFileTask {

	public static Mono<File> createTempFile(String prefix, String suffix) {
		Callable<File> callable = () -> File.createTempFile(prefix, suffix);
		return Mono.fromCallable(callable);
	}
}