package info.nguyentai.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.lang.StringUtils;


/**
 * @author TaiNT
 * Test hoạt động của process
 */
public class TestProcessor {
	
	private static final String FFPROBE = "D:\\Setup\\ffprobe.exe";
	private static final String MEDIA_FILE = "D:\\NAS_INGEST01\\cp_ftp\\cp03user\\testvideo.mp4";
	
	public static void main(String[] args) {
		
		Process testProcess = null;
		BufferedReader outReader = null;
		
		try {
			testProcess = new ProcessBuilder(FFPROBE, MEDIA_FILE).start();
			
			outReader = new BufferedReader(new InputStreamReader(testProcess.getErrorStream()));
			String line = StringUtils.EMPTY;
			
			while ((line = outReader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				outReader.close();
				testProcess.getInputStream().close();
				testProcess.getOutputStream().close();
				testProcess.getErrorStream().close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
