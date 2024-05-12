import java.io.*;
public class FileAnalyze {
    public static void main(String[] args) throws IOException{
        File file=new File("/Users/Samhitha PS/OneDrive/Documents/java visual studio code/example.txt");
        FileInputStream fin=new FileInputStream(file);
        InputStreamReader inp=new InputStreamReader(fin);
        BufferedReader br=new BufferedReader(inp);

        String line;
        int wcount=0;
        int charcount=0;
        int paracount=0;
        int whiteSpacecount=0;
        int sentenceCount=0;

        while((line=br.readLine())!=null){
            if(line.equals("")){
                paracount+=1;
            }
            else{
                charcount+=line.length();
                String words[] = line.split("\\s+");
                wcount+=words.length;
                whiteSpacecount += wcount - 1;
                String sentence[] = line.split("[!?.]+");
                sentenceCount +=sentence.length;

            }
        }
        if(sentenceCount >= 1){
            paracount++;
        }
        System.out.println("Total word count is"+wcount);
        System.out.println("Total sentence count is"+sentenceCount);
        System.out.println("Total no of characters is"+charcount);
        System.out.println("Total number of paragraphs is"+paracount);
        System.out.println("Total number of white spaces is"+whiteSpacecount);

    }
    
}
