import java.io.*;
import java.util.*;
public class Q8_4 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		try {
			var fout = new FileWriter("c:\\javaString\\test.txt");
			while(true) {
				String line = sc.nextLine();
				if(line.length() == 0) {
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\n\n",0,2);
			}
			fout.close();
			sc.close();
		}
		catch(IOException ex) {
			System.out.println("입출력 오류");
		}
	}
}
