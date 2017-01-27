import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

    public static void ReadFromFile() throws IOException{
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("documentA.txt");
            int c;
            while((c=fis.read()) != -1){
                System.out.print(c+" "); // Output is: 83 97 109 112 108 101 10 (ASCII Values of Sample)
            }
        }
        finally{ // dont forget to close your FileInputStream object.
            if (fis!=null) {
                fis.close();
            }
        }
    }
    
    public static void WriteToFile() throws IOException{
        FileOutputStream fos = null;
        byte[] byteArray = {83, 97, 109, 112, 108, 101, 10 };
        try{
            fos = new FileOutputStream("documentB.txt");
            for(byte x: byteArray){
                fos.write(x); 
            }
            // now, content is documentB is "Sample"
        }
        finally{ // dont forget to close your FileOutputStream object.
            if (fos!=null) {
                fos.close();
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
    ReadFromFile();
    WriteToFile();
    }
}
    
    
    
