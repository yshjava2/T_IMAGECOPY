import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Imagecopy 
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("D://���缮.jpg");
		
		byte arr[] = new byte[1024];
		
		/*==============
		 * �д� ������ �����ϸ�
		 ==============*/
		if(file.exists())
		{
			FileInputStream fi = new FileInputStream(file);
			BufferedInputStream buffi = new BufferedInputStream(fi);
						
			FileOutputStream fo = new FileOutputStream("D://test.jpg");
			BufferedOutputStream buffo = new BufferedOutputStream(fo);
			
			int i = 0;
			
			while( (i=buffi.read(arr)) != -1 )
			{				
				buffo.write(arr);				
			}			
						
			fi.close();
			fo.close();				
		}
		/*===========
		 * �д� ���� ����
		 ===========*/			
		else
		{
			System.out.println("������ �����ϴ�.");			
		}		
		
		
	}

	
}
