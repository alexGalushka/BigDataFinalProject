package harvard.edu.user;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Parser
{
  private final String FOOD_PATH_INPUT = "C:/FoodsData/foods.txt";
  private final String FOOD_PATH_OUTPUT = "C:/FoodsData/foods.txt";
  private final Integer numFilesToProduce = 1000;
  
  public void read(File file) throws IOException
  {
	    Scanner scanner = new Scanner(file);
        
	    boolean skipFirst = true;
	    int counter = 0;
	    File outPutFile;
	    while(scanner.hasNext() && counter < numFilesToProduce)
	    {
	    	if(counter % 8 == 0 || true == skipFirst)
	    	{
	    		outPutFile = new File(pathname);
	    		skipFirst = false;
	    	}
	        String line = scanner.nextLine();
	        if(line.isEmpty());
	        
	        counter++;
            
	    }
	}
  
  /*
   * 
   * product/productId: B000LQOCH0
review/userId: ABXLMWJIXXAIN
review/profileName: Natalia Corres "Natalia Corres"
review/helpfulness: 1/1
review/score: 4.0
review/time: 1219017600
review/summary: "Delight" says it all
review/text: This is a confection t
   * 
   * 
   * 
   */
  
}
