import java.io.*;
public class Q8_6 {
	public static void main(String[] args) {
		byte b[] = new byte[6];
		try {
			var fin = new FileInputStream("c:\\javaString\\string.out");
			int n = 0, c;
			while((c=fin.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("c:\\javaString\\string.out ���� ���� �迭�� ����մϴ�.");
			for(int i=0; i<b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			fin.close();
		}
		catch(IOException e) {
			System.out.println("c:\\javaString\\test.out ���� ���� ���߽��ϴ�. ��θ��� üũ�غ�����");
		}
	}
}
