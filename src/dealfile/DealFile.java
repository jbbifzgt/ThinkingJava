package dealfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class DealFile {
    /**
     * 
     * @author zdz8207
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        DealFile df = new DealFile();
//        df.getFileName();
        
       System.out.println(df.onescreen("D:\\newriver\\39ÄÇÖÞºóÀÊÅÅºéÇþ£¨ÄÇÖÞÎ÷ÅÅºéÇþ£©.txt").replaceAll(",0 ", "|").replaceAll("				<coordinates>					", ""));
    }

    public void getFileName() {
        String path = "d:/newriver"; // Â·¾¶
        File f = new File(path);
        String [] strs = new String[40];
        if (!f.exists()) {
            System.out.println(path + " not exists");
            return;
        }

        File fa[] = f.listFiles();
        for (int i = 0; i < fa.length; i++) {
            File fs = fa[i];
            if (fs.isDirectory()) {
                ;
            } else {
                System.out.println(fs.getName());
            }
        }
    }
    
    public String  onescreen(String fileName) throws IOException {
    	StringBuffer sb= new StringBuffer("");
    	
    	FileReader reader = new FileReader(fileName);

        BufferedReader br = new BufferedReader(reader);

        String str = null;

        int flag = 0;
        String dealedStr = "";
        while((str = br.readLine()) != null) {

              sb.append(str+"/n"); 
              if(Pattern.matches("^\\t*<coordinates> *$",str)) {
            	  flag = 1;
              }
              if(Pattern.matches("^\\t*</coordinates> *$",str)) {
            	  flag = 0;
              }
              if(flag == 1) {
            	  dealedStr += str;
              }

        }
        
        br.close();

        reader.close();
        
        return dealedStr;
    }

}
