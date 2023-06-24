package textprocessingconsoleserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This class will parse the translated text to the variable
 * where it will be sent back to client for display based on the input received
 * and the selected target language 
 * (Bahasa Malaysia, Arabic and Korean) from client request.
 * 
 * @author Umairah Hamir
 */

public class TextTranslate {
	/*
	 * This method mainly create data to ready for translation
	 * 
	 */
	public void createData()
	{
			// Declaration of target storage
			String MalayStorage = "Malay.txt";
			String ArabicStorage = "Arabic.txt";
			String KoreanStorage = "Korean.txt";
			
			// Declaration of stream objects to write data to  the target storage
			FileOutputStream fileOutputStreamBahasaMalaysia; 
			FileOutputStream fileOutputStreamArabic; 
			FileOutputStream fileOutputStreamKorean; 
			
			DataOutputStream dataOutputStreamBahasaMalaysia; 
			DataOutputStream dataOutputStreamArabic; 
			DataOutputStream dataOutputStreamKorean; 
			
			try
			{
				// write in Bahasa Malaysia
				// create stream to write Bahasa Malaysia translated text to the Bahasa Malaysia text storage
				fileOutputStreamBahasaMalaysia = new FileOutputStream(MalayStorage);
				dataOutputStreamBahasaMalaysia = new DataOutputStream(fileOutputStreamBahasaMalaysia);
				
				// write the data
				dataOutputStreamBahasaMalaysia.writeUTF("Selamat pagi");
				dataOutputStreamBahasaMalaysia.writeUTF("Selamat malam");
				dataOutputStreamBahasaMalaysia.writeUTF("Apa khabar ?");
				dataOutputStreamBahasaMalaysia.writeUTF("Terima kasih");
				dataOutputStreamBahasaMalaysia.writeUTF("Selamat tinggal");
				dataOutputStreamBahasaMalaysia.writeUTF("Ada apa");
				
				// clear the stream
				dataOutputStreamBahasaMalaysia.flush();
				
				// write in Arabic
				// create stream to write Arabic translated text to the Arabic text storage
				fileOutputStreamArabic = new FileOutputStream(ArabicStorage);
				dataOutputStreamArabic = new DataOutputStream(fileOutputStreamArabic);
				
				// write the data
				dataOutputStreamArabic.writeUTF("صباح الخير");
				dataOutputStreamArabic.writeUTF("طاب مساؤك");
				dataOutputStreamArabic.writeUTF("كيف حالك؟");
				dataOutputStreamArabic.writeUTF("شكرا لك");
				dataOutputStreamArabic.writeUTF("مع السلامة");
				dataOutputStreamArabic.writeUTF("ما أخبارك؟");
				
				// clear the stream
				dataOutputStreamArabic.flush();
				
				// write in Korean
				// create stream to write Korean translated text to the Korean text storage
				fileOutputStreamKorean = new FileOutputStream(KoreanStorage);
				dataOutputStreamKorean = new DataOutputStream(fileOutputStreamKorean);
				
				// write the data
				dataOutputStreamKorean.writeUTF("좋은 아침");
				dataOutputStreamKorean.writeUTF("안녕히 주무세요");
				dataOutputStreamKorean.writeUTF("어떻게 지내세요 ?");
				dataOutputStreamKorean.writeUTF("감사합니다");
				dataOutputStreamKorean.writeUTF("안녕");
				dataOutputStreamKorean.writeUTF("뭐야 ?");
				
				// clear the stream
				dataOutputStreamKorean.flush();
							
				// Close all streams
				fileOutputStreamBahasaMalaysia.close(); 
				fileOutputStreamArabic.close(); 
				fileOutputStreamKorean.close(); 
				
				dataOutputStreamBahasaMalaysia.close(); 
				dataOutputStreamArabic.close(); 
				dataOutputStreamKorean.close(); 
				
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
	}
	
	/**
	 * This method retrieves Malay text for English-Malay translation used.
	 * 
	 * @param text: Text input to be translated
	 * @return translated Malay text
	 */
	public String translateToBM(String text)
	{
		
		String translated = "";
		
		// declare target storage to be read 
		String path = "Malay.txt";
		
		// variable for storing text input of translation
		String morning, night, howareyou, thank, bye, whatup = "";
		
		try
		{
			// create stream to read data from source file
			FileInputStream file = new FileInputStream(path);
			DataInputStream read = new DataInputStream(file);
			
			// read data
			morning = read.readUTF();
			night = read.readUTF();
			howareyou = read.readUTF();
			thank = read.readUTF();
			bye = read.readUTF();
			whatup = read.readUTF();
			
			// Conditions to parse the correspond text to the respective variable
			// based on English text input
			if(text.toUpperCase().equals("GOOD MORNING"))
			{
				translated = morning;
			}
			else if(text.toUpperCase().equals("GOOD NIGHT"))
			{
				translated = night;
			}
			else if(text.toUpperCase().equals("HOW ARE YOU") || text.toUpperCase().equals("HOW ARE YOU ?")
				|| text.toUpperCase().equals("HOW ARE YOU?"))
			{
				translated = howareyou;
			}
			else if(text.toUpperCase().equals("THANK YOU"))
			{
				translated = thank;
			}
			else if(text.toUpperCase().equals("GOODBYE"))
			{
				translated = bye;
			}
			else if(text.toUpperCase().equals("WHAT'S UP ?") || text.toUpperCase().equals("WHAT'S UP")
					|| text.toUpperCase().equals("WHAT'S UP?"))
			{
				translated = whatup;
			}
			else
			{
				translated = "Error No Related Word In Database";
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		return translated;
	}
	
	/**
	 * This method retrieves Arabic text for English-Arabic translation used.
	 * 
	 * @param text: Text input to be translated
	 * @return translated Arabic text
	 */
	public String translateToArb(String text)
	{
		String translated = "";
		
		// declare target storage to be read 
		String path = "Arabic.txt";
		
		// variable for storing text input of translation
		String morning, night, howareyou, thank, bye, whatup = "";
		
		try
		{
			// create stream to read data from source file
			FileInputStream file = new FileInputStream(path);
			DataInputStream read = new DataInputStream(file);
			
			// read data
			morning = read.readUTF();
			night = read.readUTF();
			howareyou = read.readUTF();
			thank = read.readUTF();
			bye = read.readUTF();
			whatup = read.readUTF();
			
			// Conditions to parse the correspond text to the respective variable
			// based on English text input
			if(text.toUpperCase().equals("GOOD MORNING"))
			{
				translated = morning;
			}
			else if(text.toUpperCase().equals("GOOD NIGHT"))
			{
				translated = night;
			}
			else if(text.toUpperCase().equals("HOW ARE YOU") || text.toUpperCase().equals("HOW ARE YOU ?")
					|| text.toUpperCase().equals("HOW ARE YOU?"))
			{
				translated = howareyou;
			}
			else if(text.toUpperCase().equals("THANK YOU"))
			{
				translated = thank;
			}
			else if(text.toUpperCase().equals("GOODBYE"))
			{
				translated = bye;
			}
			else if(text.toUpperCase().equals("WHAT'S UP ?") || text.toUpperCase().equals("WHAT'S UP"))
			{
				translated = whatup;
			}
			else
			{
				translated = "Error No Related Word In Database";
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		return translated;
	}
	
	
	/**
	 * This method retrieves Korean text for English-Korean translation used.
	 * 
	 * @param text: Text input to be translated
	 * @return translated Korean text
	 */
	public String translateToKrn(String text)
	{
		String translated = "";
		
		// declare target storage to be read 
		String path = "Korean.txt";
		
		// variable for storing text input of translation
		String morning, night, howareyou, thank, bye, whatup = "";
		
		try
		{
			// create stream to read data from source file
			FileInputStream file = new FileInputStream(path);
			DataInputStream read = new DataInputStream(file);
			
			// read data
			morning = read.readUTF();
			night = read.readUTF();
			howareyou = read.readUTF();
			thank = read.readUTF();
			bye = read.readUTF();
			whatup = read.readUTF();
			
			// Conditions to parse the correspond text to the respective variable
			// based on English text input
			if(text.toUpperCase().equals("GOOD MORNING"))
			{
				translated = morning;
			}
			else if(text.toUpperCase().equals("GOOD NIGHT"))
			{
				translated = night;
			}
			else if(text.toUpperCase().equals("HOW ARE YOU") || text.toUpperCase().equals("HOW ARE YOU ?")
					|| text.toUpperCase().equals("HOW ARE YOU?"))
			{
				translated = howareyou;
			}
			else if(text.toUpperCase().equals("THANK YOU"))
			{
				translated = thank;
			}
			else if(text.toUpperCase().equals("GOODBYE"))
			{
				translated = bye;
			}
			else if(text.toUpperCase().equals("WHAT'S UP ?") || text.toUpperCase().equals("WHAT'S UP"))
			{
				translated = whatup;
			}
			else
			{
				translated = "Error No Related Word In Database";
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		return translated;
	}
}
