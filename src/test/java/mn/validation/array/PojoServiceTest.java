package mn.validation.array;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import javax.inject.Inject;
import javax.validation.ConstraintViolationException;

import org.junit.jupiter.api.Test;

import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
public class PojoServiceTest {

	@Inject
	PojoService pojoService;

	@Test
	public void testEverythingValid() {
		TestPojo pojo = new TestPojo();

		pojoService.checkTestPojo(pojo);
	}

	@Test
	public void testSmallListFailsValidation() {
		TestPojo pojo = new TestPojo();
		pojo.setStringList(Arrays.asList("One"));

		assertThrows(ConstraintViolationException.class, () -> {
			pojoService.checkTestPojo(pojo);
		});
	}

	@Test
	public void testSmallArrayFailsValidation() {
		TestPojo pojo = new TestPojo();
		pojo.setStringArray(new String[] {"One"});

		assertThrows(ConstraintViolationException.class, () -> {
			pojoService.checkTestPojo(pojo);
		});
	}
}
