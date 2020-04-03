package mn.validation.array;

import javax.inject.Singleton;
import javax.validation.Valid;

@Singleton
public class PojoService {

	public void checkTestPojo(@Valid TestPojo input) {}
}
