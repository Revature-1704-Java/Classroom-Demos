package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.revature.exception.AlbumNotFoundException;
import com.revature.model.Album;

@WebService(endpointInterface="com.revature.service.MusicService")
public class MusicServiceImpl implements MusicService {
	
	List<Album> albums = new ArrayList<>();
	
	public MusicServiceImpl() {
		albums.add(new Album("Darkside of the Moon", "Pink Floyd", 9.99));
		albums.add(new Album("Reign in Blood", "Slayer", 6.66));
		albums.add(new Album("Coloring Book", "Chance", 19.99));
	}

	@Override
	public List<Album> getAllAlbums() {
		return albums;
	}

	@Override
	public String addAlbum(Album album) throws AlbumNotFoundException {
		if (album.getArtist().equals("Tim")) {
			throw new AlbumNotFoundException("Tim not found");
		}
		albums.add(album);
		return "Successfully added album: " + album.toString();
	}

}
