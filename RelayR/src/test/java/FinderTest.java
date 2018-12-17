import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class FinderTest extends TestCase {
	// add getters and setters
	String[] input, expected;
	String search;

	@Before
	public void setUp() throws Exception {
		// setting up in individual cases
		input = new String[]{}; 
		expected = new String[]{};
		search = new String();
	}

	@After
	public void tearDown() throws Exception {
		 
	}

	// empty array search, null pointer case
	@Test
	public void testNull() {
		search = "any";
		Finder f = new Finder(input);
		assertArrayEquals(expected,f.find(search));
	}
	
	// array with single value case
	@Test
	public void testSingleValue() {
		input = new String[] {"asd"};
		search = "sad";
		expected = new String[] {"asd"};
		Finder f = new Finder(input);
		assertArrayEquals(expected, f.find(search));
	}
	
	// array with multiple value case
	@Test
	public void testMultipleValue() {
		input = new String[] {"asd","apple","pine","rose","god","car","alp","rod","ode","fog","old","dog"};
		search = "ogd";
		expected = new String[] {"dog","god"};
		Finder f = new Finder(input);
		String[] output = f.find(search);
		Arrays.sort(expected);
		Arrays.sort(output);
		assertArrayEquals(expected, output);
	}
	
	// multi value array with numeric digits case
	@Test
	public void testNumericString() {
		input = new String[] {"123","321","231","132","a2d","d12"};
		search = "321";
		expected = new String[] {"321","123","231","132"};
		Finder f = new Finder(input);
		String[] output = f.find(search);
		Arrays.sort(expected);
		Arrays.sort(output);
		assertArrayEquals(expected, output);
	}
	
	//  Large array initialization, performance
	@Test
	public void testLargeArray() throws IOException {
		//load data from file (~50k words)
		ArrayList<String> input = new ArrayList<String>();
		Path p = Paths.get("");
		String unix="/src/main/resources/";
		String win="\\src\\main\\resources\\";
		String os=System.getProperty("os.name");
		String FilePath = p.toAbsolutePath().toString() + (os.contains("windows")? win : unix) + "largeArray.txt";
		BufferedReader br = new BufferedReader(new FileReader(FilePath));
		String line;
		while((line=br.readLine())!=null)
			input.add(line.trim());
		br.close();
		search = "true";
		String[] inp = input.toArray(new String[0]);
		Finder f = new Finder(inp);
		String[] output = f.find("ccoonnlusi");
		expected = new String[] {"conclusion"};
		Arrays.sort(output);
		Arrays.sort(expected);
		System.out.println(Arrays.toString(output));
		assertArrayEquals(expected, output);
	}

}
