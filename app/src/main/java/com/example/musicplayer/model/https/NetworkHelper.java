package com.example.musicplayer.model.https;

import com.example.musicplayer.entiy.Album;
import com.example.musicplayer.entiy.AlbumSong;
import com.example.musicplayer.entiy.SearchSong;
import com.example.musicplayer.entiy.SingerImg;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/07/15
 *     desc   : 网络操作接口集合
 * </pre>
 */

public interface NetworkHelper {
    Observable<AlbumSong> getAlbumSong(String id); //得到专辑
    Observable<SearchSong> search(String seek,int offset); //搜索歌曲
    Observable<Album> searchAlbum(String seek,int offset);//搜索照片
    Observable<SearchSong> search(String seek);//根据关键字搜索
    Observable<String> getLrc(String id);//获取歌词
    Observable<SingerImg> getSingerImg(String singer);//获取歌手头像
}
