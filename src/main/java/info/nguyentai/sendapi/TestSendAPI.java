package info.nguyentai.sendapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.lang.StringUtils;

public class TestSendAPI {

	public static void main(String[] args) {

		URL url = null;
		HttpURLConnection conn = null;
		try {
			url = new URL("https://jsonplaceholder.typicode.com/todos/1");
			
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setConnectTimeout(2000);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line = StringUtils.EMPTY;
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
