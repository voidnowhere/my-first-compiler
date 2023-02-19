package compilation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Compiler compiler = new Compiler(new FileInputStream("C:\\code.txt"));
		try {
			compiler.S();
		}
		catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
