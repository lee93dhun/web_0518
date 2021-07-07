package domain;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.util.ArrayList;

public class FileUtil {
	
	// ���Ͽ��� ������ ��������
	public static ArrayList<Member> readfile( File file ){
											// 1. ������ �μ��� �ޱ� 
		try {
			FileReader fileReader = new FileReader(file);
						// 2. �ش� ������  fileReader ��ü�� �ֱ� 
			BufferedReader bufferedReader = new BufferedReader(fileReader);
						// 3. ���� Ŭ������  filfeReader ��ü�� �ֱ� 
			ArrayList<Member> members = new ArrayList<>();
			String line;
			while(  ( line = bufferedReader.readLine() ) != null ) {
						// 4. ���ۿ��� ���پ� �о���� [ readLine() ] 	
				String[] b = line.split(",");
						// 5. �о�� ���ٿ��� , �� �����ϱ� 
				Member temp = new Member(b[0], b[1], b[2], b[3] );
						// 6. ���ص� �����ͷ� ȸ����ü �����
				members.add(temp);
						// 7. ȸ����ü ����Ʈ ��� 
			}
			bufferedReader.close();
			fileReader.close();
			
			return members; // 8. ���� ���� ����Ʈ�� ��ȯ
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;  // ���� �߻��� null ��ȯ 
	}
	
	
	// ����Ʈ�� ���Ϸ� �ֱ� 
		// 1. String -> stream[ �ܺ���ġ�� ������ ���� ] 
		// 2. stream : �̵����� : ����Ʈ���� 
	
	public static void writefile( String dir , String filename , ArrayList<Member> memberlist ) {
									// 1.���ϰ��		2. ���ϸ� 		3. ������ ����Ʈ 
		
		// 1. ���ϰ�� ���� Ȯ�� 
		File file = new File(dir); // ��θ� ����Ŭ������ �ֱ� 
		if( file.exists() ) { // ��ΰ� ������ 
			file.mkdir();	// �ش� ��ο� ���� ���� 
		}
		File file2 = new File( dir , filename ); // ��ο� �ִ� �ش� ���� �������� 
		try {
			OutputStream outputStream = new BufferedOutputStream( new FileOutputStream(file2) );
			for( Member temp : memberlist ) {
				
				// 1. ��ü�� �ʵ� ����
				String out = temp.getId() + "," + temp.getPassword() + "," + temp.getName() +"," + temp.getEmail()+"\n";
				// 2. ����Ʈ�� ��ȯ 
				byte[] b = out.getBytes();
				// 3. ����Ʈ �������� 
				outputStream.write(b);
				
			} // ��� ����Ʈ�� ��ü�� �������� ����
			outputStream.close(); // ��Ʈ�� ���� 
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
