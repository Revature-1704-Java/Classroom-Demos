package com.revature.service;

import java.util.List;

import javax.jws.WebService;

import com.revature.exception.AlbumNotFoundException;
import com.revature.model.Album;

@WebService
public interface MusicService {
	List<Album> getAllAlbums();

	String addAlbum(Album album) throws AlbumNotFoundException;
}
