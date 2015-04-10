package encoder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Encoder 
{
	
	private String _fileName;
	private FileWriter _fileWriter;
	private FileReader _fileReader;
	
	public Encoder (String filename)
	{
		//STEPS
		//1. Create a FileWriter (which creates a file in the process)
		//2. Create a FileReader (which can read from a file)
		try 
		{
			_fileWriter = new FileWriter(filename);
		} 
		catch (IOException e) 
		{
			// TODO Display Catch Exception
		}
		
		try 
		{
			_fileReader = new FileReader(filename);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Display Catch Exception
		}
	}
	
	private String Encode (String plaintext)
	{
		String encoded = "";
		//Encodes plain text into obfuscated text
		
		for (char c : plaintext.toCharArray())
		{
			int p = (int) c;
			p = p + 13;
			char d = (char)p;
			encoded += String.valueOf(d);
		}
		return encoded;
	}
	
	private String Decode (String encodedText)
	{
		String decoded = "";
		//Encodes plain text into obfuscated text
		
		for (char c : encodedText.toCharArray())
		{
			int p = (int) c;
			p = p - 13;
			char d = (char)p;
			decoded += String.valueOf(d);
		}
		return decoded;
	}
	
	public void write(String plaintext)
	{
		String encodedText = this.Encode(plaintext);
		try 
		{
			_fileWriter.write(encodedText);
		} 
		catch (IOException e) 
		{
			// TODO Display Catch Exception
		}
	}
	
	public List<String> read()
	{
		
		
		return null;
	}
}
