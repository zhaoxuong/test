package testapplet;
import java.io.*;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class youdao {
		private String url;
		private String keyfrom;
		private String key;
		private String doctype;
		
		
		
	youdao(){
		this.url="http://fanyi.youdao.com/openapi.do";
		this.key="993123434";
		this.keyfrom="pdblog";	
	}
	public   String  translation(String word) throws Exception{
		
		try {
			   word = URLEncoder.encode(word, "utf-8");
			  } catch (UnsupportedEncodingException e) {
			   e.printStackTrace();
			  }
		StringBuffer buf = new StringBuffer();
		  buf.append("keyfrom=");
		  buf.append(keyfrom);
		  buf.append("&key=");
		  buf.append(key);
		  buf.append("&type=data&doctype=");
		  buf.append(doctype);
		  buf.append("&version=1.1&q=");
		  buf.append(word);
		  String para=buf.toString();
		  String result;
		  URL urlname=new URL(url+"?"+para);//½¨Á¢URL
		  HttpURLConnection conn = (HttpURLConnection) urlname.openConnection();
          conn.setRequestProperty("User-agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36");
          conn.setUseCaches(false);
          conn.setConnectTimeout(3000);
          conn.setReadTimeout(3000);
          conn.setInstanceFollowRedirects(false);
          conn.connect();
          try {
              DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                  out.writeBytes(para);
          } catch (Exception e) {
              // TODO: handle exception
          }
          InputStream is = conn.getInputStream();
          BufferedReader reader = new BufferedReader(new InputStreamReader(is));
          String strRead = null;
          StringBuffer sb=new StringBuffer(); 
          while ((strRead = reader.readLine()) != null) {
              sb.append(strRead);
          }
           result= sb.toString();
      //} catch (IOException e) {
        //  e.printStackTrace();
      //} finally {
        //  if (reader != null) {
              reader.close();
          //}
          //if (conn != null) {
              conn.disconnect();
          //}
      //}
      return result;
		  
		  
		  
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
