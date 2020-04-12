import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class ReadDataURL {


	public static void main(String[] args) {
		try {
			URL u=new URL("http://jsonplaceholder.typicode.com/todos");
			HttpURLConnection hr=(HttpURLConnection) u.openConnection();

			if(hr.getResponseCode()==200) {
				InputStream im=hr.getInputStream();
				StringBuffer sb=new StringBuffer();
				BufferedReader br=new BufferedReader(new InputStreamReader(im));
				String line=br.readLine();
				
				while(line!=null) {
					System.out.println(line);
					line=br.readLine();
				}
			}
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
