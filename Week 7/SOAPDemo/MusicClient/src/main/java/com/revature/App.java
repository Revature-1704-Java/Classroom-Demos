package com.revature;

import java.util.List;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.revature.exception.AlbumNotFoundException;
import com.revature.model.Album;
import com.revature.service.MusicService;

public class App {

	public static void main(String[] args) {
		String serviceURL = "http://localhost:8080/MusicService/Albums";
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(MusicService.class);
		factory.setAddress(serviceURL);
		
		//set up interceptors to vew messages
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		
		//consume service
		MusicService ms = (MusicService) factory.create();
		List<Album> albums = ms.getAllAlbums();
		for (Album a : albums) {
			System.out.println(a);
		}
		
		//post
		try {
			String response = ms.addAlbum(new Album("Tim's Album", "Tim", 0));
			System.out.println(response);
		} catch(AlbumNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
