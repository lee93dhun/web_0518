package Day05;

import java.util.Scanner;

public class Day05_3 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// ����11 : for�ټ�() {    for()����{}  for()��{}  }
			/*
			  			*		i = 1	b = 1 2 3 4		s = 1 		
			  		   **		i = 2	b = 1 2 3		s = 1 2 	
			  		  ***		i = 3 	b = 1 2 		s = 1 2 3	
			  		 ****		i = 4 	b = 1			s = 1 2 3 4	
			  		*****		i = 5 	b = 			s = 1 2 3 4 5
			 							�ִ��ټ� - �����ټ�		s<=�����ټ� 
			 */
		int �ټ�3 = scan.nextInt();
		for( int i = 1 ; i<=�ټ�3 ; i++ ) {
			
			// �������
			for(int b = 1 ; b<=�ټ�3-i ; b++ ) {System.out.print(" ");}
				
			// ����� 
			for(int s = 1 ; s<=i ; s++ ) {System.out.print("*");}
			
			// �ٹٲ�
			System.out.println();
			
		}

		// ���� 12 :
			/*
			  		*****		i = 1		b =  			s = 1 2 3 4 5
			  		 ****		i = 2 		b = 1 			s = 1 2 3 4
			 		  ***		i = 3		b = 1 2 		s = 1 2 3
			  		   **		i = 4		b = 1 2 3		s = 1 2
			 			*		i = 5		b = 1 2 3 4		s = 1
			 								b<=i - 1		�ִ��ټ�-�����ټ�+1
			 */			
		int �ټ�4 = scan.nextInt();
		for( int i = 1 ; i<=�ټ�4 ; i++ ) {
			
			// �������
			for( int b = 1 ; b<=i-1 ; b++ ) { System.out.print(" ");}
			//�����
			for( int s = 1 ; s<=�ټ�4-i+1 ; s++ ) { System.out.print("*");}
			//�ٹٲ�
			System.out.println();
		}
		
		// ���� 13 :
			/*
			  			    *		i = 1 	b = 1 2 3 4		s = 1					2-1	= 1
			  			   ***		i = 2	b = 1 2 3		s = 1 2 3				4-1	= 3
			  			  ***** 	i = 3	b = 1 2 		s = 1 2 3 4 5 			6-1 = 5
			  			 *******	i = 4	b = 1 			s = 1 2 3 4 5 6 7		8-1 = 7
			  			*********   i = 5   b = 			s = 1 2 3 4 5 6 7 8 9 	10-1 = 9
											�ִ��ټ�-�����ټ�		�����ټ�*2-1
			 */
		int �ټ�5 = scan.nextInt();
		for( int i = 1 ; i<=�ټ�5 ; i++ ) {
			// ����
			for( int b = 1 ; b<=�ټ�5-i ; b++ ) { System.out.print(" ");}
			// �� 
			for( int s = 1 ; s<=i*2-1 ; s++ ) { System.out.print("*"); }
			// �ٹٲ�
			System.out.println();
		}
		// ���� 14 :
		/*
		  				1
		  			   222
		  			  33333
		  			 4444444
		  			555555555
		  		   66666666666

		 */
		int �ټ�6 = scan.nextInt();
		for( int i = 1 ; i<=�ټ�6 ; i++ ) {
			// ����
			for( int b = 1 ; b<=�ټ�5-i ; b++ ) { System.out.print(" ");}
			// �� 
			for( int s = 1 ; s<=i*2-1 ; s++ ) { System.out.print(i%10); }
			// �ٹٲ�
			System.out.println();
		}

		// ���� 15 :
		/*
		  		*********
		  		 *******
		  		  *****
		  		   ***
		  			*
		 */
		// ���� 16 :
		/*
		    		 *		
		    		***
		   		   *****
		  		  *******
		 		 *********
				 *********
		  		  *******
		  		   *****
		  		    ***
		  			 *
		  */
		// ���� 17 : �Է¾��� 
		/*
		
		  	*     *
		  	 *   *
		  	  * *
		  	   *
		      * *
		  	 *   *
		  	*     *    
		        
		 */
	
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
