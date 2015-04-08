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
		
		Encoder encoder(username);
		encoder.write(msg);
	}

	public List<String> getUsers()
	{
		//returns a list of all users who have submitted a message
		Encoder encoder(username);
		
		
		
		return null;

	}

	public static void main(String[] args)
	{

	}

}
