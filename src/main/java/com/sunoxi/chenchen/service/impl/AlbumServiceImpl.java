package com.sunoxi.chenchen.service.impl;

import com.sunoxi.chenchen.domain.Album;
import com.sunoxi.chenchen.repository.AlbumDao;
import com.sunoxi.chenchen.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sunoxi on 2018/7/15.
 */
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private AlbumDao albumDao;

    @Override
    public List<Album> findAllAlbum(){
        return albumDao.findAll();
    };
}
