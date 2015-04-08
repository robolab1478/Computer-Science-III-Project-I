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
		//returns a list of all plaintext messages submitted by a user

		ArrayList<String> messages = new ArrayList<String>();
		ArrayList<String> backupMessage = new ArrayList<String>();
		backupMessage.add("no messages");

		File file = new File(username);

		if((!(file.exists()) && !(file.isDirectory())))
		{
			FileWriter makefile = new FileWriter(new File("username.txt"));
		}
		else
		{
			Scanner scan = new Scanner("username.txt");
			messages = username.read();
			//while(scan.hasNextLine())
			//{
			//	messages.add(scan.nextLine());
			//}
			return messages;
		}

		return backupMessage;

	}

	public void addMessage(String username, String msg)
	{
		//adds message to the encoded file(s)


	}

	public List<String> getUsers()
	{
		//returns a list of all users who have submitted a message

		return null;

	}

	public static void main(String[] args)
	{

	}

}
