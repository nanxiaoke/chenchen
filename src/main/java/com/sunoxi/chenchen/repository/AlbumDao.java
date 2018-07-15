package com.sunoxi.chenchen.repository;

import com.sunoxi.chenchen.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sunoxi on 2018/7/14.
 */
@Repository
public interface AlbumDao extends JpaRepository<Album, Long>{
    Album findByTitle(String title);
}
