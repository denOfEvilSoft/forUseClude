import java.io.*;

public class Q8_2 {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:\\string.txt");
			in = new InputStreamReader(fin,"UTF-8");
			int c;
			System.out.println("인코딩 문자 집합은 "+ in.getEncoding());
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}
		catch(IOException ex) {
			System.out.println("입출력 오류");
		}
	}
}
