package TooldQA.DemoMavenEclipseProject;
import java.util.Base64;
public class Encrypt {

	public static void main(String[] args) {
		/*Base64.Encoder enc = Base64.getEncoder();
		Base64.Decoder dec = Base64.getDecoder();
		String str = "Mauli@2812$";
		
		
		
		
		
		
		
		
				
		//Encode data using Base64
		
		String encoded = enc.encodeToString(str.getBytes());
        System.out.println("encoded value is \t" + encoded);
        
		
		
     // Decode data
        String decoded = new String(dec.decode(encoded));
        System.out.println("decoded value is \t" + decoded);
        System.out.println("original value is \t" + str);
        */
		String currentDirectory = System.getProperty("user.dir");
        System.out.println(currentDirectory);
        
	}
	
}
