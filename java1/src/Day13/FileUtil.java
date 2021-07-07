package Day13;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	
	// ����Ʈ�� ���Ͽ� ���� �޼ҵ� 
	public static void writefile( String dir , String filename , List< user> userlist ) throws Exception {
								// 1. ���ϰ��		// 2. �����̸�  	3. ����Ʈ[������]
		// 1. ���ϰ�� ����Ȯ��
		File dirent = new File(dir);
		if( dirent.exists() ) { // �ش� ���[����]�� ������ 
			dirent.mkdir(); // ���� ���� �޼ҵ� 
		}
		// 2. ���� ��üȭ 
		File file = new File( dir , filename );
							// ��� , ���ϸ� 
		OutputStream outputStream = new BufferedOutputStream( new FileOutputStream(file));
		
		// 3. ���� ���� 
		 	// for( int i = 0 ; i<userlist.size() ; i++ ) {}
		// for�� list Ȱ��   :  for( �ӽð�ü : ����Ʈ�� ) : ����Ʈ�� ��ü����ŭ �ϳ��� ����
		for( user temp : userlist ) {
			
			// 1. ȸ������ �ϳ��� ���ڿ��� ��� [ �ʵ� ���� , ȸ������ \n ]
			String outstring = temp.getId() +","+temp.getPassword()+","+temp.getName()+"\n";
			// 2. ȸ�� ���Ͼ��� 
			byte[] b = outstring.getBytes(); // ���ڿ� => ����Ʈ ����
			outputStream.write(b); // ���� ���� 
		}
		// 4. ��Ʈ�� �ʱ�ȭ 
		outputStream.close();
	}
	
			
	// ������ �о�ͼ� ����Ʈ ���� 
	public static ArrayList<user> readReader( Reader reader ) throws Exception{
		
		BufferedReader bufferedReader = new BufferedReader(reader);
		ArrayList<user> userlist = new ArrayList<>();
		String line;
		// �о���� 
		while( ( line = bufferedReader.readLine() ) !=null ) {
									// .readLine() : �� �پ� �о���� [ \n ���� ] 
									// .read() : �� ���ھ� �о���� 
			// �о�� �� ���� 
			String[] b = line.split(","); // �о�� ������ , �������� ���� => b[0]:���̵�  b[1]:��й�ȣ  b[2] : �̸�
							// ���ڿ�.split("���ع���") : ���ع��� �������� ���� 
			// user ��ü�� ��� 
			user temp = new user( b[0] , b[1] , b[2] );
			// ��ü�� ����Ʈ ��� 
			userlist.add(temp);
		}
		bufferedReader.close(); // ���� �ݱ� 
		return userlist;
		
	}
	// ���� �о���� �޼ҵ� 
	public static ArrayList<user> readfile( File file ) throws Exception{ 
				// ��ȯŸ��
		
		FileReader fileReader = new FileReader(file);
		ArrayList<user> userlist = new ArrayList<>();
		
		userlist = readReader(fileReader);
		
		fileReader.close();
		return userlist;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
