package mn.validation.array;

import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.Size;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class TestPojo {

	private String[] stringArray = {"A", "B", "C"};

	private List<String> stringList = Arrays.asList("Do", "Re", "Mi");


	@Size(min=3)
	public String[] getStringArray() {
		return this.stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}

	@Size(min=3)
	public List<String> getStringList() {
		return this.stringList;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}

}
