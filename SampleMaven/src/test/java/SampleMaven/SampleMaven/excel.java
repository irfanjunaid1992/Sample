package SampleMaven.SampleMaven;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hdgf.HDGFDiagram;
import org.apache.poi.hssf.usermodel.HSSFObjectData;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;

public class excel {
	
	
	public static void main(String[] args) throws IOException
	{
	
		HDGFDiagram hd;
		POIFSFileSystem fs = new POIFSFileSystem();
		  HSSFWorkbook workbook = new HSSFWorkbook(fs);
		  for (HSSFObjectData obj : workbook.getAllEmbeddedObjects()) {
		      //the OLE2 Class Name of the object
		      String oleName = obj.getOLE2ClassName();
		      if (oleName.equals("Worksheet")) {
		          DirectoryNode dn = (DirectoryNode) obj.getDirectory();
		          HSSFWorkbook embeddedWorkbook = new HSSFWorkbook(dn, false);
		          //System.out.println(entry.getName() + ": " + embeddedWorkbook.getNumberOfSheets());
		      } else if (oleName.equals("Document")) {
		    	  DirectoryNode dn = (DirectoryNode) obj.getDirectory();
//		    	  hd = new HDGFDiagram(dn,fs);
		    	
//		          HWPFDocument embeddedWordDocument = new HWPFDocument(dn);
		          //System.out.println(entry.getName() + ": " + embeddedWordDocument.getRange().text());
		      }  else if (oleName.equals("Presentation")) {
		          DirectoryNode dn = (DirectoryNode) obj.getDirectory();
//		          SlideShow<?,?> embeddedPowerPointDocument = new HSLFSlideShow(dn);
		          //System.out.println(entry.getName() + ": " + embeddedPowerPointDocument.getSlides().length);
		      } else {
		          if(obj.hasDirectoryEntry()){
		              // The DirectoryEntry is a DocumentNode. Examine its entries to find out what it is
		              DirectoryNode dn = (DirectoryNode) obj.getDirectory();
//		              for (Entry entry : dn) {
		                  //System.out.println(oleName + "." + entry.getName());
//		              }
		          } else {
		              // There is no DirectoryEntry
		              // Recover the object's data from the HSSFObjectData instance.
		              byte[] objectData = obj.getObjectData();
		          }
		      }
		  }
		
		
	    
	    
	
	}

}
