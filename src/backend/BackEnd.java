package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

<<<<<<< HEAD
import encoder.Encoder;

=======
>>>>>>> origin/master
public class BackEnd {


	public List<String> getMessages(String username) throws IOException
	{
<<<<<<< HEAD
			
	//	Encoder encoder(username);
	//	return encoder.read();
		
		//Encoder = new encoder(username + ".txt");
		//return encoder(username + ".txt").read();
		
		/*returns a list of all plaintext messages submitted by a user
		 

		ArrayList<String> messages = new ArrayList<String>();
		ArrayList<String> backupMessage = new ArrayList<String>();
		backupMessage.add("no messages");

		File file = new File(username);

		if((!(file.exists()) && !(file.isDirectory())))
		{
			FileWriter makefile = new FileWriter(new File(username +".txt"));
		}
		else
		{
			Scanner scan = new Scanner(username + ".txt");
			
			messages = username.read();
			
			while(scan.hasNextLine())
			{
				messages.add(scan.nextLine());
			}
			scan.close();
			return messages;
		}

		return backupMessage;

	}*/
=======
		Encoder encoder(username);
		return encoder.read();
	}
>>>>>>> origin/master

	public void addMessage(String username, String msg)
	{
		//adds message to the encoded file(s)
<<<<<<< HEAD
		//if file exists; add message
		//if file does not exist; make file and add message
		
		Encoder encoder(username);
		encoder.write(msg);

=======
		
		return new encoder(username).write(msg);
>>>>>>> origin/master
	}

	public List<String> getUsers()
	{
		//returns a list of all users who have submitted a message
<<<<<<< HEAD
		
		File f = new File("userMessages");
=======
	File f = new File("userMessages");
>>>>>>> origin/master
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
<<<<<<< HEAD

=======
>>>>>>> origin/master
	}

	public static void main(String[] args)
	{

	}

}
