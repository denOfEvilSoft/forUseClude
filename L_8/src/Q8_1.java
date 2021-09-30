import java.io.*;
public class Q8_1 {
	public static void main(String[] args) {
		try {
			var fn = new FileReader("c:\\string.txt");
			int c;
			while((c = fn.read()) != -1) {
				System.out.print((char)c);
			}
			fn.close();
		}
		catch(IOException ex) {
			System.out.println("입출력 오류");
		}
	}
}
