package com.imooc.test;

import java.util.ArrayList;
import java.util.List;

public class PlayLIst {

	private String playListName;
	private List<Songs> playList;

	public PlayLIst(String playListName) {
		super();
		this.playListName = playListName;
		playList = new ArrayList<Songs>();
	}

	public String getPlayListName() {
		return playListName;
	}

	public void setPlayListName(String playListName) {
		this.playListName = playListName;
	}

	/**
	 * 将歌曲添加到列表中
	 * 
	 * @param song
	 */

	public void addToPlayList(Songs song) {
		 //排除重复添加的情况
		boolean flag=false;//说明没有重复的
		for(Songs song1:playList) {
			if(song1.equals(song)) {
				flag=true;
				break;
			}
			if(flag)
				System.out.println("该歌曲已经存在于列表中");
			else
				playList.add(song);
		}


	}

	/**
	 * 显示列表中的所有歌曲
	 */
	public void disPlayList() {
		System.out.println("播放列表中的歌曲为：");
		for (Songs song : playList) {
			System.out.println(song);
		}

	}

}
