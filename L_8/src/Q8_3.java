import java.io.*;
public class Q8_3 {
	public static void main(String[]args) {
		try {
			var fin = new FileInputStream("c:\\string.txt");
			var in = new InputStreamReader(fin, "UTF-8");
			int c;
			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}
	}
}
