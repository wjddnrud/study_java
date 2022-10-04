package com.Ezem.study.ch15.fifth;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		
//		HashTable의 하위객체라서 
		Properties properties  = new Properties();
		
		
//		같은 위치에 있는 database.properties파일의 내용을 읽어온다.
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		
//		incode 암호화 decode 복호화 까진 아니더라고 converting해주는 느낌
		path = URLDecoder.decode(path, "utf-8");
		
//		FileReader fileReader = new FileReader(path);
//		properties.load(FileReader);
		
		properties.load(new FileReader(path));
		
//		database.properties에 있는 이름들을 사용하면 java가 알아서 호출해준다.
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password"); 
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}

}
