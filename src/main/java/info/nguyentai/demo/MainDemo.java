package info.nguyentai.demo;

import java.util.HashMap;
import java.util.Iterator;

public class MainDemo {
	
	private static final String INPUT = "C:/NAS_INGEST02/cms/repository/asset/201806/948/948_21C.mp4";
	private static final String cmsBasePathIP = "C:/NAS_INGEST01;\\\\\\\\127.0.0.1,E:/NAS_INGEST02;\\\\\\\\127.0.0.1";
	
	private static HashMap<String,String> convertNasToIp(){
		String[] address = cmsBasePathIP.split(",");
		HashMap<String,String> map = new HashMap<String,String>();
		for(String token: address){
			String[] tokentoken = token.split(";");
			map.put(tokentoken[0], tokentoken[1]);
		}
		return map;
	}
	
	public static void main(String[] args) {
		String[] nodes = INPUT.split("/");
		System.out.println(nodes[0] + "/" + nodes[1]);
		HashMap<String, String> nasIpMap = convertNasToIp();
		for (String key : nasIpMap.keySet()) {
			System.out.println(key);
			System.out.println(nasIpMap.get(key));
		}
	}

}
