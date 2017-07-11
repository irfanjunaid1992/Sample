package First;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class TextFile {
	
	private static String textFilePath = "C:\\Users\\irfan.junaid\\Documents\\textfile.txt";
	static String sameTextFilePath = "C:\\Users\\irfan.junaid\\Documents\\sameTextFilePath.txt";
	static String difftextFilePath = "C:\\Users\\irfan.junaid\\Documents\\difftextFilePath.txt";
	static File text;
	static FileReader fi;
	static BufferedReader br;
	static PrintWriter outSame;
	static PrintWriter outDiff;
	
	public static void main(String[] args) throws IOException
	{
				
		String line;
		
		String[] words;
		text = new File(textFilePath);
		fi = new FileReader(text);
		br = new BufferedReader(fi, 100);
		line = br.readLine();
		List<String> full = new ArrayList<String>();
		
		outSame = new PrintWriter(new File(sameTextFilePath));
		outDiff = new PrintWriter(new File(difftextFilePath));
		
		while(line!=null)
		{
			words = line.split(" ");
			
			for(String word : words)
			{
				
				System.out.println(word);
				
				if(full.contains(word))
				{
					outSame.write(word);
					outSame.write("\n ");
				}
				else
				{
					outDiff.write(word);
					outDiff.write("\n ");
				}
				
				full.add(word);
			}
			
			line = br.readLine();
			
		}
		
		
		outSame.close();
		outDiff.close();
		
		
		
	}

}
