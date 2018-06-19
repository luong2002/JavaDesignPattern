package toLowercaseDecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Tester {
	public static void main( String[] args ) {
		int c; 
		
		try {
			InputStream in = new LowerCaseInputStream( new BufferedInputStream( new FileInputStream( "readMe.txt" )));
			
			while( (c = in.read()) >= 0) {
				System.out.print((char)c);
			}
			in.close();
		}catch( IOException e) {
			e.printStackTrace();
		}
	}
}
