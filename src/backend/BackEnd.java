package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackEnd {


	public List<String> getMessages(String username) throws IOException
	{
		Encoder encoder(username);
		return encoder.read();
	}

	public void addMessage(String username, String msg)
	{
		//adds message to the encoded file(s)
		
		return new encoder(username).write(msg);
	}

	public List<String> getUsers()
	{
		//returns a list of all users who have submitted a message
	File f = new File("userMessages");
		File[] showFiles = f.listFiles();
		ArrayList<String> users = new ArrayList<String>();
		String extension = ".txt";
		for(File l : showFiles)
		{
			String filename = l.getName();
			String ext = filename.substring(filename.length() - extension.length());
			if(ext.equals(extension))
			{
				users.add(filename);
			}
		}
		
		
		return users;
	}

	public static void main(String[] args)
	{

	}

}
