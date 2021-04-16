package videoIdea;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Scanner;

public class video {

	public static void main(String[] args) throws AWTException, InterruptedException  {

			Robot robot = new Robot();
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter Your Text:");
		    String Text = scanner.nextLine();
			
		    StringSelection stringSelection = new StringSelection(Text);
		    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		    clipboard.setContents(stringSelection, null);
		    
		    System.out.println("The spaming will start in 5 seconds");
		    Thread.sleep(5000);
		    
		    int x = 1;
		while (x <= 10)
		{
			Thread.sleep(100);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			x++;

		}

	}
}