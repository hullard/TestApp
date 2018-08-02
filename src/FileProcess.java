import java.io.*;
import java.util.*;

public class FileProcess
{
	public static void removeDuplicatedWords(String filePath)
	{
		String tmpFilePath = filePath + ".tmp";
		List<String> words = new ArrayList<String>();
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try
		{
			reader = new BufferedReader(new FileReader(filePath));
			writer = new BufferedWriter(new FileWriter(tmpFilePath));
						
			String line;
			while ((line = reader.readLine()) != null)
			{
				String[] splitWords = line.trim().split("\\s+");
				String newLine = "";
				for (final String word : splitWords)
				{
					if (words.contains(word) == false)
					{
						words.add(word);
						newLine += (word + " ");
					}
				}
				writer.write(newLine + System.getProperty("line.separator"));
			}
		}
		catch (Exception e)
		{
			//exceptionHandling(e);
		}
		finally
		{
			try
			{
				reader.close();
				writer.close();
				
				File oldFile = new File(filePath);
				oldFile.delete();
				
				File newFile = new File(tmpFilePath);
				newFile.renameTo(oldFile);
			}
			catch (Exception e)
			{
				//exceptionHandling(e)
			}
		}
	}
}
