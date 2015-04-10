package driver;

import java.io.File;

import javax.swing.SwingUtilities;

public class Main
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable(){public void run(){new File("userMessages").mkdir(); new frontend.Main();}});
	}
}
