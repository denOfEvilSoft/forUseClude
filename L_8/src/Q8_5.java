import java.io.*;
public class Q8_5 {
	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try {
			var fout = new FileOutputStream("c:\\javaString\\string.out");
			for(int i =0; i<b.length; i++) {
				fout.write(b[i]);
			}
			fout.close();
		}
		catch(IOException e) {
			System.out.println("c:\\javaString\\string.out �� ������ �� �������ϴ�. ��θ��� Ȯ�����ּ���");
			return;
		}
		System.out.println("c:\\stringJava\\string.out �� �����Ͽ����ϴ�");
	}
}